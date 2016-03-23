/**
 * NumberListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.logPN;

public class NumberListType  implements java.io.Serializable {
    private java.lang.String phoneNumber;

    private java.math.BigInteger protocolEA;

    private java.math.BigInteger groupEA;

    private java.math.BigInteger errorNumber;

    private java.lang.String errorInfo;

    private java.math.BigInteger causeCode;

    private java.math.BigInteger cancelCauseCode;

    private java.lang.String action;

    /* se passado prevalece sobre o invokeId do nivel superior */
    private java.math.BigInteger invokeId;

    public NumberListType() {
    }

    public NumberListType(
           java.lang.String phoneNumber,
           java.math.BigInteger protocolEA,
           java.math.BigInteger groupEA,
           java.math.BigInteger errorNumber,
           java.lang.String errorInfo,
           java.math.BigInteger causeCode,
           java.math.BigInteger cancelCauseCode,
           java.lang.String action,
           java.math.BigInteger invokeId) {
           this.phoneNumber = phoneNumber;
           this.protocolEA = protocolEA;
           this.groupEA = groupEA;
           this.errorNumber = errorNumber;
           this.errorInfo = errorInfo;
           this.causeCode = causeCode;
           this.cancelCauseCode = cancelCauseCode;
           this.action = action;
           this.invokeId = invokeId;
    }


    /**
     * Gets the phoneNumber value for this NumberListType.
     * 
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this NumberListType.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the protocolEA value for this NumberListType.
     * 
     * @return protocolEA
     */
    public java.math.BigInteger getProtocolEA() {
        return protocolEA;
    }


    /**
     * Sets the protocolEA value for this NumberListType.
     * 
     * @param protocolEA
     */
    public void setProtocolEA(java.math.BigInteger protocolEA) {
        this.protocolEA = protocolEA;
    }


    /**
     * Gets the groupEA value for this NumberListType.
     * 
     * @return groupEA
     */
    public java.math.BigInteger getGroupEA() {
        return groupEA;
    }


    /**
     * Sets the groupEA value for this NumberListType.
     * 
     * @param groupEA
     */
    public void setGroupEA(java.math.BigInteger groupEA) {
        this.groupEA = groupEA;
    }


    /**
     * Gets the errorNumber value for this NumberListType.
     * 
     * @return errorNumber
     */
    public java.math.BigInteger getErrorNumber() {
        return errorNumber;
    }


    /**
     * Sets the errorNumber value for this NumberListType.
     * 
     * @param errorNumber
     */
    public void setErrorNumber(java.math.BigInteger errorNumber) {
        this.errorNumber = errorNumber;
    }


    /**
     * Gets the errorInfo value for this NumberListType.
     * 
     * @return errorInfo
     */
    public java.lang.String getErrorInfo() {
        return errorInfo;
    }


    /**
     * Sets the errorInfo value for this NumberListType.
     * 
     * @param errorInfo
     */
    public void setErrorInfo(java.lang.String errorInfo) {
        this.errorInfo = errorInfo;
    }


    /**
     * Gets the causeCode value for this NumberListType.
     * 
     * @return causeCode
     */
    public java.math.BigInteger getCauseCode() {
        return causeCode;
    }


    /**
     * Sets the causeCode value for this NumberListType.
     * 
     * @param causeCode
     */
    public void setCauseCode(java.math.BigInteger causeCode) {
        this.causeCode = causeCode;
    }


    /**
     * Gets the cancelCauseCode value for this NumberListType.
     * 
     * @return cancelCauseCode
     */
    public java.math.BigInteger getCancelCauseCode() {
        return cancelCauseCode;
    }


    /**
     * Sets the cancelCauseCode value for this NumberListType.
     * 
     * @param cancelCauseCode
     */
    public void setCancelCauseCode(java.math.BigInteger cancelCauseCode) {
        this.cancelCauseCode = cancelCauseCode;
    }


    /**
     * Gets the action value for this NumberListType.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this NumberListType.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the invokeId value for this NumberListType.
     * 
     * @return invokeId   * se passado prevalece sobre o invokeId do nivel superior
     */
    public java.math.BigInteger getInvokeId() {
        return invokeId;
    }


    /**
     * Sets the invokeId value for this NumberListType.
     * 
     * @param invokeId   * se passado prevalece sobre o invokeId do nivel superior
     */
    public void setInvokeId(java.math.BigInteger invokeId) {
        this.invokeId = invokeId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NumberListType)) return false;
        NumberListType other = (NumberListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.protocolEA==null && other.getProtocolEA()==null) || 
             (this.protocolEA!=null &&
              this.protocolEA.equals(other.getProtocolEA()))) &&
            ((this.groupEA==null && other.getGroupEA()==null) || 
             (this.groupEA!=null &&
              this.groupEA.equals(other.getGroupEA()))) &&
            ((this.errorNumber==null && other.getErrorNumber()==null) || 
             (this.errorNumber!=null &&
              this.errorNumber.equals(other.getErrorNumber()))) &&
            ((this.errorInfo==null && other.getErrorInfo()==null) || 
             (this.errorInfo!=null &&
              this.errorInfo.equals(other.getErrorInfo()))) &&
            ((this.causeCode==null && other.getCauseCode()==null) || 
             (this.causeCode!=null &&
              this.causeCode.equals(other.getCauseCode()))) &&
            ((this.cancelCauseCode==null && other.getCancelCauseCode()==null) || 
             (this.cancelCauseCode!=null &&
              this.cancelCauseCode.equals(other.getCancelCauseCode()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.invokeId==null && other.getInvokeId()==null) || 
             (this.invokeId!=null &&
              this.invokeId.equals(other.getInvokeId())));
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
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getProtocolEA() != null) {
            _hashCode += getProtocolEA().hashCode();
        }
        if (getGroupEA() != null) {
            _hashCode += getGroupEA().hashCode();
        }
        if (getErrorNumber() != null) {
            _hashCode += getErrorNumber().hashCode();
        }
        if (getErrorInfo() != null) {
            _hashCode += getErrorInfo().hashCode();
        }
        if (getCauseCode() != null) {
            _hashCode += getCauseCode().hashCode();
        }
        if (getCancelCauseCode() != null) {
            _hashCode += getCancelCauseCode().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getInvokeId() != null) {
            _hashCode += getInvokeId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NumberListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPN", "numberListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPN", "phoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocolEA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPN", "protocolEA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupEA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPN", "groupEA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPN", "errorNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPN", "errorInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("causeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPN", "causeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelCauseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPN", "cancelCauseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPN", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invokeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPN", "invokeId"));
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
