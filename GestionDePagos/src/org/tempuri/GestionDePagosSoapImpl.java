/**
 * GestionDePagosSoapImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.alianza.gestionpagos.exception.GestionPagosException;
import com.alianza.gestionpagos.neg.ConceptosPorPago;

public class GestionDePagosSoapImpl implements org.tempuri.GestionDePagosSoap{
	
	 private static final Logger log = LogManager.getLogger(GestionDePagosSoapImpl.class.getName());
	 
    public org.tempuri.InformacionFideicomisos[] getInformacionFideicomisos(java.lang.String fideicomiso) throws java.rmi.RemoteException {
        return null;
    }

    public java.lang.String setAplicaPagos(java.lang.String fideicomiso, java.lang.String operacion, java.lang.String identificacion, java.lang.String instruccion, java.lang.String accion, java.lang.String usuario, java.lang.String gmf, java.lang.String causalRechazo) throws java.rmi.RemoteException {
        return null;
    }

    public org.tempuri.InformacionPagosSIFI[] getInformacionPagos(java.lang.String numeroCasoBizagi) throws java.rmi.RemoteException {
        return null;
    }

    public org.tempuri.InformacionCuentas[] getInformacionCuentas(java.lang.String p_fideicomiso) throws java.rmi.RemoteException {
        return null;
    }

    public org.tempuri.Conceptos[] getConceptosPorPago(java.lang.String codigoCaso) throws java.rmi.RemoteException {
       try {
		return new ConceptosPorPago().getConceptosPorPago(codigoCaso);
	} catch (GestionPagosException e) {
		throw new RemoteException(e.getMessage());
	}
    }

}
