package com.alianza.gestionpagos.neg;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.tempuri.Conceptos;
import org.tempuri.GestionDePagosSoapImpl;

import com.alianza.gestionpagos.exception.GestionPagosException;

public class ConceptosPorPago {

	 private static final Logger log = LogManager.getLogger(GestionDePagosSoapImpl.class.getName());
	 
	 public org.tempuri.Conceptos[] getConceptosPorPago(java.lang.String codigoCaso) throws GestionPagosException {
		 Conceptos c= new Conceptos();
		 Conceptos c2= new Conceptos();
		 try {
			 c.setCodigo_Pago("233");
		       c.setTipo("Bases");
		       c.setConcepto("ATC");
		       c.setDescripcion("ANTICIPOS DE CONTRATO");
		       c.setBase("23483127");
		       c.setValor("23483127");
		       
		       
		       c2.setCodigo_Pago("233");
		       c2.setTipo("Bases");
		       c2.setConcepto("ATC");
		       c2.setDescripcion("ANTICIPOS DE CONTRATO");
		       c2.setBase("23483127");
		       c2.setValor("23483127");
		       String n1="0";
		       int a=1/Integer.parseInt(n1);
		       
	     }catch (Exception e) {
			throw new GestionPagosException(e.getMessage());
		}
		 
		 log.debug("hola mundo");
	    	
	      
	       
	       Conceptos[] list = new Conceptos[]{c,c2}; 
	    	return list;
	    }
}
