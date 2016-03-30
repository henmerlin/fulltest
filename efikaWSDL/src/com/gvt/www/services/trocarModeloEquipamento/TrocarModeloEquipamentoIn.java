/**
 * TrocarModeloEquipamentoIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.services.trocarModeloEquipamento;

public class TrocarModeloEquipamentoIn  implements java.io.Serializable {
    private java.lang.String designador;

    private int specIdDisconnect;

    private int specIdConnect;

    public TrocarModeloEquipamentoIn() {
    }

    public TrocarModeloEquipamentoIn(
           java.lang.String designador,
           int specIdDisconnect,
           int specIdConnect) {
           this.designador = designador;
           this.specIdDisconnect = specIdDisconnect;
           this.specIdConnect = specIdConnect;
    }


    /**
     * Gets the designador value for this TrocarModeloEquipamentoIn.
     * 
     * @return designador
     */
    public java.lang.String getDesignador() {
        return designador;
    }


    /**
     * Sets the designador value for this TrocarModeloEquipamentoIn.
     * 
     * @param designador
     */
    public void setDesignador(java.lang.String designador) {
        this.designador = designador;
    }


    /**
     * Gets the specIdDisconnect value for this TrocarModeloEquipamentoIn.
     * 
     * @return specIdDisconnect
     */
    public int getSpecIdDisconnect() {
        return specIdDisconnect;
    }


    /**
     * Sets the specIdDisconnect value for this TrocarModeloEquipamentoIn.
     * 
     * @param specIdDisconnect
     */
    public void setSpecIdDisconnect(int specIdDisconnect) {
        this.specIdDisconnect = specIdDisconnect;
    }


    /**
     * Gets the specIdConnect value for this TrocarModeloEquipamentoIn.
     * 
     * @return specIdConnect
     */
    public int getSpecIdConnect() {
        return specIdConnect;
    }


    /**
     * Sets the specIdConnect value for this TrocarModeloEquipamentoIn.
     * 
     * @param specIdConnect
     */
    public void setSpecIdConnect(int specIdConnect) {
        this.specIdConnect = specIdConnect;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrocarModeloEquipamentoIn)) return false;
        TrocarModeloEquipamentoIn other = (TrocarModeloEquipamentoIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.designador==null && other.getDesignador()==null) || 
             (this.designador!=null &&
              this.designador.equals(other.getDesignador()))) &&
            this.specIdDisconnect == other.getSpecIdDisconnect() &&
            this.specIdConnect == other.getSpecIdConnect();
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
        if (getDesignador() != null) {
            _hashCode += getDesignador().hashCode();
        }
        _hashCode += getSpecIdDisconnect();
        _hashCode += getSpecIdConnect();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrocarModeloEquipamentoIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/trocarModeloEquipamento", "TrocarModeloEquipamentoIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/trocarModeloEquipamento", "designador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specIdDisconnect");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/trocarModeloEquipamento", "specIdDisconnect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specIdConnect");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/trocarModeloEquipamento", "specIdConnect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
