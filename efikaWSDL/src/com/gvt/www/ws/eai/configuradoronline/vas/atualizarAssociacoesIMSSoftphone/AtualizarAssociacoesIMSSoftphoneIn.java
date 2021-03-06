/**
 * AtualizarAssociacoesIMSSoftphoneIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.vas.atualizarAssociacoesIMSSoftphone;

public class AtualizarAssociacoesIMSSoftphoneIn  implements java.io.Serializable {
    /* Numero do telefone que possui o servico Freedom. */
    private java.lang.String numeroTelefone;

    /* Rota RN2 do numero de equipamento associado ao servico Freedom
     * no cenario TDM. */
    private java.lang.String rotaRN2;

    /* Numero de equipamento associado ao servico Freedom no cenario
     * TDM. */
    private java.lang.String numeroEquipamento;

    public AtualizarAssociacoesIMSSoftphoneIn() {
    }

    public AtualizarAssociacoesIMSSoftphoneIn(
           java.lang.String numeroTelefone,
           java.lang.String rotaRN2,
           java.lang.String numeroEquipamento) {
           this.numeroTelefone = numeroTelefone;
           this.rotaRN2 = rotaRN2;
           this.numeroEquipamento = numeroEquipamento;
    }


    /**
     * Gets the numeroTelefone value for this AtualizarAssociacoesIMSSoftphoneIn.
     * 
     * @return numeroTelefone   * Numero do telefone que possui o servico Freedom.
     */
    public java.lang.String getNumeroTelefone() {
        return numeroTelefone;
    }


    /**
     * Sets the numeroTelefone value for this AtualizarAssociacoesIMSSoftphoneIn.
     * 
     * @param numeroTelefone   * Numero do telefone que possui o servico Freedom.
     */
    public void setNumeroTelefone(java.lang.String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }


    /**
     * Gets the rotaRN2 value for this AtualizarAssociacoesIMSSoftphoneIn.
     * 
     * @return rotaRN2   * Rota RN2 do numero de equipamento associado ao servico Freedom
     * no cenario TDM.
     */
    public java.lang.String getRotaRN2() {
        return rotaRN2;
    }


    /**
     * Sets the rotaRN2 value for this AtualizarAssociacoesIMSSoftphoneIn.
     * 
     * @param rotaRN2   * Rota RN2 do numero de equipamento associado ao servico Freedom
     * no cenario TDM.
     */
    public void setRotaRN2(java.lang.String rotaRN2) {
        this.rotaRN2 = rotaRN2;
    }


    /**
     * Gets the numeroEquipamento value for this AtualizarAssociacoesIMSSoftphoneIn.
     * 
     * @return numeroEquipamento   * Numero de equipamento associado ao servico Freedom no cenario
     * TDM.
     */
    public java.lang.String getNumeroEquipamento() {
        return numeroEquipamento;
    }


    /**
     * Sets the numeroEquipamento value for this AtualizarAssociacoesIMSSoftphoneIn.
     * 
     * @param numeroEquipamento   * Numero de equipamento associado ao servico Freedom no cenario
     * TDM.
     */
    public void setNumeroEquipamento(java.lang.String numeroEquipamento) {
        this.numeroEquipamento = numeroEquipamento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AtualizarAssociacoesIMSSoftphoneIn)) return false;
        AtualizarAssociacoesIMSSoftphoneIn other = (AtualizarAssociacoesIMSSoftphoneIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numeroTelefone==null && other.getNumeroTelefone()==null) || 
             (this.numeroTelefone!=null &&
              this.numeroTelefone.equals(other.getNumeroTelefone()))) &&
            ((this.rotaRN2==null && other.getRotaRN2()==null) || 
             (this.rotaRN2!=null &&
              this.rotaRN2.equals(other.getRotaRN2()))) &&
            ((this.numeroEquipamento==null && other.getNumeroEquipamento()==null) || 
             (this.numeroEquipamento!=null &&
              this.numeroEquipamento.equals(other.getNumeroEquipamento())));
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
        if (getNumeroTelefone() != null) {
            _hashCode += getNumeroTelefone().hashCode();
        }
        if (getRotaRN2() != null) {
            _hashCode += getRotaRN2().hashCode();
        }
        if (getNumeroEquipamento() != null) {
            _hashCode += getNumeroEquipamento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AtualizarAssociacoesIMSSoftphoneIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/atualizarAssociacoesIMSSoftphone", "AtualizarAssociacoesIMSSoftphoneIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroTelefone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/atualizarAssociacoesIMSSoftphone", "numeroTelefone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rotaRN2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/atualizarAssociacoesIMSSoftphone", "rotaRN2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroEquipamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/atualizarAssociacoesIMSSoftphone", "numeroEquipamento"));
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
