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

public class InformacionPagos {

	private static final Logger log = LogManager.getLogger(GestionDePagosSoapImpl.class.getName());

	public org.tempuri.InformacionPagosSIFI[] getInformacionPagos(java.lang.String numeroCasoBizagi) throws GestionPagosException {
		log.debug("inicio del metodo getInformacionPagos");
		InformacionPagosSIFI[] list;
		ArrayList<InformacionPagosSIFI> listInformacionPagosSIFI;
		Connection con=null;
		 CallableStatement stmt=null;
		 ResultSet rs=null;
		
		 try {
			 con = ConexionDirecta.getConexion(ConexionType.BD_SIFIDESA_VU_SFI);
			 log.debug("Inicio llamado al store procedure bi_pconsulta_pagos");
			 stmt = con.prepareCall("BEGIN bi_pconsulta_pagos(?, ?); END;");
			 stmt.setString(1, numeroCasoBizagi);
			 stmt.registerOutParameter(2, OracleTypes.CURSOR);
			 stmt.execute();
			 rs=(ResultSet)stmt.getObject(2);
			 listInformacionPagosSIFI = new ArrayList<InformacionPagosSIFI>();
			 while (rs.next()) {
				 InformacionPagosSIFI ips = new InformacionPagosSIFI();
				 ips.setTipo_cuenta_origen(rs.getString(1));
				 ips.setBanco_origen(rs.getString(2));
				 ips.setEncargo(rs.getString(3));
				 ips.setNum_cuenta_origen(rs.getString(4));
				 ips.setNum_fideicomiso(rs.getString(5));
				 ips.setNombre_fideicomiso(rs.getString(6));
				 ips.setValor_orden_giro(rs.getString(7));
				 ips.setNum_identificacion_causacion(rs.getString(8));
				 ips.setNombre_tercero(rs.getString(9));
				 ips.setDescri_pago(rs.getString(10));
				 ips.setDescripcion_concepto(rs.getString(11));
				 ips.setConcepto(rs.getString(12));
				 ips.setValor_neto(rs.getString(13));
				 ips.setTipo_pago(rs.getString(14));
				 ips.setEstado_pago(rs.getString(15));
				 ips.setTipo_cuenta_desti(rs.getString(16));
				 ips.setBanco_desti(rs.getString(17));
				 ips.setNum_cuenta_desti(rs.getString(18));
				 ips.setEncargo_destino(rs.getString(19));
				 ips.setNum_identificacion_giro(rs.getString(20));
				 ips.setNombre_tercero_giro(rs.getString(21));
				 ips.setGmf(rs.getString(22));
				 ips.setOrden_pago(rs.getString(23));
				 ips.setNum_instruccion(rs.getString(24));
				 ips.setDescri_instruccion_pago(rs.getString(25));
				 ips.setNumero_operacion(rs.getString(26));
				 ips.setGmfSugerido(rs.getString(27));
				 ips.setMensaje("");
				 listInformacionPagosSIFI.add(ips);
			}
			 list = listInformacionPagosSIFI.toArray(new InformacionPagosSIFI[listInformacionPagosSIFI.size()]);
			 
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
			 log.debug("finalizando metodo getInformacionPagos");
		    	return list;
		 
	    }

	
	
}
