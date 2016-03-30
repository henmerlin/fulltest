/**
 * EquipamentoFisico.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.services.model.equipamentoFisico;

public class EquipamentoFisico  implements java.io.Serializable {
    private com.gvt.www.services.model.tipoAcao.TipoAcao acao;

    private java.lang.Long idRecursoLogico;

    private java.lang.String serial;

    private java.lang.String macAddress;

    private java.lang.String mainKey;

    private java.lang.String caid;

    private com.gvt.www.services.model.modeloEquipamento.ModeloEquipamento modelo;

    public EquipamentoFisico() {
    }

    public EquipamentoFisico(
           com.gvt.www.services.model.tipoAcao.TipoAcao acao,
           java.lang.Long idRecursoLogico,
           java.lang.String serial,
           java.lang.String macAddress,
           java.lang.String mainKey,
           java.lang.String caid,
           com.gvt.www.services.model.modeloEquipamento.ModeloEquipamento modelo) {
           this.acao = acao;
           this.idRecursoLogico = idRecursoLogico;
           this.serial = serial;
           this.macAddress = macAddress;
           this.mainKey = mainKey;
           this.caid = caid;
           this.modelo = modelo;
    }


    /**
     * Gets the acao value for this EquipamentoFisico.
     * 
     * @return acao
     */
    public com.gvt.www.services.model.tipoAcao.TipoAcao getAcao() {
        return acao;
    }


    /**
     * Sets the acao value for this EquipamentoFisico.
     * 
     * @param acao
     */
    public void setAcao(com.gvt.www.services.model.tipoAcao.TipoAcao acao) {
        this.acao = acao;
    }


    /**
     * Gets the idRecursoLogico value for this EquipamentoFisico.
     * 
     * @return idRecursoLogico
     */
    public java.lang.Long getIdRecursoLogico() {
        return idRecursoLogico;
    }


    /**
     * Sets the idRecursoLogico value for this EquipamentoFisico.
     * 
     * @param idRecursoLogico
     */
    public void setIdRecursoLogico(java.lang.Long idRecursoLogico) {
        this.idRecursoLogico = idRecursoLogico;
    }


    /**
     * Gets the serial value for this EquipamentoFisico.
     * 
     * @return serial
     */
    public java.lang.String getSerial() {
        return serial;
    }


    /**
     * Sets the serial value for this EquipamentoFisico.
     * 
     * @param serial
     */
    public void setSerial(java.lang.String serial) {
        this.serial = serial;
    }


    /**
     * Gets the macAddress value for this EquipamentoFisico.
     * 
     * @return macAddress
     */
    public java.lang.String getMacAddress() {
        return macAddress;
    }


    /**
     * Sets the macAddress value for this EquipamentoFisico.
     * 
     * @param macAddress
     */
    public void setMacAddress(java.lang.String macAddress) {
        this.macAddress = macAddress;
    }


    /**
     * Gets the mainKey value for this EquipamentoFisico.
     * 
     * @return mainKey
     */
    public java.lang.String getMainKey() {
        return mainKey;
    }


    /**
     * Sets the mainKey value for this EquipamentoFisico.
     * 
     * @param mainKey
     */
    public void setMainKey(java.lang.String mainKey) {
        this.mainKey = mainKey;
    }


    /**
     * Gets the caid value for this EquipamentoFisico.
     * 
     * @return caid
     */
    public java.lang.String getCaid() {
        return caid;
    }


    /**
     * Sets the caid value for this EquipamentoFisico.
     * 
     * @param caid
     */
    public void setCaid(java.lang.String caid) {
        this.caid = caid;
    }


    /**
     * Gets the modelo value for this EquipamentoFisico.
     * 
     * @return modelo
     */
    public com.gvt.www.services.model.modeloEquipamento.ModeloEquipamento getModelo() {
        return modelo;
    }


    /**
     * Sets the modelo value for this EquipamentoFisico.
     * 
     * @param modelo
     */
    public void setModelo(com.gvt.www.services.model.modeloEquipamento.ModeloEquipamento modelo) {
        this.modelo = modelo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EquipamentoFisico)) return false;
        EquipamentoFisico other = (EquipamentoFisico) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acao==null && other.getAcao()==null) || 
             (this.acao!=null &&
              this.acao.equals(other.getAcao()))) &&
            ((this.idRecursoLogico==null && other.getIdRecursoLogico()==null) || 
             (this.idRecursoLogico!=null &&
              this.idRecursoLogico.equals(other.getIdRecursoLogico()))) &&
            ((this.serial==null && other.getSerial()==null) || 
             (this.serial!=null &&
              this.serial.equals(other.getSerial()))) &&
            ((this.macAddress==null && other.getMacAddress()==null) || 
             (this.macAddress!=null &&
              this.macAddress.equals(other.getMacAddress()))) &&
            ((this.mainKey==null && other.getMainKey()==null) || 
             (this.mainKey!=null &&
              this.mainKey.equals(other.getMainKey()))) &&
            ((this.caid==null && other.getCaid()==null) || 
             (this.caid!=null &&
              this.caid.equals(other.getCaid()))) &&
            ((this.modelo==null && other.getModelo()==null) || 
             (this.modelo!=null &&
              this.modelo.equals(other.getModelo())));
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
        if (getAcao() != null) {
            _hashCode += getAcao().hashCode();
        }
        if (getIdRecursoLogico() != null) {
            _hashCode += getIdRecursoLogico().hashCode();
        }
        if (getSerial() != null) {
            _hashCode += getSerial().hashCode();
        }
        if (getMacAddress() != null) {
            _hashCode += getMacAddress().hashCode();
        }
        if (getMainKey() != null) {
            _hashCode += getMainKey().hashCode();
        }
        if (getCaid() != null) {
            _hashCode += getCaid().hashCode();
        }
        if (getModelo() != null) {
            _hashCode += getModelo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EquipamentoFisico.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/equipamentoFisico", "EquipamentoFisico"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/equipamentoFisico", "acao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/tipoAcao", "TipoAcao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idRecursoLogico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/equipamentoFisico", "idRecursoLogico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/equipamentoFisico", "serial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("macAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/equipamentoFisico", "macAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/equipamentoFisico", "mainKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/equipamentoFisico", "caid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/equipamentoFisico", "modelo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/modeloEquipamento", "ModeloEquipamento"));
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
