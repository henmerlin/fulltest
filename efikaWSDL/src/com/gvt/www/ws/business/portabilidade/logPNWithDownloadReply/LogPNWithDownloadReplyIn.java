/**
 * LogPNWithDownloadReplyIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.logPNWithDownloadReply;

public class LogPNWithDownloadReplyIn  implements java.io.Serializable {
    private com.gvt.www.metaData.security.Passport passport;

    private boolean isInvolved;

    private java.lang.String action;

    private java.lang.String phoneNumber;

    private java.math.BigInteger protocolEA;

    private java.lang.String recipientSP;

    private java.lang.String recipientEot;

    private java.util.Calendar activationTimestamp;

    private java.lang.String rn1;

    private java.lang.String cnl;

    private java.lang.String lnpType;

    private com.gvt.www.ws.business.portabilidade.logPNWithDownloadReply.DownloadReason downloadReason;

    private java.lang.String lineType;

    private java.math.BigInteger invokeId;

    private java.lang.String fakeNumber;

    private java.math.BigInteger causeCode;

    private java.math.BigInteger cancelCauseCode;

    private java.util.Calendar dataAgendamento;

    public LogPNWithDownloadReplyIn() {
    }

    public LogPNWithDownloadReplyIn(
           com.gvt.www.metaData.security.Passport passport,
           boolean isInvolved,
           java.lang.String action,
           java.lang.String phoneNumber,
           java.math.BigInteger protocolEA,
           java.lang.String recipientSP,
           java.lang.String recipientEot,
           java.util.Calendar activationTimestamp,
           java.lang.String rn1,
           java.lang.String cnl,
           java.lang.String lnpType,
           com.gvt.www.ws.business.portabilidade.logPNWithDownloadReply.DownloadReason downloadReason,
           java.lang.String lineType,
           java.math.BigInteger invokeId,
           java.lang.String fakeNumber,
           java.math.BigInteger causeCode,
           java.math.BigInteger cancelCauseCode,
           java.util.Calendar dataAgendamento) {
           this.passport = passport;
           this.isInvolved = isInvolved;
           this.action = action;
           this.phoneNumber = phoneNumber;
           this.protocolEA = protocolEA;
           this.recipientSP = recipientSP;
           this.recipientEot = recipientEot;
           this.activationTimestamp = activationTimestamp;
           this.rn1 = rn1;
           this.cnl = cnl;
           this.lnpType = lnpType;
           this.downloadReason = downloadReason;
           this.lineType = lineType;
           this.invokeId = invokeId;
           this.fakeNumber = fakeNumber;
           this.causeCode = causeCode;
           this.cancelCauseCode = cancelCauseCode;
           this.dataAgendamento = dataAgendamento;
    }


    /**
     * Gets the passport value for this LogPNWithDownloadReplyIn.
     * 
     * @return passport
     */
    public com.gvt.www.metaData.security.Passport getPassport() {
        return passport;
    }


    /**
     * Sets the passport value for this LogPNWithDownloadReplyIn.
     * 
     * @param passport
     */
    public void setPassport(com.gvt.www.metaData.security.Passport passport) {
        this.passport = passport;
    }


    /**
     * Gets the isInvolved value for this LogPNWithDownloadReplyIn.
     * 
     * @return isInvolved
     */
    public boolean isIsInvolved() {
        return isInvolved;
    }


    /**
     * Sets the isInvolved value for this LogPNWithDownloadReplyIn.
     * 
     * @param isInvolved
     */
    public void setIsInvolved(boolean isInvolved) {
        this.isInvolved = isInvolved;
    }


    /**
     * Gets the action value for this LogPNWithDownloadReplyIn.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this LogPNWithDownloadReplyIn.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the phoneNumber value for this LogPNWithDownloadReplyIn.
     * 
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this LogPNWithDownloadReplyIn.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the protocolEA value for this LogPNWithDownloadReplyIn.
     * 
     * @return protocolEA
     */
    public java.math.BigInteger getProtocolEA() {
        return protocolEA;
    }


    /**
     * Sets the protocolEA value for this LogPNWithDownloadReplyIn.
     * 
     * @param protocolEA
     */
    public void setProtocolEA(java.math.BigInteger protocolEA) {
        this.protocolEA = protocolEA;
    }


    /**
     * Gets the recipientSP value for this LogPNWithDownloadReplyIn.
     * 
     * @return recipientSP
     */
    public java.lang.String getRecipientSP() {
        return recipientSP;
    }


    /**
     * Sets the recipientSP value for this LogPNWithDownloadReplyIn.
     * 
     * @param recipientSP
     */
    public void setRecipientSP(java.lang.String recipientSP) {
        this.recipientSP = recipientSP;
    }


    /**
     * Gets the recipientEot value for this LogPNWithDownloadReplyIn.
     * 
     * @return recipientEot
     */
    public java.lang.String getRecipientEot() {
        return recipientEot;
    }


    /**
     * Sets the recipientEot value for this LogPNWithDownloadReplyIn.
     * 
     * @param recipientEot
     */
    public void setRecipientEot(java.lang.String recipientEot) {
        this.recipientEot = recipientEot;
    }


    /**
     * Gets the activationTimestamp value for this LogPNWithDownloadReplyIn.
     * 
     * @return activationTimestamp
     */
    public java.util.Calendar getActivationTimestamp() {
        return activationTimestamp;
    }


    /**
     * Sets the activationTimestamp value for this LogPNWithDownloadReplyIn.
     * 
     * @param activationTimestamp
     */
    public void setActivationTimestamp(java.util.Calendar activationTimestamp) {
        this.activationTimestamp = activationTimestamp;
    }


    /**
     * Gets the rn1 value for this LogPNWithDownloadReplyIn.
     * 
     * @return rn1
     */
    public java.lang.String getRn1() {
        return rn1;
    }


    /**
     * Sets the rn1 value for this LogPNWithDownloadReplyIn.
     * 
     * @param rn1
     */
    public void setRn1(java.lang.String rn1) {
        this.rn1 = rn1;
    }


    /**
     * Gets the cnl value for this LogPNWithDownloadReplyIn.
     * 
     * @return cnl
     */
    public java.lang.String getCnl() {
        return cnl;
    }


    /**
     * Sets the cnl value for this LogPNWithDownloadReplyIn.
     * 
     * @param cnl
     */
    public void setCnl(java.lang.String cnl) {
        this.cnl = cnl;
    }


    /**
     * Gets the lnpType value for this LogPNWithDownloadReplyIn.
     * 
     * @return lnpType
     */
    public java.lang.String getLnpType() {
        return lnpType;
    }


    /**
     * Sets the lnpType value for this LogPNWithDownloadReplyIn.
     * 
     * @param lnpType
     */
    public void setLnpType(java.lang.String lnpType) {
        this.lnpType = lnpType;
    }


    /**
     * Gets the downloadReason value for this LogPNWithDownloadReplyIn.
     * 
     * @return downloadReason
     */
    public com.gvt.www.ws.business.portabilidade.logPNWithDownloadReply.DownloadReason getDownloadReason() {
        return downloadReason;
    }


    /**
     * Sets the downloadReason value for this LogPNWithDownloadReplyIn.
     * 
     * @param downloadReason
     */
    public void setDownloadReason(com.gvt.www.ws.business.portabilidade.logPNWithDownloadReply.DownloadReason downloadReason) {
        this.downloadReason = downloadReason;
    }


    /**
     * Gets the lineType value for this LogPNWithDownloadReplyIn.
     * 
     * @return lineType
     */
    public java.lang.String getLineType() {
        return lineType;
    }


    /**
     * Sets the lineType value for this LogPNWithDownloadReplyIn.
     * 
     * @param lineType
     */
    public void setLineType(java.lang.String lineType) {
        this.lineType = lineType;
    }


    /**
     * Gets the invokeId value for this LogPNWithDownloadReplyIn.
     * 
     * @return invokeId
     */
    public java.math.BigInteger getInvokeId() {
        return invokeId;
    }


    /**
     * Sets the invokeId value for this LogPNWithDownloadReplyIn.
     * 
     * @param invokeId
     */
    public void setInvokeId(java.math.BigInteger invokeId) {
        this.invokeId = invokeId;
    }


    /**
     * Gets the fakeNumber value for this LogPNWithDownloadReplyIn.
     * 
     * @return fakeNumber
     */
    public java.lang.String getFakeNumber() {
        return fakeNumber;
    }


    /**
     * Sets the fakeNumber value for this LogPNWithDownloadReplyIn.
     * 
     * @param fakeNumber
     */
    public void setFakeNumber(java.lang.String fakeNumber) {
        this.fakeNumber = fakeNumber;
    }


    /**
     * Gets the causeCode value for this LogPNWithDownloadReplyIn.
     * 
     * @return causeCode
     */
    public java.math.BigInteger getCauseCode() {
        return causeCode;
    }


    /**
     * Sets the causeCode value for this LogPNWithDownloadReplyIn.
     * 
     * @param causeCode
     */
    public void setCauseCode(java.math.BigInteger causeCode) {
        this.causeCode = causeCode;
    }


    /**
     * Gets the cancelCauseCode value for this LogPNWithDownloadReplyIn.
     * 
     * @return cancelCauseCode
     */
    public java.math.BigInteger getCancelCauseCode() {
        return cancelCauseCode;
    }


    /**
     * Sets the cancelCauseCode value for this LogPNWithDownloadReplyIn.
     * 
     * @param cancelCauseCode
     */
    public void setCancelCauseCode(java.math.BigInteger cancelCauseCode) {
        this.cancelCauseCode = cancelCauseCode;
    }


    /**
     * Gets the dataAgendamento value for this LogPNWithDownloadReplyIn.
     * 
     * @return dataAgendamento
     */
    public java.util.Calendar getDataAgendamento() {
        return dataAgendamento;
    }


    /**
     * Sets the dataAgendamento value for this LogPNWithDownloadReplyIn.
     * 
     * @param dataAgendamento
     */
    public void setDataAgendamento(java.util.Calendar dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LogPNWithDownloadReplyIn)) return false;
        LogPNWithDownloadReplyIn other = (LogPNWithDownloadReplyIn) obj;
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
            this.isInvolved == other.isIsInvolved() &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.protocolEA==null && other.getProtocolEA()==null) || 
             (this.protocolEA!=null &&
              this.protocolEA.equals(other.getProtocolEA()))) &&
            ((this.recipientSP==null && other.getRecipientSP()==null) || 
             (this.recipientSP!=null &&
              this.recipientSP.equals(other.getRecipientSP()))) &&
            ((this.recipientEot==null && other.getRecipientEot()==null) || 
             (this.recipientEot!=null &&
              this.recipientEot.equals(other.getRecipientEot()))) &&
            ((this.activationTimestamp==null && other.getActivationTimestamp()==null) || 
             (this.activationTimestamp!=null &&
              this.activationTimestamp.equals(other.getActivationTimestamp()))) &&
            ((this.rn1==null && other.getRn1()==null) || 
             (this.rn1!=null &&
              this.rn1.equals(other.getRn1()))) &&
            ((this.cnl==null && other.getCnl()==null) || 
             (this.cnl!=null &&
              this.cnl.equals(other.getCnl()))) &&
            ((this.lnpType==null && other.getLnpType()==null) || 
             (this.lnpType!=null &&
              this.lnpType.equals(other.getLnpType()))) &&
            ((this.downloadReason==null && other.getDownloadReason()==null) || 
             (this.downloadReason!=null &&
              this.downloadReason.equals(other.getDownloadReason()))) &&
            ((this.lineType==null && other.getLineType()==null) || 
             (this.lineType!=null &&
              this.lineType.equals(other.getLineType()))) &&
            ((this.invokeId==null && other.getInvokeId()==null) || 
             (this.invokeId!=null &&
              this.invokeId.equals(other.getInvokeId()))) &&
            ((this.fakeNumber==null && other.getFakeNumber()==null) || 
             (this.fakeNumber!=null &&
              this.fakeNumber.equals(other.getFakeNumber()))) &&
            ((this.causeCode==null && other.getCauseCode()==null) || 
             (this.causeCode!=null &&
              this.causeCode.equals(other.getCauseCode()))) &&
            ((this.cancelCauseCode==null && other.getCancelCauseCode()==null) || 
             (this.cancelCauseCode!=null &&
              this.cancelCauseCode.equals(other.getCancelCauseCode()))) &&
            ((this.dataAgendamento==null && other.getDataAgendamento()==null) || 
             (this.dataAgendamento!=null &&
              this.dataAgendamento.equals(other.getDataAgendamento())));
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
        _hashCode += (isIsInvolved() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getProtocolEA() != null) {
            _hashCode += getProtocolEA().hashCode();
        }
        if (getRecipientSP() != null) {
            _hashCode += getRecipientSP().hashCode();
        }
        if (getRecipientEot() != null) {
            _hashCode += getRecipientEot().hashCode();
        }
        if (getActivationTimestamp() != null) {
            _hashCode += getActivationTimestamp().hashCode();
        }
        if (getRn1() != null) {
            _hashCode += getRn1().hashCode();
        }
        if (getCnl() != null) {
            _hashCode += getCnl().hashCode();
        }
        if (getLnpType() != null) {
            _hashCode += getLnpType().hashCode();
        }
        if (getDownloadReason() != null) {
            _hashCode += getDownloadReason().hashCode();
        }
        if (getLineType() != null) {
            _hashCode += getLineType().hashCode();
        }
        if (getInvokeId() != null) {
            _hashCode += getInvokeId().hashCode();
        }
        if (getFakeNumber() != null) {
            _hashCode += getFakeNumber().hashCode();
        }
        if (getCauseCode() != null) {
            _hashCode += getCauseCode().hashCode();
        }
        if (getCancelCauseCode() != null) {
            _hashCode += getCancelCauseCode().hashCode();
        }
        if (getDataAgendamento() != null) {
            _hashCode += getDataAgendamento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LogPNWithDownloadReplyIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPNWithDownloadReply", "logPNWithDownloadReplyIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPNWithDownloadReply", "passport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/security", "Passport"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInvolved");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPNWithDownloadReply", "isInvolved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPNWithDownloadReply", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPNWithDownloadReply", "phoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocolEA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPNWithDownloadReply", "protocolEA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientSP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPNWithDownloadReply", "recipientSP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientEot");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPNWithDownloadReply", "recipientEot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPNWithDownloadReply", "activationTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rn1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPNWithDownloadReply", "rn1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cnl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPNWithDownloadReply", "cnl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lnpType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPNWithDownloadReply", "lnpType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downloadReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPNWithDownloadReply", "downloadReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPNWithDownloadReply", "DownloadReason"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPNWithDownloadReply", "lineType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invokeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPNWithDownloadReply", "invokeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fakeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPNWithDownloadReply", "fakeNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("causeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPNWithDownloadReply", "causeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelCauseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPNWithDownloadReply", "cancelCauseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataAgendamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPNWithDownloadReply", "dataAgendamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
