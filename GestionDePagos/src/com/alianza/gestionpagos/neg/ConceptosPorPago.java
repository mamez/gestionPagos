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

import com.alianza.gestionpagos.conexion.ConexionDirecta;
import com.alianza.gestionpagos.conexion.ConexionType;
import com.alianza.gestionpagos.exception.GestionPagosException;

import oracle.jdbc.OracleTypes;

public class ConceptosPorPago {

	 private static final Logger log = LogManager.getLogger(GestionDePagosSoapImpl.class.getName());
	 
	 public org.tempuri.Conceptos[] getConceptosPorPago(java.lang.String codigoCaso) throws GestionPagosException {
		 log.debug("inicio del metodo getConceptosPorPago");
		 ArrayList<Conceptos> listConceptos;
		 Connection con=null;
		 CallableStatement stmt=null;
		 ResultSet rs=null;
		 Conceptos[] list ;
		 try {
			 con= ConexionDirecta.getConexion(ConexionType.JDNI_PRUEBA);
			 stmt = con.prepareCall("BEGIN prueba(?, ?); END;");
			 stmt.setString(1,"BATCH");
			 stmt.registerOutParameter(2, OracleTypes.CURSOR); 
			 stmt.execute();
		     rs = (ResultSet)stmt.getObject(2);
		     listConceptos= new ArrayList<Conceptos>();
		     while (rs.next()) {
		    	 Conceptos c= new Conceptos();
					String codigoComprobante=rs.getString("PAR_VALOR");
					String descripcion=rs.getString("PAR_PARAMETRO");
					   c.setCodigo_Pago("233");
				       c.setTipo("Bases");
				       c.setConcepto(codigoComprobante);
				       c.setDescripcion(descripcion);
				       c.setBase("23483127");
				       c.setValor("23483127");
				       listConceptos.add(c);
		       }
		     list= listConceptos.toArray(new Conceptos[listConceptos.size()]);
		} catch (SQLException e1) {
			throw new GestionPagosException(e1.getMessage());
		}catch(GestionPagosException e) {
			throw new GestionPagosException(e.getMessage());
		}catch (Exception e) {
			throw new GestionPagosException(e.getMessage());
		}finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			}catch (SQLException e) {
				throw new GestionPagosException(e.getMessage());
			}
			
		}
		 log.debug("finalizando metodo getConceptosPorPago");
	    	return list;
	    }
}
