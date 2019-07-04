package com.alianza.gestionpagos.neg;

import java.sql.CallableStatement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.tempuri.GestionDePagosSoapImpl;
import org.tempuri.InformacionFideicomisos;

import com.alianza.gestionpagos.conexion.ConexionDirecta;
import com.alianza.gestionpagos.conexion.ConexionType;
import com.alianza.gestionpagos.exception.GestionPagosException;
import oracle.jdbc.OracleTypes;

public class InformacionFideicomiso {


	private static final Logger log = LogManager.getLogger(GestionDePagosSoapImpl.class.getName());

	public org.tempuri.InformacionFideicomisos[] getInformacionFideicomisos(java.lang.String fideicomiso) throws GestionPagosException {
		log.debug("Inicio del metodo getInformacionFideicomisos");
		InformacionFideicomisos[] list ;
		ArrayList<InformacionFideicomisos> listInformacionFideicomisos;
		Connection con=null;
		CallableStatement stmt=null;
		ResultSet rs=null;
		try {
			con = ConexionDirecta.getConexion(ConexionType.BD_SIFIDESA_VU_SFI);
			log.debug("Inicio llamado al store procedure bi_pinformacion_fideicomiso");
			stmt = con.prepareCall("BEGIN bi_pinformacion_fideicomiso(?, ?); END;");
			stmt.setString(1, fideicomiso);
			stmt.registerOutParameter(2, OracleTypes.CURSOR);
			stmt.execute();
			rs = (ResultSet)stmt.getObject(2);
			listInformacionFideicomisos = new ArrayList<InformacionFideicomisos>();
			while (rs.next()) {
				InformacionFideicomisos ifc=new InformacionFideicomisos();
				ifc.setFideicomiso(rs.getString(1));
				ifc.setNombreFideicomiso(rs.getString(2));
				ifc.setEncargo(rs.getString(3));
				ifc.setEstadoEncargo(rs.getString(4));
				ifc.setSaldoEncargo(rs.getString(5));
				ifc.setEstadoEncargo(rs.getString(6));
				ifc.setNombreNegocioGrifus(rs.getString(7));
				ifc.setUsuarioDirectorGestion(rs.getString(8));
				ifc.setDirectorGestion(rs.getString(9));
				ifc.setAsistenteGestion(rs.getString(10));
				ifc.setSaldoTotal(rs.getString(11));
				ifc.setSaldoCanje(rs.getString(12));
				ifc.setCtrlCancelacion(rs.getString(13));
				ifc.setTotalReservado(rs.getString(14));
				ifc.setTotalDisponible(rs.getString(15));
				ifc.setMensaje("");
				listInformacionFideicomisos.add(ifc);
			}
			list = listInformacionFideicomisos.toArray(new InformacionFideicomisos[listInformacionFideicomisos.size()]);
		}
		catch (SQLException e1) {
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
		 log.debug("finalizando metodo getInformacionFideicomisos");
	    	return list;
    }

}
