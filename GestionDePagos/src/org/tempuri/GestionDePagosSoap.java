/**
 * GestionDePagosSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface GestionDePagosSoap extends java.rmi.Remote {
    public org.tempuri.InformacionFideicomisos[] getInformacionFideicomisos(java.lang.String fideicomiso) throws java.rmi.RemoteException;
    public java.lang.String setAplicaPagos(java.lang.String fideicomiso, java.lang.String operacion, java.lang.String identificacion, java.lang.String instruccion, java.lang.String accion, java.lang.String usuario, java.lang.String gmf, java.lang.String causalRechazo) throws java.rmi.RemoteException;
    public org.tempuri.InformacionPagosSIFI[] getInformacionPagos(java.lang.String numeroCasoBizagi) throws java.rmi.RemoteException;
    public org.tempuri.InformacionCuentas[] getInformacionCuentas(java.lang.String p_fideicomiso) throws java.rmi.RemoteException;
    public org.tempuri.Conceptos[] getConceptosPorPago(java.lang.String codigoCaso) throws java.rmi.RemoteException;
}
