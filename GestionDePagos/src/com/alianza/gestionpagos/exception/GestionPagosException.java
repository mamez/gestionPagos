package com.alianza.gestionpagos.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GestionPagosException extends Exception {

	private static final long serialVersionUID = 1L;
	
	 private static final Logger log = LogManager.getLogger(GestionPagosException.class.getName());
		
	
	public GestionPagosException(String msg){
		super(msg);
		log.error("Error controlado: "+msg);
	}
	
	
	
	

}
