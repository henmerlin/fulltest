/**
 * CancelarPNByIdSolicitacaoIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.cancelarPNByIdSolicitacao;

public class CancelarPNByIdSolicitacaoIn  implements java.io.Serializable {
    private com.gvt.www.metaData.security.Passport passport;

    private java.math.BigInteger idSolicitacaoPN;

    private java.math.BigInteger motivo;

    public CancelarPNByIdSolicitacaoIn() {
    }

    public CancelarPNByIdSolicitacaoIn(
           com.gvt.www.metaData.security.Passport passport,
           java.math.BigInteger idSolicitacaoPN,
           java.math.BigInteger motivo) {
           this.passport = passport;
           this.idSolicitacaoPN = idSolicitacaoPN;
           this.motivo = motivo;
    }


    /**
     * Gets the passport value for this CancelarPNByIdSolicitacaoIn.
     * 
     * @return passport
     */
    public com.gvt.www.metaData.security.Passport getPassport() {
        return passport;
    }


    /**
     * Sets the passport value for this CancelarPNByIdSolicitacaoIn.
     * 
     * @param passport
     */
    public void setPassport(com.gvt.www.metaData.security.Passport passport) {
        this.passport = passport;
    }


    /**
     * Gets the idSolicitacaoPN value for this CancelarPNByIdSolicitacaoIn.
     * 
     * @return idSolicitacaoPN
     */
    public java.math.BigInteger getIdSolicitacaoPN() {
        return idSolicitacaoPN;
    }


    /**
     * Sets the idSolicitacaoPN value for this CancelarPNByIdSolicitacaoIn.
     * 
     * @param idSolicitacaoPN
     */
    public void setIdSolicitacaoPN(java.math.BigInteger idSolicitacaoPN) {
        this.idSolicitacaoPN = idSolicitacaoPN;
    }


    /**
     * Gets the motivo value for this CancelarPNByIdSolicitacaoIn.
     * 
     * @return motivo
     */
    public java.math.BigInteger getMotivo() {
        return motivo;
    }


    /**
     * Sets the motivo value for this CancelarPNByIdSolicitacaoIn.
     * 
     * @param motivo
     */
    public void setMotivo(java.math.BigInteger motivo) {
        this.motivo = motivo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CancelarPNByIdSolicitacaoIn)) return false;
        CancelarPNByIdSolicitacaoIn other = (CancelarPNByIdSolicitacaoIn) obj;
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
            ((this.motivo==null && other.getMotivo()==null) || 
             (this.motivo!=null &&
              this.motivo.equals(other.getMotivo())));
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
        if (getMotivo() != null) {
            _hashCode += getMotivo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CancelarPNByIdSolicitacaoIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/cancelarPNByIdSolicitacao", "cancelarPNByIdSolicitacaoIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/cancelarPNByIdSolicitacao", "passport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/security", "Passport"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSolicitacaoPN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/cancelarPNByIdSolicitacao", "idSolicitacaoPN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motivo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/cancelarPNByIdSolicitacao", "motivo"));
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
