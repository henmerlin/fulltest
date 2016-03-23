/**
 * GetOperadoraByFilterOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.getOperadoraByFilter;

public class GetOperadoraByFilterOut  implements java.io.Serializable {
    private java.lang.String servProvId;

    private java.lang.String servProvName;

    /* so retorna quando o get eh feito pelo servProvId */
    private java.lang.String rn1;

    public GetOperadoraByFilterOut() {
    }

    public GetOperadoraByFilterOut(
           java.lang.String servProvId,
           java.lang.String servProvName,
           java.lang.String rn1) {
           this.servProvId = servProvId;
           this.servProvName = servProvName;
           this.rn1 = rn1;
    }


    /**
     * Gets the servProvId value for this GetOperadoraByFilterOut.
     * 
     * @return servProvId
     */
    public java.lang.String getServProvId() {
        return servProvId;
    }


    /**
     * Sets the servProvId value for this GetOperadoraByFilterOut.
     * 
     * @param servProvId
     */
    public void setServProvId(java.lang.String servProvId) {
        this.servProvId = servProvId;
    }


    /**
     * Gets the servProvName value for this GetOperadoraByFilterOut.
     * 
     * @return servProvName
     */
    public java.lang.String getServProvName() {
        return servProvName;
    }


    /**
     * Sets the servProvName value for this GetOperadoraByFilterOut.
     * 
     * @param servProvName
     */
    public void setServProvName(java.lang.String servProvName) {
        this.servProvName = servProvName;
    }


    /**
     * Gets the rn1 value for this GetOperadoraByFilterOut.
     * 
     * @return rn1   * so retorna quando o get eh feito pelo servProvId
     */
    public java.lang.String getRn1() {
        return rn1;
    }


    /**
     * Sets the rn1 value for this GetOperadoraByFilterOut.
     * 
     * @param rn1   * so retorna quando o get eh feito pelo servProvId
     */
    public void setRn1(java.lang.String rn1) {
        this.rn1 = rn1;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetOperadoraByFilterOut)) return false;
        GetOperadoraByFilterOut other = (GetOperadoraByFilterOut) obj;
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
            ((this.servProvName==null && other.getServProvName()==null) || 
             (this.servProvName!=null &&
              this.servProvName.equals(other.getServProvName()))) &&
            ((this.rn1==null && other.getRn1()==null) || 
             (this.rn1!=null &&
              this.rn1.equals(other.getRn1())));
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
        if (getServProvName() != null) {
            _hashCode += getServProvName().hashCode();
        }
        if (getRn1() != null) {
            _hashCode += getRn1().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetOperadoraByFilterOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getOperadoraByFilter", "getOperadoraByFilterOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servProvId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getOperadoraByFilter", "servProvId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servProvName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getOperadoraByFilter", "servProvName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rn1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getOperadoraByFilter", "rn1"));
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
