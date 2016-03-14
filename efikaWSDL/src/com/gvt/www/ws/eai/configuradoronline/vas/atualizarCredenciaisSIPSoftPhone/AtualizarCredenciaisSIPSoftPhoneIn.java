/**
 * AtualizarCredenciaisSIPSoftPhoneIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.vas.atualizarCredenciaisSIPSoftPhone;

public class AtualizarCredenciaisSIPSoftPhoneIn  implements java.io.Serializable {
    /* Reprensenta a Central que o Cliente estah conectado
     * 						Ex: PRCTA_LPS01 */
    private java.lang.String clliCode;

    /* numero do telefone que possui o serviço SoftPhone.
     * 						Ex: 4130250001 */
    private java.lang.String numeroTelefone;

    /* Identificador unico do dispositivo movel onde o
     * 						aplicativo (Softphone) foi instalado(Opcional)
     * 						Ex: ABCDEF1234 */
    private java.lang.String uuid;

    /* Identificador unico do Siebel.
     * 						Caso nao seja informado, irah utilizar o que tem no inventario */
    private java.lang.String idElementoCRM;

    private java.lang.String idElementoCRMAntigo;

    public AtualizarCredenciaisSIPSoftPhoneIn() {
    }

    public AtualizarCredenciaisSIPSoftPhoneIn(
           java.lang.String clliCode,
           java.lang.String numeroTelefone,
           java.lang.String uuid,
           java.lang.String idElementoCRM,
           java.lang.String idElementoCRMAntigo) {
           this.clliCode = clliCode;
           this.numeroTelefone = numeroTelefone;
           this.uuid = uuid;
           this.idElementoCRM = idElementoCRM;
           this.idElementoCRMAntigo = idElementoCRMAntigo;
    }


    /**
     * Gets the clliCode value for this AtualizarCredenciaisSIPSoftPhoneIn.
     * 
     * @return clliCode   * Reprensenta a Central que o Cliente estah conectado
     * 						Ex: PRCTA_LPS01
     */
    public java.lang.String getClliCode() {
        return clliCode;
    }


    /**
     * Sets the clliCode value for this AtualizarCredenciaisSIPSoftPhoneIn.
     * 
     * @param clliCode   * Reprensenta a Central que o Cliente estah conectado
     * 						Ex: PRCTA_LPS01
     */
    public void setClliCode(java.lang.String clliCode) {
        this.clliCode = clliCode;
    }


    /**
     * Gets the numeroTelefone value for this AtualizarCredenciaisSIPSoftPhoneIn.
     * 
     * @return numeroTelefone   * numero do telefone que possui o serviço SoftPhone.
     * 						Ex: 4130250001
     */
    public java.lang.String getNumeroTelefone() {
        return numeroTelefone;
    }


    /**
     * Sets the numeroTelefone value for this AtualizarCredenciaisSIPSoftPhoneIn.
     * 
     * @param numeroTelefone   * numero do telefone que possui o serviço SoftPhone.
     * 						Ex: 4130250001
     */
    public void setNumeroTelefone(java.lang.String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }


    /**
     * Gets the uuid value for this AtualizarCredenciaisSIPSoftPhoneIn.
     * 
     * @return uuid   * Identificador unico do dispositivo movel onde o
     * 						aplicativo (Softphone) foi instalado(Opcional)
     * 						Ex: ABCDEF1234
     */
    public java.lang.String getUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this AtualizarCredenciaisSIPSoftPhoneIn.
     * 
     * @param uuid   * Identificador unico do dispositivo movel onde o
     * 						aplicativo (Softphone) foi instalado(Opcional)
     * 						Ex: ABCDEF1234
     */
    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }


    /**
     * Gets the idElementoCRM value for this AtualizarCredenciaisSIPSoftPhoneIn.
     * 
     * @return idElementoCRM   * Identificador unico do Siebel.
     * 						Caso nao seja informado, irah utilizar o que tem no inventario
     */
    public java.lang.String getIdElementoCRM() {
        return idElementoCRM;
    }


    /**
     * Sets the idElementoCRM value for this AtualizarCredenciaisSIPSoftPhoneIn.
     * 
     * @param idElementoCRM   * Identificador unico do Siebel.
     * 						Caso nao seja informado, irah utilizar o que tem no inventario
     */
    public void setIdElementoCRM(java.lang.String idElementoCRM) {
        this.idElementoCRM = idElementoCRM;
    }


    /**
     * Gets the idElementoCRMAntigo value for this AtualizarCredenciaisSIPSoftPhoneIn.
     * 
     * @return idElementoCRMAntigo
     */
    public java.lang.String getIdElementoCRMAntigo() {
        return idElementoCRMAntigo;
    }


    /**
     * Sets the idElementoCRMAntigo value for this AtualizarCredenciaisSIPSoftPhoneIn.
     * 
     * @param idElementoCRMAntigo
     */
    public void setIdElementoCRMAntigo(java.lang.String idElementoCRMAntigo) {
        this.idElementoCRMAntigo = idElementoCRMAntigo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AtualizarCredenciaisSIPSoftPhoneIn)) return false;
        AtualizarCredenciaisSIPSoftPhoneIn other = (AtualizarCredenciaisSIPSoftPhoneIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clliCode==null && other.getClliCode()==null) || 
             (this.clliCode!=null &&
              this.clliCode.equals(other.getClliCode()))) &&
            ((this.numeroTelefone==null && other.getNumeroTelefone()==null) || 
             (this.numeroTelefone!=null &&
              this.numeroTelefone.equals(other.getNumeroTelefone()))) &&
            ((this.uuid==null && other.getUuid()==null) || 
             (this.uuid!=null &&
              this.uuid.equals(other.getUuid()))) &&
            ((this.idElementoCRM==null && other.getIdElementoCRM()==null) || 
             (this.idElementoCRM!=null &&
              this.idElementoCRM.equals(other.getIdElementoCRM()))) &&
            ((this.idElementoCRMAntigo==null && other.getIdElementoCRMAntigo()==null) || 
             (this.idElementoCRMAntigo!=null &&
              this.idElementoCRMAntigo.equals(other.getIdElementoCRMAntigo())));
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
        if (getClliCode() != null) {
            _hashCode += getClliCode().hashCode();
        }
        if (getNumeroTelefone() != null) {
            _hashCode += getNumeroTelefone().hashCode();
        }
        if (getUuid() != null) {
            _hashCode += getUuid().hashCode();
        }
        if (getIdElementoCRM() != null) {
            _hashCode += getIdElementoCRM().hashCode();
        }
        if (getIdElementoCRMAntigo() != null) {
            _hashCode += getIdElementoCRMAntigo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AtualizarCredenciaisSIPSoftPhoneIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/atualizarCredenciaisSIPSoftPhone", "AtualizarCredenciaisSIPSoftPhoneIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clliCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/atualizarCredenciaisSIPSoftPhone", "clliCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroTelefone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/atualizarCredenciaisSIPSoftPhone", "numeroTelefone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uuid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/atualizarCredenciaisSIPSoftPhone", "uuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idElementoCRM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/atualizarCredenciaisSIPSoftPhone", "idElementoCRM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idElementoCRMAntigo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/atualizarCredenciaisSIPSoftPhone", "idElementoCRMAntigo"));
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
