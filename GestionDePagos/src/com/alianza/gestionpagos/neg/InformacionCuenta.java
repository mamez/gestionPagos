package com.alianza.gestionpagos.neg;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.tempuri.GestionDePagosSoapImpl;
import org.tempuri.InformacionCuentas;

import com.alianza.gestionpagos.conexion.ConexionDirecta;
import com.alianza.gestionpagos.conexion.ConexionType;
import com.alianza.gestionpagos.exception.GestionPagosException;

import oracle.jdbc.OracleTypes;

public class InformacionCuenta {

	private static final Logger log = LogManager.getLogger(GestionDePagosSoapImpl.class.getName());
	
	public org.tempuri.InformacionCuentas[] getInformacionCuentas(java.lang.String p_fideicomiso)  throws GestionPagosException {
		log.debug("Inicio del metodo getInformacionCuentas");
		InformacionCuentas[] list ;
		ArrayList<InformacionCuentas> listInformacionCuentas;
		 Connection con=null;
		 CallableStatement stmt=null;
		 ResultSet rs=null;
		 try {
			 con= ConexionDirecta.getConexion(ConexionType.BD_SIFIDESA_VU_SFI);
			 log.debug("Inicio del llamado al store procedure BI_CONSULTACNTAS_FIDECOMISO");
			 stmt = con.prepareCall("BEGIN BI_CONSULTACNTAS_FIDECOMISO(?, ?); END;");
			 stmt.setString(1, p_fideicomiso);
			 stmt.registerOutParameter(2, OracleTypes.CURSOR); 
			 stmt.execute();
			 rs = (ResultSet)stmt.getObject(2);
			 listInformacionCuentas = new ArrayList<InformacionCuentas>();
			 while (rs.next()) {
				 InformacionCuentas ic = new InformacionCuentas();
				ic.setBanco(rs.getString(1));
				ic.setSucursal(rs.getString(2));
				ic.setClaseCuenta(rs.getString(3));
				ic.setDescripcion(rs.getString(4));
				ic.setNumeroCuenta(rs.getString(5));
				ic.setMensaje("");
				listInformacionCuentas.add(ic);
			}
			 list = listInformacionCuentas.toArray(new InformacionCuentas[listInformacionCuentas.size()]);
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
			 log.debug("finalizando metodo getInformacionCuentas");
		    	return list;
	    }

}
