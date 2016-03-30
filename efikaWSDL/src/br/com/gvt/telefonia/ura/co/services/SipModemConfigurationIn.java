/**
 * SipModemConfigurationIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.telefonia.ura.co.services;

public class SipModemConfigurationIn  implements java.io.Serializable {
    private java.lang.String designator;

    private java.lang.String instance;

    public SipModemConfigurationIn() {
    }

    public SipModemConfigurationIn(
           java.lang.String designator,
           java.lang.String instance) {
           this.designator = designator;
           this.instance = instance;
    }


    /**
     * Gets the designator value for this SipModemConfigurationIn.
     * 
     * @return designator
     */
    public java.lang.String getDesignator() {
        return designator;
    }


    /**
     * Sets the designator value for this SipModemConfigurationIn.
     * 
     * @param designator
     */
    public void setDesignator(java.lang.String designator) {
        this.designator = designator;
    }


    /**
     * Gets the instance value for this SipModemConfigurationIn.
     * 
     * @return instance
     */
    public java.lang.String getInstance() {
        return instance;
    }


    /**
     * Sets the instance value for this SipModemConfigurationIn.
     * 
     * @param instance
     */
    public void setInstance(java.lang.String instance) {
        this.instance = instance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SipModemConfigurationIn)) return false;
        SipModemConfigurationIn other = (SipModemConfigurationIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.designator==null && other.getDesignator()==null) || 
             (this.designator!=null &&
              this.designator.equals(other.getDesignator()))) &&
            ((this.instance==null && other.getInstance()==null) || 
             (this.instance!=null &&
              this.instance.equals(other.getInstance())));
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
        if (getDesignator() != null) {
            _hashCode += getDesignator().hashCode();
        }
        if (getInstance() != null) {
            _hashCode += getInstance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SipModemConfigurationIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "sipModemConfigurationIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "designator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instance"));
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
