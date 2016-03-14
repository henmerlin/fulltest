/**
 * Produto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria;

public class Produto  implements java.io.Serializable {
    private com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.ProdutoLinha linha;

    private com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.ProdutoBandaLarga bandaLarga;

    private com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.ProdutoTv tv;

    private com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.ProdutoVAS vas;

    public Produto() {
    }

    public Produto(
           com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.ProdutoLinha linha,
           com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.ProdutoBandaLarga bandaLarga,
           com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.ProdutoTv tv,
           com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.ProdutoVAS vas) {
           this.linha = linha;
           this.bandaLarga = bandaLarga;
           this.tv = tv;
           this.vas = vas;
    }


    /**
     * Gets the linha value for this Produto.
     * 
     * @return linha
     */
    public com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.ProdutoLinha getLinha() {
        return linha;
    }


    /**
     * Sets the linha value for this Produto.
     * 
     * @param linha
     */
    public void setLinha(com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.ProdutoLinha linha) {
        this.linha = linha;
    }


    /**
     * Gets the bandaLarga value for this Produto.
     * 
     * @return bandaLarga
     */
    public com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.ProdutoBandaLarga getBandaLarga() {
        return bandaLarga;
    }


    /**
     * Sets the bandaLarga value for this Produto.
     * 
     * @param bandaLarga
     */
    public void setBandaLarga(com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.ProdutoBandaLarga bandaLarga) {
        this.bandaLarga = bandaLarga;
    }


    /**
     * Gets the tv value for this Produto.
     * 
     * @return tv
     */
    public com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.ProdutoTv getTv() {
        return tv;
    }


    /**
     * Sets the tv value for this Produto.
     * 
     * @param tv
     */
    public void setTv(com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.ProdutoTv tv) {
        this.tv = tv;
    }


    /**
     * Gets the vas value for this Produto.
     * 
     * @return vas
     */
    public com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.ProdutoVAS getVas() {
        return vas;
    }


    /**
     * Sets the vas value for this Produto.
     * 
     * @param vas
     */
    public void setVas(com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.ProdutoVAS vas) {
        this.vas = vas;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Produto)) return false;
        Produto other = (Produto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.linha==null && other.getLinha()==null) || 
             (this.linha!=null &&
              this.linha.equals(other.getLinha()))) &&
            ((this.bandaLarga==null && other.getBandaLarga()==null) || 
             (this.bandaLarga!=null &&
              this.bandaLarga.equals(other.getBandaLarga()))) &&
            ((this.tv==null && other.getTv()==null) || 
             (this.tv!=null &&
              this.tv.equals(other.getTv()))) &&
            ((this.vas==null && other.getVas()==null) || 
             (this.vas!=null &&
              this.vas.equals(other.getVas())));
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
        if (getLinha() != null) {
            _hashCode += getLinha().hashCode();
        }
        if (getBandaLarga() != null) {
            _hashCode += getBandaLarga().hashCode();
        }
        if (getTv() != null) {
            _hashCode += getTv().hashCode();
        }
        if (getVas() != null) {
            _hashCode += getVas().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Produto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "Produto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linha");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "linha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "ProdutoLinha"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bandaLarga");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "bandaLarga"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "ProdutoBandaLarga"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "tv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "ProdutoTv"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "vas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "ProdutoVAS"));
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
