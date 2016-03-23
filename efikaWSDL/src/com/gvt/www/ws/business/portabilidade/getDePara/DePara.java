/**
 * DePara.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.getDePara;


/**
 * DePara de portabilidade
 */
public class DePara  implements java.io.Serializable {
    /* ex:4133331234 */
    private java.lang.String lista;

    /* ex: 4160001234 */
    private java.lang.String equipamento;

    private java.lang.String cod;

    private java.lang.String msg;

    public DePara() {
    }

    public DePara(
           java.lang.String lista,
           java.lang.String equipamento,
           java.lang.String cod,
           java.lang.String msg) {
           this.lista = lista;
           this.equipamento = equipamento;
           this.cod = cod;
           this.msg = msg;
    }


    /**
     * Gets the lista value for this DePara.
     * 
     * @return lista   * ex:4133331234
     */
    public java.lang.String getLista() {
        return lista;
    }


    /**
     * Sets the lista value for this DePara.
     * 
     * @param lista   * ex:4133331234
     */
    public void setLista(java.lang.String lista) {
        this.lista = lista;
    }


    /**
     * Gets the equipamento value for this DePara.
     * 
     * @return equipamento   * ex: 4160001234
     */
    public java.lang.String getEquipamento() {
        return equipamento;
    }


    /**
     * Sets the equipamento value for this DePara.
     * 
     * @param equipamento   * ex: 4160001234
     */
    public void setEquipamento(java.lang.String equipamento) {
        this.equipamento = equipamento;
    }


    /**
     * Gets the cod value for this DePara.
     * 
     * @return cod
     */
    public java.lang.String getCod() {
        return cod;
    }


    /**
     * Sets the cod value for this DePara.
     * 
     * @param cod
     */
    public void setCod(java.lang.String cod) {
        this.cod = cod;
    }


    /**
     * Gets the msg value for this DePara.
     * 
     * @return msg
     */
    public java.lang.String getMsg() {
        return msg;
    }


    /**
     * Sets the msg value for this DePara.
     * 
     * @param msg
     */
    public void setMsg(java.lang.String msg) {
        this.msg = msg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DePara)) return false;
        DePara other = (DePara) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lista==null && other.getLista()==null) || 
             (this.lista!=null &&
              this.lista.equals(other.getLista()))) &&
            ((this.equipamento==null && other.getEquipamento()==null) || 
             (this.equipamento!=null &&
              this.equipamento.equals(other.getEquipamento()))) &&
            ((this.cod==null && other.getCod()==null) || 
             (this.cod!=null &&
              this.cod.equals(other.getCod()))) &&
            ((this.msg==null && other.getMsg()==null) || 
             (this.msg!=null &&
              this.msg.equals(other.getMsg())));
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
        if (getLista() != null) {
            _hashCode += getLista().hashCode();
        }
        if (getEquipamento() != null) {
            _hashCode += getEquipamento().hashCode();
        }
        if (getCod() != null) {
            _hashCode += getCod().hashCode();
        }
        if (getMsg() != null) {
            _hashCode += getMsg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DePara.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getDePara", "DePara"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lista");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getDePara", "lista"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("equipamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getDePara", "equipamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getDePara", "cod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getDePara", "msg"));
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
