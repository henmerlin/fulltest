/**
 * SipOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.telefonia.ura.co.services;

public class SipOut  implements java.io.Serializable {
    private java.lang.String tecnology;

    public SipOut() {
    }

    public SipOut(
           java.lang.String tecnology) {
           this.tecnology = tecnology;
    }


    /**
     * Gets the tecnology value for this SipOut.
     * 
     * @return tecnology
     */
    public java.lang.String getTecnology() {
        return tecnology;
    }


    /**
     * Sets the tecnology value for this SipOut.
     * 
     * @param tecnology
     */
    public void setTecnology(java.lang.String tecnology) {
        this.tecnology = tecnology;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SipOut)) return false;
        SipOut other = (SipOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tecnology==null && other.getTecnology()==null) || 
             (this.tecnology!=null &&
              this.tecnology.equals(other.getTecnology())));
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
        if (getTecnology() != null) {
            _hashCode += getTecnology().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SipOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "sipOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tecnology");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tecnology"));
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
