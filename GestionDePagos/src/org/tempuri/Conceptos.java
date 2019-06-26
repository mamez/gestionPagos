/**
 * Conceptos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Conceptos  implements java.io.Serializable {
    private java.lang.String codigo_Pago;

    private java.lang.String tipo;

    private java.lang.String concepto;

    private java.lang.String descripcion;

    private java.lang.String base;

    private java.lang.String valor;

    private java.lang.String mensaje;

    public Conceptos() {
    }

    public Conceptos(
           java.lang.String codigo_Pago,
           java.lang.String tipo,
           java.lang.String concepto,
           java.lang.String descripcion,
           java.lang.String base,
           java.lang.String valor,
           java.lang.String mensaje) {
           this.codigo_Pago = codigo_Pago;
           this.tipo = tipo;
           this.concepto = concepto;
           this.descripcion = descripcion;
           this.base = base;
           this.valor = valor;
           this.mensaje = mensaje;
    }


    /**
     * Gets the codigo_Pago value for this Conceptos.
     * 
     * @return codigo_Pago
     */
    public java.lang.String getCodigo_Pago() {
        return codigo_Pago;
    }


    /**
     * Sets the codigo_Pago value for this Conceptos.
     * 
     * @param codigo_Pago
     */
    public void setCodigo_Pago(java.lang.String codigo_Pago) {
        this.codigo_Pago = codigo_Pago;
    }


    /**
     * Gets the tipo value for this Conceptos.
     * 
     * @return tipo
     */
    public java.lang.String getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this Conceptos.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the concepto value for this Conceptos.
     * 
     * @return concepto
     */
    public java.lang.String getConcepto() {
        return concepto;
    }


    /**
     * Sets the concepto value for this Conceptos.
     * 
     * @param concepto
     */
    public void setConcepto(java.lang.String concepto) {
        this.concepto = concepto;
    }


    /**
     * Gets the descripcion value for this Conceptos.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this Conceptos.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the base value for this Conceptos.
     * 
     * @return base
     */
    public java.lang.String getBase() {
        return base;
    }


    /**
     * Sets the base value for this Conceptos.
     * 
     * @param base
     */
    public void setBase(java.lang.String base) {
        this.base = base;
    }


    /**
     * Gets the valor value for this Conceptos.
     * 
     * @return valor
     */
    public java.lang.String getValor() {
        return valor;
    }


    /**
     * Sets the valor value for this Conceptos.
     * 
     * @param valor
     */
    public void setValor(java.lang.String valor) {
        this.valor = valor;
    }


    /**
     * Gets the mensaje value for this Conceptos.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this Conceptos.
     * 
     * @param mensaje
     */
    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Conceptos)) return false;
        Conceptos other = (Conceptos) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigo_Pago==null && other.getCodigo_Pago()==null) || 
             (this.codigo_Pago!=null &&
              this.codigo_Pago.equals(other.getCodigo_Pago()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.concepto==null && other.getConcepto()==null) || 
             (this.concepto!=null &&
              this.concepto.equals(other.getConcepto()))) &&
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion()))) &&
            ((this.base==null && other.getBase()==null) || 
             (this.base!=null &&
              this.base.equals(other.getBase()))) &&
            ((this.valor==null && other.getValor()==null) || 
             (this.valor!=null &&
              this.valor.equals(other.getValor()))) &&
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
        if (getCodigo_Pago() != null) {
            _hashCode += getCodigo_Pago().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getConcepto() != null) {
            _hashCode += getConcepto().hashCode();
        }
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        if (getBase() != null) {
            _hashCode += getBase().hashCode();
        }
        if (getValor() != null) {
            _hashCode += getValor().hashCode();
        }
        if (getMensaje() != null) {
            _hashCode += getMensaje().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Conceptos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Conceptos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo_Pago");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "codigo_Pago"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concepto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Concepto"));
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
        elemField.setFieldName("base");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Base"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Valor"));
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
