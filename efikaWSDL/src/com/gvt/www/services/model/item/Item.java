/**
 * Item.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.services.model.item;

public class Item  implements java.io.Serializable {
    private java.lang.String nome;

    private com.gvt.www.services.model.tipoAcao.TipoAcao acao;

    private int provisioningCode;

    private java.lang.String idElementoCRM;

    private com.gvt.www.services.model.item.Item[] item;

    private com.gvt.www.services.model.map.Map[] parametros;

    public Item() {
    }

    public Item(
           java.lang.String nome,
           com.gvt.www.services.model.tipoAcao.TipoAcao acao,
           int provisioningCode,
           java.lang.String idElementoCRM,
           com.gvt.www.services.model.item.Item[] item,
           com.gvt.www.services.model.map.Map[] parametros) {
           this.nome = nome;
           this.acao = acao;
           this.provisioningCode = provisioningCode;
           this.idElementoCRM = idElementoCRM;
           this.item = item;
           this.parametros = parametros;
    }


    /**
     * Gets the nome value for this Item.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this Item.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the acao value for this Item.
     * 
     * @return acao
     */
    public com.gvt.www.services.model.tipoAcao.TipoAcao getAcao() {
        return acao;
    }


    /**
     * Sets the acao value for this Item.
     * 
     * @param acao
     */
    public void setAcao(com.gvt.www.services.model.tipoAcao.TipoAcao acao) {
        this.acao = acao;
    }


    /**
     * Gets the provisioningCode value for this Item.
     * 
     * @return provisioningCode
     */
    public int getProvisioningCode() {
        return provisioningCode;
    }


    /**
     * Sets the provisioningCode value for this Item.
     * 
     * @param provisioningCode
     */
    public void setProvisioningCode(int provisioningCode) {
        this.provisioningCode = provisioningCode;
    }


    /**
     * Gets the idElementoCRM value for this Item.
     * 
     * @return idElementoCRM
     */
    public java.lang.String getIdElementoCRM() {
        return idElementoCRM;
    }


    /**
     * Sets the idElementoCRM value for this Item.
     * 
     * @param idElementoCRM
     */
    public void setIdElementoCRM(java.lang.String idElementoCRM) {
        this.idElementoCRM = idElementoCRM;
    }


    /**
     * Gets the item value for this Item.
     * 
     * @return item
     */
    public com.gvt.www.services.model.item.Item[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this Item.
     * 
     * @param item
     */
    public void setItem(com.gvt.www.services.model.item.Item[] item) {
        this.item = item;
    }


    /**
     * Gets the parametros value for this Item.
     * 
     * @return parametros
     */
    public com.gvt.www.services.model.map.Map[] getParametros() {
        return parametros;
    }


    /**
     * Sets the parametros value for this Item.
     * 
     * @param parametros
     */
    public void setParametros(com.gvt.www.services.model.map.Map[] parametros) {
        this.parametros = parametros;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Item)) return false;
        Item other = (Item) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.acao==null && other.getAcao()==null) || 
             (this.acao!=null &&
              this.acao.equals(other.getAcao()))) &&
            this.provisioningCode == other.getProvisioningCode() &&
            ((this.idElementoCRM==null && other.getIdElementoCRM()==null) || 
             (this.idElementoCRM!=null &&
              this.idElementoCRM.equals(other.getIdElementoCRM()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem()))) &&
            ((this.parametros==null && other.getParametros()==null) || 
             (this.parametros!=null &&
              java.util.Arrays.equals(this.parametros, other.getParametros())));
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
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getAcao() != null) {
            _hashCode += getAcao().hashCode();
        }
        _hashCode += getProvisioningCode();
        if (getIdElementoCRM() != null) {
            _hashCode += getIdElementoCRM().hashCode();
        }
        if (getItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getParametros() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParametros());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParametros(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Item.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/item", "Item"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/item", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/item", "acao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/tipoAcao", "TipoAcao"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provisioningCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/item", "provisioningCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idElementoCRM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/item", "idElementoCRM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/item", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/item", "Item"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/item", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parametros");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/item", "parametros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/map", "Map"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/map", "parametro"));
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
