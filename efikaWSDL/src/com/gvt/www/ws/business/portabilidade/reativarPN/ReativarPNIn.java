/**
 * ReativarPNIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.reativarPN;

public class ReativarPNIn  implements java.io.Serializable {
    private com.gvt.www.metaData.security.Passport passport;

    private java.lang.String[] phoneNumber;

    private java.lang.String numDocumento;

    public ReativarPNIn() {
    }

    public ReativarPNIn(
           com.gvt.www.metaData.security.Passport passport,
           java.lang.String[] phoneNumber,
           java.lang.String numDocumento) {
           this.passport = passport;
           this.phoneNumber = phoneNumber;
           this.numDocumento = numDocumento;
    }


    /**
     * Gets the passport value for this ReativarPNIn.
     * 
     * @return passport
     */
    public com.gvt.www.metaData.security.Passport getPassport() {
        return passport;
    }


    /**
     * Sets the passport value for this ReativarPNIn.
     * 
     * @param passport
     */
    public void setPassport(com.gvt.www.metaData.security.Passport passport) {
        this.passport = passport;
    }


    /**
     * Gets the phoneNumber value for this ReativarPNIn.
     * 
     * @return phoneNumber
     */
    public java.lang.String[] getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this ReativarPNIn.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String[] phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public java.lang.String getPhoneNumber(int i) {
        return this.phoneNumber[i];
    }

    public void setPhoneNumber(int i, java.lang.String _value) {
        this.phoneNumber[i] = _value;
    }


    /**
     * Gets the numDocumento value for this ReativarPNIn.
     * 
     * @return numDocumento
     */
    public java.lang.String getNumDocumento() {
        return numDocumento;
    }


    /**
     * Sets the numDocumento value for this ReativarPNIn.
     * 
     * @param numDocumento
     */
    public void setNumDocumento(java.lang.String numDocumento) {
        this.numDocumento = numDocumento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReativarPNIn)) return false;
        ReativarPNIn other = (ReativarPNIn) obj;
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
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              java.util.Arrays.equals(this.phoneNumber, other.getPhoneNumber()))) &&
            ((this.numDocumento==null && other.getNumDocumento()==null) || 
             (this.numDocumento!=null &&
              this.numDocumento.equals(other.getNumDocumento())));
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
        if (getPhoneNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPhoneNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPhoneNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNumDocumento() != null) {
            _hashCode += getNumDocumento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReativarPNIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/reativarPN", "reativarPNIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/reativarPN", "passport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/security", "Passport"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/reativarPN", "phoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/reativarPN", "numDocumento"));
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
