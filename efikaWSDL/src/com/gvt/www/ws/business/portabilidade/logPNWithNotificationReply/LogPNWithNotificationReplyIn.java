/**
 * LogPNWithNotificationReplyIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.logPNWithNotificationReply;

public class LogPNWithNotificationReplyIn  implements java.io.Serializable {
    private com.gvt.www.metaData.security.Passport passport;

    private com.gvt.www.ws.business.portabilidade.logPNWithNotificationReply.NumberListType[] numberList;

    private java.math.BigInteger invokeId;

    private java.lang.String returnSystem;

    private java.lang.String status;

    public LogPNWithNotificationReplyIn() {
    }

    public LogPNWithNotificationReplyIn(
           com.gvt.www.metaData.security.Passport passport,
           com.gvt.www.ws.business.portabilidade.logPNWithNotificationReply.NumberListType[] numberList,
           java.math.BigInteger invokeId,
           java.lang.String returnSystem,
           java.lang.String status) {
           this.passport = passport;
           this.numberList = numberList;
           this.invokeId = invokeId;
           this.returnSystem = returnSystem;
           this.status = status;
    }


    /**
     * Gets the passport value for this LogPNWithNotificationReplyIn.
     * 
     * @return passport
     */
    public com.gvt.www.metaData.security.Passport getPassport() {
        return passport;
    }


    /**
     * Sets the passport value for this LogPNWithNotificationReplyIn.
     * 
     * @param passport
     */
    public void setPassport(com.gvt.www.metaData.security.Passport passport) {
        this.passport = passport;
    }


    /**
     * Gets the numberList value for this LogPNWithNotificationReplyIn.
     * 
     * @return numberList
     */
    public com.gvt.www.ws.business.portabilidade.logPNWithNotificationReply.NumberListType[] getNumberList() {
        return numberList;
    }


    /**
     * Sets the numberList value for this LogPNWithNotificationReplyIn.
     * 
     * @param numberList
     */
    public void setNumberList(com.gvt.www.ws.business.portabilidade.logPNWithNotificationReply.NumberListType[] numberList) {
        this.numberList = numberList;
    }

    public com.gvt.www.ws.business.portabilidade.logPNWithNotificationReply.NumberListType getNumberList(int i) {
        return this.numberList[i];
    }

    public void setNumberList(int i, com.gvt.www.ws.business.portabilidade.logPNWithNotificationReply.NumberListType _value) {
        this.numberList[i] = _value;
    }


    /**
     * Gets the invokeId value for this LogPNWithNotificationReplyIn.
     * 
     * @return invokeId
     */
    public java.math.BigInteger getInvokeId() {
        return invokeId;
    }


    /**
     * Sets the invokeId value for this LogPNWithNotificationReplyIn.
     * 
     * @param invokeId
     */
    public void setInvokeId(java.math.BigInteger invokeId) {
        this.invokeId = invokeId;
    }


    /**
     * Gets the returnSystem value for this LogPNWithNotificationReplyIn.
     * 
     * @return returnSystem
     */
    public java.lang.String getReturnSystem() {
        return returnSystem;
    }


    /**
     * Sets the returnSystem value for this LogPNWithNotificationReplyIn.
     * 
     * @param returnSystem
     */
    public void setReturnSystem(java.lang.String returnSystem) {
        this.returnSystem = returnSystem;
    }


    /**
     * Gets the status value for this LogPNWithNotificationReplyIn.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this LogPNWithNotificationReplyIn.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LogPNWithNotificationReplyIn)) return false;
        LogPNWithNotificationReplyIn other = (LogPNWithNotificationReplyIn) obj;
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
            ((this.numberList==null && other.getNumberList()==null) || 
             (this.numberList!=null &&
              java.util.Arrays.equals(this.numberList, other.getNumberList()))) &&
            ((this.invokeId==null && other.getInvokeId()==null) || 
             (this.invokeId!=null &&
              this.invokeId.equals(other.getInvokeId()))) &&
            ((this.returnSystem==null && other.getReturnSystem()==null) || 
             (this.returnSystem!=null &&
              this.returnSystem.equals(other.getReturnSystem()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getNumberList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNumberList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNumberList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInvokeId() != null) {
            _hashCode += getInvokeId().hashCode();
        }
        if (getReturnSystem() != null) {
            _hashCode += getReturnSystem().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LogPNWithNotificationReplyIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPNWithNotificationReply", "logPNWithNotificationReplyIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPNWithNotificationReply", "passport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/security", "Passport"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPNWithNotificationReply", "numberList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPNWithNotificationReply", "numberListType"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invokeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPNWithNotificationReply", "invokeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPNWithNotificationReply", "returnSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPNWithNotificationReply", "status"));
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
