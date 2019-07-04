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
import com.alianza.gestionpagos.exception.GestionPagosException;

import oracle.jdbc.OracleTypes;

public class AplicaPagos {

	private static final Logger log = LogManager.getLogger(GestionDePagosSoapImpl.class.getName());

	public java.lang.String setAplicaPagos(java.lang.String fideicomiso, java.lang.String operacion, java.lang.String identificacion, java.lang.String instruccion, java.lang.String accion, java.lang.String Usuario, java.lang.String gmf, java.lang.String causalRechazo) throws java.rmi.RemoteException {

		log.debug("inicio del metodo setAplicaPagos");
		String mensaje ="";
		Connection con=null;
		CallableStatement stmt=null;
		ResultSet rs=null;
		try {
			con= ConexionDirecta.getConexion(ConexionType.BD_SIFIDESA_VU_SFI);
			stmt = con.prepareCall("BEGIN bi_pconsulta_numInstruccion(?, ?,?); END;");
			stmt.setString(1, fideicomiso);
			stmt.setString(2, operacion);
			stmt.registerOutParameter(3, OracleTypes.CURSOR);
			stmt.execute();
			rs = (ResultSet)stmt.getObject(3);
			
		} 
		catch (Exception e) {
		}
		return mensaje;	

	}

	public String ConsultaUsuarioSIFI(String sParamUsuario) {
		String dominio ="";
		String strsql ="";
		return null;
	}
}
