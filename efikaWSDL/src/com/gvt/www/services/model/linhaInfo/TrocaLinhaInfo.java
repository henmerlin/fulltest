/**
 * TrocaLinhaInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.services.model.linhaInfo;

public class TrocaLinhaInfo  implements java.io.Serializable {
    private java.lang.String instanciaAtual;

    private java.lang.String instanciaNova;

    public TrocaLinhaInfo() {
    }

    public TrocaLinhaInfo(
           java.lang.String instanciaAtual,
           java.lang.String instanciaNova) {
           this.instanciaAtual = instanciaAtual;
           this.instanciaNova = instanciaNova;
    }


    /**
     * Gets the instanciaAtual value for this TrocaLinhaInfo.
     * 
     * @return instanciaAtual
     */
    public java.lang.String getInstanciaAtual() {
        return instanciaAtual;
    }


    /**
     * Sets the instanciaAtual value for this TrocaLinhaInfo.
     * 
     * @param instanciaAtual
     */
    public void setInstanciaAtual(java.lang.String instanciaAtual) {
        this.instanciaAtual = instanciaAtual;
    }


    /**
     * Gets the instanciaNova value for this TrocaLinhaInfo.
     * 
     * @return instanciaNova
     */
    public java.lang.String getInstanciaNova() {
        return instanciaNova;
    }


    /**
     * Sets the instanciaNova value for this TrocaLinhaInfo.
     * 
     * @param instanciaNova
     */
    public void setInstanciaNova(java.lang.String instanciaNova) {
        this.instanciaNova = instanciaNova;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrocaLinhaInfo)) return false;
        TrocaLinhaInfo other = (TrocaLinhaInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.instanciaAtual==null && other.getInstanciaAtual()==null) || 
             (this.instanciaAtual!=null &&
              this.instanciaAtual.equals(other.getInstanciaAtual()))) &&
            ((this.instanciaNova==null && other.getInstanciaNova()==null) || 
             (this.instanciaNova!=null &&
              this.instanciaNova.equals(other.getInstanciaNova())));
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
        if (getInstanciaAtual() != null) {
            _hashCode += getInstanciaAtual().hashCode();
        }
        if (getInstanciaNova() != null) {
            _hashCode += getInstanciaNova().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrocaLinhaInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/linhaInfo", "TrocaLinhaInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instanciaAtual");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/linhaInfo", "instanciaAtual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instanciaNova");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/linhaInfo", "instanciaNova"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
