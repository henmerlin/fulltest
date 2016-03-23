/**
 * RemoverSuspensaoConflitoPNIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.removerSuspensaoConflitoPN;

public class RemoverSuspensaoConflitoPNIn  implements java.io.Serializable {
    private com.gvt.www.metaData.security.Passport passport;

    private java.math.BigInteger idSolicitacaoPN;

    private java.math.BigInteger protocolEA;

    private java.lang.String phoneNumber;

    private java.util.Calendar dataAgendamento;

    private com.gvt.www.ws.business.portabilidade.removerSuspensaoConflitoPN.RemoverSuspensaoConflitoPNInTipoRemocao tipoRemocao;

    public RemoverSuspensaoConflitoPNIn() {
    }

    public RemoverSuspensaoConflitoPNIn(
           com.gvt.www.metaData.security.Passport passport,
           java.math.BigInteger idSolicitacaoPN,
           java.math.BigInteger protocolEA,
           java.lang.String phoneNumber,
           java.util.Calendar dataAgendamento,
           com.gvt.www.ws.business.portabilidade.removerSuspensaoConflitoPN.RemoverSuspensaoConflitoPNInTipoRemocao tipoRemocao) {
           this.passport = passport;
           this.idSolicitacaoPN = idSolicitacaoPN;
           this.protocolEA = protocolEA;
           this.phoneNumber = phoneNumber;
           this.dataAgendamento = dataAgendamento;
           this.tipoRemocao = tipoRemocao;
    }


    /**
     * Gets the passport value for this RemoverSuspensaoConflitoPNIn.
     * 
     * @return passport
     */
    public com.gvt.www.metaData.security.Passport getPassport() {
        return passport;
    }


    /**
     * Sets the passport value for this RemoverSuspensaoConflitoPNIn.
     * 
     * @param passport
     */
    public void setPassport(com.gvt.www.metaData.security.Passport passport) {
        this.passport = passport;
    }


    /**
     * Gets the idSolicitacaoPN value for this RemoverSuspensaoConflitoPNIn.
     * 
     * @return idSolicitacaoPN
     */
    public java.math.BigInteger getIdSolicitacaoPN() {
        return idSolicitacaoPN;
    }


    /**
     * Sets the idSolicitacaoPN value for this RemoverSuspensaoConflitoPNIn.
     * 
     * @param idSolicitacaoPN
     */
    public void setIdSolicitacaoPN(java.math.BigInteger idSolicitacaoPN) {
        this.idSolicitacaoPN = idSolicitacaoPN;
    }


    /**
     * Gets the protocolEA value for this RemoverSuspensaoConflitoPNIn.
     * 
     * @return protocolEA
     */
    public java.math.BigInteger getProtocolEA() {
        return protocolEA;
    }


    /**
     * Sets the protocolEA value for this RemoverSuspensaoConflitoPNIn.
     * 
     * @param protocolEA
     */
    public void setProtocolEA(java.math.BigInteger protocolEA) {
        this.protocolEA = protocolEA;
    }


    /**
     * Gets the phoneNumber value for this RemoverSuspensaoConflitoPNIn.
     * 
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this RemoverSuspensaoConflitoPNIn.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the dataAgendamento value for this RemoverSuspensaoConflitoPNIn.
     * 
     * @return dataAgendamento
     */
    public java.util.Calendar getDataAgendamento() {
        return dataAgendamento;
    }


    /**
     * Sets the dataAgendamento value for this RemoverSuspensaoConflitoPNIn.
     * 
     * @param dataAgendamento
     */
    public void setDataAgendamento(java.util.Calendar dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }


    /**
     * Gets the tipoRemocao value for this RemoverSuspensaoConflitoPNIn.
     * 
     * @return tipoRemocao
     */
    public com.gvt.www.ws.business.portabilidade.removerSuspensaoConflitoPN.RemoverSuspensaoConflitoPNInTipoRemocao getTipoRemocao() {
        return tipoRemocao;
    }


    /**
     * Sets the tipoRemocao value for this RemoverSuspensaoConflitoPNIn.
     * 
     * @param tipoRemocao
     */
    public void setTipoRemocao(com.gvt.www.ws.business.portabilidade.removerSuspensaoConflitoPN.RemoverSuspensaoConflitoPNInTipoRemocao tipoRemocao) {
        this.tipoRemocao = tipoRemocao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoverSuspensaoConflitoPNIn)) return false;
        RemoverSuspensaoConflitoPNIn other = (RemoverSuspensaoConflitoPNIn) obj;
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
            ((this.idSolicitacaoPN==null && other.getIdSolicitacaoPN()==null) || 
             (this.idSolicitacaoPN!=null &&
              this.idSolicitacaoPN.equals(other.getIdSolicitacaoPN()))) &&
            ((this.protocolEA==null && other.getProtocolEA()==null) || 
             (this.protocolEA!=null &&
              this.protocolEA.equals(other.getProtocolEA()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.dataAgendamento==null && other.getDataAgendamento()==null) || 
             (this.dataAgendamento!=null &&
              this.dataAgendamento.equals(other.getDataAgendamento()))) &&
            ((this.tipoRemocao==null && other.getTipoRemocao()==null) || 
             (this.tipoRemocao!=null &&
              this.tipoRemocao.equals(other.getTipoRemocao())));
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
        if (getIdSolicitacaoPN() != null) {
            _hashCode += getIdSolicitacaoPN().hashCode();
        }
        if (getProtocolEA() != null) {
            _hashCode += getProtocolEA().hashCode();
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getDataAgendamento() != null) {
            _hashCode += getDataAgendamento().hashCode();
        }
        if (getTipoRemocao() != null) {
            _hashCode += getTipoRemocao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoverSuspensaoConflitoPNIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/removerSuspensaoConflitoPN", "removerSuspensaoConflitoPNIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/removerSuspensaoConflitoPN", "passport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/security", "Passport"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSolicitacaoPN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/removerSuspensaoConflitoPN", "idSolicitacaoPN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocolEA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/removerSuspensaoConflitoPN", "protocolEA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/removerSuspensaoConflitoPN", "phoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataAgendamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/removerSuspensaoConflitoPN", "dataAgendamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoRemocao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/removerSuspensaoConflitoPN", "tipoRemocao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/removerSuspensaoConflitoPN", ">removerSuspensaoConflitoPNIn>tipoRemocao"));
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
