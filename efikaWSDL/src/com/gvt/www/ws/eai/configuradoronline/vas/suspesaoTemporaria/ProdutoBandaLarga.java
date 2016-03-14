/**
 * ProdutoBandaLarga.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria;

public class ProdutoBandaLarga  extends com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.ProdutoLinha  implements java.io.Serializable {
    private java.lang.String designador;

    /* Campo Cabinet do TBS. */
    private java.lang.String armario;

    /* Posicao fisica da placa no Armario. Formato de 3
     * 						digitos 0 LPAD. */
    private java.lang.String rin;

    /* Campo port do TBS. Formato de 5 digitos 0 LPAD */
    private java.lang.String porta;

    /* Informação do TBS conhecida como Shasta. */
    private java.lang.String modeloPlaca;

    public ProdutoBandaLarga() {
    }

    public ProdutoBandaLarga(
           java.lang.String numeroLista,
           java.lang.String numeroEquipamento,
           java.lang.String clliCode,
           java.lang.String clliCodeEquipamento,
           java.lang.String miscInfo,
           java.lang.String cidade,
           java.lang.String uf,
           java.lang.String designador,
           java.lang.String armario,
           java.lang.String rin,
           java.lang.String porta,
           java.lang.String modeloPlaca) {
        super(
            numeroLista,
            numeroEquipamento,
            clliCode,
            clliCodeEquipamento,
            miscInfo,
            cidade,
            uf);
        this.designador = designador;
        this.armario = armario;
        this.rin = rin;
        this.porta = porta;
        this.modeloPlaca = modeloPlaca;
    }


    /**
     * Gets the designador value for this ProdutoBandaLarga.
     * 
     * @return designador
     */
    public java.lang.String getDesignador() {
        return designador;
    }


    /**
     * Sets the designador value for this ProdutoBandaLarga.
     * 
     * @param designador
     */
    public void setDesignador(java.lang.String designador) {
        this.designador = designador;
    }


    /**
     * Gets the armario value for this ProdutoBandaLarga.
     * 
     * @return armario   * Campo Cabinet do TBS.
     */
    public java.lang.String getArmario() {
        return armario;
    }


    /**
     * Sets the armario value for this ProdutoBandaLarga.
     * 
     * @param armario   * Campo Cabinet do TBS.
     */
    public void setArmario(java.lang.String armario) {
        this.armario = armario;
    }


    /**
     * Gets the rin value for this ProdutoBandaLarga.
     * 
     * @return rin   * Posicao fisica da placa no Armario. Formato de 3
     * 						digitos 0 LPAD.
     */
    public java.lang.String getRin() {
        return rin;
    }


    /**
     * Sets the rin value for this ProdutoBandaLarga.
     * 
     * @param rin   * Posicao fisica da placa no Armario. Formato de 3
     * 						digitos 0 LPAD.
     */
    public void setRin(java.lang.String rin) {
        this.rin = rin;
    }


    /**
     * Gets the porta value for this ProdutoBandaLarga.
     * 
     * @return porta   * Campo port do TBS. Formato de 5 digitos 0 LPAD
     */
    public java.lang.String getPorta() {
        return porta;
    }


    /**
     * Sets the porta value for this ProdutoBandaLarga.
     * 
     * @param porta   * Campo port do TBS. Formato de 5 digitos 0 LPAD
     */
    public void setPorta(java.lang.String porta) {
        this.porta = porta;
    }


    /**
     * Gets the modeloPlaca value for this ProdutoBandaLarga.
     * 
     * @return modeloPlaca   * Informação do TBS conhecida como Shasta.
     */
    public java.lang.String getModeloPlaca() {
        return modeloPlaca;
    }


    /**
     * Sets the modeloPlaca value for this ProdutoBandaLarga.
     * 
     * @param modeloPlaca   * Informação do TBS conhecida como Shasta.
     */
    public void setModeloPlaca(java.lang.String modeloPlaca) {
        this.modeloPlaca = modeloPlaca;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProdutoBandaLarga)) return false;
        ProdutoBandaLarga other = (ProdutoBandaLarga) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.designador==null && other.getDesignador()==null) || 
             (this.designador!=null &&
              this.designador.equals(other.getDesignador()))) &&
            ((this.armario==null && other.getArmario()==null) || 
             (this.armario!=null &&
              this.armario.equals(other.getArmario()))) &&
            ((this.rin==null && other.getRin()==null) || 
             (this.rin!=null &&
              this.rin.equals(other.getRin()))) &&
            ((this.porta==null && other.getPorta()==null) || 
             (this.porta!=null &&
              this.porta.equals(other.getPorta()))) &&
            ((this.modeloPlaca==null && other.getModeloPlaca()==null) || 
             (this.modeloPlaca!=null &&
              this.modeloPlaca.equals(other.getModeloPlaca())));
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
        if (getDesignador() != null) {
            _hashCode += getDesignador().hashCode();
        }
        if (getArmario() != null) {
            _hashCode += getArmario().hashCode();
        }
        if (getRin() != null) {
            _hashCode += getRin().hashCode();
        }
        if (getPorta() != null) {
            _hashCode += getPorta().hashCode();
        }
        if (getModeloPlaca() != null) {
            _hashCode += getModeloPlaca().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProdutoBandaLarga.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "ProdutoBandaLarga"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "designador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("armario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "armario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "rin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("porta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "porta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modeloPlaca");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "modeloPlaca"));
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
