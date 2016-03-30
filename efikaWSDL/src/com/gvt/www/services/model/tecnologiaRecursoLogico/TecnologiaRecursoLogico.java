/**
 * TecnologiaRecursoLogico.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.services.model.tecnologiaRecursoLogico;

public class TecnologiaRecursoLogico  implements java.io.Serializable {
    private com.gvt.www.services.model.tecnologiaRecursoLogico.TecnologiaRecursoLogicoEnum tecnologia;

    private com.gvt.www.services.model.tipoTecnologiaRecursoLogico.TipoTecnologiaRecursoLogico tipoTecnologiaRecursoLogico;

    public TecnologiaRecursoLogico() {
    }

    public TecnologiaRecursoLogico(
           com.gvt.www.services.model.tecnologiaRecursoLogico.TecnologiaRecursoLogicoEnum tecnologia,
           com.gvt.www.services.model.tipoTecnologiaRecursoLogico.TipoTecnologiaRecursoLogico tipoTecnologiaRecursoLogico) {
           this.tecnologia = tecnologia;
           this.tipoTecnologiaRecursoLogico = tipoTecnologiaRecursoLogico;
    }


    /**
     * Gets the tecnologia value for this TecnologiaRecursoLogico.
     * 
     * @return tecnologia
     */
    public com.gvt.www.services.model.tecnologiaRecursoLogico.TecnologiaRecursoLogicoEnum getTecnologia() {
        return tecnologia;
    }


    /**
     * Sets the tecnologia value for this TecnologiaRecursoLogico.
     * 
     * @param tecnologia
     */
    public void setTecnologia(com.gvt.www.services.model.tecnologiaRecursoLogico.TecnologiaRecursoLogicoEnum tecnologia) {
        this.tecnologia = tecnologia;
    }


    /**
     * Gets the tipoTecnologiaRecursoLogico value for this TecnologiaRecursoLogico.
     * 
     * @return tipoTecnologiaRecursoLogico
     */
    public com.gvt.www.services.model.tipoTecnologiaRecursoLogico.TipoTecnologiaRecursoLogico getTipoTecnologiaRecursoLogico() {
        return tipoTecnologiaRecursoLogico;
    }


    /**
     * Sets the tipoTecnologiaRecursoLogico value for this TecnologiaRecursoLogico.
     * 
     * @param tipoTecnologiaRecursoLogico
     */
    public void setTipoTecnologiaRecursoLogico(com.gvt.www.services.model.tipoTecnologiaRecursoLogico.TipoTecnologiaRecursoLogico tipoTecnologiaRecursoLogico) {
        this.tipoTecnologiaRecursoLogico = tipoTecnologiaRecursoLogico;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TecnologiaRecursoLogico)) return false;
        TecnologiaRecursoLogico other = (TecnologiaRecursoLogico) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tecnologia==null && other.getTecnologia()==null) || 
             (this.tecnologia!=null &&
              this.tecnologia.equals(other.getTecnologia()))) &&
            ((this.tipoTecnologiaRecursoLogico==null && other.getTipoTecnologiaRecursoLogico()==null) || 
             (this.tipoTecnologiaRecursoLogico!=null &&
              this.tipoTecnologiaRecursoLogico.equals(other.getTipoTecnologiaRecursoLogico())));
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
        if (getTecnologia() != null) {
            _hashCode += getTecnologia().hashCode();
        }
        if (getTipoTecnologiaRecursoLogico() != null) {
            _hashCode += getTipoTecnologiaRecursoLogico().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TecnologiaRecursoLogico.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/tecnologiaRecursoLogico", "TecnologiaRecursoLogico"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tecnologia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/tecnologiaRecursoLogico", "tecnologia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/tecnologiaRecursoLogico", "TecnologiaRecursoLogicoEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoTecnologiaRecursoLogico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/tecnologiaRecursoLogico", "tipoTecnologiaRecursoLogico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/tipoTecnologiaRecursoLogico", "TipoTecnologiaRecursoLogico"));
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
