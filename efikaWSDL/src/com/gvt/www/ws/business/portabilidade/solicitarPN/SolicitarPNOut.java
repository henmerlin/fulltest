/**
 * SolicitarPNOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.solicitarPN;

public class SolicitarPNOut  implements java.io.Serializable {
    private java.lang.String codigoRejeicao;

    private java.lang.String motivoRejeicao;

    private java.math.BigInteger idSolicitacaoPN;

    public SolicitarPNOut() {
    }

    public SolicitarPNOut(
           java.lang.String codigoRejeicao,
           java.lang.String motivoRejeicao,
           java.math.BigInteger idSolicitacaoPN) {
           this.codigoRejeicao = codigoRejeicao;
           this.motivoRejeicao = motivoRejeicao;
           this.idSolicitacaoPN = idSolicitacaoPN;
    }


    /**
     * Gets the codigoRejeicao value for this SolicitarPNOut.
     * 
     * @return codigoRejeicao
     */
    public java.lang.String getCodigoRejeicao() {
        return codigoRejeicao;
    }


    /**
     * Sets the codigoRejeicao value for this SolicitarPNOut.
     * 
     * @param codigoRejeicao
     */
    public void setCodigoRejeicao(java.lang.String codigoRejeicao) {
        this.codigoRejeicao = codigoRejeicao;
    }


    /**
     * Gets the motivoRejeicao value for this SolicitarPNOut.
     * 
     * @return motivoRejeicao
     */
    public java.lang.String getMotivoRejeicao() {
        return motivoRejeicao;
    }


    /**
     * Sets the motivoRejeicao value for this SolicitarPNOut.
     * 
     * @param motivoRejeicao
     */
    public void setMotivoRejeicao(java.lang.String motivoRejeicao) {
        this.motivoRejeicao = motivoRejeicao;
    }


    /**
     * Gets the idSolicitacaoPN value for this SolicitarPNOut.
     * 
     * @return idSolicitacaoPN
     */
    public java.math.BigInteger getIdSolicitacaoPN() {
        return idSolicitacaoPN;
    }


    /**
     * Sets the idSolicitacaoPN value for this SolicitarPNOut.
     * 
     * @param idSolicitacaoPN
     */
    public void setIdSolicitacaoPN(java.math.BigInteger idSolicitacaoPN) {
        this.idSolicitacaoPN = idSolicitacaoPN;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SolicitarPNOut)) return false;
        SolicitarPNOut other = (SolicitarPNOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoRejeicao==null && other.getCodigoRejeicao()==null) || 
             (this.codigoRejeicao!=null &&
              this.codigoRejeicao.equals(other.getCodigoRejeicao()))) &&
            ((this.motivoRejeicao==null && other.getMotivoRejeicao()==null) || 
             (this.motivoRejeicao!=null &&
              this.motivoRejeicao.equals(other.getMotivoRejeicao()))) &&
            ((this.idSolicitacaoPN==null && other.getIdSolicitacaoPN()==null) || 
             (this.idSolicitacaoPN!=null &&
              this.idSolicitacaoPN.equals(other.getIdSolicitacaoPN())));
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
        if (getCodigoRejeicao() != null) {
            _hashCode += getCodigoRejeicao().hashCode();
        }
        if (getMotivoRejeicao() != null) {
            _hashCode += getMotivoRejeicao().hashCode();
        }
        if (getIdSolicitacaoPN() != null) {
            _hashCode += getIdSolicitacaoPN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SolicitarPNOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", "solicitarPNOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoRejeicao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", "codigoRejeicao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motivoRejeicao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", "motivoRejeicao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSolicitacaoPN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", "idSolicitacaoPN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
