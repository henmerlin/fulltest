/**
 * ReceberCancelamentoPNIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.receberCancelamentoPN;

public class ReceberCancelamentoPNIn  implements java.io.Serializable {
    private java.math.BigInteger invokeId;

    private java.math.BigInteger protocoloEA;

    private com.gvt.www.ws.business.portabilidade.receberCancelamentoPN.ReceberCancelamentoPNInStatus status;

    private java.math.BigInteger cancelCauseCode;

    public ReceberCancelamentoPNIn() {
    }

    public ReceberCancelamentoPNIn(
           java.math.BigInteger invokeId,
           java.math.BigInteger protocoloEA,
           com.gvt.www.ws.business.portabilidade.receberCancelamentoPN.ReceberCancelamentoPNInStatus status,
           java.math.BigInteger cancelCauseCode) {
           this.invokeId = invokeId;
           this.protocoloEA = protocoloEA;
           this.status = status;
           this.cancelCauseCode = cancelCauseCode;
    }


    /**
     * Gets the invokeId value for this ReceberCancelamentoPNIn.
     * 
     * @return invokeId
     */
    public java.math.BigInteger getInvokeId() {
        return invokeId;
    }


    /**
     * Sets the invokeId value for this ReceberCancelamentoPNIn.
     * 
     * @param invokeId
     */
    public void setInvokeId(java.math.BigInteger invokeId) {
        this.invokeId = invokeId;
    }


    /**
     * Gets the protocoloEA value for this ReceberCancelamentoPNIn.
     * 
     * @return protocoloEA
     */
    public java.math.BigInteger getProtocoloEA() {
        return protocoloEA;
    }


    /**
     * Sets the protocoloEA value for this ReceberCancelamentoPNIn.
     * 
     * @param protocoloEA
     */
    public void setProtocoloEA(java.math.BigInteger protocoloEA) {
        this.protocoloEA = protocoloEA;
    }


    /**
     * Gets the status value for this ReceberCancelamentoPNIn.
     * 
     * @return status
     */
    public com.gvt.www.ws.business.portabilidade.receberCancelamentoPN.ReceberCancelamentoPNInStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ReceberCancelamentoPNIn.
     * 
     * @param status
     */
    public void setStatus(com.gvt.www.ws.business.portabilidade.receberCancelamentoPN.ReceberCancelamentoPNInStatus status) {
        this.status = status;
    }


    /**
     * Gets the cancelCauseCode value for this ReceberCancelamentoPNIn.
     * 
     * @return cancelCauseCode
     */
    public java.math.BigInteger getCancelCauseCode() {
        return cancelCauseCode;
    }


    /**
     * Sets the cancelCauseCode value for this ReceberCancelamentoPNIn.
     * 
     * @param cancelCauseCode
     */
    public void setCancelCauseCode(java.math.BigInteger cancelCauseCode) {
        this.cancelCauseCode = cancelCauseCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReceberCancelamentoPNIn)) return false;
        ReceberCancelamentoPNIn other = (ReceberCancelamentoPNIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.invokeId==null && other.getInvokeId()==null) || 
             (this.invokeId!=null &&
              this.invokeId.equals(other.getInvokeId()))) &&
            ((this.protocoloEA==null && other.getProtocoloEA()==null) || 
             (this.protocoloEA!=null &&
              this.protocoloEA.equals(other.getProtocoloEA()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.cancelCauseCode==null && other.getCancelCauseCode()==null) || 
             (this.cancelCauseCode!=null &&
              this.cancelCauseCode.equals(other.getCancelCauseCode())));
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
        if (getInvokeId() != null) {
            _hashCode += getInvokeId().hashCode();
        }
        if (getProtocoloEA() != null) {
            _hashCode += getProtocoloEA().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getCancelCauseCode() != null) {
            _hashCode += getCancelCauseCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReceberCancelamentoPNIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberCancelamentoPN", "receberCancelamentoPNIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invokeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberCancelamentoPN", "invokeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocoloEA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberCancelamentoPN", "protocoloEA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberCancelamentoPN", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberCancelamentoPN", ">receberCancelamentoPNIn>status"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelCauseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberCancelamentoPN", "cancelCauseCode"));
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
