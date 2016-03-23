/**
 * IsGVTIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.isGVT;

public class IsGVTIn  implements java.io.Serializable {
    private com.gvt.www.metaData.security.Passport passport;

    private java.lang.String[] numero;

    /* Reserved for Future Use - resolve problema quando tem apenas
     * um elemento unbounded. */
    private java.lang.String RFU;

    public IsGVTIn() {
    }

    public IsGVTIn(
           com.gvt.www.metaData.security.Passport passport,
           java.lang.String[] numero,
           java.lang.String RFU) {
           this.passport = passport;
           this.numero = numero;
           this.RFU = RFU;
    }


    /**
     * Gets the passport value for this IsGVTIn.
     * 
     * @return passport
     */
    public com.gvt.www.metaData.security.Passport getPassport() {
        return passport;
    }


    /**
     * Sets the passport value for this IsGVTIn.
     * 
     * @param passport
     */
    public void setPassport(com.gvt.www.metaData.security.Passport passport) {
        this.passport = passport;
    }


    /**
     * Gets the numero value for this IsGVTIn.
     * 
     * @return numero
     */
    public java.lang.String[] getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this IsGVTIn.
     * 
     * @param numero
     */
    public void setNumero(java.lang.String[] numero) {
        this.numero = numero;
    }

    public java.lang.String getNumero(int i) {
        return this.numero[i];
    }

    public void setNumero(int i, java.lang.String _value) {
        this.numero[i] = _value;
    }


    /**
     * Gets the RFU value for this IsGVTIn.
     * 
     * @return RFU   * Reserved for Future Use - resolve problema quando tem apenas
     * um elemento unbounded.
     */
    public java.lang.String getRFU() {
        return RFU;
    }


    /**
     * Sets the RFU value for this IsGVTIn.
     * 
     * @param RFU   * Reserved for Future Use - resolve problema quando tem apenas
     * um elemento unbounded.
     */
    public void setRFU(java.lang.String RFU) {
        this.RFU = RFU;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IsGVTIn)) return false;
        IsGVTIn other = (IsGVTIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.passport==null && other.getPassport()==null) || 
             (this.passport!=null &&
              this.passport.equals(other.getPassport()))) &&
            ((this.numero==null && other.getNumero()==null) || 
             (this.numero!=null &&
              java.util.Arrays.equals(this.numero, other.getNumero()))) &&
            ((this.RFU==null && other.getRFU()==null) || 
             (this.RFU!=null &&
              this.RFU.equals(other.getRFU())));
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
        if (getPassport() != null) {
            _hashCode += getPassport().hashCode();
        }
        if (getNumero() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNumero());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNumero(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRFU() != null) {
            _hashCode += getRFU().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IsGVTIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isGVT", "isGVTIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isGVT", "passport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/security", "Passport"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isGVT", "numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RFU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isGVT", "RFU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
