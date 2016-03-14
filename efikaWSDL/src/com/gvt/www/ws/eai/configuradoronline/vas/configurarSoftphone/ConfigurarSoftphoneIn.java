/**
 * ConfigurarSoftphoneIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.vas.configurarSoftphone;

public class ConfigurarSoftphoneIn  implements java.io.Serializable {
    private java.lang.String numeroTelefone;

    private java.lang.String numeroEquipamento;

    private java.lang.String routeRN2;

    private java.lang.String clliCode;

    private java.lang.String cidade;

    private java.lang.String estado;

    private java.lang.String miscInfo;

    private java.lang.String tecnologia;

    private java.lang.String adslCabinet;

    private java.lang.String activityCD;

    public ConfigurarSoftphoneIn() {
    }

    public ConfigurarSoftphoneIn(
           java.lang.String numeroTelefone,
           java.lang.String numeroEquipamento,
           java.lang.String routeRN2,
           java.lang.String clliCode,
           java.lang.String cidade,
           java.lang.String estado,
           java.lang.String miscInfo,
           java.lang.String tecnologia,
           java.lang.String adslCabinet,
           java.lang.String activityCD) {
           this.numeroTelefone = numeroTelefone;
           this.numeroEquipamento = numeroEquipamento;
           this.routeRN2 = routeRN2;
           this.clliCode = clliCode;
           this.cidade = cidade;
           this.estado = estado;
           this.miscInfo = miscInfo;
           this.tecnologia = tecnologia;
           this.adslCabinet = adslCabinet;
           this.activityCD = activityCD;
    }


    /**
     * Gets the numeroTelefone value for this ConfigurarSoftphoneIn.
     * 
     * @return numeroTelefone
     */
    public java.lang.String getNumeroTelefone() {
        return numeroTelefone;
    }


    /**
     * Sets the numeroTelefone value for this ConfigurarSoftphoneIn.
     * 
     * @param numeroTelefone
     */
    public void setNumeroTelefone(java.lang.String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }


    /**
     * Gets the numeroEquipamento value for this ConfigurarSoftphoneIn.
     * 
     * @return numeroEquipamento
     */
    public java.lang.String getNumeroEquipamento() {
        return numeroEquipamento;
    }


    /**
     * Sets the numeroEquipamento value for this ConfigurarSoftphoneIn.
     * 
     * @param numeroEquipamento
     */
    public void setNumeroEquipamento(java.lang.String numeroEquipamento) {
        this.numeroEquipamento = numeroEquipamento;
    }


    /**
     * Gets the routeRN2 value for this ConfigurarSoftphoneIn.
     * 
     * @return routeRN2
     */
    public java.lang.String getRouteRN2() {
        return routeRN2;
    }


    /**
     * Sets the routeRN2 value for this ConfigurarSoftphoneIn.
     * 
     * @param routeRN2
     */
    public void setRouteRN2(java.lang.String routeRN2) {
        this.routeRN2 = routeRN2;
    }


    /**
     * Gets the clliCode value for this ConfigurarSoftphoneIn.
     * 
     * @return clliCode
     */
    public java.lang.String getClliCode() {
        return clliCode;
    }


    /**
     * Sets the clliCode value for this ConfigurarSoftphoneIn.
     * 
     * @param clliCode
     */
    public void setClliCode(java.lang.String clliCode) {
        this.clliCode = clliCode;
    }


    /**
     * Gets the cidade value for this ConfigurarSoftphoneIn.
     * 
     * @return cidade
     */
    public java.lang.String getCidade() {
        return cidade;
    }


    /**
     * Sets the cidade value for this ConfigurarSoftphoneIn.
     * 
     * @param cidade
     */
    public void setCidade(java.lang.String cidade) {
        this.cidade = cidade;
    }


    /**
     * Gets the estado value for this ConfigurarSoftphoneIn.
     * 
     * @return estado
     */
    public java.lang.String getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this ConfigurarSoftphoneIn.
     * 
     * @param estado
     */
    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }


    /**
     * Gets the miscInfo value for this ConfigurarSoftphoneIn.
     * 
     * @return miscInfo
     */
    public java.lang.String getMiscInfo() {
        return miscInfo;
    }


    /**
     * Sets the miscInfo value for this ConfigurarSoftphoneIn.
     * 
     * @param miscInfo
     */
    public void setMiscInfo(java.lang.String miscInfo) {
        this.miscInfo = miscInfo;
    }


    /**
     * Gets the tecnologia value for this ConfigurarSoftphoneIn.
     * 
     * @return tecnologia
     */
    public java.lang.String getTecnologia() {
        return tecnologia;
    }


    /**
     * Sets the tecnologia value for this ConfigurarSoftphoneIn.
     * 
     * @param tecnologia
     */
    public void setTecnologia(java.lang.String tecnologia) {
        this.tecnologia = tecnologia;
    }


    /**
     * Gets the adslCabinet value for this ConfigurarSoftphoneIn.
     * 
     * @return adslCabinet
     */
    public java.lang.String getAdslCabinet() {
        return adslCabinet;
    }


    /**
     * Sets the adslCabinet value for this ConfigurarSoftphoneIn.
     * 
     * @param adslCabinet
     */
    public void setAdslCabinet(java.lang.String adslCabinet) {
        this.adslCabinet = adslCabinet;
    }


    /**
     * Gets the activityCD value for this ConfigurarSoftphoneIn.
     * 
     * @return activityCD
     */
    public java.lang.String getActivityCD() {
        return activityCD;
    }


    /**
     * Sets the activityCD value for this ConfigurarSoftphoneIn.
     * 
     * @param activityCD
     */
    public void setActivityCD(java.lang.String activityCD) {
        this.activityCD = activityCD;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfigurarSoftphoneIn)) return false;
        ConfigurarSoftphoneIn other = (ConfigurarSoftphoneIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numeroTelefone==null && other.getNumeroTelefone()==null) || 
             (this.numeroTelefone!=null &&
              this.numeroTelefone.equals(other.getNumeroTelefone()))) &&
            ((this.numeroEquipamento==null && other.getNumeroEquipamento()==null) || 
             (this.numeroEquipamento!=null &&
              this.numeroEquipamento.equals(other.getNumeroEquipamento()))) &&
            ((this.routeRN2==null && other.getRouteRN2()==null) || 
             (this.routeRN2!=null &&
              this.routeRN2.equals(other.getRouteRN2()))) &&
            ((this.clliCode==null && other.getClliCode()==null) || 
             (this.clliCode!=null &&
              this.clliCode.equals(other.getClliCode()))) &&
            ((this.cidade==null && other.getCidade()==null) || 
             (this.cidade!=null &&
              this.cidade.equals(other.getCidade()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.miscInfo==null && other.getMiscInfo()==null) || 
             (this.miscInfo!=null &&
              this.miscInfo.equals(other.getMiscInfo()))) &&
            ((this.tecnologia==null && other.getTecnologia()==null) || 
             (this.tecnologia!=null &&
              this.tecnologia.equals(other.getTecnologia()))) &&
            ((this.adslCabinet==null && other.getAdslCabinet()==null) || 
             (this.adslCabinet!=null &&
              this.adslCabinet.equals(other.getAdslCabinet()))) &&
            ((this.activityCD==null && other.getActivityCD()==null) || 
             (this.activityCD!=null &&
              this.activityCD.equals(other.getActivityCD())));
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
        if (getNumeroTelefone() != null) {
            _hashCode += getNumeroTelefone().hashCode();
        }
        if (getNumeroEquipamento() != null) {
            _hashCode += getNumeroEquipamento().hashCode();
        }
        if (getRouteRN2() != null) {
            _hashCode += getRouteRN2().hashCode();
        }
        if (getClliCode() != null) {
            _hashCode += getClliCode().hashCode();
        }
        if (getCidade() != null) {
            _hashCode += getCidade().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getMiscInfo() != null) {
            _hashCode += getMiscInfo().hashCode();
        }
        if (getTecnologia() != null) {
            _hashCode += getTecnologia().hashCode();
        }
        if (getAdslCabinet() != null) {
            _hashCode += getAdslCabinet().hashCode();
        }
        if (getActivityCD() != null) {
            _hashCode += getActivityCD().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfigurarSoftphoneIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/configurarSoftphone", "ConfigurarSoftphoneIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroTelefone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/configurarSoftphone", "numeroTelefone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroEquipamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/configurarSoftphone", "numeroEquipamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeRN2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/configurarSoftphone", "routeRN2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clliCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/configurarSoftphone", "clliCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/configurarSoftphone", "cidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/configurarSoftphone", "estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("miscInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/configurarSoftphone", "miscInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tecnologia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/configurarSoftphone", "tecnologia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adslCabinet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/configurarSoftphone", "adslCabinet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityCD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/configurarSoftphone", "ActivityCD"));
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
