/**
 * ResetModemSipInterfaceOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.telefonia.ura.co.services;

public class ResetModemSipInterfaceOut  implements java.io.Serializable {
    private java.lang.Boolean isResetModem;

    public ResetModemSipInterfaceOut() {
    }

    public ResetModemSipInterfaceOut(
           java.lang.Boolean isResetModem) {
           this.isResetModem = isResetModem;
    }


    /**
     * Gets the isResetModem value for this ResetModemSipInterfaceOut.
     * 
     * @return isResetModem
     */
    public java.lang.Boolean getIsResetModem() {
        return isResetModem;
    }


    /**
     * Sets the isResetModem value for this ResetModemSipInterfaceOut.
     * 
     * @param isResetModem
     */
    public void setIsResetModem(java.lang.Boolean isResetModem) {
        this.isResetModem = isResetModem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResetModemSipInterfaceOut)) return false;
        ResetModemSipInterfaceOut other = (ResetModemSipInterfaceOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isResetModem==null && other.getIsResetModem()==null) || 
             (this.isResetModem!=null &&
              this.isResetModem.equals(other.getIsResetModem())));
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
        if (getIsResetModem() != null) {
            _hashCode += getIsResetModem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResetModemSipInterfaceOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "resetModemSipInterfaceOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isResetModem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isResetModem"));
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
