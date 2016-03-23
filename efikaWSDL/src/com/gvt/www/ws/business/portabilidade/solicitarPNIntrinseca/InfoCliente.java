/**
 * InfoCliente.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca;

public class InfoCliente  implements java.io.Serializable {
    private java.lang.String nome;

    private java.lang.String cpf;

    private java.lang.String cnpj;

    public InfoCliente() {
    }

    public InfoCliente(
           java.lang.String nome,
           java.lang.String cpf,
           java.lang.String cnpj) {
           this.nome = nome;
           this.cpf = cpf;
           this.cnpj = cnpj;
    }


    /**
     * Gets the nome value for this InfoCliente.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this InfoCliente.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the cpf value for this InfoCliente.
     * 
     * @return cpf
     */
    public java.lang.String getCpf() {
        return cpf;
    }


    /**
     * Sets the cpf value for this InfoCliente.
     * 
     * @param cpf
     */
    public void setCpf(java.lang.String cpf) {
        this.cpf = cpf;
    }


    /**
     * Gets the cnpj value for this InfoCliente.
     * 
     * @return cnpj
     */
    public java.lang.String getCnpj() {
        return cnpj;
    }


    /**
     * Sets the cnpj value for this InfoCliente.
     * 
     * @param cnpj
     */
    public void setCnpj(java.lang.String cnpj) {
        this.cnpj = cnpj;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InfoCliente)) return false;
        InfoCliente other = (InfoCliente) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.cpf==null && other.getCpf()==null) || 
             (this.cpf!=null &&
              this.cpf.equals(other.getCpf()))) &&
            ((this.cnpj==null && other.getCnpj()==null) || 
             (this.cnpj!=null &&
              this.cnpj.equals(other.getCnpj())));
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
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getCpf() != null) {
            _hashCode += getCpf().hashCode();
        }
        if (getCnpj() != null) {
            _hashCode += getCnpj().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InfoCliente.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca", "InfoCliente"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca", "cpf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cnpj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca", "cnpj"));
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
