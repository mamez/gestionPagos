package com.alianza.gestionpagos.neg;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.tempuri.Conceptos;
import org.tempuri.GestionDePagosSoapImpl;
import org.tempuri.InformacionCuentas;
import org.tempuri.InformacionFideicomisos;
import org.tempuri.InformacionPagosSIFI;

import com.alianza.gestionpagos.conexion.ConexionDirecta;
import com.alianza.gestionpagos.conexion.ConexionType;
import com.alianza.gestionpagos.config.LeerParametrosProperties;
import com.alianza.gestionpagos.exception.GestionPagosException;

import oracle.jdbc.OracleTypes;

public class AplicaPagos {


	private static final Logger log = LogManager.getLogger(GestionDePagosSoapImpl.class.getName());

	public String usuarioSIFI;

	public java.lang.String setAplicaPagos(java.lang.String fideicomiso, java.lang.String operacion, java.lang.String identificacion, java.lang.String instruccion, java.lang.String accion, java.lang.String Usuario, java.lang.String gmf, java.lang.String causalRechazo)  throws GestionPagosException {
		log.debug("Inicio del metodo setAplicaPagos");
		String numInstruccion = null;
		String mensaje = null;
		Connection con=null;
		CallableStatement stmt=null;
		ResultSet rs=null;

		try {
			con= ConexionDirecta.getConexion(ConexionType.BD_SIFIDESA_VU_SFI);
			stmt = con.prepareCall("BEGIN bi_pconsulta_numInstruccion(?,?,?); END;");
			stmt.setString(1, fideicomiso);
			stmt.setString(2, operacion);
			stmt.registerOutParameter(3, OracleTypes.CURSOR);
			stmt.execute();
			rs = (ResultSet)stmt.getObject(3);
			int rowCount = 0;
			while (rs.next()) {
				rowCount ++ ;
			}
			if (rowCount > 0 ) {
				if (rowCount ==1) {
					while (rs.next()) {
						numInstruccion = rs.getString(1);

					}
				}
				if (rowCount > 1) {
					mensaje = "El pago para el fideicomiso: " + fideicomiso + " con numero de operacion: " + operacion + " tiene mas de un numero de instruccion. Por favor validar";
				}
			}
			else {
				mensaje = "El pago para el fideicomiso: " + fideicomiso + " con numero de operacion: " + operacion + " no tiene numero de instruccion. Por favor validar";
			}

			if (numInstruccion != null && !numInstruccion.isEmpty()) {
				return mensaje;
			}
			else {
				stmt = con.prepareCall("BEGIN FD_QAUTORIZAR_OPERACIONES_WEB.Confirma_Proceso(?,?,?,?,?,?,?,?); END;");
				stmt.setString(1,fideicomiso );
				stmt.setString(2, operacion);
				stmt.setString(3, instruccion);
				stmt.setString(4, accion);
				stmt.setString(5, Usuario);
				stmt.setString(6, gmf);
				stmt.setString(7, causalRechazo);
				stmt.registerOutParameter(8, OracleTypes.CURSOR);
				stmt.execute();
				rs = (ResultSet)stmt.getObject(8);
				String error = "" ;
				while (rs.next()) {
					error = rs.getString(1);	
				}

				if (error == "null") {
					mensaje = "Transacción realizada con éxito.";
				}
				else {
					mensaje = error ;
				}

			}

		}catch (SQLException e1) {
			throw new GestionPagosException(e1.getMessage());
		}catch(GestionPagosException e) {
			throw new GestionPagosException(e.getMessage());
		}catch (Exception e) {
			throw new GestionPagosException(e.getMessage());
		}finally {
			try {

				stmt.close();
				con.close();
				rs.close();
			}catch (SQLException e) {
				throw new GestionPagosException(e.getMessage());
			}

		}
		return mensaje;
	}


	public String ConsultaUsuarioSIFI(String sParamUsuario) throws GestionPagosException {

		// Instancia de la clase LeerParametrosProperties
		LeerParametrosProperties properties = new LeerParametrosProperties();

		String usuarioSIFI = "";
		String dominio = properties.getLeerParametrosProperties("dominio");
		String resul = dominio + sParamUsuario;
		String strsql = "select usua_usua from ge_tusua where usua_dominio = upper('?') and usua_stat = 'AC'";
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			con= ConexionDirecta.getConexion(ConexionType.BD_SIFIDESA_VU_SFI);
			ps = con.prepareStatement(strsql);
			ps.setString(1, resul);
			rs = ps.executeQuery();
			while (rs.next()) {
				usuarioSIFI = rs.getString(1);

			}
		} catch (SQLException e1) {
			throw new GestionPagosException(e1.getMessage());
		}
		catch(GestionPagosException e) {
			throw new GestionPagosException(e.getMessage());
		}catch (Exception e) {
			throw new GestionPagosException(e.getMessage());
		}finally {
			try {
				ps.close();
				con.close();
				rs.close();
			}catch (SQLException e) {
				throw new GestionPagosException(e.getMessage());
			}

		}
		log.debug("finalizando metodo ConsultaUsuarioSIFI");

		return usuarioSIFI;
	}
}