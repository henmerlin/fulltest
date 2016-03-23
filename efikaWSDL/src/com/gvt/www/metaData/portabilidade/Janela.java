/**
 * Janela.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.metaData.portabilidade;


/**
 * Janela para agendamento de portabilidade
 */
public class Janela  implements java.io.Serializable {
    private java.util.Calendar inicio;

    private java.util.Calendar fim;

    /* atende o SLA = true
     * não atende o SLA = false */
    private boolean sla;

    public Janela() {
    }

    public Janela(
           java.util.Calendar inicio,
           java.util.Calendar fim,
           boolean sla) {
           this.inicio = inicio;
           this.fim = fim;
           this.sla = sla;
    }


    /**
     * Gets the inicio value for this Janela.
     * 
     * @return inicio
     */
    public java.util.Calendar getInicio() {
        return inicio;
    }


    /**
     * Sets the inicio value for this Janela.
     * 
     * @param inicio
     */
    public void setInicio(java.util.Calendar inicio) {
        this.inicio = inicio;
    }


    /**
     * Gets the fim value for this Janela.
     * 
     * @return fim
     */
    public java.util.Calendar getFim() {
        return fim;
    }


    /**
     * Sets the fim value for this Janela.
     * 
     * @param fim
     */
    public void setFim(java.util.Calendar fim) {
        this.fim = fim;
    }


    /**
     * Gets the sla value for this Janela.
     * 
     * @return sla   * atende o SLA = true
     * não atende o SLA = false
     */
    public boolean isSla() {
        return sla;
    }


    /**
     * Sets the sla value for this Janela.
     * 
     * @param sla   * atende o SLA = true
     * não atende o SLA = false
     */
    public void setSla(boolean sla) {
        this.sla = sla;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Janela)) return false;
        Janela other = (Janela) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inicio==null && other.getInicio()==null) || 
             (this.inicio!=null &&
              this.inicio.equals(other.getInicio()))) &&
            ((this.fim==null && other.getFim()==null) || 
             (this.fim!=null &&
              this.fim.equals(other.getFim()))) &&
            this.sla == other.isSla();
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
        if (getInicio() != null) {
            _hashCode += getInicio().hashCode();
        }
        if (getFim() != null) {
            _hashCode += getFim().hashCode();
        }
        _hashCode += (isSla() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Janela.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/portabilidade", "Janela"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/portabilidade", "inicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/portabilidade", "fim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sla");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/portabilidade", "sla"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
