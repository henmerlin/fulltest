/**
 * SipModemConfigurationOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.telefonia.ura.co.services;

public class SipModemConfigurationOut  implements java.io.Serializable {
    private java.lang.Boolean isSipModemconfigured;

    public SipModemConfigurationOut() {
    }

    public SipModemConfigurationOut(
           java.lang.Boolean isSipModemconfigured) {
           this.isSipModemconfigured = isSipModemconfigured;
    }


    /**
     * Gets the isSipModemconfigured value for this SipModemConfigurationOut.
     * 
     * @return isSipModemconfigured
     */
    public java.lang.Boolean getIsSipModemconfigured() {
        return isSipModemconfigured;
    }


    /**
     * Sets the isSipModemconfigured value for this SipModemConfigurationOut.
     * 
     * @param isSipModemconfigured
     */
    public void setIsSipModemconfigured(java.lang.Boolean isSipModemconfigured) {
        this.isSipModemconfigured = isSipModemconfigured;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SipModemConfigurationOut)) return false;
        SipModemConfigurationOut other = (SipModemConfigurationOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isSipModemconfigured==null && other.getIsSipModemconfigured()==null) || 
             (this.isSipModemconfigured!=null &&
              this.isSipModemconfigured.equals(other.getIsSipModemconfigured())));
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
        if (getIsSipModemconfigured() != null) {
            _hashCode += getIsSipModemconfigured().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SipModemConfigurationOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "sipModemConfigurationOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSipModemconfigured");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isSipModemconfigured"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
