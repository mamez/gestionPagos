/**
 * GestionDePagosLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GestionDePagosLocator extends org.apache.axis.client.Service implements org.tempuri.GestionDePagos {

    public GestionDePagosLocator() {
    }


    public GestionDePagosLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GestionDePagosLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GestionDePagosSoap
    private java.lang.String GestionDePagosSoap_address = "http://localhost:52562/GestionDePagos.asmx";

    public java.lang.String getGestionDePagosSoapAddress() {
        return GestionDePagosSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GestionDePagosSoapWSDDServiceName = "GestionDePagosSoap";

    public java.lang.String getGestionDePagosSoapWSDDServiceName() {
        return GestionDePagosSoapWSDDServiceName;
    }

    public void setGestionDePagosSoapWSDDServiceName(java.lang.String name) {
        GestionDePagosSoapWSDDServiceName = name;
    }

    public org.tempuri.GestionDePagosSoap getGestionDePagosSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GestionDePagosSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGestionDePagosSoap(endpoint);
    }

    public org.tempuri.GestionDePagosSoap getGestionDePagosSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.GestionDePagosSoapStub _stub = new org.tempuri.GestionDePagosSoapStub(portAddress, this);
            _stub.setPortName(getGestionDePagosSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGestionDePagosSoapEndpointAddress(java.lang.String address) {
        GestionDePagosSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.GestionDePagosSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.GestionDePagosSoapStub _stub = new org.tempuri.GestionDePagosSoapStub(new java.net.URL(GestionDePagosSoap_address), this);
                _stub.setPortName(getGestionDePagosSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("GestionDePagosSoap".equals(inputPortName)) {
            return getGestionDePagosSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "GestionDePagos");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "GestionDePagosSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GestionDePagosSoap".equals(portName)) {
            setGestionDePagosSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
