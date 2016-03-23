/**
 * LogPNIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.logPN;

public class LogPNIn  implements java.io.Serializable {
    private com.gvt.www.metaData.security.Passport passport;

    private com.gvt.www.ws.business.portabilidade.logPN.NumberListType[] numberList;

    private java.math.BigInteger invokeId;

    private java.lang.String returnSystem;

    private java.math.BigInteger groupInvokeId;

    public LogPNIn() {
    }

    public LogPNIn(
           com.gvt.www.metaData.security.Passport passport,
           com.gvt.www.ws.business.portabilidade.logPN.NumberListType[] numberList,
           java.math.BigInteger invokeId,
           java.lang.String returnSystem,
           java.math.BigInteger groupInvokeId) {
           this.passport = passport;
           this.numberList = numberList;
           this.invokeId = invokeId;
           this.returnSystem = returnSystem;
           this.groupInvokeId = groupInvokeId;
    }


    /**
     * Gets the passport value for this LogPNIn.
     * 
     * @return passport
     */
    public com.gvt.www.metaData.security.Passport getPassport() {
        return passport;
    }


    /**
     * Sets the passport value for this LogPNIn.
     * 
     * @param passport
     */
    public void setPassport(com.gvt.www.metaData.security.Passport passport) {
        this.passport = passport;
    }


    /**
     * Gets the numberList value for this LogPNIn.
     * 
     * @return numberList
     */
    public com.gvt.www.ws.business.portabilidade.logPN.NumberListType[] getNumberList() {
        return numberList;
    }


    /**
     * Sets the numberList value for this LogPNIn.
     * 
     * @param numberList
     */
    public void setNumberList(com.gvt.www.ws.business.portabilidade.logPN.NumberListType[] numberList) {
        this.numberList = numberList;
    }

    public com.gvt.www.ws.business.portabilidade.logPN.NumberListType getNumberList(int i) {
        return this.numberList[i];
    }

    public void setNumberList(int i, com.gvt.www.ws.business.portabilidade.logPN.NumberListType _value) {
        this.numberList[i] = _value;
    }


    /**
     * Gets the invokeId value for this LogPNIn.
     * 
     * @return invokeId
     */
    public java.math.BigInteger getInvokeId() {
        return invokeId;
    }


    /**
     * Sets the invokeId value for this LogPNIn.
     * 
     * @param invokeId
     */
    public void setInvokeId(java.math.BigInteger invokeId) {
        this.invokeId = invokeId;
    }


    /**
     * Gets the returnSystem value for this LogPNIn.
     * 
     * @return returnSystem
     */
    public java.lang.String getReturnSystem() {
        return returnSystem;
    }


    /**
     * Sets the returnSystem value for this LogPNIn.
     * 
     * @param returnSystem
     */
    public void setReturnSystem(java.lang.String returnSystem) {
        this.returnSystem = returnSystem;
    }


    /**
     * Gets the groupInvokeId value for this LogPNIn.
     * 
     * @return groupInvokeId
     */
    public java.math.BigInteger getGroupInvokeId() {
        return groupInvokeId;
    }


    /**
     * Sets the groupInvokeId value for this LogPNIn.
     * 
     * @param groupInvokeId
     */
    public void setGroupInvokeId(java.math.BigInteger groupInvokeId) {
        this.groupInvokeId = groupInvokeId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LogPNIn)) return false;
        LogPNIn other = (LogPNIn) obj;
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
            ((this.groupInvokeId==null && other.getGroupInvokeId()==null) || 
             (this.groupInvokeId!=null &&
              this.groupInvokeId.equals(other.getGroupInvokeId())));
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
        if (getGroupInvokeId() != null) {
            _hashCode += getGroupInvokeId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LogPNIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPN", "logPNIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPN", "passport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/security", "Passport"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPN", "numberList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPN", "numberListType"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invokeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPN", "invokeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPN", "returnSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupInvokeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPN", "groupInvokeId"));
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
