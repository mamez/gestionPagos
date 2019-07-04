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

public class ConceptosPorPago {

	 private static final Logger log = LogManager.getLogger(GestionDePagosSoapImpl.class.getName());
	 
	 public org.tempuri.Conceptos[] getConceptosPorPago(java.lang.String codigoCaso) throws GestionPagosException {
		 log.debug("Inicio del metodo getConceptosPorPago");
		 Conceptos[] list ;
		 ArrayList<Conceptos> listConceptos;
		 Connection con=null;
		 CallableStatement stmt=null;
		 ResultSet rs=null;
		 try {
			 con= ConexionDirecta.getConexion(ConexionType.BD_SIFIDESA_VU_SFI);
			 log.debug("Inicio del llamado al store procedure BI_RETENCIONES_CASOBIZA");
			 stmt = con.prepareCall("BEGIN BI_RETENCIONES_CASOBIZA(?, ?); END;");
			 stmt.setString(1, codigoCaso);
			 stmt.registerOutParameter(2, OracleTypes.CURSOR); 
			 stmt.execute();
			 rs = (ResultSet)stmt.getObject(2);
			 listConceptos= new ArrayList<Conceptos>();
			 while (rs.next()) {
		    	 Conceptos c= new Conceptos();
					
		    	 c.setCodigo_Pago(rs.getString(1));
		    	 c.setTipo(rs.getString(2));
		    	 c.setConcepto(rs.getString(3));	
		    	 c.setDescripcion(rs.getString(4));
		    	 c.setBase(rs.getString(5)); 
		    	 c.setValor(rs.getString(6));
                 c.setMensaje("");        
				 listConceptos.add(c);
		       }
			 list= listConceptos.toArray(new Conceptos[listConceptos.size()]);
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
			 log.debug("finalizando metodo getConceptosPorPago");
		    	return list;
		 
	    }
	 
	 
}
