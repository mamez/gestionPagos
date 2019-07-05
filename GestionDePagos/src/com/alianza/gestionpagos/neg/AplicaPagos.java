package com.alianza.gestionpagos.neg;

import java.sql.CallableStatement;
import java.sql.Connection;
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
	
	public java.lang.String setAplicaPagos(java.lang.String fideicomiso, java.lang.String operacion, java.lang.String identificacion, java.lang.String instruccion, java.lang.String accion, java.lang.String Usuario, java.lang.String gmf, java.lang.String causalRechazo)  throws GestionPagosException, SQLException {

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
			while (rs.next()) {
				mensaje = mensaje.toString();
			}
			if(mensaje.compareTo(mensaje)> 1) {
				mensaje = "El pago para el fideicomiso" + fideicomiso + "con numero de operación" + operacion +  " tiene mas de un numero de instruccion. Por favor validar";
			}
			else {
				mensaje = "El pago para el fideicomiso" + fideicomiso + " con numero de operacion: " + operacion +  " no tiene numero de instruccion. Por favor validar";
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
		if (mensaje.isEmpty()) {
			 log.debug("finalizando metodo setAplicaPagos");
		    	return mensaje;
		}
		else {
			con= ConexionDirecta.getConexion(ConexionType.BD_SIFIDESA_VU_SFI);
			stmt = con.prepareCall("BEGIN FD_QAUTORIZAR_OPERACIONES_WEB.Confirma_Proceso(?,?,?); END;");
			
		}
		 return mensaje;
    }


	public String ConsultaUsuarioSIFI(String sParamUsuario) {
		
		String dominio = null;
		String mensaje = null;
		
		
		try {
			String strsql = "select usua_usua from ge_tusua where usua_dominio = upper('" + dominio + sParamUsuario + "') and usua_stat = 'AC'";
			Connection con=null;
			CallableStatement stmt=null;
	        con= ConexionDirecta.getConexion(ConexionType.BD_SIFIDESA_VU_SFI);
	        stmt = (CallableStatement) con.createStatement();
	        ResultSet rs = stmt.executeQuery(strsql);
	        while (rs.next()) {
	        	rs.toString();	
			}
	        
		} catch (Exception e) {
			
		}
		
        
        return usuarioSIFI;
	}
}