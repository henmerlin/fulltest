/**
 * RetornoAutenticacaoManualIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.retornoAutenticacaoManual;

public class RetornoAutenticacaoManualIn  implements java.io.Serializable {
    private com.gvt.www.metaData.security.Passport passport;

    private boolean authorization;

    private java.math.BigInteger cause_code;

    private java.math.BigInteger protocolEA;

    private java.math.BigInteger groupGVT;

    public RetornoAutenticacaoManualIn() {
    }

    public RetornoAutenticacaoManualIn(
           com.gvt.www.metaData.security.Passport passport,
           boolean authorization,
           java.math.BigInteger cause_code,
           java.math.BigInteger protocolEA,
           java.math.BigInteger groupGVT) {
           this.passport = passport;
           this.authorization = authorization;
           this.cause_code = cause_code;
           this.protocolEA = protocolEA;
           this.groupGVT = groupGVT;
    }


    /**
     * Gets the passport value for this RetornoAutenticacaoManualIn.
     * 
     * @return passport
     */
    public com.gvt.www.metaData.security.Passport getPassport() {
        return passport;
    }


    /**
     * Sets the passport value for this RetornoAutenticacaoManualIn.
     * 
     * @param passport
     */
    public void setPassport(com.gvt.www.metaData.security.Passport passport) {
        this.passport = passport;
    }


    /**
     * Gets the authorization value for this RetornoAutenticacaoManualIn.
     * 
     * @return authorization
     */
    public boolean isAuthorization() {
        return authorization;
    }


    /**
     * Sets the authorization value for this RetornoAutenticacaoManualIn.
     * 
     * @param authorization
     */
    public void setAuthorization(boolean authorization) {
        this.authorization = authorization;
    }


    /**
     * Gets the cause_code value for this RetornoAutenticacaoManualIn.
     * 
     * @return cause_code
     */
    public java.math.BigInteger getCause_code() {
        return cause_code;
    }


    /**
     * Sets the cause_code value for this RetornoAutenticacaoManualIn.
     * 
     * @param cause_code
     */
    public void setCause_code(java.math.BigInteger cause_code) {
        this.cause_code = cause_code;
    }


    /**
     * Gets the protocolEA value for this RetornoAutenticacaoManualIn.
     * 
     * @return protocolEA
     */
    public java.math.BigInteger getProtocolEA() {
        return protocolEA;
    }


    /**
     * Sets the protocolEA value for this RetornoAutenticacaoManualIn.
     * 
     * @param protocolEA
     */
    public void setProtocolEA(java.math.BigInteger protocolEA) {
        this.protocolEA = protocolEA;
    }


    /**
     * Gets the groupGVT value for this RetornoAutenticacaoManualIn.
     * 
     * @return groupGVT
     */
    public java.math.BigInteger getGroupGVT() {
        return groupGVT;
    }


    /**
     * Sets the groupGVT value for this RetornoAutenticacaoManualIn.
     * 
     * @param groupGVT
     */
    public void setGroupGVT(java.math.BigInteger groupGVT) {
        this.groupGVT = groupGVT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetornoAutenticacaoManualIn)) return false;
        RetornoAutenticacaoManualIn other = (RetornoAutenticacaoManualIn) obj;
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
            this.authorization == other.isAuthorization() &&
            ((this.cause_code==null && other.getCause_code()==null) || 
             (this.cause_code!=null &&
              this.cause_code.equals(other.getCause_code()))) &&
            ((this.protocolEA==null && other.getProtocolEA()==null) || 
             (this.protocolEA!=null &&
              this.protocolEA.equals(other.getProtocolEA()))) &&
            ((this.groupGVT==null && other.getGroupGVT()==null) || 
             (this.groupGVT!=null &&
              this.groupGVT.equals(other.getGroupGVT())));
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
        _hashCode += (isAuthorization() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCause_code() != null) {
            _hashCode += getCause_code().hashCode();
        }
        if (getProtocolEA() != null) {
            _hashCode += getProtocolEA().hashCode();
        }
        if (getGroupGVT() != null) {
            _hashCode += getGroupGVT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetornoAutenticacaoManualIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/retornoAutenticacaoManual", "retornoAutenticacaoManualIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/retornoAutenticacaoManual", "passport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/security", "Passport"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorization");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/retornoAutenticacaoManual", "authorization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cause_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/retornoAutenticacaoManual", "cause_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocolEA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/retornoAutenticacaoManual", "protocolEA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupGVT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/retornoAutenticacaoManual", "groupGVT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
