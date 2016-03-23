/**
 * Numero.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.inserirNP;

public class Numero  implements java.io.Serializable {
    /* Array de números de telefone.
     * Vários números podem ser inseridos numa única chamada, porém sempre
     * para o mesmo CNL, SWITCH,PRODUTO e OPERADORA */
    private java.lang.String[] telefone;

    /* ex. CTA */
    private java.lang.String siglaCNL;

    /* Obrigatório se o produto for Retail */
    private java.lang.String _switch;

    private java.math.BigInteger idTipoProduto;

    /* ex: 25, 14, 21, 23 */
    private java.lang.String codOperadora;

    public Numero() {
    }

    public Numero(
           java.lang.String[] telefone,
           java.lang.String siglaCNL,
           java.lang.String _switch,
           java.math.BigInteger idTipoProduto,
           java.lang.String codOperadora) {
           this.telefone = telefone;
           this.siglaCNL = siglaCNL;
           this._switch = _switch;
           this.idTipoProduto = idTipoProduto;
           this.codOperadora = codOperadora;
    }


    /**
     * Gets the telefone value for this Numero.
     * 
     * @return telefone   * Array de números de telefone.
     * Vários números podem ser inseridos numa única chamada, porém sempre
     * para o mesmo CNL, SWITCH,PRODUTO e OPERADORA
     */
    public java.lang.String[] getTelefone() {
        return telefone;
    }


    /**
     * Sets the telefone value for this Numero.
     * 
     * @param telefone   * Array de números de telefone.
     * Vários números podem ser inseridos numa única chamada, porém sempre
     * para o mesmo CNL, SWITCH,PRODUTO e OPERADORA
     */
    public void setTelefone(java.lang.String[] telefone) {
        this.telefone = telefone;
    }

    public java.lang.String getTelefone(int i) {
        return this.telefone[i];
    }

    public void setTelefone(int i, java.lang.String _value) {
        this.telefone[i] = _value;
    }


    /**
     * Gets the siglaCNL value for this Numero.
     * 
     * @return siglaCNL   * ex. CTA
     */
    public java.lang.String getSiglaCNL() {
        return siglaCNL;
    }


    /**
     * Sets the siglaCNL value for this Numero.
     * 
     * @param siglaCNL   * ex. CTA
     */
    public void setSiglaCNL(java.lang.String siglaCNL) {
        this.siglaCNL = siglaCNL;
    }


    /**
     * Gets the _switch value for this Numero.
     * 
     * @return _switch   * Obrigatório se o produto for Retail
     */
    public java.lang.String get_switch() {
        return _switch;
    }


    /**
     * Sets the _switch value for this Numero.
     * 
     * @param _switch   * Obrigatório se o produto for Retail
     */
    public void set_switch(java.lang.String _switch) {
        this._switch = _switch;
    }


    /**
     * Gets the idTipoProduto value for this Numero.
     * 
     * @return idTipoProduto
     */
    public java.math.BigInteger getIdTipoProduto() {
        return idTipoProduto;
    }


    /**
     * Sets the idTipoProduto value for this Numero.
     * 
     * @param idTipoProduto
     */
    public void setIdTipoProduto(java.math.BigInteger idTipoProduto) {
        this.idTipoProduto = idTipoProduto;
    }


    /**
     * Gets the codOperadora value for this Numero.
     * 
     * @return codOperadora   * ex: 25, 14, 21, 23
     */
    public java.lang.String getCodOperadora() {
        return codOperadora;
    }


    /**
     * Sets the codOperadora value for this Numero.
     * 
     * @param codOperadora   * ex: 25, 14, 21, 23
     */
    public void setCodOperadora(java.lang.String codOperadora) {
        this.codOperadora = codOperadora;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Numero)) return false;
        Numero other = (Numero) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.telefone==null && other.getTelefone()==null) || 
             (this.telefone!=null &&
              java.util.Arrays.equals(this.telefone, other.getTelefone()))) &&
            ((this.siglaCNL==null && other.getSiglaCNL()==null) || 
             (this.siglaCNL!=null &&
              this.siglaCNL.equals(other.getSiglaCNL()))) &&
            ((this._switch==null && other.get_switch()==null) || 
             (this._switch!=null &&
              this._switch.equals(other.get_switch()))) &&
            ((this.idTipoProduto==null && other.getIdTipoProduto()==null) || 
             (this.idTipoProduto!=null &&
              this.idTipoProduto.equals(other.getIdTipoProduto()))) &&
            ((this.codOperadora==null && other.getCodOperadora()==null) || 
             (this.codOperadora!=null &&
              this.codOperadora.equals(other.getCodOperadora())));
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
        if (getTelefone() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTelefone());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTelefone(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSiglaCNL() != null) {
            _hashCode += getSiglaCNL().hashCode();
        }
        if (get_switch() != null) {
            _hashCode += get_switch().hashCode();
        }
        if (getIdTipoProduto() != null) {
            _hashCode += getIdTipoProduto().hashCode();
        }
        if (getCodOperadora() != null) {
            _hashCode += getCodOperadora().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Numero.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/inserirNP", "Numero"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/inserirNP", "telefone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siglaCNL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/inserirNP", "siglaCNL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_switch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/inserirNP", "switch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idTipoProduto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/inserirNP", "idTipoProduto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codOperadora");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/inserirNP", "codOperadora"));
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
