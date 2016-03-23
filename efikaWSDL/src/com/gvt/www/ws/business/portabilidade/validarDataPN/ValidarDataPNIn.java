/**
 * ValidarDataPNIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.validarDataPN;

public class ValidarDataPNIn  implements java.io.Serializable {
    private com.gvt.www.metaData.security.Passport passport;

    private com.gvt.www.ws.business.portabilidade.validarDataPN.ValidarDataPNInTipoValidacao tipoValidacao;

    /* ex:4130250001 */
    private java.lang.String numero;

    private java.util.Calendar dataAgendamento;

    public ValidarDataPNIn() {
    }

    public ValidarDataPNIn(
           com.gvt.www.metaData.security.Passport passport,
           com.gvt.www.ws.business.portabilidade.validarDataPN.ValidarDataPNInTipoValidacao tipoValidacao,
           java.lang.String numero,
           java.util.Calendar dataAgendamento) {
           this.passport = passport;
           this.tipoValidacao = tipoValidacao;
           this.numero = numero;
           this.dataAgendamento = dataAgendamento;
    }


    /**
     * Gets the passport value for this ValidarDataPNIn.
     * 
     * @return passport
     */
    public com.gvt.www.metaData.security.Passport getPassport() {
        return passport;
    }


    /**
     * Sets the passport value for this ValidarDataPNIn.
     * 
     * @param passport
     */
    public void setPassport(com.gvt.www.metaData.security.Passport passport) {
        this.passport = passport;
    }


    /**
     * Gets the tipoValidacao value for this ValidarDataPNIn.
     * 
     * @return tipoValidacao
     */
    public com.gvt.www.ws.business.portabilidade.validarDataPN.ValidarDataPNInTipoValidacao getTipoValidacao() {
        return tipoValidacao;
    }


    /**
     * Sets the tipoValidacao value for this ValidarDataPNIn.
     * 
     * @param tipoValidacao
     */
    public void setTipoValidacao(com.gvt.www.ws.business.portabilidade.validarDataPN.ValidarDataPNInTipoValidacao tipoValidacao) {
        this.tipoValidacao = tipoValidacao;
    }


    /**
     * Gets the numero value for this ValidarDataPNIn.
     * 
     * @return numero   * ex:4130250001
     */
    public java.lang.String getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this ValidarDataPNIn.
     * 
     * @param numero   * ex:4130250001
     */
    public void setNumero(java.lang.String numero) {
        this.numero = numero;
    }


    /**
     * Gets the dataAgendamento value for this ValidarDataPNIn.
     * 
     * @return dataAgendamento
     */
    public java.util.Calendar getDataAgendamento() {
        return dataAgendamento;
    }


    /**
     * Sets the dataAgendamento value for this ValidarDataPNIn.
     * 
     * @param dataAgendamento
     */
    public void setDataAgendamento(java.util.Calendar dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidarDataPNIn)) return false;
        ValidarDataPNIn other = (ValidarDataPNIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.passport==null && other.getPassport()==null) || 
             (this.passport!=null &&
              this.passport.equals(other.getPassport()))) &&
            ((this.tipoValidacao==null && other.getTipoValidacao()==null) || 
             (this.tipoValidacao!=null &&
              this.tipoValidacao.equals(other.getTipoValidacao()))) &&
            ((this.numero==null && other.getNumero()==null) || 
             (this.numero!=null &&
              this.numero.equals(other.getNumero()))) &&
            ((this.dataAgendamento==null && other.getDataAgendamento()==null) || 
             (this.dataAgendamento!=null &&
              this.dataAgendamento.equals(other.getDataAgendamento())));
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
        if (getPassport() != null) {
            _hashCode += getPassport().hashCode();
        }
        if (getTipoValidacao() != null) {
            _hashCode += getTipoValidacao().hashCode();
        }
        if (getNumero() != null) {
            _hashCode += getNumero().hashCode();
        }
        if (getDataAgendamento() != null) {
            _hashCode += getDataAgendamento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidarDataPNIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/validarDataPN", "validarDataPNIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/validarDataPN", "passport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/security", "Passport"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoValidacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/validarDataPN", "tipoValidacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/validarDataPN", ">validarDataPNIn>tipoValidacao"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/validarDataPN", "numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataAgendamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/validarDataPN", "dataAgendamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
