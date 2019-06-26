/**
 * InformacionPagosSIFI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InformacionPagosSIFI  implements java.io.Serializable {
    private java.lang.String tipo_cuenta_origen;

    private java.lang.String banco_origen;

    private java.lang.String encargo;

    private java.lang.String num_cuenta_origen;

    private java.lang.String num_fideicomiso;

    private java.lang.String nombre_fideicomiso;

    private java.lang.String valor_orden_giro;

    private java.lang.String num_identificacion_causacion;

    private java.lang.String nombre_tercero;

    private java.lang.String descri_pago;

    private java.lang.String descripcion_concepto;

    private java.lang.String concepto;

    private java.lang.String valor_neto;

    private java.lang.String tipo_pago;

    private java.lang.String estado_pago;

    private java.lang.String tipo_cuenta_desti;

    private java.lang.String banco_desti;

    private java.lang.String num_cuenta_desti;

    private java.lang.String encargo_destino;

    private java.lang.String num_identificacion_giro;

    private java.lang.String nombre_tercero_giro;

    private java.lang.String gmf;

    private java.lang.String orden_pago;

    private java.lang.String num_instruccion;

    private java.lang.String descri_instruccion_pago;

    private java.lang.String numero_operacion;

    private java.lang.String gmfSugerido;

    private java.lang.String mensaje;

    private org.tempuri.Conceptos[] conceptoPago;

    public InformacionPagosSIFI() {
    }

    public InformacionPagosSIFI(
           java.lang.String tipo_cuenta_origen,
           java.lang.String banco_origen,
           java.lang.String encargo,
           java.lang.String num_cuenta_origen,
           java.lang.String num_fideicomiso,
           java.lang.String nombre_fideicomiso,
           java.lang.String valor_orden_giro,
           java.lang.String num_identificacion_causacion,
           java.lang.String nombre_tercero,
           java.lang.String descri_pago,
           java.lang.String descripcion_concepto,
           java.lang.String concepto,
           java.lang.String valor_neto,
           java.lang.String tipo_pago,
           java.lang.String estado_pago,
           java.lang.String tipo_cuenta_desti,
           java.lang.String banco_desti,
           java.lang.String num_cuenta_desti,
           java.lang.String encargo_destino,
           java.lang.String num_identificacion_giro,
           java.lang.String nombre_tercero_giro,
           java.lang.String gmf,
           java.lang.String orden_pago,
           java.lang.String num_instruccion,
           java.lang.String descri_instruccion_pago,
           java.lang.String numero_operacion,
           java.lang.String gmfSugerido,
           java.lang.String mensaje,
           org.tempuri.Conceptos[] conceptoPago) {
           this.tipo_cuenta_origen = tipo_cuenta_origen;
           this.banco_origen = banco_origen;
           this.encargo = encargo;
           this.num_cuenta_origen = num_cuenta_origen;
           this.num_fideicomiso = num_fideicomiso;
           this.nombre_fideicomiso = nombre_fideicomiso;
           this.valor_orden_giro = valor_orden_giro;
           this.num_identificacion_causacion = num_identificacion_causacion;
           this.nombre_tercero = nombre_tercero;
           this.descri_pago = descri_pago;
           this.descripcion_concepto = descripcion_concepto;
           this.concepto = concepto;
           this.valor_neto = valor_neto;
           this.tipo_pago = tipo_pago;
           this.estado_pago = estado_pago;
           this.tipo_cuenta_desti = tipo_cuenta_desti;
           this.banco_desti = banco_desti;
           this.num_cuenta_desti = num_cuenta_desti;
           this.encargo_destino = encargo_destino;
           this.num_identificacion_giro = num_identificacion_giro;
           this.nombre_tercero_giro = nombre_tercero_giro;
           this.gmf = gmf;
           this.orden_pago = orden_pago;
           this.num_instruccion = num_instruccion;
           this.descri_instruccion_pago = descri_instruccion_pago;
           this.numero_operacion = numero_operacion;
           this.gmfSugerido = gmfSugerido;
           this.mensaje = mensaje;
           this.conceptoPago = conceptoPago;
    }


    /**
     * Gets the tipo_cuenta_origen value for this InformacionPagosSIFI.
     * 
     * @return tipo_cuenta_origen
     */
    public java.lang.String getTipo_cuenta_origen() {
        return tipo_cuenta_origen;
    }


    /**
     * Sets the tipo_cuenta_origen value for this InformacionPagosSIFI.
     * 
     * @param tipo_cuenta_origen
     */
    public void setTipo_cuenta_origen(java.lang.String tipo_cuenta_origen) {
        this.tipo_cuenta_origen = tipo_cuenta_origen;
    }


    /**
     * Gets the banco_origen value for this InformacionPagosSIFI.
     * 
     * @return banco_origen
     */
    public java.lang.String getBanco_origen() {
        return banco_origen;
    }


    /**
     * Sets the banco_origen value for this InformacionPagosSIFI.
     * 
     * @param banco_origen
     */
    public void setBanco_origen(java.lang.String banco_origen) {
        this.banco_origen = banco_origen;
    }


    /**
     * Gets the encargo value for this InformacionPagosSIFI.
     * 
     * @return encargo
     */
    public java.lang.String getEncargo() {
        return encargo;
    }


    /**
     * Sets the encargo value for this InformacionPagosSIFI.
     * 
     * @param encargo
     */
    public void setEncargo(java.lang.String encargo) {
        this.encargo = encargo;
    }


    /**
     * Gets the num_cuenta_origen value for this InformacionPagosSIFI.
     * 
     * @return num_cuenta_origen
     */
    public java.lang.String getNum_cuenta_origen() {
        return num_cuenta_origen;
    }


    /**
     * Sets the num_cuenta_origen value for this InformacionPagosSIFI.
     * 
     * @param num_cuenta_origen
     */
    public void setNum_cuenta_origen(java.lang.String num_cuenta_origen) {
        this.num_cuenta_origen = num_cuenta_origen;
    }


    /**
     * Gets the num_fideicomiso value for this InformacionPagosSIFI.
     * 
     * @return num_fideicomiso
     */
    public java.lang.String getNum_fideicomiso() {
        return num_fideicomiso;
    }


    /**
     * Sets the num_fideicomiso value for this InformacionPagosSIFI.
     * 
     * @param num_fideicomiso
     */
    public void setNum_fideicomiso(java.lang.String num_fideicomiso) {
        this.num_fideicomiso = num_fideicomiso;
    }


    /**
     * Gets the nombre_fideicomiso value for this InformacionPagosSIFI.
     * 
     * @return nombre_fideicomiso
     */
    public java.lang.String getNombre_fideicomiso() {
        return nombre_fideicomiso;
    }


    /**
     * Sets the nombre_fideicomiso value for this InformacionPagosSIFI.
     * 
     * @param nombre_fideicomiso
     */
    public void setNombre_fideicomiso(java.lang.String nombre_fideicomiso) {
        this.nombre_fideicomiso = nombre_fideicomiso;
    }


    /**
     * Gets the valor_orden_giro value for this InformacionPagosSIFI.
     * 
     * @return valor_orden_giro
     */
    public java.lang.String getValor_orden_giro() {
        return valor_orden_giro;
    }


    /**
     * Sets the valor_orden_giro value for this InformacionPagosSIFI.
     * 
     * @param valor_orden_giro
     */
    public void setValor_orden_giro(java.lang.String valor_orden_giro) {
        this.valor_orden_giro = valor_orden_giro;
    }


    /**
     * Gets the num_identificacion_causacion value for this InformacionPagosSIFI.
     * 
     * @return num_identificacion_causacion
     */
    public java.lang.String getNum_identificacion_causacion() {
        return num_identificacion_causacion;
    }


    /**
     * Sets the num_identificacion_causacion value for this InformacionPagosSIFI.
     * 
     * @param num_identificacion_causacion
     */
    public void setNum_identificacion_causacion(java.lang.String num_identificacion_causacion) {
        this.num_identificacion_causacion = num_identificacion_causacion;
    }


    /**
     * Gets the nombre_tercero value for this InformacionPagosSIFI.
     * 
     * @return nombre_tercero
     */
    public java.lang.String getNombre_tercero() {
        return nombre_tercero;
    }


    /**
     * Sets the nombre_tercero value for this InformacionPagosSIFI.
     * 
     * @param nombre_tercero
     */
    public void setNombre_tercero(java.lang.String nombre_tercero) {
        this.nombre_tercero = nombre_tercero;
    }


    /**
     * Gets the descri_pago value for this InformacionPagosSIFI.
     * 
     * @return descri_pago
     */
    public java.lang.String getDescri_pago() {
        return descri_pago;
    }


    /**
     * Sets the descri_pago value for this InformacionPagosSIFI.
     * 
     * @param descri_pago
     */
    public void setDescri_pago(java.lang.String descri_pago) {
        this.descri_pago = descri_pago;
    }


    /**
     * Gets the descripcion_concepto value for this InformacionPagosSIFI.
     * 
     * @return descripcion_concepto
     */
    public java.lang.String getDescripcion_concepto() {
        return descripcion_concepto;
    }


    /**
     * Sets the descripcion_concepto value for this InformacionPagosSIFI.
     * 
     * @param descripcion_concepto
     */
    public void setDescripcion_concepto(java.lang.String descripcion_concepto) {
        this.descripcion_concepto = descripcion_concepto;
    }


    /**
     * Gets the concepto value for this InformacionPagosSIFI.
     * 
     * @return concepto
     */
    public java.lang.String getConcepto() {
        return concepto;
    }


    /**
     * Sets the concepto value for this InformacionPagosSIFI.
     * 
     * @param concepto
     */
    public void setConcepto(java.lang.String concepto) {
        this.concepto = concepto;
    }


    /**
     * Gets the valor_neto value for this InformacionPagosSIFI.
     * 
     * @return valor_neto
     */
    public java.lang.String getValor_neto() {
        return valor_neto;
    }


    /**
     * Sets the valor_neto value for this InformacionPagosSIFI.
     * 
     * @param valor_neto
     */
    public void setValor_neto(java.lang.String valor_neto) {
        this.valor_neto = valor_neto;
    }


    /**
     * Gets the tipo_pago value for this InformacionPagosSIFI.
     * 
     * @return tipo_pago
     */
    public java.lang.String getTipo_pago() {
        return tipo_pago;
    }


    /**
     * Sets the tipo_pago value for this InformacionPagosSIFI.
     * 
     * @param tipo_pago
     */
    public void setTipo_pago(java.lang.String tipo_pago) {
        this.tipo_pago = tipo_pago;
    }


    /**
     * Gets the estado_pago value for this InformacionPagosSIFI.
     * 
     * @return estado_pago
     */
    public java.lang.String getEstado_pago() {
        return estado_pago;
    }


    /**
     * Sets the estado_pago value for this InformacionPagosSIFI.
     * 
     * @param estado_pago
     */
    public void setEstado_pago(java.lang.String estado_pago) {
        this.estado_pago = estado_pago;
    }


    /**
     * Gets the tipo_cuenta_desti value for this InformacionPagosSIFI.
     * 
     * @return tipo_cuenta_desti
     */
    public java.lang.String getTipo_cuenta_desti() {
        return tipo_cuenta_desti;
    }


    /**
     * Sets the tipo_cuenta_desti value for this InformacionPagosSIFI.
     * 
     * @param tipo_cuenta_desti
     */
    public void setTipo_cuenta_desti(java.lang.String tipo_cuenta_desti) {
        this.tipo_cuenta_desti = tipo_cuenta_desti;
    }


    /**
     * Gets the banco_desti value for this InformacionPagosSIFI.
     * 
     * @return banco_desti
     */
    public java.lang.String getBanco_desti() {
        return banco_desti;
    }


    /**
     * Sets the banco_desti value for this InformacionPagosSIFI.
     * 
     * @param banco_desti
     */
    public void setBanco_desti(java.lang.String banco_desti) {
        this.banco_desti = banco_desti;
    }


    /**
     * Gets the num_cuenta_desti value for this InformacionPagosSIFI.
     * 
     * @return num_cuenta_desti
     */
    public java.lang.String getNum_cuenta_desti() {
        return num_cuenta_desti;
    }


    /**
     * Sets the num_cuenta_desti value for this InformacionPagosSIFI.
     * 
     * @param num_cuenta_desti
     */
    public void setNum_cuenta_desti(java.lang.String num_cuenta_desti) {
        this.num_cuenta_desti = num_cuenta_desti;
    }


    /**
     * Gets the encargo_destino value for this InformacionPagosSIFI.
     * 
     * @return encargo_destino
     */
    public java.lang.String getEncargo_destino() {
        return encargo_destino;
    }


    /**
     * Sets the encargo_destino value for this InformacionPagosSIFI.
     * 
     * @param encargo_destino
     */
    public void setEncargo_destino(java.lang.String encargo_destino) {
        this.encargo_destino = encargo_destino;
    }


    /**
     * Gets the num_identificacion_giro value for this InformacionPagosSIFI.
     * 
     * @return num_identificacion_giro
     */
    public java.lang.String getNum_identificacion_giro() {
        return num_identificacion_giro;
    }


    /**
     * Sets the num_identificacion_giro value for this InformacionPagosSIFI.
     * 
     * @param num_identificacion_giro
     */
    public void setNum_identificacion_giro(java.lang.String num_identificacion_giro) {
        this.num_identificacion_giro = num_identificacion_giro;
    }


    /**
     * Gets the nombre_tercero_giro value for this InformacionPagosSIFI.
     * 
     * @return nombre_tercero_giro
     */
    public java.lang.String getNombre_tercero_giro() {
        return nombre_tercero_giro;
    }


    /**
     * Sets the nombre_tercero_giro value for this InformacionPagosSIFI.
     * 
     * @param nombre_tercero_giro
     */
    public void setNombre_tercero_giro(java.lang.String nombre_tercero_giro) {
        this.nombre_tercero_giro = nombre_tercero_giro;
    }


    /**
     * Gets the gmf value for this InformacionPagosSIFI.
     * 
     * @return gmf
     */
    public java.lang.String getGmf() {
        return gmf;
    }


    /**
     * Sets the gmf value for this InformacionPagosSIFI.
     * 
     * @param gmf
     */
    public void setGmf(java.lang.String gmf) {
        this.gmf = gmf;
    }


    /**
     * Gets the orden_pago value for this InformacionPagosSIFI.
     * 
     * @return orden_pago
     */
    public java.lang.String getOrden_pago() {
        return orden_pago;
    }


    /**
     * Sets the orden_pago value for this InformacionPagosSIFI.
     * 
     * @param orden_pago
     */
    public void setOrden_pago(java.lang.String orden_pago) {
        this.orden_pago = orden_pago;
    }


    /**
     * Gets the num_instruccion value for this InformacionPagosSIFI.
     * 
     * @return num_instruccion
     */
    public java.lang.String getNum_instruccion() {
        return num_instruccion;
    }


    /**
     * Sets the num_instruccion value for this InformacionPagosSIFI.
     * 
     * @param num_instruccion
     */
    public void setNum_instruccion(java.lang.String num_instruccion) {
        this.num_instruccion = num_instruccion;
    }


    /**
     * Gets the descri_instruccion_pago value for this InformacionPagosSIFI.
     * 
     * @return descri_instruccion_pago
     */
    public java.lang.String getDescri_instruccion_pago() {
        return descri_instruccion_pago;
    }


    /**
     * Sets the descri_instruccion_pago value for this InformacionPagosSIFI.
     * 
     * @param descri_instruccion_pago
     */
    public void setDescri_instruccion_pago(java.lang.String descri_instruccion_pago) {
        this.descri_instruccion_pago = descri_instruccion_pago;
    }


    /**
     * Gets the numero_operacion value for this InformacionPagosSIFI.
     * 
     * @return numero_operacion
     */
    public java.lang.String getNumero_operacion() {
        return numero_operacion;
    }


    /**
     * Sets the numero_operacion value for this InformacionPagosSIFI.
     * 
     * @param numero_operacion
     */
    public void setNumero_operacion(java.lang.String numero_operacion) {
        this.numero_operacion = numero_operacion;
    }


    /**
     * Gets the gmfSugerido value for this InformacionPagosSIFI.
     * 
     * @return gmfSugerido
     */
    public java.lang.String getGmfSugerido() {
        return gmfSugerido;
    }


    /**
     * Sets the gmfSugerido value for this InformacionPagosSIFI.
     * 
     * @param gmfSugerido
     */
    public void setGmfSugerido(java.lang.String gmfSugerido) {
        this.gmfSugerido = gmfSugerido;
    }


    /**
     * Gets the mensaje value for this InformacionPagosSIFI.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this InformacionPagosSIFI.
     * 
     * @param mensaje
     */
    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }


    /**
     * Gets the conceptoPago value for this InformacionPagosSIFI.
     * 
     * @return conceptoPago
     */
    public org.tempuri.Conceptos[] getConceptoPago() {
        return conceptoPago;
    }


    /**
     * Sets the conceptoPago value for this InformacionPagosSIFI.
     * 
     * @param conceptoPago
     */
    public void setConceptoPago(org.tempuri.Conceptos[] conceptoPago) {
        this.conceptoPago = conceptoPago;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InformacionPagosSIFI)) return false;
        InformacionPagosSIFI other = (InformacionPagosSIFI) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipo_cuenta_origen==null && other.getTipo_cuenta_origen()==null) || 
             (this.tipo_cuenta_origen!=null &&
              this.tipo_cuenta_origen.equals(other.getTipo_cuenta_origen()))) &&
            ((this.banco_origen==null && other.getBanco_origen()==null) || 
             (this.banco_origen!=null &&
              this.banco_origen.equals(other.getBanco_origen()))) &&
            ((this.encargo==null && other.getEncargo()==null) || 
             (this.encargo!=null &&
              this.encargo.equals(other.getEncargo()))) &&
            ((this.num_cuenta_origen==null && other.getNum_cuenta_origen()==null) || 
             (this.num_cuenta_origen!=null &&
              this.num_cuenta_origen.equals(other.getNum_cuenta_origen()))) &&
            ((this.num_fideicomiso==null && other.getNum_fideicomiso()==null) || 
             (this.num_fideicomiso!=null &&
              this.num_fideicomiso.equals(other.getNum_fideicomiso()))) &&
            ((this.nombre_fideicomiso==null && other.getNombre_fideicomiso()==null) || 
             (this.nombre_fideicomiso!=null &&
              this.nombre_fideicomiso.equals(other.getNombre_fideicomiso()))) &&
            ((this.valor_orden_giro==null && other.getValor_orden_giro()==null) || 
             (this.valor_orden_giro!=null &&
              this.valor_orden_giro.equals(other.getValor_orden_giro()))) &&
            ((this.num_identificacion_causacion==null && other.getNum_identificacion_causacion()==null) || 
             (this.num_identificacion_causacion!=null &&
              this.num_identificacion_causacion.equals(other.getNum_identificacion_causacion()))) &&
            ((this.nombre_tercero==null && other.getNombre_tercero()==null) || 
             (this.nombre_tercero!=null &&
              this.nombre_tercero.equals(other.getNombre_tercero()))) &&
            ((this.descri_pago==null && other.getDescri_pago()==null) || 
             (this.descri_pago!=null &&
              this.descri_pago.equals(other.getDescri_pago()))) &&
            ((this.descripcion_concepto==null && other.getDescripcion_concepto()==null) || 
             (this.descripcion_concepto!=null &&
              this.descripcion_concepto.equals(other.getDescripcion_concepto()))) &&
            ((this.concepto==null && other.getConcepto()==null) || 
             (this.concepto!=null &&
              this.concepto.equals(other.getConcepto()))) &&
            ((this.valor_neto==null && other.getValor_neto()==null) || 
             (this.valor_neto!=null &&
              this.valor_neto.equals(other.getValor_neto()))) &&
            ((this.tipo_pago==null && other.getTipo_pago()==null) || 
             (this.tipo_pago!=null &&
              this.tipo_pago.equals(other.getTipo_pago()))) &&
            ((this.estado_pago==null && other.getEstado_pago()==null) || 
             (this.estado_pago!=null &&
              this.estado_pago.equals(other.getEstado_pago()))) &&
            ((this.tipo_cuenta_desti==null && other.getTipo_cuenta_desti()==null) || 
             (this.tipo_cuenta_desti!=null &&
              this.tipo_cuenta_desti.equals(other.getTipo_cuenta_desti()))) &&
            ((this.banco_desti==null && other.getBanco_desti()==null) || 
             (this.banco_desti!=null &&
              this.banco_desti.equals(other.getBanco_desti()))) &&
            ((this.num_cuenta_desti==null && other.getNum_cuenta_desti()==null) || 
             (this.num_cuenta_desti!=null &&
              this.num_cuenta_desti.equals(other.getNum_cuenta_desti()))) &&
            ((this.encargo_destino==null && other.getEncargo_destino()==null) || 
             (this.encargo_destino!=null &&
              this.encargo_destino.equals(other.getEncargo_destino()))) &&
            ((this.num_identificacion_giro==null && other.getNum_identificacion_giro()==null) || 
             (this.num_identificacion_giro!=null &&
              this.num_identificacion_giro.equals(other.getNum_identificacion_giro()))) &&
            ((this.nombre_tercero_giro==null && other.getNombre_tercero_giro()==null) || 
             (this.nombre_tercero_giro!=null &&
              this.nombre_tercero_giro.equals(other.getNombre_tercero_giro()))) &&
            ((this.gmf==null && other.getGmf()==null) || 
             (this.gmf!=null &&
              this.gmf.equals(other.getGmf()))) &&
            ((this.orden_pago==null && other.getOrden_pago()==null) || 
             (this.orden_pago!=null &&
              this.orden_pago.equals(other.getOrden_pago()))) &&
            ((this.num_instruccion==null && other.getNum_instruccion()==null) || 
             (this.num_instruccion!=null &&
              this.num_instruccion.equals(other.getNum_instruccion()))) &&
            ((this.descri_instruccion_pago==null && other.getDescri_instruccion_pago()==null) || 
             (this.descri_instruccion_pago!=null &&
              this.descri_instruccion_pago.equals(other.getDescri_instruccion_pago()))) &&
            ((this.numero_operacion==null && other.getNumero_operacion()==null) || 
             (this.numero_operacion!=null &&
              this.numero_operacion.equals(other.getNumero_operacion()))) &&
            ((this.gmfSugerido==null && other.getGmfSugerido()==null) || 
             (this.gmfSugerido!=null &&
              this.gmfSugerido.equals(other.getGmfSugerido()))) &&
            ((this.mensaje==null && other.getMensaje()==null) || 
             (this.mensaje!=null &&
              this.mensaje.equals(other.getMensaje()))) &&
            ((this.conceptoPago==null && other.getConceptoPago()==null) || 
             (this.conceptoPago!=null &&
              java.util.Arrays.equals(this.conceptoPago, other.getConceptoPago())));
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
        if (getTipo_cuenta_origen() != null) {
            _hashCode += getTipo_cuenta_origen().hashCode();
        }
        if (getBanco_origen() != null) {
            _hashCode += getBanco_origen().hashCode();
        }
        if (getEncargo() != null) {
            _hashCode += getEncargo().hashCode();
        }
        if (getNum_cuenta_origen() != null) {
            _hashCode += getNum_cuenta_origen().hashCode();
        }
        if (getNum_fideicomiso() != null) {
            _hashCode += getNum_fideicomiso().hashCode();
        }
        if (getNombre_fideicomiso() != null) {
            _hashCode += getNombre_fideicomiso().hashCode();
        }
        if (getValor_orden_giro() != null) {
            _hashCode += getValor_orden_giro().hashCode();
        }
        if (getNum_identificacion_causacion() != null) {
            _hashCode += getNum_identificacion_causacion().hashCode();
        }
        if (getNombre_tercero() != null) {
            _hashCode += getNombre_tercero().hashCode();
        }
        if (getDescri_pago() != null) {
            _hashCode += getDescri_pago().hashCode();
        }
        if (getDescripcion_concepto() != null) {
            _hashCode += getDescripcion_concepto().hashCode();
        }
        if (getConcepto() != null) {
            _hashCode += getConcepto().hashCode();
        }
        if (getValor_neto() != null) {
            _hashCode += getValor_neto().hashCode();
        }
        if (getTipo_pago() != null) {
            _hashCode += getTipo_pago().hashCode();
        }
        if (getEstado_pago() != null) {
            _hashCode += getEstado_pago().hashCode();
        }
        if (getTipo_cuenta_desti() != null) {
            _hashCode += getTipo_cuenta_desti().hashCode();
        }
        if (getBanco_desti() != null) {
            _hashCode += getBanco_desti().hashCode();
        }
        if (getNum_cuenta_desti() != null) {
            _hashCode += getNum_cuenta_desti().hashCode();
        }
        if (getEncargo_destino() != null) {
            _hashCode += getEncargo_destino().hashCode();
        }
        if (getNum_identificacion_giro() != null) {
            _hashCode += getNum_identificacion_giro().hashCode();
        }
        if (getNombre_tercero_giro() != null) {
            _hashCode += getNombre_tercero_giro().hashCode();
        }
        if (getGmf() != null) {
            _hashCode += getGmf().hashCode();
        }
        if (getOrden_pago() != null) {
            _hashCode += getOrden_pago().hashCode();
        }
        if (getNum_instruccion() != null) {
            _hashCode += getNum_instruccion().hashCode();
        }
        if (getDescri_instruccion_pago() != null) {
            _hashCode += getDescri_instruccion_pago().hashCode();
        }
        if (getNumero_operacion() != null) {
            _hashCode += getNumero_operacion().hashCode();
        }
        if (getGmfSugerido() != null) {
            _hashCode += getGmfSugerido().hashCode();
        }
        if (getMensaje() != null) {
            _hashCode += getMensaje().hashCode();
        }
        if (getConceptoPago() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConceptoPago());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConceptoPago(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InformacionPagosSIFI.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "InformacionPagosSIFI"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo_cuenta_origen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Tipo_cuenta_origen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("banco_origen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Banco_origen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encargo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Encargo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("num_cuenta_origen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Num_cuenta_origen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("num_fideicomiso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Num_fideicomiso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre_fideicomiso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Nombre_fideicomiso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valor_orden_giro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Valor_orden_giro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("num_identificacion_causacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Num_identificacion_causacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre_tercero");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Nombre_tercero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descri_pago");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Descri_pago"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcion_concepto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Descripcion_concepto"));
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
        elemField.setFieldName("valor_neto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Valor_neto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo_pago");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Tipo_pago"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado_pago");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Estado_pago"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo_cuenta_desti");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Tipo_cuenta_desti"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("banco_desti");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Banco_desti"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("num_cuenta_desti");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Num_cuenta_desti"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encargo_destino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Encargo_destino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("num_identificacion_giro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Num_identificacion_giro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre_tercero_giro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Nombre_tercero_giro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gmf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Gmf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orden_pago");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Orden_pago"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("num_instruccion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Num_instruccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descri_instruccion_pago");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Descri_instruccion_pago"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero_operacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Numero_operacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gmfSugerido");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GmfSugerido"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conceptoPago");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ConceptoPago"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Conceptos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "Conceptos"));
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
