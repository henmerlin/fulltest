/**
 * ConcluirTarefaPortabilidadeIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.concluirTarefaPortabilidade;

public class ConcluirTarefaPortabilidadeIn  implements java.io.Serializable {
    private com.gvt.www.metaData.security.Passport passport;

    private java.math.BigInteger idSolicitacaoPN;

    private java.lang.String osTBS;

    public ConcluirTarefaPortabilidadeIn() {
    }

    public ConcluirTarefaPortabilidadeIn(
           com.gvt.www.metaData.security.Passport passport,
           java.math.BigInteger idSolicitacaoPN,
           java.lang.String osTBS) {
           this.passport = passport;
           this.idSolicitacaoPN = idSolicitacaoPN;
           this.osTBS = osTBS;
    }


    /**
     * Gets the passport value for this ConcluirTarefaPortabilidadeIn.
     * 
     * @return passport
     */
    public com.gvt.www.metaData.security.Passport getPassport() {
        return passport;
    }


    /**
     * Sets the passport value for this ConcluirTarefaPortabilidadeIn.
     * 
     * @param passport
     */
    public void setPassport(com.gvt.www.metaData.security.Passport passport) {
        this.passport = passport;
    }


    /**
     * Gets the idSolicitacaoPN value for this ConcluirTarefaPortabilidadeIn.
     * 
     * @return idSolicitacaoPN
     */
    public java.math.BigInteger getIdSolicitacaoPN() {
        return idSolicitacaoPN;
    }


    /**
     * Sets the idSolicitacaoPN value for this ConcluirTarefaPortabilidadeIn.
     * 
     * @param idSolicitacaoPN
     */
    public void setIdSolicitacaoPN(java.math.BigInteger idSolicitacaoPN) {
        this.idSolicitacaoPN = idSolicitacaoPN;
    }


    /**
     * Gets the osTBS value for this ConcluirTarefaPortabilidadeIn.
     * 
     * @return osTBS
     */
    public java.lang.String getOsTBS() {
        return osTBS;
    }


    /**
     * Sets the osTBS value for this ConcluirTarefaPortabilidadeIn.
     * 
     * @param osTBS
     */
    public void setOsTBS(java.lang.String osTBS) {
        this.osTBS = osTBS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConcluirTarefaPortabilidadeIn)) return false;
        ConcluirTarefaPortabilidadeIn other = (ConcluirTarefaPortabilidadeIn) obj;
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
            ((this.idSolicitacaoPN==null && other.getIdSolicitacaoPN()==null) || 
             (this.idSolicitacaoPN!=null &&
              this.idSolicitacaoPN.equals(other.getIdSolicitacaoPN()))) &&
            ((this.osTBS==null && other.getOsTBS()==null) || 
             (this.osTBS!=null &&
              this.osTBS.equals(other.getOsTBS())));
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
        if (getIdSolicitacaoPN() != null) {
            _hashCode += getIdSolicitacaoPN().hashCode();
        }
        if (getOsTBS() != null) {
            _hashCode += getOsTBS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConcluirTarefaPortabilidadeIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/concluirTarefaPortabilidade", "concluirTarefaPortabilidadeIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/concluirTarefaPortabilidade", "passport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/security", "Passport"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSolicitacaoPN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/concluirTarefaPortabilidade", "idSolicitacaoPN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("osTBS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/concluirTarefaPortabilidade", "osTBS"));
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
