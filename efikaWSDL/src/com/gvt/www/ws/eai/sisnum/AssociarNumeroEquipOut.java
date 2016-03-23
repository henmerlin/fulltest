/**
 * AssociarNumeroEquipOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.sisnum;

public class AssociarNumeroEquipOut  implements java.io.Serializable {
    private java.lang.String nrEquip;

    public AssociarNumeroEquipOut() {
    }

    public AssociarNumeroEquipOut(
           java.lang.String nrEquip) {
           this.nrEquip = nrEquip;
    }


    /**
     * Gets the nrEquip value for this AssociarNumeroEquipOut.
     * 
     * @return nrEquip
     */
    public java.lang.String getNrEquip() {
        return nrEquip;
    }


    /**
     * Sets the nrEquip value for this AssociarNumeroEquipOut.
     * 
     * @param nrEquip
     */
    public void setNrEquip(java.lang.String nrEquip) {
        this.nrEquip = nrEquip;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssociarNumeroEquipOut)) return false;
        AssociarNumeroEquipOut other = (AssociarNumeroEquipOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nrEquip==null && other.getNrEquip()==null) || 
             (this.nrEquip!=null &&
              this.nrEquip.equals(other.getNrEquip())));
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
        if (getNrEquip() != null) {
            _hashCode += getNrEquip().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AssociarNumeroEquipOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/sisnum", "associarNumeroEquipOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nrEquip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/sisnum", "nrEquip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
