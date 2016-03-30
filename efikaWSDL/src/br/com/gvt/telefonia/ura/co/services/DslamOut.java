/**
 * DslamOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.telefonia.ura.co.services;

public class DslamOut  implements java.io.Serializable {
    private java.lang.String accessDesignator;

    private java.lang.Boolean isDSLAMManagable;

    public DslamOut() {
    }

    public DslamOut(
           java.lang.String accessDesignator,
           java.lang.Boolean isDSLAMManagable) {
           this.accessDesignator = accessDesignator;
           this.isDSLAMManagable = isDSLAMManagable;
    }


    /**
     * Gets the accessDesignator value for this DslamOut.
     * 
     * @return accessDesignator
     */
    public java.lang.String getAccessDesignator() {
        return accessDesignator;
    }


    /**
     * Sets the accessDesignator value for this DslamOut.
     * 
     * @param accessDesignator
     */
    public void setAccessDesignator(java.lang.String accessDesignator) {
        this.accessDesignator = accessDesignator;
    }


    /**
     * Gets the isDSLAMManagable value for this DslamOut.
     * 
     * @return isDSLAMManagable
     */
    public java.lang.Boolean getIsDSLAMManagable() {
        return isDSLAMManagable;
    }


    /**
     * Sets the isDSLAMManagable value for this DslamOut.
     * 
     * @param isDSLAMManagable
     */
    public void setIsDSLAMManagable(java.lang.Boolean isDSLAMManagable) {
        this.isDSLAMManagable = isDSLAMManagable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DslamOut)) return false;
        DslamOut other = (DslamOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accessDesignator==null && other.getAccessDesignator()==null) || 
             (this.accessDesignator!=null &&
              this.accessDesignator.equals(other.getAccessDesignator()))) &&
            ((this.isDSLAMManagable==null && other.getIsDSLAMManagable()==null) || 
             (this.isDSLAMManagable!=null &&
              this.isDSLAMManagable.equals(other.getIsDSLAMManagable())));
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
        if (getAccessDesignator() != null) {
            _hashCode += getAccessDesignator().hashCode();
        }
        if (getIsDSLAMManagable() != null) {
            _hashCode += getIsDSLAMManagable().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DslamOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "dslamOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessDesignator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accessDesignator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDSLAMManagable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isDSLAMManagable"));
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
