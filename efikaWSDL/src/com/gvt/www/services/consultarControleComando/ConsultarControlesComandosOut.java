/**
 * ConsultarControlesComandosOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.services.consultarControleComando;

public class ConsultarControlesComandosOut  extends com.gvt.www.services.model.retorno.Retorno  implements java.io.Serializable {
    private com.gvt.www.services.model.controleComando.ControleComando[] comando;

    public ConsultarControlesComandosOut() {
    }

    public ConsultarControlesComandosOut(
           int codigo,
           java.lang.String mensagem,
           com.gvt.www.services.model.controleComando.ControleComando[] comando) {
        super(
            codigo,
            mensagem);
        this.comando = comando;
    }


    /**
     * Gets the comando value for this ConsultarControlesComandosOut.
     * 
     * @return comando
     */
    public com.gvt.www.services.model.controleComando.ControleComando[] getComando() {
        return comando;
    }


    /**
     * Sets the comando value for this ConsultarControlesComandosOut.
     * 
     * @param comando
     */
    public void setComando(com.gvt.www.services.model.controleComando.ControleComando[] comando) {
        this.comando = comando;
    }

    public com.gvt.www.services.model.controleComando.ControleComando getComando(int i) {
        return this.comando[i];
    }

    public void setComando(int i, com.gvt.www.services.model.controleComando.ControleComando _value) {
        this.comando[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarControlesComandosOut)) return false;
        ConsultarControlesComandosOut other = (ConsultarControlesComandosOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.comando==null && other.getComando()==null) || 
             (this.comando!=null &&
              java.util.Arrays.equals(this.comando, other.getComando())));
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
        if (getComando() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComando());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComando(), i);
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
        new org.apache.axis.description.TypeDesc(ConsultarControlesComandosOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/consultarControleComando", "ConsultarControlesComandosOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comando");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/consultarControleComando", "comando"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/controleComando", "ControleComando"));
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
