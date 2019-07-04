package com.alianza.gestionpagos.conexion;

public enum ConexionType {
	
    JDNI_PRUEBA("jdbc/glvLocal"),
    BASE_DATOS_PREUBA2("jdbc/local2"),
    BD_SIFIDESA_VU_SFI("jdbc/vusfiLocal");
	
	
	private final String jdni;
	
	ConexionType(String jdni){
		this.jdni=jdni;
	}

	public String getJdni() {
		return jdni;
	}

}
