/**
 * Numeros.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca;

public class Numeros  implements java.io.Serializable {
    private com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.Numero_rpon_list[] numero;

    private java.math.BigInteger groupGVT;

    public Numeros() {
    }

    public Numeros(
           com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.Numero_rpon_list[] numero,
           java.math.BigInteger groupGVT) {
           this.numero = numero;
           this.groupGVT = groupGVT;
    }


    /**
     * Gets the numero value for this Numeros.
     * 
     * @return numero
     */
    public com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.Numero_rpon_list[] getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this Numeros.
     * 
     * @param numero
     */
    public void setNumero(com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.Numero_rpon_list[] numero) {
        this.numero = numero;
    }

    public com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.Numero_rpon_list getNumero(int i) {
        return this.numero[i];
    }

    public void setNumero(int i, com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.Numero_rpon_list _value) {
        this.numero[i] = _value;
    }


    /**
     * Gets the groupGVT value for this Numeros.
     * 
     * @return groupGVT
     */
    public java.math.BigInteger getGroupGVT() {
        return groupGVT;
    }


    /**
     * Sets the groupGVT value for this Numeros.
     * 
     * @param groupGVT
     */
    public void setGroupGVT(java.math.BigInteger groupGVT) {
        this.groupGVT = groupGVT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Numeros)) return false;
        Numeros other = (Numeros) obj;
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
              java.util.Arrays.equals(this.numero, other.getNumero()))) &&
            ((this.groupGVT==null && other.getGroupGVT()==null) || 
             (this.groupGVT!=null &&
              this.groupGVT.equals(other.getGroupGVT())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNumero());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNumero(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGroupGVT() != null) {
            _hashCode += getGroupGVT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Numeros.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca", "numeros"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca", "numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca", "numero_rpon_list"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupGVT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca", "groupGVT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
