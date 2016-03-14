/**
 * ChangePasswordIMSIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.vas.changePasswordIMS;

public class ChangePasswordIMSIn  implements java.io.Serializable {
    /* numero do telefone que possui o serviço SoftPhone.
     * 						Ex: 4130250001 */
    private java.lang.String numeroTelefone;

    /* Central do número configurado na IMS, numero de lista */
    private java.lang.String _switch;

    /* Para resetar os numeros associados ao Freedom deve passar a
     * flag como TRUE, 
     * 					para executar uma operação normal de reset sem validar Freedom
     * passar como FALSE */
    private boolean oneNumberService;

    public ChangePasswordIMSIn() {
    }

    public ChangePasswordIMSIn(
           java.lang.String numeroTelefone,
           java.lang.String _switch,
           boolean oneNumberService) {
           this.numeroTelefone = numeroTelefone;
           this._switch = _switch;
           this.oneNumberService = oneNumberService;
    }


    /**
     * Gets the numeroTelefone value for this ChangePasswordIMSIn.
     * 
     * @return numeroTelefone   * numero do telefone que possui o serviço SoftPhone.
     * 						Ex: 4130250001
     */
    public java.lang.String getNumeroTelefone() {
        return numeroTelefone;
    }


    /**
     * Sets the numeroTelefone value for this ChangePasswordIMSIn.
     * 
     * @param numeroTelefone   * numero do telefone que possui o serviço SoftPhone.
     * 						Ex: 4130250001
     */
    public void setNumeroTelefone(java.lang.String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }


    /**
     * Gets the _switch value for this ChangePasswordIMSIn.
     * 
     * @return _switch   * Central do número configurado na IMS, numero de lista
     */
    public java.lang.String get_switch() {
        return _switch;
    }


    /**
     * Sets the _switch value for this ChangePasswordIMSIn.
     * 
     * @param _switch   * Central do número configurado na IMS, numero de lista
     */
    public void set_switch(java.lang.String _switch) {
        this._switch = _switch;
    }


    /**
     * Gets the oneNumberService value for this ChangePasswordIMSIn.
     * 
     * @return oneNumberService   * Para resetar os numeros associados ao Freedom deve passar a
     * flag como TRUE, 
     * 					para executar uma operação normal de reset sem validar Freedom
     * passar como FALSE
     */
    public boolean isOneNumberService() {
        return oneNumberService;
    }


    /**
     * Sets the oneNumberService value for this ChangePasswordIMSIn.
     * 
     * @param oneNumberService   * Para resetar os numeros associados ao Freedom deve passar a
     * flag como TRUE, 
     * 					para executar uma operação normal de reset sem validar Freedom
     * passar como FALSE
     */
    public void setOneNumberService(boolean oneNumberService) {
        this.oneNumberService = oneNumberService;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangePasswordIMSIn)) return false;
        ChangePasswordIMSIn other = (ChangePasswordIMSIn) obj;
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
            ((this._switch==null && other.get_switch()==null) || 
             (this._switch!=null &&
              this._switch.equals(other.get_switch()))) &&
            this.oneNumberService == other.isOneNumberService();
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
        if (get_switch() != null) {
            _hashCode += get_switch().hashCode();
        }
        _hashCode += (isOneNumberService() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangePasswordIMSIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/changePasswordIMS", "ChangePasswordIMSIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroTelefone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/changePasswordIMS", "numeroTelefone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_switch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/changePasswordIMS", "switch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oneNumberService");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/changePasswordIMS", "oneNumberService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
