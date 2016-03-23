/**
 * IsReativavelIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.isReativavel;

public class IsReativavelIn  implements java.io.Serializable {
    private com.gvt.www.metaData.security.Passport passport;

    private java.lang.String[] numero;

    /* Ex.: numero do CPF ou CNPJ */
    private java.lang.String numDocumento;

    public IsReativavelIn() {
    }

    public IsReativavelIn(
           com.gvt.www.metaData.security.Passport passport,
           java.lang.String[] numero,
           java.lang.String numDocumento) {
           this.passport = passport;
           this.numero = numero;
           this.numDocumento = numDocumento;
    }


    /**
     * Gets the passport value for this IsReativavelIn.
     * 
     * @return passport
     */
    public com.gvt.www.metaData.security.Passport getPassport() {
        return passport;
    }


    /**
     * Sets the passport value for this IsReativavelIn.
     * 
     * @param passport
     */
    public void setPassport(com.gvt.www.metaData.security.Passport passport) {
        this.passport = passport;
    }


    /**
     * Gets the numero value for this IsReativavelIn.
     * 
     * @return numero
     */
    public java.lang.String[] getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this IsReativavelIn.
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
     * Gets the numDocumento value for this IsReativavelIn.
     * 
     * @return numDocumento   * Ex.: numero do CPF ou CNPJ
     */
    public java.lang.String getNumDocumento() {
        return numDocumento;
    }


    /**
     * Sets the numDocumento value for this IsReativavelIn.
     * 
     * @param numDocumento   * Ex.: numero do CPF ou CNPJ
     */
    public void setNumDocumento(java.lang.String numDocumento) {
        this.numDocumento = numDocumento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IsReativavelIn)) return false;
        IsReativavelIn other = (IsReativavelIn) obj;
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
        if (getNumDocumento() != null) {
            _hashCode += getNumDocumento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IsReativavelIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isReativavel", "isReativavelIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isReativavel", "passport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/security", "Passport"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isReativavel", "numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isReativavel", "numDocumento"));
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
