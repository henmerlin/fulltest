/**
 * ConcluirMudancaEnderecoIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.concluirMudancaEndereco;

public class ConcluirMudancaEnderecoIn  implements java.io.Serializable {
    private com.gvt.www.metaData.security.Passport passport;

    private java.lang.String cnlNovo;

    private com.gvt.www.ws.business.portabilidade.concluirMudancaEndereco.Numero_rpon_list[] numeros;

    private java.lang.Boolean produtoRI;

    private java.lang.Boolean oneNumber;

    private java.lang.Boolean rn2Modified;

    public ConcluirMudancaEnderecoIn() {
    }

    public ConcluirMudancaEnderecoIn(
           com.gvt.www.metaData.security.Passport passport,
           java.lang.String cnlNovo,
           com.gvt.www.ws.business.portabilidade.concluirMudancaEndereco.Numero_rpon_list[] numeros,
           java.lang.Boolean produtoRI,
           java.lang.Boolean oneNumber,
           java.lang.Boolean rn2Modified) {
           this.passport = passport;
           this.cnlNovo = cnlNovo;
           this.numeros = numeros;
           this.produtoRI = produtoRI;
           this.oneNumber = oneNumber;
           this.rn2Modified = rn2Modified;
    }


    /**
     * Gets the passport value for this ConcluirMudancaEnderecoIn.
     * 
     * @return passport
     */
    public com.gvt.www.metaData.security.Passport getPassport() {
        return passport;
    }


    /**
     * Sets the passport value for this ConcluirMudancaEnderecoIn.
     * 
     * @param passport
     */
    public void setPassport(com.gvt.www.metaData.security.Passport passport) {
        this.passport = passport;
    }


    /**
     * Gets the cnlNovo value for this ConcluirMudancaEnderecoIn.
     * 
     * @return cnlNovo
     */
    public java.lang.String getCnlNovo() {
        return cnlNovo;
    }


    /**
     * Sets the cnlNovo value for this ConcluirMudancaEnderecoIn.
     * 
     * @param cnlNovo
     */
    public void setCnlNovo(java.lang.String cnlNovo) {
        this.cnlNovo = cnlNovo;
    }


    /**
     * Gets the numeros value for this ConcluirMudancaEnderecoIn.
     * 
     * @return numeros
     */
    public com.gvt.www.ws.business.portabilidade.concluirMudancaEndereco.Numero_rpon_list[] getNumeros() {
        return numeros;
    }


    /**
     * Sets the numeros value for this ConcluirMudancaEnderecoIn.
     * 
     * @param numeros
     */
    public void setNumeros(com.gvt.www.ws.business.portabilidade.concluirMudancaEndereco.Numero_rpon_list[] numeros) {
        this.numeros = numeros;
    }

    public com.gvt.www.ws.business.portabilidade.concluirMudancaEndereco.Numero_rpon_list getNumeros(int i) {
        return this.numeros[i];
    }

    public void setNumeros(int i, com.gvt.www.ws.business.portabilidade.concluirMudancaEndereco.Numero_rpon_list _value) {
        this.numeros[i] = _value;
    }


    /**
     * Gets the produtoRI value for this ConcluirMudancaEnderecoIn.
     * 
     * @return produtoRI
     */
    public java.lang.Boolean getProdutoRI() {
        return produtoRI;
    }


    /**
     * Sets the produtoRI value for this ConcluirMudancaEnderecoIn.
     * 
     * @param produtoRI
     */
    public void setProdutoRI(java.lang.Boolean produtoRI) {
        this.produtoRI = produtoRI;
    }


    /**
     * Gets the oneNumber value for this ConcluirMudancaEnderecoIn.
     * 
     * @return oneNumber
     */
    public java.lang.Boolean getOneNumber() {
        return oneNumber;
    }


    /**
     * Sets the oneNumber value for this ConcluirMudancaEnderecoIn.
     * 
     * @param oneNumber
     */
    public void setOneNumber(java.lang.Boolean oneNumber) {
        this.oneNumber = oneNumber;
    }


    /**
     * Gets the rn2Modified value for this ConcluirMudancaEnderecoIn.
     * 
     * @return rn2Modified
     */
    public java.lang.Boolean getRn2Modified() {
        return rn2Modified;
    }


    /**
     * Sets the rn2Modified value for this ConcluirMudancaEnderecoIn.
     * 
     * @param rn2Modified
     */
    public void setRn2Modified(java.lang.Boolean rn2Modified) {
        this.rn2Modified = rn2Modified;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConcluirMudancaEnderecoIn)) return false;
        ConcluirMudancaEnderecoIn other = (ConcluirMudancaEnderecoIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.passport==null && other.getPassport()==null) || 
             (this.passport!=null &&
              this.passport.equals(other.getPassport()))) &&
            ((this.cnlNovo==null && other.getCnlNovo()==null) || 
             (this.cnlNovo!=null &&
              this.cnlNovo.equals(other.getCnlNovo()))) &&
            ((this.numeros==null && other.getNumeros()==null) || 
             (this.numeros!=null &&
              java.util.Arrays.equals(this.numeros, other.getNumeros()))) &&
            ((this.produtoRI==null && other.getProdutoRI()==null) || 
             (this.produtoRI!=null &&
              this.produtoRI.equals(other.getProdutoRI()))) &&
            ((this.oneNumber==null && other.getOneNumber()==null) || 
             (this.oneNumber!=null &&
              this.oneNumber.equals(other.getOneNumber()))) &&
            ((this.rn2Modified==null && other.getRn2Modified()==null) || 
             (this.rn2Modified!=null &&
              this.rn2Modified.equals(other.getRn2Modified())));
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
        if (getPassport() != null) {
            _hashCode += getPassport().hashCode();
        }
        if (getCnlNovo() != null) {
            _hashCode += getCnlNovo().hashCode();
        }
        if (getNumeros() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNumeros());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNumeros(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProdutoRI() != null) {
            _hashCode += getProdutoRI().hashCode();
        }
        if (getOneNumber() != null) {
            _hashCode += getOneNumber().hashCode();
        }
        if (getRn2Modified() != null) {
            _hashCode += getRn2Modified().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConcluirMudancaEnderecoIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/concluirMudancaEndereco", "concluirMudancaEnderecoIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/concluirMudancaEndereco", "passport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/security", "Passport"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cnlNovo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/concluirMudancaEndereco", "cnlNovo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeros");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/concluirMudancaEndereco", "numeros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/concluirMudancaEndereco", "numero_rpon_list"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("produtoRI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/concluirMudancaEndereco", "produtoRI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/concluirMudancaEndereco", "oneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rn2Modified");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/concluirMudancaEndereco", "rn2Modified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
