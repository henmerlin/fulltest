/**
 * AtualizarFirmwareCPEsIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.devicemanagement.services;

public class AtualizarFirmwareCPEsIn  implements java.io.Serializable {
    private com.gvt.www.ws.eai.configuradoronline.contingent.types.CustomerInfo customerInfo;

    public AtualizarFirmwareCPEsIn() {
    }

    public AtualizarFirmwareCPEsIn(
           com.gvt.www.ws.eai.configuradoronline.contingent.types.CustomerInfo customerInfo) {
           this.customerInfo = customerInfo;
    }


    /**
     * Gets the customerInfo value for this AtualizarFirmwareCPEsIn.
     * 
     * @return customerInfo
     */
    public com.gvt.www.ws.eai.configuradoronline.contingent.types.CustomerInfo getCustomerInfo() {
        return customerInfo;
    }


    /**
     * Sets the customerInfo value for this AtualizarFirmwareCPEsIn.
     * 
     * @param customerInfo
     */
    public void setCustomerInfo(com.gvt.www.ws.eai.configuradoronline.contingent.types.CustomerInfo customerInfo) {
        this.customerInfo = customerInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AtualizarFirmwareCPEsIn)) return false;
        AtualizarFirmwareCPEsIn other = (AtualizarFirmwareCPEsIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerInfo==null && other.getCustomerInfo()==null) || 
             (this.customerInfo!=null &&
              this.customerInfo.equals(other.getCustomerInfo())));
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
        if (getCustomerInfo() != null) {
            _hashCode += getCustomerInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AtualizarFirmwareCPEsIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "AtualizarFirmwareCPEsIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "customerInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/contingent/types", "CustomerInfo"));
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
