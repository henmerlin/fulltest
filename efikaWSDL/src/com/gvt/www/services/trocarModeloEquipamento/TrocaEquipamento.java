/**
 * TrocaEquipamento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.services.trocarModeloEquipamento;

public class TrocaEquipamento  implements java.io.Serializable {
    private com.gvt.www.services.model.recursoLogico.RecursoLogicoWS disconnect;

    private com.gvt.www.services.model.recursoLogico.RecursoLogicoWS connect;

    public TrocaEquipamento() {
    }

    public TrocaEquipamento(
           com.gvt.www.services.model.recursoLogico.RecursoLogicoWS disconnect,
           com.gvt.www.services.model.recursoLogico.RecursoLogicoWS connect) {
           this.disconnect = disconnect;
           this.connect = connect;
    }


    /**
     * Gets the disconnect value for this TrocaEquipamento.
     * 
     * @return disconnect
     */
    public com.gvt.www.services.model.recursoLogico.RecursoLogicoWS getDisconnect() {
        return disconnect;
    }


    /**
     * Sets the disconnect value for this TrocaEquipamento.
     * 
     * @param disconnect
     */
    public void setDisconnect(com.gvt.www.services.model.recursoLogico.RecursoLogicoWS disconnect) {
        this.disconnect = disconnect;
    }


    /**
     * Gets the connect value for this TrocaEquipamento.
     * 
     * @return connect
     */
    public com.gvt.www.services.model.recursoLogico.RecursoLogicoWS getConnect() {
        return connect;
    }


    /**
     * Sets the connect value for this TrocaEquipamento.
     * 
     * @param connect
     */
    public void setConnect(com.gvt.www.services.model.recursoLogico.RecursoLogicoWS connect) {
        this.connect = connect;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrocaEquipamento)) return false;
        TrocaEquipamento other = (TrocaEquipamento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.disconnect==null && other.getDisconnect()==null) || 
             (this.disconnect!=null &&
              this.disconnect.equals(other.getDisconnect()))) &&
            ((this.connect==null && other.getConnect()==null) || 
             (this.connect!=null &&
              this.connect.equals(other.getConnect())));
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
        if (getDisconnect() != null) {
            _hashCode += getDisconnect().hashCode();
        }
        if (getConnect() != null) {
            _hashCode += getConnect().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrocaEquipamento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/trocarModeloEquipamento", "TrocaEquipamento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disconnect");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/trocarModeloEquipamento", "disconnect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/recursoLogico", "RecursoLogicoWS"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connect");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/trocarModeloEquipamento", "connect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/recursoLogico", "RecursoLogicoWS"));
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
