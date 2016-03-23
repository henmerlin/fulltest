/**
 * AutenticarPNIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.autenticarPN;

public class AutenticarPNIn  implements java.io.Serializable {
    private java.math.BigInteger protocoloEA;

    private boolean newValues;

    private boolean reAutenticacao;

    public AutenticarPNIn() {
    }

    public AutenticarPNIn(
           java.math.BigInteger protocoloEA,
           boolean newValues,
           boolean reAutenticacao) {
           this.protocoloEA = protocoloEA;
           this.newValues = newValues;
           this.reAutenticacao = reAutenticacao;
    }


    /**
     * Gets the protocoloEA value for this AutenticarPNIn.
     * 
     * @return protocoloEA
     */
    public java.math.BigInteger getProtocoloEA() {
        return protocoloEA;
    }


    /**
     * Sets the protocoloEA value for this AutenticarPNIn.
     * 
     * @param protocoloEA
     */
    public void setProtocoloEA(java.math.BigInteger protocoloEA) {
        this.protocoloEA = protocoloEA;
    }


    /**
     * Gets the newValues value for this AutenticarPNIn.
     * 
     * @return newValues
     */
    public boolean isNewValues() {
        return newValues;
    }


    /**
     * Sets the newValues value for this AutenticarPNIn.
     * 
     * @param newValues
     */
    public void setNewValues(boolean newValues) {
        this.newValues = newValues;
    }


    /**
     * Gets the reAutenticacao value for this AutenticarPNIn.
     * 
     * @return reAutenticacao
     */
    public boolean isReAutenticacao() {
        return reAutenticacao;
    }


    /**
     * Sets the reAutenticacao value for this AutenticarPNIn.
     * 
     * @param reAutenticacao
     */
    public void setReAutenticacao(boolean reAutenticacao) {
        this.reAutenticacao = reAutenticacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AutenticarPNIn)) return false;
        AutenticarPNIn other = (AutenticarPNIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.protocoloEA==null && other.getProtocoloEA()==null) || 
             (this.protocoloEA!=null &&
              this.protocoloEA.equals(other.getProtocoloEA()))) &&
            this.newValues == other.isNewValues() &&
            this.reAutenticacao == other.isReAutenticacao();
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
        if (getProtocoloEA() != null) {
            _hashCode += getProtocoloEA().hashCode();
        }
        _hashCode += (isNewValues() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isReAutenticacao() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AutenticarPNIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/autenticarPN", "autenticarPNIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocoloEA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/autenticarPN", "protocoloEA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/autenticarPN", "newValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reAutenticacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/autenticarPN", "reAutenticacao"));
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
