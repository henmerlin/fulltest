/**
 * ConsultarTecnologiaLinhaIMSOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.vas.consultarTecnologiaLinhaIMS;

public class ConsultarTecnologiaLinhaIMSOut  implements java.io.Serializable {
    /* Vai retornar qual é a tecnologia da instância. */
    private java.lang.String tecnologiaLinha;

    private java.lang.String mensagem;

    private java.lang.String descricao;

    public ConsultarTecnologiaLinhaIMSOut() {
    }

    public ConsultarTecnologiaLinhaIMSOut(
           java.lang.String tecnologiaLinha,
           java.lang.String mensagem,
           java.lang.String descricao) {
           this.tecnologiaLinha = tecnologiaLinha;
           this.mensagem = mensagem;
           this.descricao = descricao;
    }


    /**
     * Gets the tecnologiaLinha value for this ConsultarTecnologiaLinhaIMSOut.
     * 
     * @return tecnologiaLinha   * Vai retornar qual é a tecnologia da instância.
     */
    public java.lang.String getTecnologiaLinha() {
        return tecnologiaLinha;
    }


    /**
     * Sets the tecnologiaLinha value for this ConsultarTecnologiaLinhaIMSOut.
     * 
     * @param tecnologiaLinha   * Vai retornar qual é a tecnologia da instância.
     */
    public void setTecnologiaLinha(java.lang.String tecnologiaLinha) {
        this.tecnologiaLinha = tecnologiaLinha;
    }


    /**
     * Gets the mensagem value for this ConsultarTecnologiaLinhaIMSOut.
     * 
     * @return mensagem
     */
    public java.lang.String getMensagem() {
        return mensagem;
    }


    /**
     * Sets the mensagem value for this ConsultarTecnologiaLinhaIMSOut.
     * 
     * @param mensagem
     */
    public void setMensagem(java.lang.String mensagem) {
        this.mensagem = mensagem;
    }


    /**
     * Gets the descricao value for this ConsultarTecnologiaLinhaIMSOut.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this ConsultarTecnologiaLinhaIMSOut.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarTecnologiaLinhaIMSOut)) return false;
        ConsultarTecnologiaLinhaIMSOut other = (ConsultarTecnologiaLinhaIMSOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tecnologiaLinha==null && other.getTecnologiaLinha()==null) || 
             (this.tecnologiaLinha!=null &&
              this.tecnologiaLinha.equals(other.getTecnologiaLinha()))) &&
            ((this.mensagem==null && other.getMensagem()==null) || 
             (this.mensagem!=null &&
              this.mensagem.equals(other.getMensagem()))) &&
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao())));
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
        if (getTecnologiaLinha() != null) {
            _hashCode += getTecnologiaLinha().hashCode();
        }
        if (getMensagem() != null) {
            _hashCode += getMensagem().hashCode();
        }
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultarTecnologiaLinhaIMSOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/consultarTecnologiaLinhaIMS", "ConsultarTecnologiaLinhaIMSOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tecnologiaLinha");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/consultarTecnologiaLinhaIMS", "tecnologiaLinha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/consultarTecnologiaLinhaIMS", "mensagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/consultarTecnologiaLinhaIMS", "descricao"));
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
