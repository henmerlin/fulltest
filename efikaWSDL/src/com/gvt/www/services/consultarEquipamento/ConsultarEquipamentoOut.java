/**
 * ConsultarEquipamentoOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.services.consultarEquipamento;

public class ConsultarEquipamentoOut  extends com.gvt.www.services.model.retorno.Retorno  implements java.io.Serializable {
    private com.gvt.www.services.model.recursoLogico.RecursoLogicoWS[] recursosLogicos;

    public ConsultarEquipamentoOut() {
    }

    public ConsultarEquipamentoOut(
           int codigo,
           java.lang.String mensagem,
           com.gvt.www.services.model.recursoLogico.RecursoLogicoWS[] recursosLogicos) {
        super(
            codigo,
            mensagem);
        this.recursosLogicos = recursosLogicos;
    }


    /**
     * Gets the recursosLogicos value for this ConsultarEquipamentoOut.
     * 
     * @return recursosLogicos
     */
    public com.gvt.www.services.model.recursoLogico.RecursoLogicoWS[] getRecursosLogicos() {
        return recursosLogicos;
    }


    /**
     * Sets the recursosLogicos value for this ConsultarEquipamentoOut.
     * 
     * @param recursosLogicos
     */
    public void setRecursosLogicos(com.gvt.www.services.model.recursoLogico.RecursoLogicoWS[] recursosLogicos) {
        this.recursosLogicos = recursosLogicos;
    }

    public com.gvt.www.services.model.recursoLogico.RecursoLogicoWS getRecursosLogicos(int i) {
        return this.recursosLogicos[i];
    }

    public void setRecursosLogicos(int i, com.gvt.www.services.model.recursoLogico.RecursoLogicoWS _value) {
        this.recursosLogicos[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarEquipamentoOut)) return false;
        ConsultarEquipamentoOut other = (ConsultarEquipamentoOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.recursosLogicos==null && other.getRecursosLogicos()==null) || 
             (this.recursosLogicos!=null &&
              java.util.Arrays.equals(this.recursosLogicos, other.getRecursosLogicos())));
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
        if (getRecursosLogicos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecursosLogicos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecursosLogicos(), i);
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
        new org.apache.axis.description.TypeDesc(ConsultarEquipamentoOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/consultarEquipamento", "ConsultarEquipamentoOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recursosLogicos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/consultarEquipamento", "recursosLogicos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/recursoLogico", "RecursoLogicoWS"));
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
