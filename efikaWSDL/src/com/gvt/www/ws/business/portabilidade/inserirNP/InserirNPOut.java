/**
 * InserirNPOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.inserirNP;

public class InserirNPOut  implements java.io.Serializable {
    /* 0 (zero) = sucesso.
     * -1 = erro. */
    private java.math.BigInteger status;

    private com.gvt.www.ws.business.portabilidade.inserirNP.Resultado[] resultado;

    private java.lang.String idReserva;

    public InserirNPOut() {
    }

    public InserirNPOut(
           java.math.BigInteger status,
           com.gvt.www.ws.business.portabilidade.inserirNP.Resultado[] resultado,
           java.lang.String idReserva) {
           this.status = status;
           this.resultado = resultado;
           this.idReserva = idReserva;
    }


    /**
     * Gets the status value for this InserirNPOut.
     * 
     * @return status   * 0 (zero) = sucesso.
     * -1 = erro.
     */
    public java.math.BigInteger getStatus() {
        return status;
    }


    /**
     * Sets the status value for this InserirNPOut.
     * 
     * @param status   * 0 (zero) = sucesso.
     * -1 = erro.
     */
    public void setStatus(java.math.BigInteger status) {
        this.status = status;
    }


    /**
     * Gets the resultado value for this InserirNPOut.
     * 
     * @return resultado
     */
    public com.gvt.www.ws.business.portabilidade.inserirNP.Resultado[] getResultado() {
        return resultado;
    }


    /**
     * Sets the resultado value for this InserirNPOut.
     * 
     * @param resultado
     */
    public void setResultado(com.gvt.www.ws.business.portabilidade.inserirNP.Resultado[] resultado) {
        this.resultado = resultado;
    }

    public com.gvt.www.ws.business.portabilidade.inserirNP.Resultado getResultado(int i) {
        return this.resultado[i];
    }

    public void setResultado(int i, com.gvt.www.ws.business.portabilidade.inserirNP.Resultado _value) {
        this.resultado[i] = _value;
    }


    /**
     * Gets the idReserva value for this InserirNPOut.
     * 
     * @return idReserva
     */
    public java.lang.String getIdReserva() {
        return idReserva;
    }


    /**
     * Sets the idReserva value for this InserirNPOut.
     * 
     * @param idReserva
     */
    public void setIdReserva(java.lang.String idReserva) {
        this.idReserva = idReserva;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InserirNPOut)) return false;
        InserirNPOut other = (InserirNPOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.resultado==null && other.getResultado()==null) || 
             (this.resultado!=null &&
              java.util.Arrays.equals(this.resultado, other.getResultado()))) &&
            ((this.idReserva==null && other.getIdReserva()==null) || 
             (this.idReserva!=null &&
              this.idReserva.equals(other.getIdReserva())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getResultado() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResultado());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResultado(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIdReserva() != null) {
            _hashCode += getIdReserva().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InserirNPOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/inserirNP", "inserirNPOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/inserirNP", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/inserirNP", "resultado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/inserirNP", "Resultado"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idReserva");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/inserirNP", "idReserva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
