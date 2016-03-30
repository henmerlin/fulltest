/**
 * TrocaAcesso.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.services.model.trocaAcesso;

public class TrocaAcesso  implements java.io.Serializable {
    private java.lang.String antigoAcesso;

    private java.lang.String novoAcesso;

    public TrocaAcesso() {
    }

    public TrocaAcesso(
           java.lang.String antigoAcesso,
           java.lang.String novoAcesso) {
           this.antigoAcesso = antigoAcesso;
           this.novoAcesso = novoAcesso;
    }


    /**
     * Gets the antigoAcesso value for this TrocaAcesso.
     * 
     * @return antigoAcesso
     */
    public java.lang.String getAntigoAcesso() {
        return antigoAcesso;
    }


    /**
     * Sets the antigoAcesso value for this TrocaAcesso.
     * 
     * @param antigoAcesso
     */
    public void setAntigoAcesso(java.lang.String antigoAcesso) {
        this.antigoAcesso = antigoAcesso;
    }


    /**
     * Gets the novoAcesso value for this TrocaAcesso.
     * 
     * @return novoAcesso
     */
    public java.lang.String getNovoAcesso() {
        return novoAcesso;
    }


    /**
     * Sets the novoAcesso value for this TrocaAcesso.
     * 
     * @param novoAcesso
     */
    public void setNovoAcesso(java.lang.String novoAcesso) {
        this.novoAcesso = novoAcesso;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrocaAcesso)) return false;
        TrocaAcesso other = (TrocaAcesso) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.antigoAcesso==null && other.getAntigoAcesso()==null) || 
             (this.antigoAcesso!=null &&
              this.antigoAcesso.equals(other.getAntigoAcesso()))) &&
            ((this.novoAcesso==null && other.getNovoAcesso()==null) || 
             (this.novoAcesso!=null &&
              this.novoAcesso.equals(other.getNovoAcesso())));
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
        if (getAntigoAcesso() != null) {
            _hashCode += getAntigoAcesso().hashCode();
        }
        if (getNovoAcesso() != null) {
            _hashCode += getNovoAcesso().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrocaAcesso.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/trocaAcesso", "TrocaAcesso"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("antigoAcesso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/trocaAcesso", "antigoAcesso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("novoAcesso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/trocaAcesso", "novoAcesso"));
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
