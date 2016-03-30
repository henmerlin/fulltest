/**
 * ListarModelosOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.services.listarModelos;

public class ListarModelosOut  extends com.gvt.www.services.model.retorno.Retorno  implements java.io.Serializable {
    private com.gvt.www.services.model.modeloEquipamento.ModeloEquipamento[] modelo;

    public ListarModelosOut() {
    }

    public ListarModelosOut(
           int codigo,
           java.lang.String mensagem,
           com.gvt.www.services.model.modeloEquipamento.ModeloEquipamento[] modelo) {
        super(
            codigo,
            mensagem);
        this.modelo = modelo;
    }


    /**
     * Gets the modelo value for this ListarModelosOut.
     * 
     * @return modelo
     */
    public com.gvt.www.services.model.modeloEquipamento.ModeloEquipamento[] getModelo() {
        return modelo;
    }


    /**
     * Sets the modelo value for this ListarModelosOut.
     * 
     * @param modelo
     */
    public void setModelo(com.gvt.www.services.model.modeloEquipamento.ModeloEquipamento[] modelo) {
        this.modelo = modelo;
    }

    public com.gvt.www.services.model.modeloEquipamento.ModeloEquipamento getModelo(int i) {
        return this.modelo[i];
    }

    public void setModelo(int i, com.gvt.www.services.model.modeloEquipamento.ModeloEquipamento _value) {
        this.modelo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListarModelosOut)) return false;
        ListarModelosOut other = (ListarModelosOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.modelo==null && other.getModelo()==null) || 
             (this.modelo!=null &&
              java.util.Arrays.equals(this.modelo, other.getModelo())));
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
        if (getModelo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModelo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModelo(), i);
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
        new org.apache.axis.description.TypeDesc(ListarModelosOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/listarModelos", "ListarModelosOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/listarModelos", "modelo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/modeloEquipamento", "ModeloEquipamento"));
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
