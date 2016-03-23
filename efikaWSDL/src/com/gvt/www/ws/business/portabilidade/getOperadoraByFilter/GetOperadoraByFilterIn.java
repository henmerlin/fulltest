/**
 * GetOperadoraByFilterIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.getOperadoraByFilter;

public class GetOperadoraByFilterIn  implements java.io.Serializable {
    private java.lang.String servProvId;

    private java.lang.String phoneNumber;

    private java.lang.String eot;

    public GetOperadoraByFilterIn() {
    }

    public GetOperadoraByFilterIn(
           java.lang.String servProvId,
           java.lang.String phoneNumber,
           java.lang.String eot) {
           this.servProvId = servProvId;
           this.phoneNumber = phoneNumber;
           this.eot = eot;
    }


    /**
     * Gets the servProvId value for this GetOperadoraByFilterIn.
     * 
     * @return servProvId
     */
    public java.lang.String getServProvId() {
        return servProvId;
    }


    /**
     * Sets the servProvId value for this GetOperadoraByFilterIn.
     * 
     * @param servProvId
     */
    public void setServProvId(java.lang.String servProvId) {
        this.servProvId = servProvId;
    }


    /**
     * Gets the phoneNumber value for this GetOperadoraByFilterIn.
     * 
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this GetOperadoraByFilterIn.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the eot value for this GetOperadoraByFilterIn.
     * 
     * @return eot
     */
    public java.lang.String getEot() {
        return eot;
    }


    /**
     * Sets the eot value for this GetOperadoraByFilterIn.
     * 
     * @param eot
     */
    public void setEot(java.lang.String eot) {
        this.eot = eot;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetOperadoraByFilterIn)) return false;
        GetOperadoraByFilterIn other = (GetOperadoraByFilterIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.servProvId==null && other.getServProvId()==null) || 
             (this.servProvId!=null &&
              this.servProvId.equals(other.getServProvId()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.eot==null && other.getEot()==null) || 
             (this.eot!=null &&
              this.eot.equals(other.getEot())));
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
        if (getServProvId() != null) {
            _hashCode += getServProvId().hashCode();
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getEot() != null) {
            _hashCode += getEot().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetOperadoraByFilterIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getOperadoraByFilter", "getOperadoraByFilterIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servProvId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getOperadoraByFilter", "servProvId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getOperadoraByFilter", "phoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eot");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getOperadoraByFilter", "eot"));
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
