/**
 * MigrarPTSProdutoRIOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.migrarPTSProdutoRI;

public class MigrarPTSProdutoRIOut  implements java.io.Serializable {
    private java.lang.String mensagem;

    private java.math.BigInteger codigoErro;

    public MigrarPTSProdutoRIOut() {
    }

    public MigrarPTSProdutoRIOut(
           java.lang.String mensagem,
           java.math.BigInteger codigoErro) {
           this.mensagem = mensagem;
           this.codigoErro = codigoErro;
    }


    /**
     * Gets the mensagem value for this MigrarPTSProdutoRIOut.
     * 
     * @return mensagem
     */
    public java.lang.String getMensagem() {
        return mensagem;
    }


    /**
     * Sets the mensagem value for this MigrarPTSProdutoRIOut.
     * 
     * @param mensagem
     */
    public void setMensagem(java.lang.String mensagem) {
        this.mensagem = mensagem;
    }


    /**
     * Gets the codigoErro value for this MigrarPTSProdutoRIOut.
     * 
     * @return codigoErro
     */
    public java.math.BigInteger getCodigoErro() {
        return codigoErro;
    }


    /**
     * Sets the codigoErro value for this MigrarPTSProdutoRIOut.
     * 
     * @param codigoErro
     */
    public void setCodigoErro(java.math.BigInteger codigoErro) {
        this.codigoErro = codigoErro;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MigrarPTSProdutoRIOut)) return false;
        MigrarPTSProdutoRIOut other = (MigrarPTSProdutoRIOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mensagem==null && other.getMensagem()==null) || 
             (this.mensagem!=null &&
              this.mensagem.equals(other.getMensagem()))) &&
            ((this.codigoErro==null && other.getCodigoErro()==null) || 
             (this.codigoErro!=null &&
              this.codigoErro.equals(other.getCodigoErro())));
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
        if (getMensagem() != null) {
            _hashCode += getMensagem().hashCode();
        }
        if (getCodigoErro() != null) {
            _hashCode += getCodigoErro().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MigrarPTSProdutoRIOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/migrarPTSProdutoRI", "migrarPTSProdutoRIOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/migrarPTSProdutoRI", "mensagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoErro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/migrarPTSProdutoRI", "codigoErro"));
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
