/**
 * ADSLInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.services.model.adslInfo;

public class ADSLInfo  implements java.io.Serializable {
    private java.lang.String instancia;

    private java.lang.String cidade;

    private java.lang.String estado;

    private java.lang.String central;

    private java.lang.String armario;

    private java.lang.String shasta;

    private java.lang.String rin;

    private java.lang.String porta;

    private boolean processarElementosInventario;

    private boolean configurarRadiusChangeVelocity;

    private java.lang.String designadorTV;

    public ADSLInfo() {
    }

    public ADSLInfo(
           java.lang.String instancia,
           java.lang.String cidade,
           java.lang.String estado,
           java.lang.String central,
           java.lang.String armario,
           java.lang.String shasta,
           java.lang.String rin,
           java.lang.String porta,
           boolean processarElementosInventario,
           boolean configurarRadiusChangeVelocity,
           java.lang.String designadorTV) {
           this.instancia = instancia;
           this.cidade = cidade;
           this.estado = estado;
           this.central = central;
           this.armario = armario;
           this.shasta = shasta;
           this.rin = rin;
           this.porta = porta;
           this.processarElementosInventario = processarElementosInventario;
           this.configurarRadiusChangeVelocity = configurarRadiusChangeVelocity;
           this.designadorTV = designadorTV;
    }


    /**
     * Gets the instancia value for this ADSLInfo.
     * 
     * @return instancia
     */
    public java.lang.String getInstancia() {
        return instancia;
    }


    /**
     * Sets the instancia value for this ADSLInfo.
     * 
     * @param instancia
     */
    public void setInstancia(java.lang.String instancia) {
        this.instancia = instancia;
    }


    /**
     * Gets the cidade value for this ADSLInfo.
     * 
     * @return cidade
     */
    public java.lang.String getCidade() {
        return cidade;
    }


    /**
     * Sets the cidade value for this ADSLInfo.
     * 
     * @param cidade
     */
    public void setCidade(java.lang.String cidade) {
        this.cidade = cidade;
    }


    /**
     * Gets the estado value for this ADSLInfo.
     * 
     * @return estado
     */
    public java.lang.String getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this ADSLInfo.
     * 
     * @param estado
     */
    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }


    /**
     * Gets the central value for this ADSLInfo.
     * 
     * @return central
     */
    public java.lang.String getCentral() {
        return central;
    }


    /**
     * Sets the central value for this ADSLInfo.
     * 
     * @param central
     */
    public void setCentral(java.lang.String central) {
        this.central = central;
    }


    /**
     * Gets the armario value for this ADSLInfo.
     * 
     * @return armario
     */
    public java.lang.String getArmario() {
        return armario;
    }


    /**
     * Sets the armario value for this ADSLInfo.
     * 
     * @param armario
     */
    public void setArmario(java.lang.String armario) {
        this.armario = armario;
    }


    /**
     * Gets the shasta value for this ADSLInfo.
     * 
     * @return shasta
     */
    public java.lang.String getShasta() {
        return shasta;
    }


    /**
     * Sets the shasta value for this ADSLInfo.
     * 
     * @param shasta
     */
    public void setShasta(java.lang.String shasta) {
        this.shasta = shasta;
    }


    /**
     * Gets the rin value for this ADSLInfo.
     * 
     * @return rin
     */
    public java.lang.String getRin() {
        return rin;
    }


    /**
     * Sets the rin value for this ADSLInfo.
     * 
     * @param rin
     */
    public void setRin(java.lang.String rin) {
        this.rin = rin;
    }


    /**
     * Gets the porta value for this ADSLInfo.
     * 
     * @return porta
     */
    public java.lang.String getPorta() {
        return porta;
    }


    /**
     * Sets the porta value for this ADSLInfo.
     * 
     * @param porta
     */
    public void setPorta(java.lang.String porta) {
        this.porta = porta;
    }


    /**
     * Gets the processarElementosInventario value for this ADSLInfo.
     * 
     * @return processarElementosInventario
     */
    public boolean isProcessarElementosInventario() {
        return processarElementosInventario;
    }


    /**
     * Sets the processarElementosInventario value for this ADSLInfo.
     * 
     * @param processarElementosInventario
     */
    public void setProcessarElementosInventario(boolean processarElementosInventario) {
        this.processarElementosInventario = processarElementosInventario;
    }


    /**
     * Gets the configurarRadiusChangeVelocity value for this ADSLInfo.
     * 
     * @return configurarRadiusChangeVelocity
     */
    public boolean isConfigurarRadiusChangeVelocity() {
        return configurarRadiusChangeVelocity;
    }


    /**
     * Sets the configurarRadiusChangeVelocity value for this ADSLInfo.
     * 
     * @param configurarRadiusChangeVelocity
     */
    public void setConfigurarRadiusChangeVelocity(boolean configurarRadiusChangeVelocity) {
        this.configurarRadiusChangeVelocity = configurarRadiusChangeVelocity;
    }


    /**
     * Gets the designadorTV value for this ADSLInfo.
     * 
     * @return designadorTV
     */
    public java.lang.String getDesignadorTV() {
        return designadorTV;
    }


    /**
     * Sets the designadorTV value for this ADSLInfo.
     * 
     * @param designadorTV
     */
    public void setDesignadorTV(java.lang.String designadorTV) {
        this.designadorTV = designadorTV;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ADSLInfo)) return false;
        ADSLInfo other = (ADSLInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.instancia==null && other.getInstancia()==null) || 
             (this.instancia!=null &&
              this.instancia.equals(other.getInstancia()))) &&
            ((this.cidade==null && other.getCidade()==null) || 
             (this.cidade!=null &&
              this.cidade.equals(other.getCidade()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.central==null && other.getCentral()==null) || 
             (this.central!=null &&
              this.central.equals(other.getCentral()))) &&
            ((this.armario==null && other.getArmario()==null) || 
             (this.armario!=null &&
              this.armario.equals(other.getArmario()))) &&
            ((this.shasta==null && other.getShasta()==null) || 
             (this.shasta!=null &&
              this.shasta.equals(other.getShasta()))) &&
            ((this.rin==null && other.getRin()==null) || 
             (this.rin!=null &&
              this.rin.equals(other.getRin()))) &&
            ((this.porta==null && other.getPorta()==null) || 
             (this.porta!=null &&
              this.porta.equals(other.getPorta()))) &&
            this.processarElementosInventario == other.isProcessarElementosInventario() &&
            this.configurarRadiusChangeVelocity == other.isConfigurarRadiusChangeVelocity() &&
            ((this.designadorTV==null && other.getDesignadorTV()==null) || 
             (this.designadorTV!=null &&
              this.designadorTV.equals(other.getDesignadorTV())));
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
        if (getInstancia() != null) {
            _hashCode += getInstancia().hashCode();
        }
        if (getCidade() != null) {
            _hashCode += getCidade().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getCentral() != null) {
            _hashCode += getCentral().hashCode();
        }
        if (getArmario() != null) {
            _hashCode += getArmario().hashCode();
        }
        if (getShasta() != null) {
            _hashCode += getShasta().hashCode();
        }
        if (getRin() != null) {
            _hashCode += getRin().hashCode();
        }
        if (getPorta() != null) {
            _hashCode += getPorta().hashCode();
        }
        _hashCode += (isProcessarElementosInventario() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isConfigurarRadiusChangeVelocity() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDesignadorTV() != null) {
            _hashCode += getDesignadorTV().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ADSLInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/adslInfo", "ADSLInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instancia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/adslInfo", "instancia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/adslInfo", "cidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/adslInfo", "estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("central");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/adslInfo", "central"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("armario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/adslInfo", "armario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shasta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/adslInfo", "shasta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/adslInfo", "rin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("porta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/adslInfo", "porta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processarElementosInventario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/adslInfo", "processarElementosInventario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configurarRadiusChangeVelocity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/adslInfo", "configurarRadiusChangeVelocity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorTV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/adslInfo", "designadorTV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
