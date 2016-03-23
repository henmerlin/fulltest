/**
 * ConfigurarSwitchIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.configurarSwitch;

public class ConfigurarSwitchIn  implements java.io.Serializable {
    private java.lang.String phoneNumber;

    private java.math.BigInteger tipoAtividade;

    private java.math.BigInteger protocolEA;

    private java.lang.Boolean enviarTSAtivacao;

    private java.lang.Boolean enviarTSDesconexao;

    public ConfigurarSwitchIn() {
    }

    public ConfigurarSwitchIn(
           java.lang.String phoneNumber,
           java.math.BigInteger tipoAtividade,
           java.math.BigInteger protocolEA,
           java.lang.Boolean enviarTSAtivacao,
           java.lang.Boolean enviarTSDesconexao) {
           this.phoneNumber = phoneNumber;
           this.tipoAtividade = tipoAtividade;
           this.protocolEA = protocolEA;
           this.enviarTSAtivacao = enviarTSAtivacao;
           this.enviarTSDesconexao = enviarTSDesconexao;
    }


    /**
     * Gets the phoneNumber value for this ConfigurarSwitchIn.
     * 
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this ConfigurarSwitchIn.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the tipoAtividade value for this ConfigurarSwitchIn.
     * 
     * @return tipoAtividade
     */
    public java.math.BigInteger getTipoAtividade() {
        return tipoAtividade;
    }


    /**
     * Sets the tipoAtividade value for this ConfigurarSwitchIn.
     * 
     * @param tipoAtividade
     */
    public void setTipoAtividade(java.math.BigInteger tipoAtividade) {
        this.tipoAtividade = tipoAtividade;
    }


    /**
     * Gets the protocolEA value for this ConfigurarSwitchIn.
     * 
     * @return protocolEA
     */
    public java.math.BigInteger getProtocolEA() {
        return protocolEA;
    }


    /**
     * Sets the protocolEA value for this ConfigurarSwitchIn.
     * 
     * @param protocolEA
     */
    public void setProtocolEA(java.math.BigInteger protocolEA) {
        this.protocolEA = protocolEA;
    }


    /**
     * Gets the enviarTSAtivacao value for this ConfigurarSwitchIn.
     * 
     * @return enviarTSAtivacao
     */
    public java.lang.Boolean getEnviarTSAtivacao() {
        return enviarTSAtivacao;
    }


    /**
     * Sets the enviarTSAtivacao value for this ConfigurarSwitchIn.
     * 
     * @param enviarTSAtivacao
     */
    public void setEnviarTSAtivacao(java.lang.Boolean enviarTSAtivacao) {
        this.enviarTSAtivacao = enviarTSAtivacao;
    }


    /**
     * Gets the enviarTSDesconexao value for this ConfigurarSwitchIn.
     * 
     * @return enviarTSDesconexao
     */
    public java.lang.Boolean getEnviarTSDesconexao() {
        return enviarTSDesconexao;
    }


    /**
     * Sets the enviarTSDesconexao value for this ConfigurarSwitchIn.
     * 
     * @param enviarTSDesconexao
     */
    public void setEnviarTSDesconexao(java.lang.Boolean enviarTSDesconexao) {
        this.enviarTSDesconexao = enviarTSDesconexao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfigurarSwitchIn)) return false;
        ConfigurarSwitchIn other = (ConfigurarSwitchIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.tipoAtividade==null && other.getTipoAtividade()==null) || 
             (this.tipoAtividade!=null &&
              this.tipoAtividade.equals(other.getTipoAtividade()))) &&
            ((this.protocolEA==null && other.getProtocolEA()==null) || 
             (this.protocolEA!=null &&
              this.protocolEA.equals(other.getProtocolEA()))) &&
            ((this.enviarTSAtivacao==null && other.getEnviarTSAtivacao()==null) || 
             (this.enviarTSAtivacao!=null &&
              this.enviarTSAtivacao.equals(other.getEnviarTSAtivacao()))) &&
            ((this.enviarTSDesconexao==null && other.getEnviarTSDesconexao()==null) || 
             (this.enviarTSDesconexao!=null &&
              this.enviarTSDesconexao.equals(other.getEnviarTSDesconexao())));
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
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getTipoAtividade() != null) {
            _hashCode += getTipoAtividade().hashCode();
        }
        if (getProtocolEA() != null) {
            _hashCode += getProtocolEA().hashCode();
        }
        if (getEnviarTSAtivacao() != null) {
            _hashCode += getEnviarTSAtivacao().hashCode();
        }
        if (getEnviarTSDesconexao() != null) {
            _hashCode += getEnviarTSDesconexao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfigurarSwitchIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/configurarSwitch", "configurarSwitchIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/configurarSwitch", "phoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoAtividade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/configurarSwitch", "tipoAtividade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocolEA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/configurarSwitch", "protocolEA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enviarTSAtivacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/configurarSwitch", "enviarTSAtivacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enviarTSDesconexao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/configurarSwitch", "enviarTSDesconexao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
