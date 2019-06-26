/**
 * InformacionCuentas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InformacionCuentas  implements java.io.Serializable {
    private java.lang.String banco;

    private java.lang.String sucursal;

    private java.lang.String claseCuenta;

    private java.lang.String descripcion;

    private java.lang.String numeroCuenta;

    private java.lang.String mensaje;

    public InformacionCuentas() {
    }

    public InformacionCuentas(
           java.lang.String banco,
           java.lang.String sucursal,
           java.lang.String claseCuenta,
           java.lang.String descripcion,
           java.lang.String numeroCuenta,
           java.lang.String mensaje) {
           this.banco = banco;
           this.sucursal = sucursal;
           this.claseCuenta = claseCuenta;
           this.descripcion = descripcion;
           this.numeroCuenta = numeroCuenta;
           this.mensaje = mensaje;
    }


    /**
     * Gets the banco value for this InformacionCuentas.
     * 
     * @return banco
     */
    public java.lang.String getBanco() {
        return banco;
    }


    /**
     * Sets the banco value for this InformacionCuentas.
     * 
     * @param banco
     */
    public void setBanco(java.lang.String banco) {
        this.banco = banco;
    }


    /**
     * Gets the sucursal value for this InformacionCuentas.
     * 
     * @return sucursal
     */
    public java.lang.String getSucursal() {
        return sucursal;
    }


    /**
     * Sets the sucursal value for this InformacionCuentas.
     * 
     * @param sucursal
     */
    public void setSucursal(java.lang.String sucursal) {
        this.sucursal = sucursal;
    }


    /**
     * Gets the claseCuenta value for this InformacionCuentas.
     * 
     * @return claseCuenta
     */
    public java.lang.String getClaseCuenta() {
        return claseCuenta;
    }


    /**
     * Sets the claseCuenta value for this InformacionCuentas.
     * 
     * @param claseCuenta
     */
    public void setClaseCuenta(java.lang.String claseCuenta) {
        this.claseCuenta = claseCuenta;
    }


    /**
     * Gets the descripcion value for this InformacionCuentas.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this InformacionCuentas.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the numeroCuenta value for this InformacionCuentas.
     * 
     * @return numeroCuenta
     */
    public java.lang.String getNumeroCuenta() {
        return numeroCuenta;
    }


    /**
     * Sets the numeroCuenta value for this InformacionCuentas.
     * 
     * @param numeroCuenta
     */
    public void setNumeroCuenta(java.lang.String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }


    /**
     * Gets the mensaje value for this InformacionCuentas.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this InformacionCuentas.
     * 
     * @param mensaje
     */
    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InformacionCuentas)) return false;
        InformacionCuentas other = (InformacionCuentas) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.banco==null && other.getBanco()==null) || 
             (this.banco!=null &&
              this.banco.equals(other.getBanco()))) &&
            ((this.sucursal==null && other.getSucursal()==null) || 
             (this.sucursal!=null &&
              this.sucursal.equals(other.getSucursal()))) &&
            ((this.claseCuenta==null && other.getClaseCuenta()==null) || 
             (this.claseCuenta!=null &&
              this.claseCuenta.equals(other.getClaseCuenta()))) &&
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion()))) &&
            ((this.numeroCuenta==null && other.getNumeroCuenta()==null) || 
             (this.numeroCuenta!=null &&
              this.numeroCuenta.equals(other.getNumeroCuenta()))) &&
            ((this.mensaje==null && other.getMensaje()==null) || 
             (this.mensaje!=null &&
              this.mensaje.equals(other.getMensaje())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBanco() != null) {
            _hashCode += getBanco().hashCode();
        }
        if (getSucursal() != null) {
            _hashCode += getSucursal().hashCode();
        }
        if (getClaseCuenta() != null) {
            _hashCode += getClaseCuenta().hashCode();
        }
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        if (getNumeroCuenta() != null) {
            _hashCode += getNumeroCuenta().hashCode();
        }
        if (getMensaje() != null) {
            _hashCode += getMensaje().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InformacionCuentas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "InformacionCuentas"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("banco");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Banco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sucursal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Sucursal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claseCuenta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ClaseCuenta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Descripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroCuenta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NumeroCuenta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Mensaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
