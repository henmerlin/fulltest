/**
 * GetJanelasOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.getJanelas;

public class GetJanelasOut  implements java.io.Serializable {
    private com.gvt.www.metaData.portabilidade.Janela[] janelas;

    /* Reserved for Future Use - resolve problema quando tem apenas
     * 
     *                                        um elemento unbounded. */
    private java.lang.String RFU;

    public GetJanelasOut() {
    }

    public GetJanelasOut(
           com.gvt.www.metaData.portabilidade.Janela[] janelas,
           java.lang.String RFU) {
           this.janelas = janelas;
           this.RFU = RFU;
    }


    /**
     * Gets the janelas value for this GetJanelasOut.
     * 
     * @return janelas
     */
    public com.gvt.www.metaData.portabilidade.Janela[] getJanelas() {
        return janelas;
    }


    /**
     * Sets the janelas value for this GetJanelasOut.
     * 
     * @param janelas
     */
    public void setJanelas(com.gvt.www.metaData.portabilidade.Janela[] janelas) {
        this.janelas = janelas;
    }

    public com.gvt.www.metaData.portabilidade.Janela getJanelas(int i) {
        return this.janelas[i];
    }

    public void setJanelas(int i, com.gvt.www.metaData.portabilidade.Janela _value) {
        this.janelas[i] = _value;
    }


    /**
     * Gets the RFU value for this GetJanelasOut.
     * 
     * @return RFU   * Reserved for Future Use - resolve problema quando tem apenas
     * 
     *                                        um elemento unbounded.
     */
    public java.lang.String getRFU() {
        return RFU;
    }


    /**
     * Sets the RFU value for this GetJanelasOut.
     * 
     * @param RFU   * Reserved for Future Use - resolve problema quando tem apenas
     * 
     *                                        um elemento unbounded.
     */
    public void setRFU(java.lang.String RFU) {
        this.RFU = RFU;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetJanelasOut)) return false;
        GetJanelasOut other = (GetJanelasOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.janelas==null && other.getJanelas()==null) || 
             (this.janelas!=null &&
              java.util.Arrays.equals(this.janelas, other.getJanelas()))) &&
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
        if (getJanelas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJanelas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJanelas(), i);
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
        new org.apache.axis.description.TypeDesc(GetJanelasOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getJanelas", "getJanelasOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("janelas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getJanelas", "janelas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/portabilidade", "Janela"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RFU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getJanelas", "RFU"));
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
