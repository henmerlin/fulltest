/**
 * TVInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.services.model.tvInfo;

public class TVInfo  implements java.io.Serializable {
    private java.lang.String designadorTurbonet;

    private java.lang.String instancia;

    private java.lang.String nomeCliente;

    private java.lang.String CEP;

    private java.lang.String rpon;

    private java.lang.String categoriaServico;

    private java.lang.String usuarioPassport;

    private java.lang.String sistemaPassport;

    private int velocidadeDownload;

    private int velocidadeUpload;

    public TVInfo() {
    }

    public TVInfo(
           java.lang.String designadorTurbonet,
           java.lang.String instancia,
           java.lang.String nomeCliente,
           java.lang.String CEP,
           java.lang.String rpon,
           java.lang.String categoriaServico,
           java.lang.String usuarioPassport,
           java.lang.String sistemaPassport,
           int velocidadeDownload,
           int velocidadeUpload) {
           this.designadorTurbonet = designadorTurbonet;
           this.instancia = instancia;
           this.nomeCliente = nomeCliente;
           this.CEP = CEP;
           this.rpon = rpon;
           this.categoriaServico = categoriaServico;
           this.usuarioPassport = usuarioPassport;
           this.sistemaPassport = sistemaPassport;
           this.velocidadeDownload = velocidadeDownload;
           this.velocidadeUpload = velocidadeUpload;
    }


    /**
     * Gets the designadorTurbonet value for this TVInfo.
     * 
     * @return designadorTurbonet
     */
    public java.lang.String getDesignadorTurbonet() {
        return designadorTurbonet;
    }


    /**
     * Sets the designadorTurbonet value for this TVInfo.
     * 
     * @param designadorTurbonet
     */
    public void setDesignadorTurbonet(java.lang.String designadorTurbonet) {
        this.designadorTurbonet = designadorTurbonet;
    }


    /**
     * Gets the instancia value for this TVInfo.
     * 
     * @return instancia
     */
    public java.lang.String getInstancia() {
        return instancia;
    }


    /**
     * Sets the instancia value for this TVInfo.
     * 
     * @param instancia
     */
    public void setInstancia(java.lang.String instancia) {
        this.instancia = instancia;
    }


    /**
     * Gets the nomeCliente value for this TVInfo.
     * 
     * @return nomeCliente
     */
    public java.lang.String getNomeCliente() {
        return nomeCliente;
    }


    /**
     * Sets the nomeCliente value for this TVInfo.
     * 
     * @param nomeCliente
     */
    public void setNomeCliente(java.lang.String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }


    /**
     * Gets the CEP value for this TVInfo.
     * 
     * @return CEP
     */
    public java.lang.String getCEP() {
        return CEP;
    }


    /**
     * Sets the CEP value for this TVInfo.
     * 
     * @param CEP
     */
    public void setCEP(java.lang.String CEP) {
        this.CEP = CEP;
    }


    /**
     * Gets the rpon value for this TVInfo.
     * 
     * @return rpon
     */
    public java.lang.String getRpon() {
        return rpon;
    }


    /**
     * Sets the rpon value for this TVInfo.
     * 
     * @param rpon
     */
    public void setRpon(java.lang.String rpon) {
        this.rpon = rpon;
    }


    /**
     * Gets the categoriaServico value for this TVInfo.
     * 
     * @return categoriaServico
     */
    public java.lang.String getCategoriaServico() {
        return categoriaServico;
    }


    /**
     * Sets the categoriaServico value for this TVInfo.
     * 
     * @param categoriaServico
     */
    public void setCategoriaServico(java.lang.String categoriaServico) {
        this.categoriaServico = categoriaServico;
    }


    /**
     * Gets the usuarioPassport value for this TVInfo.
     * 
     * @return usuarioPassport
     */
    public java.lang.String getUsuarioPassport() {
        return usuarioPassport;
    }


    /**
     * Sets the usuarioPassport value for this TVInfo.
     * 
     * @param usuarioPassport
     */
    public void setUsuarioPassport(java.lang.String usuarioPassport) {
        this.usuarioPassport = usuarioPassport;
    }


    /**
     * Gets the sistemaPassport value for this TVInfo.
     * 
     * @return sistemaPassport
     */
    public java.lang.String getSistemaPassport() {
        return sistemaPassport;
    }


    /**
     * Sets the sistemaPassport value for this TVInfo.
     * 
     * @param sistemaPassport
     */
    public void setSistemaPassport(java.lang.String sistemaPassport) {
        this.sistemaPassport = sistemaPassport;
    }


    /**
     * Gets the velocidadeDownload value for this TVInfo.
     * 
     * @return velocidadeDownload
     */
    public int getVelocidadeDownload() {
        return velocidadeDownload;
    }


    /**
     * Sets the velocidadeDownload value for this TVInfo.
     * 
     * @param velocidadeDownload
     */
    public void setVelocidadeDownload(int velocidadeDownload) {
        this.velocidadeDownload = velocidadeDownload;
    }


    /**
     * Gets the velocidadeUpload value for this TVInfo.
     * 
     * @return velocidadeUpload
     */
    public int getVelocidadeUpload() {
        return velocidadeUpload;
    }


    /**
     * Sets the velocidadeUpload value for this TVInfo.
     * 
     * @param velocidadeUpload
     */
    public void setVelocidadeUpload(int velocidadeUpload) {
        this.velocidadeUpload = velocidadeUpload;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TVInfo)) return false;
        TVInfo other = (TVInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.designadorTurbonet==null && other.getDesignadorTurbonet()==null) || 
             (this.designadorTurbonet!=null &&
              this.designadorTurbonet.equals(other.getDesignadorTurbonet()))) &&
            ((this.instancia==null && other.getInstancia()==null) || 
             (this.instancia!=null &&
              this.instancia.equals(other.getInstancia()))) &&
            ((this.nomeCliente==null && other.getNomeCliente()==null) || 
             (this.nomeCliente!=null &&
              this.nomeCliente.equals(other.getNomeCliente()))) &&
            ((this.CEP==null && other.getCEP()==null) || 
             (this.CEP!=null &&
              this.CEP.equals(other.getCEP()))) &&
            ((this.rpon==null && other.getRpon()==null) || 
             (this.rpon!=null &&
              this.rpon.equals(other.getRpon()))) &&
            ((this.categoriaServico==null && other.getCategoriaServico()==null) || 
             (this.categoriaServico!=null &&
              this.categoriaServico.equals(other.getCategoriaServico()))) &&
            ((this.usuarioPassport==null && other.getUsuarioPassport()==null) || 
             (this.usuarioPassport!=null &&
              this.usuarioPassport.equals(other.getUsuarioPassport()))) &&
            ((this.sistemaPassport==null && other.getSistemaPassport()==null) || 
             (this.sistemaPassport!=null &&
              this.sistemaPassport.equals(other.getSistemaPassport()))) &&
            this.velocidadeDownload == other.getVelocidadeDownload() &&
            this.velocidadeUpload == other.getVelocidadeUpload();
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
        if (getDesignadorTurbonet() != null) {
            _hashCode += getDesignadorTurbonet().hashCode();
        }
        if (getInstancia() != null) {
            _hashCode += getInstancia().hashCode();
        }
        if (getNomeCliente() != null) {
            _hashCode += getNomeCliente().hashCode();
        }
        if (getCEP() != null) {
            _hashCode += getCEP().hashCode();
        }
        if (getRpon() != null) {
            _hashCode += getRpon().hashCode();
        }
        if (getCategoriaServico() != null) {
            _hashCode += getCategoriaServico().hashCode();
        }
        if (getUsuarioPassport() != null) {
            _hashCode += getUsuarioPassport().hashCode();
        }
        if (getSistemaPassport() != null) {
            _hashCode += getSistemaPassport().hashCode();
        }
        _hashCode += getVelocidadeDownload();
        _hashCode += getVelocidadeUpload();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TVInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/tvInfo", "TVInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorTurbonet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/tvInfo", "designadorTurbonet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instancia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/tvInfo", "instancia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/tvInfo", "nomeCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CEP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/tvInfo", "CEP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rpon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/tvInfo", "rpon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoriaServico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/tvInfo", "categoriaServico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuarioPassport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/tvInfo", "usuarioPassport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sistemaPassport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/tvInfo", "sistemaPassport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("velocidadeDownload");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/tvInfo", "velocidadeDownload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("velocidadeUpload");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/tvInfo", "velocidadeUpload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
