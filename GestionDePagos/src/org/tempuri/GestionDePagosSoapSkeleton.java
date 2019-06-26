/**
 * GestionDePagosSoapSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GestionDePagosSoapSkeleton implements org.tempuri.GestionDePagosSoap, org.apache.axis.wsdl.Skeleton {
    private org.tempuri.GestionDePagosSoap impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "fideicomiso"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getInformacionFideicomisos", _params, new javax.xml.namespace.QName("http://tempuri.org/", "GetInformacionFideicomisosResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfInformacionFideicomisos"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetInformacionFideicomisos"));
        _oper.setSoapAction("http://tempuri.org/GetInformacionFideicomisos");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getInformacionFideicomisos") == null) {
            _myOperations.put("getInformacionFideicomisos", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getInformacionFideicomisos")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Fideicomiso"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Operacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Identificacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Instruccion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Accion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Gmf"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "CausalRechazo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("setAplicaPagos", _params, new javax.xml.namespace.QName("http://tempuri.org/", "SetAplicaPagosResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "SetAplicaPagos"));
        _oper.setSoapAction("http://tempuri.org/SetAplicaPagos");
        _myOperationsList.add(_oper);
        if (_myOperations.get("setAplicaPagos") == null) {
            _myOperations.put("setAplicaPagos", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("setAplicaPagos")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "numeroCasoBizagi"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getInformacionPagos", _params, new javax.xml.namespace.QName("http://tempuri.org/", "GetInformacionPagosResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfInformacionPagosSIFI"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetInformacionPagos"));
        _oper.setSoapAction("http://tempuri.org/GetInformacionPagos");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getInformacionPagos") == null) {
            _myOperations.put("getInformacionPagos", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getInformacionPagos")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "p_fideicomiso"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getInformacionCuentas", _params, new javax.xml.namespace.QName("http://tempuri.org/", "GetInformacionCuentasResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfInformacionCuentas"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetInformacionCuentas"));
        _oper.setSoapAction("http://tempuri.org/GetInformacionCuentas");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getInformacionCuentas") == null) {
            _myOperations.put("getInformacionCuentas", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getInformacionCuentas")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "codigoCaso"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getConceptosPorPago", _params, new javax.xml.namespace.QName("http://tempuri.org/", "GetConceptosPorPagoResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfConceptos"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetConceptosPorPago"));
        _oper.setSoapAction("http://tempuri.org/GetConceptosPorPago");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getConceptosPorPago") == null) {
            _myOperations.put("getConceptosPorPago", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getConceptosPorPago")).add(_oper);
    }

    public GestionDePagosSoapSkeleton() {
        this.impl = new org.tempuri.GestionDePagosSoapImpl();
    }

    public GestionDePagosSoapSkeleton(org.tempuri.GestionDePagosSoap impl) {
        this.impl = impl;
    }
    public org.tempuri.InformacionFideicomisos[] getInformacionFideicomisos(java.lang.String fideicomiso) throws java.rmi.RemoteException
    {
        org.tempuri.InformacionFideicomisos[] ret = impl.getInformacionFideicomisos(fideicomiso);
        return ret;
    }

    public java.lang.String setAplicaPagos(java.lang.String fideicomiso, java.lang.String operacion, java.lang.String identificacion, java.lang.String instruccion, java.lang.String accion, java.lang.String usuario, java.lang.String gmf, java.lang.String causalRechazo) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.setAplicaPagos(fideicomiso, operacion, identificacion, instruccion, accion, usuario, gmf, causalRechazo);
        return ret;
    }

    public org.tempuri.InformacionPagosSIFI[] getInformacionPagos(java.lang.String numeroCasoBizagi) throws java.rmi.RemoteException
    {
        org.tempuri.InformacionPagosSIFI[] ret = impl.getInformacionPagos(numeroCasoBizagi);
        return ret;
    }

    public org.tempuri.InformacionCuentas[] getInformacionCuentas(java.lang.String p_fideicomiso) throws java.rmi.RemoteException
    {
        org.tempuri.InformacionCuentas[] ret = impl.getInformacionCuentas(p_fideicomiso);
        return ret;
    }

    public org.tempuri.Conceptos[] getConceptosPorPago(java.lang.String codigoCaso) throws java.rmi.RemoteException
    {
        org.tempuri.Conceptos[] ret = impl.getConceptosPorPago(codigoCaso);
        return ret;
    }

}
