/**
 * ConsultarControlesComandosIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.services.consultarControleComando;

public class ConsultarControlesComandosIn  implements java.io.Serializable {
    private java.math.BigInteger idRecursoLogico;

    private java.math.BigInteger idHomeGateway;

    private java.math.BigInteger idPortaFXS;

    private java.lang.String designador;

    public ConsultarControlesComandosIn() {
    }

    public ConsultarControlesComandosIn(
           java.math.BigInteger idRecursoLogico,
           java.math.BigInteger idHomeGateway,
           java.math.BigInteger idPortaFXS,
           java.lang.String designador) {
           this.idRecursoLogico = idRecursoLogico;
           this.idHomeGateway = idHomeGateway;
           this.idPortaFXS = idPortaFXS;
           this.designador = designador;
    }


    /**
     * Gets the idRecursoLogico value for this ConsultarControlesComandosIn.
     * 
     * @return idRecursoLogico
     */
    public java.math.BigInteger getIdRecursoLogico() {
        return idRecursoLogico;
    }


    /**
     * Sets the idRecursoLogico value for this ConsultarControlesComandosIn.
     * 
     * @param idRecursoLogico
     */
    public void setIdRecursoLogico(java.math.BigInteger idRecursoLogico) {
        this.idRecursoLogico = idRecursoLogico;
    }


    /**
     * Gets the idHomeGateway value for this ConsultarControlesComandosIn.
     * 
     * @return idHomeGateway
     */
    public java.math.BigInteger getIdHomeGateway() {
        return idHomeGateway;
    }


    /**
     * Sets the idHomeGateway value for this ConsultarControlesComandosIn.
     * 
     * @param idHomeGateway
     */
    public void setIdHomeGateway(java.math.BigInteger idHomeGateway) {
        this.idHomeGateway = idHomeGateway;
    }


    /**
     * Gets the idPortaFXS value for this ConsultarControlesComandosIn.
     * 
     * @return idPortaFXS
     */
    public java.math.BigInteger getIdPortaFXS() {
        return idPortaFXS;
    }


    /**
     * Sets the idPortaFXS value for this ConsultarControlesComandosIn.
     * 
     * @param idPortaFXS
     */
    public void setIdPortaFXS(java.math.BigInteger idPortaFXS) {
        this.idPortaFXS = idPortaFXS;
    }


    /**
     * Gets the designador value for this ConsultarControlesComandosIn.
     * 
     * @return designador
     */
    public java.lang.String getDesignador() {
        return designador;
    }


    /**
     * Sets the designador value for this ConsultarControlesComandosIn.
     * 
     * @param designador
     */
    public void setDesignador(java.lang.String designador) {
        this.designador = designador;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarControlesComandosIn)) return false;
        ConsultarControlesComandosIn other = (ConsultarControlesComandosIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idRecursoLogico==null && other.getIdRecursoLogico()==null) || 
             (this.idRecursoLogico!=null &&
              this.idRecursoLogico.equals(other.getIdRecursoLogico()))) &&
            ((this.idHomeGateway==null && other.getIdHomeGateway()==null) || 
             (this.idHomeGateway!=null &&
              this.idHomeGateway.equals(other.getIdHomeGateway()))) &&
            ((this.idPortaFXS==null && other.getIdPortaFXS()==null) || 
             (this.idPortaFXS!=null &&
              this.idPortaFXS.equals(other.getIdPortaFXS()))) &&
            ((this.designador==null && other.getDesignador()==null) || 
             (this.designador!=null &&
              this.designador.equals(other.getDesignador())));
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
        if (getIdRecursoLogico() != null) {
            _hashCode += getIdRecursoLogico().hashCode();
        }
        if (getIdHomeGateway() != null) {
            _hashCode += getIdHomeGateway().hashCode();
        }
        if (getIdPortaFXS() != null) {
            _hashCode += getIdPortaFXS().hashCode();
        }
        if (getDesignador() != null) {
            _hashCode += getDesignador().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultarControlesComandosIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/consultarControleComando", "ConsultarControlesComandosIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idRecursoLogico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/consultarControleComando", "idRecursoLogico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idHomeGateway");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/consultarControleComando", "idHomeGateway"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPortaFXS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/consultarControleComando", "idPortaFXS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/consultarControleComando", "designador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
