/**
 * RemoverCredenciaisSIPSoftPhoneIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.vas.removerCredenciaisSIPSoftPhone;

public class RemoverCredenciaisSIPSoftPhoneIn  implements java.io.Serializable {
    /* numero do telefone que possui o serviço SoftPhone.
     * 						Ex: 4130250001 */
    private java.lang.String numeroTelefone;

    /* Identificador unico do Siebel */
    private java.lang.String idElementoCRM;

    public RemoverCredenciaisSIPSoftPhoneIn() {
    }

    public RemoverCredenciaisSIPSoftPhoneIn(
           java.lang.String numeroTelefone,
           java.lang.String idElementoCRM) {
           this.numeroTelefone = numeroTelefone;
           this.idElementoCRM = idElementoCRM;
    }


    /**
     * Gets the numeroTelefone value for this RemoverCredenciaisSIPSoftPhoneIn.
     * 
     * @return numeroTelefone   * numero do telefone que possui o serviço SoftPhone.
     * 						Ex: 4130250001
     */
    public java.lang.String getNumeroTelefone() {
        return numeroTelefone;
    }


    /**
     * Sets the numeroTelefone value for this RemoverCredenciaisSIPSoftPhoneIn.
     * 
     * @param numeroTelefone   * numero do telefone que possui o serviço SoftPhone.
     * 						Ex: 4130250001
     */
    public void setNumeroTelefone(java.lang.String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }


    /**
     * Gets the idElementoCRM value for this RemoverCredenciaisSIPSoftPhoneIn.
     * 
     * @return idElementoCRM   * Identificador unico do Siebel
     */
    public java.lang.String getIdElementoCRM() {
        return idElementoCRM;
    }


    /**
     * Sets the idElementoCRM value for this RemoverCredenciaisSIPSoftPhoneIn.
     * 
     * @param idElementoCRM   * Identificador unico do Siebel
     */
    public void setIdElementoCRM(java.lang.String idElementoCRM) {
        this.idElementoCRM = idElementoCRM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoverCredenciaisSIPSoftPhoneIn)) return false;
        RemoverCredenciaisSIPSoftPhoneIn other = (RemoverCredenciaisSIPSoftPhoneIn) obj;
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
            ((this.idElementoCRM==null && other.getIdElementoCRM()==null) || 
             (this.idElementoCRM!=null &&
              this.idElementoCRM.equals(other.getIdElementoCRM())));
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
        if (getIdElementoCRM() != null) {
            _hashCode += getIdElementoCRM().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoverCredenciaisSIPSoftPhoneIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/removerCredenciaisSIPSoftPhone", "RemoverCredenciaisSIPSoftPhoneIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroTelefone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/removerCredenciaisSIPSoftPhone", "numeroTelefone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idElementoCRM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/removerCredenciaisSIPSoftPhone", "idElementoCRM"));
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
