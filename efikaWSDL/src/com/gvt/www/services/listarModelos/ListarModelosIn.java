/**
 * ListarModelosIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.services.listarModelos;

public class ListarModelosIn  implements java.io.Serializable {
    private java.lang.Integer id;

    private com.gvt.www.services.model.tipoRecursoLogico.TipoRecursoLogico tipoRecursoLogico;

    public ListarModelosIn() {
    }

    public ListarModelosIn(
           java.lang.Integer id,
           com.gvt.www.services.model.tipoRecursoLogico.TipoRecursoLogico tipoRecursoLogico) {
           this.id = id;
           this.tipoRecursoLogico = tipoRecursoLogico;
    }


    /**
     * Gets the id value for this ListarModelosIn.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this ListarModelosIn.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the tipoRecursoLogico value for this ListarModelosIn.
     * 
     * @return tipoRecursoLogico
     */
    public com.gvt.www.services.model.tipoRecursoLogico.TipoRecursoLogico getTipoRecursoLogico() {
        return tipoRecursoLogico;
    }


    /**
     * Sets the tipoRecursoLogico value for this ListarModelosIn.
     * 
     * @param tipoRecursoLogico
     */
    public void setTipoRecursoLogico(com.gvt.www.services.model.tipoRecursoLogico.TipoRecursoLogico tipoRecursoLogico) {
        this.tipoRecursoLogico = tipoRecursoLogico;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListarModelosIn)) return false;
        ListarModelosIn other = (ListarModelosIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.tipoRecursoLogico==null && other.getTipoRecursoLogico()==null) || 
             (this.tipoRecursoLogico!=null &&
              this.tipoRecursoLogico.equals(other.getTipoRecursoLogico())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getTipoRecursoLogico() != null) {
            _hashCode += getTipoRecursoLogico().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListarModelosIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/listarModelos", "ListarModelosIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/listarModelos", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoRecursoLogico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/listarModelos", "tipoRecursoLogico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/tipoRecursoLogico", "TipoRecursoLogico"));
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
