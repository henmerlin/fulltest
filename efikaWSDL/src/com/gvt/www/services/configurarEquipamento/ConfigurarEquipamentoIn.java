/**
 * ConfigurarEquipamentoIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.services.configurarEquipamento;

public class ConfigurarEquipamentoIn  implements java.io.Serializable {
    private java.lang.String acesso;

    private com.gvt.www.services.model.ordemServico.OrdemServico infoOrdem;

    private com.gvt.www.services.model.origem.Origem origem;

    private java.lang.String cidade;

    private com.gvt.www.services.model.trocaAcesso.TrocaAcesso trocaAcesso;

    private com.gvt.www.services.model.recursoLogico.RecursoLogicoWS[] recursoLogico;

    public ConfigurarEquipamentoIn() {
    }

    public ConfigurarEquipamentoIn(
           java.lang.String acesso,
           com.gvt.www.services.model.ordemServico.OrdemServico infoOrdem,
           com.gvt.www.services.model.origem.Origem origem,
           java.lang.String cidade,
           com.gvt.www.services.model.trocaAcesso.TrocaAcesso trocaAcesso,
           com.gvt.www.services.model.recursoLogico.RecursoLogicoWS[] recursoLogico) {
           this.acesso = acesso;
           this.infoOrdem = infoOrdem;
           this.origem = origem;
           this.cidade = cidade;
           this.trocaAcesso = trocaAcesso;
           this.recursoLogico = recursoLogico;
    }


    /**
     * Gets the acesso value for this ConfigurarEquipamentoIn.
     * 
     * @return acesso
     */
    public java.lang.String getAcesso() {
        return acesso;
    }


    /**
     * Sets the acesso value for this ConfigurarEquipamentoIn.
     * 
     * @param acesso
     */
    public void setAcesso(java.lang.String acesso) {
        this.acesso = acesso;
    }


    /**
     * Gets the infoOrdem value for this ConfigurarEquipamentoIn.
     * 
     * @return infoOrdem
     */
    public com.gvt.www.services.model.ordemServico.OrdemServico getInfoOrdem() {
        return infoOrdem;
    }


    /**
     * Sets the infoOrdem value for this ConfigurarEquipamentoIn.
     * 
     * @param infoOrdem
     */
    public void setInfoOrdem(com.gvt.www.services.model.ordemServico.OrdemServico infoOrdem) {
        this.infoOrdem = infoOrdem;
    }


    /**
     * Gets the origem value for this ConfigurarEquipamentoIn.
     * 
     * @return origem
     */
    public com.gvt.www.services.model.origem.Origem getOrigem() {
        return origem;
    }


    /**
     * Sets the origem value for this ConfigurarEquipamentoIn.
     * 
     * @param origem
     */
    public void setOrigem(com.gvt.www.services.model.origem.Origem origem) {
        this.origem = origem;
    }


    /**
     * Gets the cidade value for this ConfigurarEquipamentoIn.
     * 
     * @return cidade
     */
    public java.lang.String getCidade() {
        return cidade;
    }


    /**
     * Sets the cidade value for this ConfigurarEquipamentoIn.
     * 
     * @param cidade
     */
    public void setCidade(java.lang.String cidade) {
        this.cidade = cidade;
    }


    /**
     * Gets the trocaAcesso value for this ConfigurarEquipamentoIn.
     * 
     * @return trocaAcesso
     */
    public com.gvt.www.services.model.trocaAcesso.TrocaAcesso getTrocaAcesso() {
        return trocaAcesso;
    }


    /**
     * Sets the trocaAcesso value for this ConfigurarEquipamentoIn.
     * 
     * @param trocaAcesso
     */
    public void setTrocaAcesso(com.gvt.www.services.model.trocaAcesso.TrocaAcesso trocaAcesso) {
        this.trocaAcesso = trocaAcesso;
    }


    /**
     * Gets the recursoLogico value for this ConfigurarEquipamentoIn.
     * 
     * @return recursoLogico
     */
    public com.gvt.www.services.model.recursoLogico.RecursoLogicoWS[] getRecursoLogico() {
        return recursoLogico;
    }


    /**
     * Sets the recursoLogico value for this ConfigurarEquipamentoIn.
     * 
     * @param recursoLogico
     */
    public void setRecursoLogico(com.gvt.www.services.model.recursoLogico.RecursoLogicoWS[] recursoLogico) {
        this.recursoLogico = recursoLogico;
    }

    public com.gvt.www.services.model.recursoLogico.RecursoLogicoWS getRecursoLogico(int i) {
        return this.recursoLogico[i];
    }

    public void setRecursoLogico(int i, com.gvt.www.services.model.recursoLogico.RecursoLogicoWS _value) {
        this.recursoLogico[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfigurarEquipamentoIn)) return false;
        ConfigurarEquipamentoIn other = (ConfigurarEquipamentoIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acesso==null && other.getAcesso()==null) || 
             (this.acesso!=null &&
              this.acesso.equals(other.getAcesso()))) &&
            ((this.infoOrdem==null && other.getInfoOrdem()==null) || 
             (this.infoOrdem!=null &&
              this.infoOrdem.equals(other.getInfoOrdem()))) &&
            ((this.origem==null && other.getOrigem()==null) || 
             (this.origem!=null &&
              this.origem.equals(other.getOrigem()))) &&
            ((this.cidade==null && other.getCidade()==null) || 
             (this.cidade!=null &&
              this.cidade.equals(other.getCidade()))) &&
            ((this.trocaAcesso==null && other.getTrocaAcesso()==null) || 
             (this.trocaAcesso!=null &&
              this.trocaAcesso.equals(other.getTrocaAcesso()))) &&
            ((this.recursoLogico==null && other.getRecursoLogico()==null) || 
             (this.recursoLogico!=null &&
              java.util.Arrays.equals(this.recursoLogico, other.getRecursoLogico())));
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
        if (getAcesso() != null) {
            _hashCode += getAcesso().hashCode();
        }
        if (getInfoOrdem() != null) {
            _hashCode += getInfoOrdem().hashCode();
        }
        if (getOrigem() != null) {
            _hashCode += getOrigem().hashCode();
        }
        if (getCidade() != null) {
            _hashCode += getCidade().hashCode();
        }
        if (getTrocaAcesso() != null) {
            _hashCode += getTrocaAcesso().hashCode();
        }
        if (getRecursoLogico() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecursoLogico());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecursoLogico(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfigurarEquipamentoIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/configurarEquipamento", "ConfigurarEquipamentoIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acesso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/configurarEquipamento", "acesso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoOrdem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/configurarEquipamento", "infoOrdem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/ordemServico", "OrdemServico"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/configurarEquipamento", "origem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/origem", "Origem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/configurarEquipamento", "cidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trocaAcesso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/configurarEquipamento", "trocaAcesso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/trocaAcesso", "TrocaAcesso"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recursoLogico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/configurarEquipamento", "recursoLogico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/recursoLogico", "RecursoLogicoWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
