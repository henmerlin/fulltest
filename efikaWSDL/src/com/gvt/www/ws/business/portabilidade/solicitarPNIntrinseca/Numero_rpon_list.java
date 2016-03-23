/**
 * Numero_rpon_list.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca;

public class Numero_rpon_list  implements java.io.Serializable {
    private java.lang.String numero;

    /* usado apenas pelo retail */
    private java.lang.String rpon;

    public Numero_rpon_list() {
    }

    public Numero_rpon_list(
           java.lang.String numero,
           java.lang.String rpon) {
           this.numero = numero;
           this.rpon = rpon;
    }


    /**
     * Gets the numero value for this Numero_rpon_list.
     * 
     * @return numero
     */
    public java.lang.String getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this Numero_rpon_list.
     * 
     * @param numero
     */
    public void setNumero(java.lang.String numero) {
        this.numero = numero;
    }


    /**
     * Gets the rpon value for this Numero_rpon_list.
     * 
     * @return rpon   * usado apenas pelo retail
     */
    public java.lang.String getRpon() {
        return rpon;
    }


    /**
     * Sets the rpon value for this Numero_rpon_list.
     * 
     * @param rpon   * usado apenas pelo retail
     */
    public void setRpon(java.lang.String rpon) {
        this.rpon = rpon;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Numero_rpon_list)) return false;
        Numero_rpon_list other = (Numero_rpon_list) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numero==null && other.getNumero()==null) || 
             (this.numero!=null &&
              this.numero.equals(other.getNumero()))) &&
            ((this.rpon==null && other.getRpon()==null) || 
             (this.rpon!=null &&
              this.rpon.equals(other.getRpon())));
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
        if (getNumero() != null) {
            _hashCode += getNumero().hashCode();
        }
        if (getRpon() != null) {
            _hashCode += getRpon().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Numero_rpon_list.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca", "numero_rpon_list"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca", "numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rpon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca", "rpon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
