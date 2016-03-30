/**
 * ConfigurarServicoIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.services.configurarServico;

public class ConfigurarServicoIn  implements java.io.Serializable {
    private java.lang.String sistemaOrigem;

    private com.gvt.www.services.model.ordemServico.OrdemServico infoOrdem;

    private com.gvt.www.services.model.acesso.Acesso acesso;

    public ConfigurarServicoIn() {
    }

    public ConfigurarServicoIn(
           java.lang.String sistemaOrigem,
           com.gvt.www.services.model.ordemServico.OrdemServico infoOrdem,
           com.gvt.www.services.model.acesso.Acesso acesso) {
           this.sistemaOrigem = sistemaOrigem;
           this.infoOrdem = infoOrdem;
           this.acesso = acesso;
    }


    /**
     * Gets the sistemaOrigem value for this ConfigurarServicoIn.
     * 
     * @return sistemaOrigem
     */
    public java.lang.String getSistemaOrigem() {
        return sistemaOrigem;
    }


    /**
     * Sets the sistemaOrigem value for this ConfigurarServicoIn.
     * 
     * @param sistemaOrigem
     */
    public void setSistemaOrigem(java.lang.String sistemaOrigem) {
        this.sistemaOrigem = sistemaOrigem;
    }


    /**
     * Gets the infoOrdem value for this ConfigurarServicoIn.
     * 
     * @return infoOrdem
     */
    public com.gvt.www.services.model.ordemServico.OrdemServico getInfoOrdem() {
        return infoOrdem;
    }


    /**
     * Sets the infoOrdem value for this ConfigurarServicoIn.
     * 
     * @param infoOrdem
     */
    public void setInfoOrdem(com.gvt.www.services.model.ordemServico.OrdemServico infoOrdem) {
        this.infoOrdem = infoOrdem;
    }


    /**
     * Gets the acesso value for this ConfigurarServicoIn.
     * 
     * @return acesso
     */
    public com.gvt.www.services.model.acesso.Acesso getAcesso() {
        return acesso;
    }


    /**
     * Sets the acesso value for this ConfigurarServicoIn.
     * 
     * @param acesso
     */
    public void setAcesso(com.gvt.www.services.model.acesso.Acesso acesso) {
        this.acesso = acesso;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfigurarServicoIn)) return false;
        ConfigurarServicoIn other = (ConfigurarServicoIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sistemaOrigem==null && other.getSistemaOrigem()==null) || 
             (this.sistemaOrigem!=null &&
              this.sistemaOrigem.equals(other.getSistemaOrigem()))) &&
            ((this.infoOrdem==null && other.getInfoOrdem()==null) || 
             (this.infoOrdem!=null &&
              this.infoOrdem.equals(other.getInfoOrdem()))) &&
            ((this.acesso==null && other.getAcesso()==null) || 
             (this.acesso!=null &&
              this.acesso.equals(other.getAcesso())));
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
        if (getSistemaOrigem() != null) {
            _hashCode += getSistemaOrigem().hashCode();
        }
        if (getInfoOrdem() != null) {
            _hashCode += getInfoOrdem().hashCode();
        }
        if (getAcesso() != null) {
            _hashCode += getAcesso().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfigurarServicoIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/configurarServico", "ConfigurarServicoIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sistemaOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/configurarServico", "sistemaOrigem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoOrdem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/configurarServico", "infoOrdem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/ordemServico", "OrdemServico"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acesso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/configurarServico", "acesso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/acesso", "Acesso"));
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
