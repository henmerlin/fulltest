/**
 * ReceberAutenticacaoDoadoraIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.receberAutenticacaoDoadora;

public class ReceberAutenticacaoDoadoraIn  implements java.io.Serializable {
    private com.gvt.www.metaData.security.Passport passport;

    private java.math.BigInteger idSolicitacaoPN;

    private java.math.BigInteger invokeId;

    private java.math.BigInteger protocolEA;

    private java.lang.String buType;

    private java.lang.Boolean authorization;

    private java.math.BigInteger causeCode;

    private java.lang.String justification;

    private com.gvt.www.ws.business.portabilidade.receberAutenticacaoDoadora.ReceberAutenticacaoDoadoraInFraudError fraudError;

    private java.lang.String donorCnl;

    public ReceberAutenticacaoDoadoraIn() {
    }

    public ReceberAutenticacaoDoadoraIn(
           com.gvt.www.metaData.security.Passport passport,
           java.math.BigInteger idSolicitacaoPN,
           java.math.BigInteger invokeId,
           java.math.BigInteger protocolEA,
           java.lang.String buType,
           java.lang.Boolean authorization,
           java.math.BigInteger causeCode,
           java.lang.String justification,
           com.gvt.www.ws.business.portabilidade.receberAutenticacaoDoadora.ReceberAutenticacaoDoadoraInFraudError fraudError,
           java.lang.String donorCnl) {
           this.passport = passport;
           this.idSolicitacaoPN = idSolicitacaoPN;
           this.invokeId = invokeId;
           this.protocolEA = protocolEA;
           this.buType = buType;
           this.authorization = authorization;
           this.causeCode = causeCode;
           this.justification = justification;
           this.fraudError = fraudError;
           this.donorCnl = donorCnl;
    }


    /**
     * Gets the passport value for this ReceberAutenticacaoDoadoraIn.
     * 
     * @return passport
     */
    public com.gvt.www.metaData.security.Passport getPassport() {
        return passport;
    }


    /**
     * Sets the passport value for this ReceberAutenticacaoDoadoraIn.
     * 
     * @param passport
     */
    public void setPassport(com.gvt.www.metaData.security.Passport passport) {
        this.passport = passport;
    }


    /**
     * Gets the idSolicitacaoPN value for this ReceberAutenticacaoDoadoraIn.
     * 
     * @return idSolicitacaoPN
     */
    public java.math.BigInteger getIdSolicitacaoPN() {
        return idSolicitacaoPN;
    }


    /**
     * Sets the idSolicitacaoPN value for this ReceberAutenticacaoDoadoraIn.
     * 
     * @param idSolicitacaoPN
     */
    public void setIdSolicitacaoPN(java.math.BigInteger idSolicitacaoPN) {
        this.idSolicitacaoPN = idSolicitacaoPN;
    }


    /**
     * Gets the invokeId value for this ReceberAutenticacaoDoadoraIn.
     * 
     * @return invokeId
     */
    public java.math.BigInteger getInvokeId() {
        return invokeId;
    }


    /**
     * Sets the invokeId value for this ReceberAutenticacaoDoadoraIn.
     * 
     * @param invokeId
     */
    public void setInvokeId(java.math.BigInteger invokeId) {
        this.invokeId = invokeId;
    }


    /**
     * Gets the protocolEA value for this ReceberAutenticacaoDoadoraIn.
     * 
     * @return protocolEA
     */
    public java.math.BigInteger getProtocolEA() {
        return protocolEA;
    }


    /**
     * Sets the protocolEA value for this ReceberAutenticacaoDoadoraIn.
     * 
     * @param protocolEA
     */
    public void setProtocolEA(java.math.BigInteger protocolEA) {
        this.protocolEA = protocolEA;
    }


    /**
     * Gets the buType value for this ReceberAutenticacaoDoadoraIn.
     * 
     * @return buType
     */
    public java.lang.String getBuType() {
        return buType;
    }


    /**
     * Sets the buType value for this ReceberAutenticacaoDoadoraIn.
     * 
     * @param buType
     */
    public void setBuType(java.lang.String buType) {
        this.buType = buType;
    }


    /**
     * Gets the authorization value for this ReceberAutenticacaoDoadoraIn.
     * 
     * @return authorization
     */
    public java.lang.Boolean getAuthorization() {
        return authorization;
    }


    /**
     * Sets the authorization value for this ReceberAutenticacaoDoadoraIn.
     * 
     * @param authorization
     */
    public void setAuthorization(java.lang.Boolean authorization) {
        this.authorization = authorization;
    }


    /**
     * Gets the causeCode value for this ReceberAutenticacaoDoadoraIn.
     * 
     * @return causeCode
     */
    public java.math.BigInteger getCauseCode() {
        return causeCode;
    }


    /**
     * Sets the causeCode value for this ReceberAutenticacaoDoadoraIn.
     * 
     * @param causeCode
     */
    public void setCauseCode(java.math.BigInteger causeCode) {
        this.causeCode = causeCode;
    }


    /**
     * Gets the justification value for this ReceberAutenticacaoDoadoraIn.
     * 
     * @return justification
     */
    public java.lang.String getJustification() {
        return justification;
    }


    /**
     * Sets the justification value for this ReceberAutenticacaoDoadoraIn.
     * 
     * @param justification
     */
    public void setJustification(java.lang.String justification) {
        this.justification = justification;
    }


    /**
     * Gets the fraudError value for this ReceberAutenticacaoDoadoraIn.
     * 
     * @return fraudError
     */
    public com.gvt.www.ws.business.portabilidade.receberAutenticacaoDoadora.ReceberAutenticacaoDoadoraInFraudError getFraudError() {
        return fraudError;
    }


    /**
     * Sets the fraudError value for this ReceberAutenticacaoDoadoraIn.
     * 
     * @param fraudError
     */
    public void setFraudError(com.gvt.www.ws.business.portabilidade.receberAutenticacaoDoadora.ReceberAutenticacaoDoadoraInFraudError fraudError) {
        this.fraudError = fraudError;
    }


    /**
     * Gets the donorCnl value for this ReceberAutenticacaoDoadoraIn.
     * 
     * @return donorCnl
     */
    public java.lang.String getDonorCnl() {
        return donorCnl;
    }


    /**
     * Sets the donorCnl value for this ReceberAutenticacaoDoadoraIn.
     * 
     * @param donorCnl
     */
    public void setDonorCnl(java.lang.String donorCnl) {
        this.donorCnl = donorCnl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReceberAutenticacaoDoadoraIn)) return false;
        ReceberAutenticacaoDoadoraIn other = (ReceberAutenticacaoDoadoraIn) obj;
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
            ((this.invokeId==null && other.getInvokeId()==null) || 
             (this.invokeId!=null &&
              this.invokeId.equals(other.getInvokeId()))) &&
            ((this.protocolEA==null && other.getProtocolEA()==null) || 
             (this.protocolEA!=null &&
              this.protocolEA.equals(other.getProtocolEA()))) &&
            ((this.buType==null && other.getBuType()==null) || 
             (this.buType!=null &&
              this.buType.equals(other.getBuType()))) &&
            ((this.authorization==null && other.getAuthorization()==null) || 
             (this.authorization!=null &&
              this.authorization.equals(other.getAuthorization()))) &&
            ((this.causeCode==null && other.getCauseCode()==null) || 
             (this.causeCode!=null &&
              this.causeCode.equals(other.getCauseCode()))) &&
            ((this.justification==null && other.getJustification()==null) || 
             (this.justification!=null &&
              this.justification.equals(other.getJustification()))) &&
            ((this.fraudError==null && other.getFraudError()==null) || 
             (this.fraudError!=null &&
              this.fraudError.equals(other.getFraudError()))) &&
            ((this.donorCnl==null && other.getDonorCnl()==null) || 
             (this.donorCnl!=null &&
              this.donorCnl.equals(other.getDonorCnl())));
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
        if (getInvokeId() != null) {
            _hashCode += getInvokeId().hashCode();
        }
        if (getProtocolEA() != null) {
            _hashCode += getProtocolEA().hashCode();
        }
        if (getBuType() != null) {
            _hashCode += getBuType().hashCode();
        }
        if (getAuthorization() != null) {
            _hashCode += getAuthorization().hashCode();
        }
        if (getCauseCode() != null) {
            _hashCode += getCauseCode().hashCode();
        }
        if (getJustification() != null) {
            _hashCode += getJustification().hashCode();
        }
        if (getFraudError() != null) {
            _hashCode += getFraudError().hashCode();
        }
        if (getDonorCnl() != null) {
            _hashCode += getDonorCnl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReceberAutenticacaoDoadoraIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberAutenticacaoDoadora", "receberAutenticacaoDoadoraIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberAutenticacaoDoadora", "passport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/security", "Passport"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSolicitacaoPN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberAutenticacaoDoadora", "idSolicitacaoPN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invokeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberAutenticacaoDoadora", "invokeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocolEA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberAutenticacaoDoadora", "protocolEA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberAutenticacaoDoadora", "buType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorization");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberAutenticacaoDoadora", "authorization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("causeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberAutenticacaoDoadora", "causeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("justification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberAutenticacaoDoadora", "justification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fraudError");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberAutenticacaoDoadora", "fraudError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberAutenticacaoDoadora", ">receberAutenticacaoDoadoraIn>fraudError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("donorCnl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberAutenticacaoDoadora", "donorCnl"));
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
