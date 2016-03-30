/**
 * TrocarModeloEquipamentoOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.services.trocarModeloEquipamento;

public class TrocarModeloEquipamentoOut  extends com.gvt.www.services.model.retorno.Retorno  implements java.io.Serializable {
    private com.gvt.www.services.trocarModeloEquipamento.TrocaEquipamento[] trocaEquipamento;

    public TrocarModeloEquipamentoOut() {
    }

    public TrocarModeloEquipamentoOut(
           int codigo,
           java.lang.String mensagem,
           com.gvt.www.services.trocarModeloEquipamento.TrocaEquipamento[] trocaEquipamento) {
        super(
            codigo,
            mensagem);
        this.trocaEquipamento = trocaEquipamento;
    }


    /**
     * Gets the trocaEquipamento value for this TrocarModeloEquipamentoOut.
     * 
     * @return trocaEquipamento
     */
    public com.gvt.www.services.trocarModeloEquipamento.TrocaEquipamento[] getTrocaEquipamento() {
        return trocaEquipamento;
    }


    /**
     * Sets the trocaEquipamento value for this TrocarModeloEquipamentoOut.
     * 
     * @param trocaEquipamento
     */
    public void setTrocaEquipamento(com.gvt.www.services.trocarModeloEquipamento.TrocaEquipamento[] trocaEquipamento) {
        this.trocaEquipamento = trocaEquipamento;
    }

    public com.gvt.www.services.trocarModeloEquipamento.TrocaEquipamento getTrocaEquipamento(int i) {
        return this.trocaEquipamento[i];
    }

    public void setTrocaEquipamento(int i, com.gvt.www.services.trocarModeloEquipamento.TrocaEquipamento _value) {
        this.trocaEquipamento[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrocarModeloEquipamentoOut)) return false;
        TrocarModeloEquipamentoOut other = (TrocarModeloEquipamentoOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.trocaEquipamento==null && other.getTrocaEquipamento()==null) || 
             (this.trocaEquipamento!=null &&
              java.util.Arrays.equals(this.trocaEquipamento, other.getTrocaEquipamento())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getTrocaEquipamento() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrocaEquipamento());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrocaEquipamento(), i);
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
        new org.apache.axis.description.TypeDesc(TrocarModeloEquipamentoOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/trocarModeloEquipamento", "TrocarModeloEquipamentoOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trocaEquipamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/trocarModeloEquipamento", "trocaEquipamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/trocarModeloEquipamento", "TrocaEquipamento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
