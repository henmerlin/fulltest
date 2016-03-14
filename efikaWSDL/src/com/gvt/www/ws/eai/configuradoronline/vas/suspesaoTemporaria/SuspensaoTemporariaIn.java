/**
 * SuspensaoTemporariaIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria;


/**
 * Adiciona ou Remove Suspensão temporária. Criado para
 *         		atender a demanda do Siebel 8, que não gera mais uma
 *         		ordem, agora é um status da linha.
 */
public class SuspensaoTemporariaIn  implements java.io.Serializable {
    /* true - adiciona suspensao temporaria ao produto
     *         				false - remove suspensao temporaria ao produto */
    private boolean ativar;

    private com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.Produto produto;

    public SuspensaoTemporariaIn() {
    }

    public SuspensaoTemporariaIn(
           boolean ativar,
           com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.Produto produto) {
           this.ativar = ativar;
           this.produto = produto;
    }


    /**
     * Gets the ativar value for this SuspensaoTemporariaIn.
     * 
     * @return ativar   * true - adiciona suspensao temporaria ao produto
     *         				false - remove suspensao temporaria ao produto
     */
    public boolean isAtivar() {
        return ativar;
    }


    /**
     * Sets the ativar value for this SuspensaoTemporariaIn.
     * 
     * @param ativar   * true - adiciona suspensao temporaria ao produto
     *         				false - remove suspensao temporaria ao produto
     */
    public void setAtivar(boolean ativar) {
        this.ativar = ativar;
    }


    /**
     * Gets the produto value for this SuspensaoTemporariaIn.
     * 
     * @return produto
     */
    public com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.Produto getProduto() {
        return produto;
    }


    /**
     * Sets the produto value for this SuspensaoTemporariaIn.
     * 
     * @param produto
     */
    public void setProduto(com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.Produto produto) {
        this.produto = produto;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SuspensaoTemporariaIn)) return false;
        SuspensaoTemporariaIn other = (SuspensaoTemporariaIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ativar == other.isAtivar() &&
            ((this.produto==null && other.getProduto()==null) || 
             (this.produto!=null &&
              this.produto.equals(other.getProduto())));
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
        _hashCode += (isAtivar() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getProduto() != null) {
            _hashCode += getProduto().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SuspensaoTemporariaIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "SuspensaoTemporariaIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ativar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "ativar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("produto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "produto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "Produto"));
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
