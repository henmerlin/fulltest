/**
 * ProdutoLinha.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria;

public class ProdutoLinha  implements java.io.Serializable {
    private java.lang.String numeroLista;

    private java.lang.String numeroEquipamento;

    /* Reprensenta a Central que o Cliente está
     * 						conectador. Por ex.: PRCTA_LPS01 */
    private java.lang.String clliCode;

    /* Reprensenta o numero de equipamento na Central TDM que o Cliente
     * está
     * 						conectador, utilizado a principio no Phone 2 GO. */
    private java.lang.String clliCodeEquipamento;

    /* Representa a posicao da instancia dentro da
     *             			Switch. */
    private java.lang.String miscInfo;

    private java.lang.String cidade;

    private java.lang.String uf;

    public ProdutoLinha() {
    }

    public ProdutoLinha(
           java.lang.String numeroLista,
           java.lang.String numeroEquipamento,
           java.lang.String clliCode,
           java.lang.String clliCodeEquipamento,
           java.lang.String miscInfo,
           java.lang.String cidade,
           java.lang.String uf) {
           this.numeroLista = numeroLista;
           this.numeroEquipamento = numeroEquipamento;
           this.clliCode = clliCode;
           this.clliCodeEquipamento = clliCodeEquipamento;
           this.miscInfo = miscInfo;
           this.cidade = cidade;
           this.uf = uf;
    }


    /**
     * Gets the numeroLista value for this ProdutoLinha.
     * 
     * @return numeroLista
     */
    public java.lang.String getNumeroLista() {
        return numeroLista;
    }


    /**
     * Sets the numeroLista value for this ProdutoLinha.
     * 
     * @param numeroLista
     */
    public void setNumeroLista(java.lang.String numeroLista) {
        this.numeroLista = numeroLista;
    }


    /**
     * Gets the numeroEquipamento value for this ProdutoLinha.
     * 
     * @return numeroEquipamento
     */
    public java.lang.String getNumeroEquipamento() {
        return numeroEquipamento;
    }


    /**
     * Sets the numeroEquipamento value for this ProdutoLinha.
     * 
     * @param numeroEquipamento
     */
    public void setNumeroEquipamento(java.lang.String numeroEquipamento) {
        this.numeroEquipamento = numeroEquipamento;
    }


    /**
     * Gets the clliCode value for this ProdutoLinha.
     * 
     * @return clliCode   * Reprensenta a Central que o Cliente está
     * 						conectador. Por ex.: PRCTA_LPS01
     */
    public java.lang.String getClliCode() {
        return clliCode;
    }


    /**
     * Sets the clliCode value for this ProdutoLinha.
     * 
     * @param clliCode   * Reprensenta a Central que o Cliente está
     * 						conectador. Por ex.: PRCTA_LPS01
     */
    public void setClliCode(java.lang.String clliCode) {
        this.clliCode = clliCode;
    }


    /**
     * Gets the clliCodeEquipamento value for this ProdutoLinha.
     * 
     * @return clliCodeEquipamento   * Reprensenta o numero de equipamento na Central TDM que o Cliente
     * está
     * 						conectador, utilizado a principio no Phone 2 GO.
     */
    public java.lang.String getClliCodeEquipamento() {
        return clliCodeEquipamento;
    }


    /**
     * Sets the clliCodeEquipamento value for this ProdutoLinha.
     * 
     * @param clliCodeEquipamento   * Reprensenta o numero de equipamento na Central TDM que o Cliente
     * está
     * 						conectador, utilizado a principio no Phone 2 GO.
     */
    public void setClliCodeEquipamento(java.lang.String clliCodeEquipamento) {
        this.clliCodeEquipamento = clliCodeEquipamento;
    }


    /**
     * Gets the miscInfo value for this ProdutoLinha.
     * 
     * @return miscInfo   * Representa a posicao da instancia dentro da
     *             			Switch.
     */
    public java.lang.String getMiscInfo() {
        return miscInfo;
    }


    /**
     * Sets the miscInfo value for this ProdutoLinha.
     * 
     * @param miscInfo   * Representa a posicao da instancia dentro da
     *             			Switch.
     */
    public void setMiscInfo(java.lang.String miscInfo) {
        this.miscInfo = miscInfo;
    }


    /**
     * Gets the cidade value for this ProdutoLinha.
     * 
     * @return cidade
     */
    public java.lang.String getCidade() {
        return cidade;
    }


    /**
     * Sets the cidade value for this ProdutoLinha.
     * 
     * @param cidade
     */
    public void setCidade(java.lang.String cidade) {
        this.cidade = cidade;
    }


    /**
     * Gets the uf value for this ProdutoLinha.
     * 
     * @return uf
     */
    public java.lang.String getUf() {
        return uf;
    }


    /**
     * Sets the uf value for this ProdutoLinha.
     * 
     * @param uf
     */
    public void setUf(java.lang.String uf) {
        this.uf = uf;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProdutoLinha)) return false;
        ProdutoLinha other = (ProdutoLinha) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numeroLista==null && other.getNumeroLista()==null) || 
             (this.numeroLista!=null &&
              this.numeroLista.equals(other.getNumeroLista()))) &&
            ((this.numeroEquipamento==null && other.getNumeroEquipamento()==null) || 
             (this.numeroEquipamento!=null &&
              this.numeroEquipamento.equals(other.getNumeroEquipamento()))) &&
            ((this.clliCode==null && other.getClliCode()==null) || 
             (this.clliCode!=null &&
              this.clliCode.equals(other.getClliCode()))) &&
            ((this.clliCodeEquipamento==null && other.getClliCodeEquipamento()==null) || 
             (this.clliCodeEquipamento!=null &&
              this.clliCodeEquipamento.equals(other.getClliCodeEquipamento()))) &&
            ((this.miscInfo==null && other.getMiscInfo()==null) || 
             (this.miscInfo!=null &&
              this.miscInfo.equals(other.getMiscInfo()))) &&
            ((this.cidade==null && other.getCidade()==null) || 
             (this.cidade!=null &&
              this.cidade.equals(other.getCidade()))) &&
            ((this.uf==null && other.getUf()==null) || 
             (this.uf!=null &&
              this.uf.equals(other.getUf())));
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
        if (getNumeroLista() != null) {
            _hashCode += getNumeroLista().hashCode();
        }
        if (getNumeroEquipamento() != null) {
            _hashCode += getNumeroEquipamento().hashCode();
        }
        if (getClliCode() != null) {
            _hashCode += getClliCode().hashCode();
        }
        if (getClliCodeEquipamento() != null) {
            _hashCode += getClliCodeEquipamento().hashCode();
        }
        if (getMiscInfo() != null) {
            _hashCode += getMiscInfo().hashCode();
        }
        if (getCidade() != null) {
            _hashCode += getCidade().hashCode();
        }
        if (getUf() != null) {
            _hashCode += getUf().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProdutoLinha.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "ProdutoLinha"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroLista");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "numeroLista"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroEquipamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "numeroEquipamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clliCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "clliCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clliCodeEquipamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "clliCodeEquipamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("miscInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "miscInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "cidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "uf"));
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
