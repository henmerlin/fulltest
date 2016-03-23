/**
 * GetHistoricoPNByFilterOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.getHistoricoPNByFilter;

public class GetHistoricoPNByFilterOut  implements java.io.Serializable {
    private com.gvt.www.ws.business.portabilidade.getHistoricoPNByFilter.ActionType[] historicoNumero;

    /* Reserved for Future Use - resolve problema quando tem apenas
     * um elemento unbounded. */
    private java.lang.String RFU;

    public GetHistoricoPNByFilterOut() {
    }

    public GetHistoricoPNByFilterOut(
           com.gvt.www.ws.business.portabilidade.getHistoricoPNByFilter.ActionType[] historicoNumero,
           java.lang.String RFU) {
           this.historicoNumero = historicoNumero;
           this.RFU = RFU;
    }


    /**
     * Gets the historicoNumero value for this GetHistoricoPNByFilterOut.
     * 
     * @return historicoNumero
     */
    public com.gvt.www.ws.business.portabilidade.getHistoricoPNByFilter.ActionType[] getHistoricoNumero() {
        return historicoNumero;
    }


    /**
     * Sets the historicoNumero value for this GetHistoricoPNByFilterOut.
     * 
     * @param historicoNumero
     */
    public void setHistoricoNumero(com.gvt.www.ws.business.portabilidade.getHistoricoPNByFilter.ActionType[] historicoNumero) {
        this.historicoNumero = historicoNumero;
    }

    public com.gvt.www.ws.business.portabilidade.getHistoricoPNByFilter.ActionType getHistoricoNumero(int i) {
        return this.historicoNumero[i];
    }

    public void setHistoricoNumero(int i, com.gvt.www.ws.business.portabilidade.getHistoricoPNByFilter.ActionType _value) {
        this.historicoNumero[i] = _value;
    }


    /**
     * Gets the RFU value for this GetHistoricoPNByFilterOut.
     * 
     * @return RFU   * Reserved for Future Use - resolve problema quando tem apenas
     * um elemento unbounded.
     */
    public java.lang.String getRFU() {
        return RFU;
    }


    /**
     * Sets the RFU value for this GetHistoricoPNByFilterOut.
     * 
     * @param RFU   * Reserved for Future Use - resolve problema quando tem apenas
     * um elemento unbounded.
     */
    public void setRFU(java.lang.String RFU) {
        this.RFU = RFU;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetHistoricoPNByFilterOut)) return false;
        GetHistoricoPNByFilterOut other = (GetHistoricoPNByFilterOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.historicoNumero==null && other.getHistoricoNumero()==null) || 
             (this.historicoNumero!=null &&
              java.util.Arrays.equals(this.historicoNumero, other.getHistoricoNumero()))) &&
            ((this.RFU==null && other.getRFU()==null) || 
             (this.RFU!=null &&
              this.RFU.equals(other.getRFU())));
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
        if (getHistoricoNumero() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHistoricoNumero());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHistoricoNumero(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRFU() != null) {
            _hashCode += getRFU().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetHistoricoPNByFilterOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getHistoricoPNByFilter", "getHistoricoPNByFilterOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historicoNumero");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getHistoricoPNByFilter", "historicoNumero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getHistoricoPNByFilter", "actionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RFU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getHistoricoPNByFilter", "RFU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
