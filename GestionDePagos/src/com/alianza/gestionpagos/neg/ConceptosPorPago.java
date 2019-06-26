package com.alianza.gestionpagos.neg;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.tempuri.Conceptos;
import org.tempuri.GestionDePagosSoapImpl;
import org.tempuri.InformacionCuentas;
import org.tempuri.InformacionPagosSIFI;

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
		
		       
	     }catch (Exception e) {
			throw new GestionPagosException(e.getMessage());
		}
		 
		 log.debug("Finaliza correctamente el proceso");
	    	
	   
	       Conceptos[] list = new Conceptos[]{c,c2}; 
	    	return list;
	    }
	 
	 
	 public org.tempuri.InformacionCuentas[] getInformacionCuentas(java.lang.String p_fideicomiso) throws GestionPagosException {
		 InformacionCuentas i = new InformacionCuentas();
		 InformacionCuentas i2 = new InformacionCuentas();
		 
		 try {
			
		 i.setBanco("BBVA");
		 i.setSucursal("Bogota");
		 i.setClaseCuenta("CA");
		 i.setDescripcion("Persona Natural");
		 i.setNumeroCuenta("01013847");
		 
		 i2.setBanco("Davivienda");
		 i2.setSucursal("Cali");
		 i2.setClaseCuenta("CC");
		 i2.setDescripcion("Persona Natural");
		 i2.setNumeroCuenta("5432453221");
		
		 } catch (Exception e) {
				throw new GestionPagosException(e.getMessage());
			}
		 
		 log.debug("Informacion de las cuentas mostrada correctamente");
		 InformacionCuentas[] list = new InformacionCuentas[]{i,i2};
		 
		 return list;
	    }
	 
	 public org.tempuri.InformacionPagosSIFI[] getInformacionPagos(java.lang.String numeroCasoBizagi) throws GestionPagosException {
		 InformacionPagosSIFI ips = new InformacionPagosSIFI();
		 
		 try {
			
		 ips.setTipo_cuenta_origen("");
		 ips.setBanco_origen("");
		 ips.setEncargo("103846461");
		 ips.setNum_cuenta_origen("");
		 ips.setNum_fideicomiso("31231");
		 ips.setNombre_fideicomiso("FIDEICOMISO LA ESPERANZA");
		 ips.setValor_orden_giro("847236");
		 ips.setNum_identificacion_causacion("42342");
		 ips.setNombre_tercero("CASTILLO RUBIO ALVARO EDUARDO");
		 ips.setDescri_pago("Pruebas");
		 ips.setDescripcion_concepto("Entrega excedentes");
		 ips.setConcepto("1038476");
		 ips.setValor_neto("100310");
		 ips.setTipo_pago("AC");
		 ips.setEstado_pago("G");
		 ips.setTipo_cuenta_desti("");
		 ips.setBanco_desti("");
		 ips.setNum_cuenta_desti("");
		 ips.setBanco_desti("");
		 ips.setEncargo_destino("");
		 ips.setNum_identificacion_giro("79435288");
		 ips.setNombre_tercero_giro("SANINT ECHEVERRI JUAN CARLOS");
		 ips.setGmf("");
		 ips.setOrden_pago("123");
		 ips.setNum_instruccion("43213");
		 ips.setDescri_instruccion_pago("");
		 ips.setNumero_operacion("");
		 ips.setGmfSugerido("N");
		 
		 } catch (Exception e) {
			 throw new GestionPagosException(e.getMessage());
			}
		 log.debug("Informacion de las cuentas mostrada correctamente");
		 InformacionPagosSIFI[] list = new InformacionPagosSIFI[] {ips};
		 return list;
	 }
	 

	 
}
