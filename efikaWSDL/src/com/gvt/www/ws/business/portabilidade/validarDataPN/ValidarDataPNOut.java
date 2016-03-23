/**
 * ValidarDataPNOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.validarDataPN;

public class ValidarDataPNOut  implements java.io.Serializable {
    /* 0 Data é válida
     * -1 Não pode reagendar/cancelar */
    private java.math.BigInteger status;

    private boolean sla;

    public ValidarDataPNOut() {
    }

    public ValidarDataPNOut(
           java.math.BigInteger status,
           boolean sla) {
           this.status = status;
           this.sla = sla;
    }


    /**
     * Gets the status value for this ValidarDataPNOut.
     * 
     * @return status   * 0 Data é válida
     * -1 Não pode reagendar/cancelar
     */
    public java.math.BigInteger getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ValidarDataPNOut.
     * 
     * @param status   * 0 Data é válida
     * -1 Não pode reagendar/cancelar
     */
    public void setStatus(java.math.BigInteger status) {
        this.status = status;
    }


    /**
     * Gets the sla value for this ValidarDataPNOut.
     * 
     * @return sla
     */
    public boolean isSla() {
        return sla;
    }


    /**
     * Sets the sla value for this ValidarDataPNOut.
     * 
     * @param sla
     */
    public void setSla(boolean sla) {
        this.sla = sla;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidarDataPNOut)) return false;
        ValidarDataPNOut other = (ValidarDataPNOut) obj;
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
            this.sla == other.isSla();
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
        _hashCode += (isSla() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidarDataPNOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/validarDataPN", "validarDataPNOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/validarDataPN", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sla");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/validarDataPN", "sla"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
