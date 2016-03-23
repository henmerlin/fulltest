/**
 * ReservaInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.inserirNP;

public class ReservaInfo  implements java.io.Serializable {
    private java.lang.String nomeCliente;

    private java.lang.String emailSolicitante;

    private java.lang.String idSolicitante;

    private java.lang.String nomeSolicitante;

    public ReservaInfo() {
    }

    public ReservaInfo(
           java.lang.String nomeCliente,
           java.lang.String emailSolicitante,
           java.lang.String idSolicitante,
           java.lang.String nomeSolicitante) {
           this.nomeCliente = nomeCliente;
           this.emailSolicitante = emailSolicitante;
           this.idSolicitante = idSolicitante;
           this.nomeSolicitante = nomeSolicitante;
    }


    /**
     * Gets the nomeCliente value for this ReservaInfo.
     * 
     * @return nomeCliente
     */
    public java.lang.String getNomeCliente() {
        return nomeCliente;
    }


    /**
     * Sets the nomeCliente value for this ReservaInfo.
     * 
     * @param nomeCliente
     */
    public void setNomeCliente(java.lang.String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }


    /**
     * Gets the emailSolicitante value for this ReservaInfo.
     * 
     * @return emailSolicitante
     */
    public java.lang.String getEmailSolicitante() {
        return emailSolicitante;
    }


    /**
     * Sets the emailSolicitante value for this ReservaInfo.
     * 
     * @param emailSolicitante
     */
    public void setEmailSolicitante(java.lang.String emailSolicitante) {
        this.emailSolicitante = emailSolicitante;
    }


    /**
     * Gets the idSolicitante value for this ReservaInfo.
     * 
     * @return idSolicitante
     */
    public java.lang.String getIdSolicitante() {
        return idSolicitante;
    }


    /**
     * Sets the idSolicitante value for this ReservaInfo.
     * 
     * @param idSolicitante
     */
    public void setIdSolicitante(java.lang.String idSolicitante) {
        this.idSolicitante = idSolicitante;
    }


    /**
     * Gets the nomeSolicitante value for this ReservaInfo.
     * 
     * @return nomeSolicitante
     */
    public java.lang.String getNomeSolicitante() {
        return nomeSolicitante;
    }


    /**
     * Sets the nomeSolicitante value for this ReservaInfo.
     * 
     * @param nomeSolicitante
     */
    public void setNomeSolicitante(java.lang.String nomeSolicitante) {
        this.nomeSolicitante = nomeSolicitante;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReservaInfo)) return false;
        ReservaInfo other = (ReservaInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nomeCliente==null && other.getNomeCliente()==null) || 
             (this.nomeCliente!=null &&
              this.nomeCliente.equals(other.getNomeCliente()))) &&
            ((this.emailSolicitante==null && other.getEmailSolicitante()==null) || 
             (this.emailSolicitante!=null &&
              this.emailSolicitante.equals(other.getEmailSolicitante()))) &&
            ((this.idSolicitante==null && other.getIdSolicitante()==null) || 
             (this.idSolicitante!=null &&
              this.idSolicitante.equals(other.getIdSolicitante()))) &&
            ((this.nomeSolicitante==null && other.getNomeSolicitante()==null) || 
             (this.nomeSolicitante!=null &&
              this.nomeSolicitante.equals(other.getNomeSolicitante())));
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
        if (getNomeCliente() != null) {
            _hashCode += getNomeCliente().hashCode();
        }
        if (getEmailSolicitante() != null) {
            _hashCode += getEmailSolicitante().hashCode();
        }
        if (getIdSolicitante() != null) {
            _hashCode += getIdSolicitante().hashCode();
        }
        if (getNomeSolicitante() != null) {
            _hashCode += getNomeSolicitante().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReservaInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/inserirNP", "ReservaInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/inserirNP", "nomeCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailSolicitante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/inserirNP", "emailSolicitante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSolicitante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/inserirNP", "idSolicitante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeSolicitante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/inserirNP", "nomeSolicitante"));
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
