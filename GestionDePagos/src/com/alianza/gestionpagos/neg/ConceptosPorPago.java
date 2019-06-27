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
		 log.debug("inicio del metodo getConceptosPorPago");
		 Conceptos[] list ;
		 ArrayList<Conceptos> listConceptos;
		 Connection con=null;
		 CallableStatement stmt=null;
		 ResultSet rs=null;
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
		 }catch (SQLException e1) {
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
	 
	 
	 public org.tempuri.InformacionFideicomisos[] getInformacionFideicomisos(java.lang.String fideicomiso) throws GestionPagosException {
		 InformacionFideicomisos ifc = new InformacionFideicomisos();
		 try {
			 ifc.setFideicomiso("123");
			 ifc.setNombreFideicomiso("ACG");
			 ifc.setEncargo("1231");
			 ifc.setSaldoEncargo("400000");
			 ifc.setEstadoEncargo("N");
			 ifc.setNombreNegocioGrifus("AMC");
			 ifc.setUsuarioDirectorGestion("Daniel Manrique");
			 ifc.setDirectorGestion("SI");
			 ifc.setAsistenteGestion("Dora");
			 ifc.setSaldoTotal("100000000");
			 ifc.setSaldoCanje("104440");
			 ifc.setCtrlCancelacion("G");
			 ifc.setTotalReservado("GA");
			 ifc.setTotalDisponible("10");
			 
			
		} catch (Exception e) {
			throw new GestionPagosException(e.getMessage());
		}
		 log.debug("Informacion de los fidecomisos correctamente");
		 InformacionFideicomisos[] list = new InformacionFideicomisos[] {ifc};
		 return list;
	    }

	 
}
