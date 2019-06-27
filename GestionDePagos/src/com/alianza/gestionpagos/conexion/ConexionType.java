package com.alianza.gestionpagos.conexion;

public enum ConexionType {
	JDNI_PRUEBA("jdbc/glvLocal");
	
	
	private final String jdni;
	
	ConexionType(String jdni){
		this.jdni=jdni;
	}

	public String getJdni() {
		return jdni;
	}
	
	
}
