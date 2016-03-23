/**
 * ReversingInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.receberPedidoAutenticacaoPN;

public class ReversingInfoType  implements java.io.Serializable {
    /* protocolo que esta sendo estornado */
    private java.math.BigInteger reversingProtocolEA;

    private com.gvt.www.ws.business.portabilidade.receberPedidoAutenticacaoPN.ReversingInfoTypeReversingType reversingType;

    private java.lang.String reversingJustification;

    public ReversingInfoType() {
    }

    public ReversingInfoType(
           java.math.BigInteger reversingProtocolEA,
           com.gvt.www.ws.business.portabilidade.receberPedidoAutenticacaoPN.ReversingInfoTypeReversingType reversingType,
           java.lang.String reversingJustification) {
           this.reversingProtocolEA = reversingProtocolEA;
           this.reversingType = reversingType;
           this.reversingJustification = reversingJustification;
    }


    /**
     * Gets the reversingProtocolEA value for this ReversingInfoType.
     * 
     * @return reversingProtocolEA   * protocolo que esta sendo estornado
     */
    public java.math.BigInteger getReversingProtocolEA() {
        return reversingProtocolEA;
    }


    /**
     * Sets the reversingProtocolEA value for this ReversingInfoType.
     * 
     * @param reversingProtocolEA   * protocolo que esta sendo estornado
     */
    public void setReversingProtocolEA(java.math.BigInteger reversingProtocolEA) {
        this.reversingProtocolEA = reversingProtocolEA;
    }


    /**
     * Gets the reversingType value for this ReversingInfoType.
     * 
     * @return reversingType
     */
    public com.gvt.www.ws.business.portabilidade.receberPedidoAutenticacaoPN.ReversingInfoTypeReversingType getReversingType() {
        return reversingType;
    }


    /**
     * Sets the reversingType value for this ReversingInfoType.
     * 
     * @param reversingType
     */
    public void setReversingType(com.gvt.www.ws.business.portabilidade.receberPedidoAutenticacaoPN.ReversingInfoTypeReversingType reversingType) {
        this.reversingType = reversingType;
    }


    /**
     * Gets the reversingJustification value for this ReversingInfoType.
     * 
     * @return reversingJustification
     */
    public java.lang.String getReversingJustification() {
        return reversingJustification;
    }


    /**
     * Sets the reversingJustification value for this ReversingInfoType.
     * 
     * @param reversingJustification
     */
    public void setReversingJustification(java.lang.String reversingJustification) {
        this.reversingJustification = reversingJustification;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReversingInfoType)) return false;
        ReversingInfoType other = (ReversingInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reversingProtocolEA==null && other.getReversingProtocolEA()==null) || 
             (this.reversingProtocolEA!=null &&
              this.reversingProtocolEA.equals(other.getReversingProtocolEA()))) &&
            ((this.reversingType==null && other.getReversingType()==null) || 
             (this.reversingType!=null &&
              this.reversingType.equals(other.getReversingType()))) &&
            ((this.reversingJustification==null && other.getReversingJustification()==null) || 
             (this.reversingJustification!=null &&
              this.reversingJustification.equals(other.getReversingJustification())));
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
        if (getReversingProtocolEA() != null) {
            _hashCode += getReversingProtocolEA().hashCode();
        }
        if (getReversingType() != null) {
            _hashCode += getReversingType().hashCode();
        }
        if (getReversingJustification() != null) {
            _hashCode += getReversingJustification().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReversingInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberPedidoAutenticacaoPN", "ReversingInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reversingProtocolEA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberPedidoAutenticacaoPN", "reversingProtocolEA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reversingType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberPedidoAutenticacaoPN", "reversingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberPedidoAutenticacaoPN", ">ReversingInfoType>reversingType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reversingJustification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberPedidoAutenticacaoPN", "reversingJustification"));
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
