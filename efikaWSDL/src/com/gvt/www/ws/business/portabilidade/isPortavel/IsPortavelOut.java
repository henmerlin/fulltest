/**
 * IsPortavelOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.isPortavel;

public class IsPortavelOut  implements java.io.Serializable {
    private com.gvt.www.ws.business.portabilidade.isPortavel.ResultadoIsPortavel[] resultado;

    /* Reserved for Future Use - resolve problema quando tem apenas
     * um elemento unbounded. */
    private java.lang.String RFU;

    public IsPortavelOut() {
    }

    public IsPortavelOut(
           com.gvt.www.ws.business.portabilidade.isPortavel.ResultadoIsPortavel[] resultado,
           java.lang.String RFU) {
           this.resultado = resultado;
           this.RFU = RFU;
    }


    /**
     * Gets the resultado value for this IsPortavelOut.
     * 
     * @return resultado
     */
    public com.gvt.www.ws.business.portabilidade.isPortavel.ResultadoIsPortavel[] getResultado() {
        return resultado;
    }


    /**
     * Sets the resultado value for this IsPortavelOut.
     * 
     * @param resultado
     */
    public void setResultado(com.gvt.www.ws.business.portabilidade.isPortavel.ResultadoIsPortavel[] resultado) {
        this.resultado = resultado;
    }

    public com.gvt.www.ws.business.portabilidade.isPortavel.ResultadoIsPortavel getResultado(int i) {
        return this.resultado[i];
    }

    public void setResultado(int i, com.gvt.www.ws.business.portabilidade.isPortavel.ResultadoIsPortavel _value) {
        this.resultado[i] = _value;
    }


    /**
     * Gets the RFU value for this IsPortavelOut.
     * 
     * @return RFU   * Reserved for Future Use - resolve problema quando tem apenas
     * um elemento unbounded.
     */
    public java.lang.String getRFU() {
        return RFU;
    }


    /**
     * Sets the RFU value for this IsPortavelOut.
     * 
     * @param RFU   * Reserved for Future Use - resolve problema quando tem apenas
     * um elemento unbounded.
     */
    public void setRFU(java.lang.String RFU) {
        this.RFU = RFU;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IsPortavelOut)) return false;
        IsPortavelOut other = (IsPortavelOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resultado==null && other.getResultado()==null) || 
             (this.resultado!=null &&
              java.util.Arrays.equals(this.resultado, other.getResultado()))) &&
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
        if (getResultado() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResultado());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResultado(), i);
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
        new org.apache.axis.description.TypeDesc(IsPortavelOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isPortavel", "isPortavelOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isPortavel", "resultado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isPortavel", "resultadoIsPortavel"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RFU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isPortavel", "RFU"));
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
