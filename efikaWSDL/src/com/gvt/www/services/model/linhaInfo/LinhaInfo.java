/**
 * LinhaInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.services.model.linhaInfo;

public class LinhaInfo  implements java.io.Serializable {
    private java.lang.String instancia;

    private com.gvt.www.services.model.linhaInfo.TrocaLinhaInfo troca;

    private java.lang.String numEquipamento;

    private java.lang.String central;

    private java.lang.String armario;

    private java.lang.String cidade;

    private java.lang.String estado;

    private java.lang.String miscInfo;

    private java.lang.String flagPortabilidade;

    private java.lang.String flagPiloto;

    public LinhaInfo() {
    }

    public LinhaInfo(
           java.lang.String instancia,
           com.gvt.www.services.model.linhaInfo.TrocaLinhaInfo troca,
           java.lang.String numEquipamento,
           java.lang.String central,
           java.lang.String armario,
           java.lang.String cidade,
           java.lang.String estado,
           java.lang.String miscInfo,
           java.lang.String flagPortabilidade,
           java.lang.String flagPiloto) {
           this.instancia = instancia;
           this.troca = troca;
           this.numEquipamento = numEquipamento;
           this.central = central;
           this.armario = armario;
           this.cidade = cidade;
           this.estado = estado;
           this.miscInfo = miscInfo;
           this.flagPortabilidade = flagPortabilidade;
           this.flagPiloto = flagPiloto;
    }


    /**
     * Gets the instancia value for this LinhaInfo.
     * 
     * @return instancia
     */
    public java.lang.String getInstancia() {
        return instancia;
    }


    /**
     * Sets the instancia value for this LinhaInfo.
     * 
     * @param instancia
     */
    public void setInstancia(java.lang.String instancia) {
        this.instancia = instancia;
    }


    /**
     * Gets the troca value for this LinhaInfo.
     * 
     * @return troca
     */
    public com.gvt.www.services.model.linhaInfo.TrocaLinhaInfo getTroca() {
        return troca;
    }


    /**
     * Sets the troca value for this LinhaInfo.
     * 
     * @param troca
     */
    public void setTroca(com.gvt.www.services.model.linhaInfo.TrocaLinhaInfo troca) {
        this.troca = troca;
    }


    /**
     * Gets the numEquipamento value for this LinhaInfo.
     * 
     * @return numEquipamento
     */
    public java.lang.String getNumEquipamento() {
        return numEquipamento;
    }


    /**
     * Sets the numEquipamento value for this LinhaInfo.
     * 
     * @param numEquipamento
     */
    public void setNumEquipamento(java.lang.String numEquipamento) {
        this.numEquipamento = numEquipamento;
    }


    /**
     * Gets the central value for this LinhaInfo.
     * 
     * @return central
     */
    public java.lang.String getCentral() {
        return central;
    }


    /**
     * Sets the central value for this LinhaInfo.
     * 
     * @param central
     */
    public void setCentral(java.lang.String central) {
        this.central = central;
    }


    /**
     * Gets the armario value for this LinhaInfo.
     * 
     * @return armario
     */
    public java.lang.String getArmario() {
        return armario;
    }


    /**
     * Sets the armario value for this LinhaInfo.
     * 
     * @param armario
     */
    public void setArmario(java.lang.String armario) {
        this.armario = armario;
    }


    /**
     * Gets the cidade value for this LinhaInfo.
     * 
     * @return cidade
     */
    public java.lang.String getCidade() {
        return cidade;
    }


    /**
     * Sets the cidade value for this LinhaInfo.
     * 
     * @param cidade
     */
    public void setCidade(java.lang.String cidade) {
        this.cidade = cidade;
    }


    /**
     * Gets the estado value for this LinhaInfo.
     * 
     * @return estado
     */
    public java.lang.String getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this LinhaInfo.
     * 
     * @param estado
     */
    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }


    /**
     * Gets the miscInfo value for this LinhaInfo.
     * 
     * @return miscInfo
     */
    public java.lang.String getMiscInfo() {
        return miscInfo;
    }


    /**
     * Sets the miscInfo value for this LinhaInfo.
     * 
     * @param miscInfo
     */
    public void setMiscInfo(java.lang.String miscInfo) {
        this.miscInfo = miscInfo;
    }


    /**
     * Gets the flagPortabilidade value for this LinhaInfo.
     * 
     * @return flagPortabilidade
     */
    public java.lang.String getFlagPortabilidade() {
        return flagPortabilidade;
    }


    /**
     * Sets the flagPortabilidade value for this LinhaInfo.
     * 
     * @param flagPortabilidade
     */
    public void setFlagPortabilidade(java.lang.String flagPortabilidade) {
        this.flagPortabilidade = flagPortabilidade;
    }


    /**
     * Gets the flagPiloto value for this LinhaInfo.
     * 
     * @return flagPiloto
     */
    public java.lang.String getFlagPiloto() {
        return flagPiloto;
    }


    /**
     * Sets the flagPiloto value for this LinhaInfo.
     * 
     * @param flagPiloto
     */
    public void setFlagPiloto(java.lang.String flagPiloto) {
        this.flagPiloto = flagPiloto;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LinhaInfo)) return false;
        LinhaInfo other = (LinhaInfo) obj;
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
            ((this.troca==null && other.getTroca()==null) || 
             (this.troca!=null &&
              this.troca.equals(other.getTroca()))) &&
            ((this.numEquipamento==null && other.getNumEquipamento()==null) || 
             (this.numEquipamento!=null &&
              this.numEquipamento.equals(other.getNumEquipamento()))) &&
            ((this.central==null && other.getCentral()==null) || 
             (this.central!=null &&
              this.central.equals(other.getCentral()))) &&
            ((this.armario==null && other.getArmario()==null) || 
             (this.armario!=null &&
              this.armario.equals(other.getArmario()))) &&
            ((this.cidade==null && other.getCidade()==null) || 
             (this.cidade!=null &&
              this.cidade.equals(other.getCidade()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.miscInfo==null && other.getMiscInfo()==null) || 
             (this.miscInfo!=null &&
              this.miscInfo.equals(other.getMiscInfo()))) &&
            ((this.flagPortabilidade==null && other.getFlagPortabilidade()==null) || 
             (this.flagPortabilidade!=null &&
              this.flagPortabilidade.equals(other.getFlagPortabilidade()))) &&
            ((this.flagPiloto==null && other.getFlagPiloto()==null) || 
             (this.flagPiloto!=null &&
              this.flagPiloto.equals(other.getFlagPiloto())));
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
        if (getTroca() != null) {
            _hashCode += getTroca().hashCode();
        }
        if (getNumEquipamento() != null) {
            _hashCode += getNumEquipamento().hashCode();
        }
        if (getCentral() != null) {
            _hashCode += getCentral().hashCode();
        }
        if (getArmario() != null) {
            _hashCode += getArmario().hashCode();
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
        if (getFlagPortabilidade() != null) {
            _hashCode += getFlagPortabilidade().hashCode();
        }
        if (getFlagPiloto() != null) {
            _hashCode += getFlagPiloto().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LinhaInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/linhaInfo", "LinhaInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instancia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/linhaInfo", "instancia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("troca");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/linhaInfo", "troca"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/linhaInfo", "TrocaLinhaInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numEquipamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/linhaInfo", "numEquipamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("central");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/linhaInfo", "central"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("armario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/linhaInfo", "armario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/linhaInfo", "cidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/linhaInfo", "estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("miscInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/linhaInfo", "miscInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagPortabilidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/linhaInfo", "flagPortabilidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagPiloto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/linhaInfo", "flagPiloto"));
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
