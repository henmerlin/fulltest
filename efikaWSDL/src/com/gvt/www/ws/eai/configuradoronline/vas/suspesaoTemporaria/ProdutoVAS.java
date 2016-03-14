/**
 * ProdutoVAS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria;

public class ProdutoVAS  implements java.io.Serializable {
    private java.lang.String documento;

    private java.lang.String idOrdem;

    private java.lang.String designadorVAS;

    private java.lang.String nomeServico;

    public ProdutoVAS() {
    }

    public ProdutoVAS(
           java.lang.String documento,
           java.lang.String idOrdem,
           java.lang.String designadorVAS,
           java.lang.String nomeServico) {
           this.documento = documento;
           this.idOrdem = idOrdem;
           this.designadorVAS = designadorVAS;
           this.nomeServico = nomeServico;
    }


    /**
     * Gets the documento value for this ProdutoVAS.
     * 
     * @return documento
     */
    public java.lang.String getDocumento() {
        return documento;
    }


    /**
     * Sets the documento value for this ProdutoVAS.
     * 
     * @param documento
     */
    public void setDocumento(java.lang.String documento) {
        this.documento = documento;
    }


    /**
     * Gets the idOrdem value for this ProdutoVAS.
     * 
     * @return idOrdem
     */
    public java.lang.String getIdOrdem() {
        return idOrdem;
    }


    /**
     * Sets the idOrdem value for this ProdutoVAS.
     * 
     * @param idOrdem
     */
    public void setIdOrdem(java.lang.String idOrdem) {
        this.idOrdem = idOrdem;
    }


    /**
     * Gets the designadorVAS value for this ProdutoVAS.
     * 
     * @return designadorVAS
     */
    public java.lang.String getDesignadorVAS() {
        return designadorVAS;
    }


    /**
     * Sets the designadorVAS value for this ProdutoVAS.
     * 
     * @param designadorVAS
     */
    public void setDesignadorVAS(java.lang.String designadorVAS) {
        this.designadorVAS = designadorVAS;
    }


    /**
     * Gets the nomeServico value for this ProdutoVAS.
     * 
     * @return nomeServico
     */
    public java.lang.String getNomeServico() {
        return nomeServico;
    }


    /**
     * Sets the nomeServico value for this ProdutoVAS.
     * 
     * @param nomeServico
     */
    public void setNomeServico(java.lang.String nomeServico) {
        this.nomeServico = nomeServico;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProdutoVAS)) return false;
        ProdutoVAS other = (ProdutoVAS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.documento==null && other.getDocumento()==null) || 
             (this.documento!=null &&
              this.documento.equals(other.getDocumento()))) &&
            ((this.idOrdem==null && other.getIdOrdem()==null) || 
             (this.idOrdem!=null &&
              this.idOrdem.equals(other.getIdOrdem()))) &&
            ((this.designadorVAS==null && other.getDesignadorVAS()==null) || 
             (this.designadorVAS!=null &&
              this.designadorVAS.equals(other.getDesignadorVAS()))) &&
            ((this.nomeServico==null && other.getNomeServico()==null) || 
             (this.nomeServico!=null &&
              this.nomeServico.equals(other.getNomeServico())));
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
        if (getDocumento() != null) {
            _hashCode += getDocumento().hashCode();
        }
        if (getIdOrdem() != null) {
            _hashCode += getIdOrdem().hashCode();
        }
        if (getDesignadorVAS() != null) {
            _hashCode += getDesignadorVAS().hashCode();
        }
        if (getNomeServico() != null) {
            _hashCode += getNomeServico().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProdutoVAS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "ProdutoVAS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "documento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idOrdem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "idOrdem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorVAS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "designadorVAS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeServico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "nomeServico"));
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
