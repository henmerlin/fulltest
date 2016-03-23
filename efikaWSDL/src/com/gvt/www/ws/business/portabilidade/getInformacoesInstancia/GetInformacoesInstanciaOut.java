/**
 * GetInformacoesInstanciaOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.getInformacoesInstancia;

public class GetInformacoesInstanciaOut  implements java.io.Serializable {
    /* Retorna "fixo" ou "celular" */
    private java.lang.String tipo;

    private boolean gvt;

    private java.lang.String tipoEspecial;

    private java.lang.String cnl;

    private java.lang.String operadora;

    private com.gvt.www.ws.business.portabilidade.getInformacoesInstancia.OperationResponse operationResponse;

    public GetInformacoesInstanciaOut() {
    }

    public GetInformacoesInstanciaOut(
           java.lang.String tipo,
           boolean gvt,
           java.lang.String tipoEspecial,
           java.lang.String cnl,
           java.lang.String operadora,
           com.gvt.www.ws.business.portabilidade.getInformacoesInstancia.OperationResponse operationResponse) {
           this.tipo = tipo;
           this.gvt = gvt;
           this.tipoEspecial = tipoEspecial;
           this.cnl = cnl;
           this.operadora = operadora;
           this.operationResponse = operationResponse;
    }


    /**
     * Gets the tipo value for this GetInformacoesInstanciaOut.
     * 
     * @return tipo   * Retorna "fixo" ou "celular"
     */
    public java.lang.String getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this GetInformacoesInstanciaOut.
     * 
     * @param tipo   * Retorna "fixo" ou "celular"
     */
    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the gvt value for this GetInformacoesInstanciaOut.
     * 
     * @return gvt
     */
    public boolean isGvt() {
        return gvt;
    }


    /**
     * Sets the gvt value for this GetInformacoesInstanciaOut.
     * 
     * @param gvt
     */
    public void setGvt(boolean gvt) {
        this.gvt = gvt;
    }


    /**
     * Gets the tipoEspecial value for this GetInformacoesInstanciaOut.
     * 
     * @return tipoEspecial
     */
    public java.lang.String getTipoEspecial() {
        return tipoEspecial;
    }


    /**
     * Sets the tipoEspecial value for this GetInformacoesInstanciaOut.
     * 
     * @param tipoEspecial
     */
    public void setTipoEspecial(java.lang.String tipoEspecial) {
        this.tipoEspecial = tipoEspecial;
    }


    /**
     * Gets the cnl value for this GetInformacoesInstanciaOut.
     * 
     * @return cnl
     */
    public java.lang.String getCnl() {
        return cnl;
    }


    /**
     * Sets the cnl value for this GetInformacoesInstanciaOut.
     * 
     * @param cnl
     */
    public void setCnl(java.lang.String cnl) {
        this.cnl = cnl;
    }


    /**
     * Gets the operadora value for this GetInformacoesInstanciaOut.
     * 
     * @return operadora
     */
    public java.lang.String getOperadora() {
        return operadora;
    }


    /**
     * Sets the operadora value for this GetInformacoesInstanciaOut.
     * 
     * @param operadora
     */
    public void setOperadora(java.lang.String operadora) {
        this.operadora = operadora;
    }


    /**
     * Gets the operationResponse value for this GetInformacoesInstanciaOut.
     * 
     * @return operationResponse
     */
    public com.gvt.www.ws.business.portabilidade.getInformacoesInstancia.OperationResponse getOperationResponse() {
        return operationResponse;
    }


    /**
     * Sets the operationResponse value for this GetInformacoesInstanciaOut.
     * 
     * @param operationResponse
     */
    public void setOperationResponse(com.gvt.www.ws.business.portabilidade.getInformacoesInstancia.OperationResponse operationResponse) {
        this.operationResponse = operationResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetInformacoesInstanciaOut)) return false;
        GetInformacoesInstanciaOut other = (GetInformacoesInstanciaOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            this.gvt == other.isGvt() &&
            ((this.tipoEspecial==null && other.getTipoEspecial()==null) || 
             (this.tipoEspecial!=null &&
              this.tipoEspecial.equals(other.getTipoEspecial()))) &&
            ((this.cnl==null && other.getCnl()==null) || 
             (this.cnl!=null &&
              this.cnl.equals(other.getCnl()))) &&
            ((this.operadora==null && other.getOperadora()==null) || 
             (this.operadora!=null &&
              this.operadora.equals(other.getOperadora()))) &&
            ((this.operationResponse==null && other.getOperationResponse()==null) || 
             (this.operationResponse!=null &&
              this.operationResponse.equals(other.getOperationResponse())));
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
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        _hashCode += (isGvt() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTipoEspecial() != null) {
            _hashCode += getTipoEspecial().hashCode();
        }
        if (getCnl() != null) {
            _hashCode += getCnl().hashCode();
        }
        if (getOperadora() != null) {
            _hashCode += getOperadora().hashCode();
        }
        if (getOperationResponse() != null) {
            _hashCode += getOperationResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetInformacoesInstanciaOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getInformacoesInstancia", "getInformacoesInstanciaOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getInformacoesInstancia", "tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gvt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getInformacoesInstancia", "gvt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoEspecial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getInformacoesInstancia", "tipoEspecial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cnl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getInformacoesInstancia", "cnl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operadora");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getInformacoesInstancia", "operadora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getInformacoesInstancia", "operationResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getInformacoesInstancia", "OperationResponse"));
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
