/**
 * ControleComando.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.services.model.controleComando;

public class ControleComando  implements java.io.Serializable {
    private long id;

    private java.lang.String idComandoPlataforma;

    private java.lang.String nomeComando;

    private java.lang.Long idRecursoLogico;

    private java.lang.Long idHomeGateway;

    private java.lang.Long idPortaFXS;

    private java.lang.String designador;

    private java.util.Calendar dataRequisicao;

    private java.util.Calendar dataExecucao;

    private java.util.Calendar dataPrevistaExpiracao;

    private java.lang.String observacao;

    private java.lang.String status;

    public ControleComando() {
    }

    public ControleComando(
           long id,
           java.lang.String idComandoPlataforma,
           java.lang.String nomeComando,
           java.lang.Long idRecursoLogico,
           java.lang.Long idHomeGateway,
           java.lang.Long idPortaFXS,
           java.lang.String designador,
           java.util.Calendar dataRequisicao,
           java.util.Calendar dataExecucao,
           java.util.Calendar dataPrevistaExpiracao,
           java.lang.String observacao,
           java.lang.String status) {
           this.id = id;
           this.idComandoPlataforma = idComandoPlataforma;
           this.nomeComando = nomeComando;
           this.idRecursoLogico = idRecursoLogico;
           this.idHomeGateway = idHomeGateway;
           this.idPortaFXS = idPortaFXS;
           this.designador = designador;
           this.dataRequisicao = dataRequisicao;
           this.dataExecucao = dataExecucao;
           this.dataPrevistaExpiracao = dataPrevistaExpiracao;
           this.observacao = observacao;
           this.status = status;
    }


    /**
     * Gets the id value for this ControleComando.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this ControleComando.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the idComandoPlataforma value for this ControleComando.
     * 
     * @return idComandoPlataforma
     */
    public java.lang.String getIdComandoPlataforma() {
        return idComandoPlataforma;
    }


    /**
     * Sets the idComandoPlataforma value for this ControleComando.
     * 
     * @param idComandoPlataforma
     */
    public void setIdComandoPlataforma(java.lang.String idComandoPlataforma) {
        this.idComandoPlataforma = idComandoPlataforma;
    }


    /**
     * Gets the nomeComando value for this ControleComando.
     * 
     * @return nomeComando
     */
    public java.lang.String getNomeComando() {
        return nomeComando;
    }


    /**
     * Sets the nomeComando value for this ControleComando.
     * 
     * @param nomeComando
     */
    public void setNomeComando(java.lang.String nomeComando) {
        this.nomeComando = nomeComando;
    }


    /**
     * Gets the idRecursoLogico value for this ControleComando.
     * 
     * @return idRecursoLogico
     */
    public java.lang.Long getIdRecursoLogico() {
        return idRecursoLogico;
    }


    /**
     * Sets the idRecursoLogico value for this ControleComando.
     * 
     * @param idRecursoLogico
     */
    public void setIdRecursoLogico(java.lang.Long idRecursoLogico) {
        this.idRecursoLogico = idRecursoLogico;
    }


    /**
     * Gets the idHomeGateway value for this ControleComando.
     * 
     * @return idHomeGateway
     */
    public java.lang.Long getIdHomeGateway() {
        return idHomeGateway;
    }


    /**
     * Sets the idHomeGateway value for this ControleComando.
     * 
     * @param idHomeGateway
     */
    public void setIdHomeGateway(java.lang.Long idHomeGateway) {
        this.idHomeGateway = idHomeGateway;
    }


    /**
     * Gets the idPortaFXS value for this ControleComando.
     * 
     * @return idPortaFXS
     */
    public java.lang.Long getIdPortaFXS() {
        return idPortaFXS;
    }


    /**
     * Sets the idPortaFXS value for this ControleComando.
     * 
     * @param idPortaFXS
     */
    public void setIdPortaFXS(java.lang.Long idPortaFXS) {
        this.idPortaFXS = idPortaFXS;
    }


    /**
     * Gets the designador value for this ControleComando.
     * 
     * @return designador
     */
    public java.lang.String getDesignador() {
        return designador;
    }


    /**
     * Sets the designador value for this ControleComando.
     * 
     * @param designador
     */
    public void setDesignador(java.lang.String designador) {
        this.designador = designador;
    }


    /**
     * Gets the dataRequisicao value for this ControleComando.
     * 
     * @return dataRequisicao
     */
    public java.util.Calendar getDataRequisicao() {
        return dataRequisicao;
    }


    /**
     * Sets the dataRequisicao value for this ControleComando.
     * 
     * @param dataRequisicao
     */
    public void setDataRequisicao(java.util.Calendar dataRequisicao) {
        this.dataRequisicao = dataRequisicao;
    }


    /**
     * Gets the dataExecucao value for this ControleComando.
     * 
     * @return dataExecucao
     */
    public java.util.Calendar getDataExecucao() {
        return dataExecucao;
    }


    /**
     * Sets the dataExecucao value for this ControleComando.
     * 
     * @param dataExecucao
     */
    public void setDataExecucao(java.util.Calendar dataExecucao) {
        this.dataExecucao = dataExecucao;
    }


    /**
     * Gets the dataPrevistaExpiracao value for this ControleComando.
     * 
     * @return dataPrevistaExpiracao
     */
    public java.util.Calendar getDataPrevistaExpiracao() {
        return dataPrevistaExpiracao;
    }


    /**
     * Sets the dataPrevistaExpiracao value for this ControleComando.
     * 
     * @param dataPrevistaExpiracao
     */
    public void setDataPrevistaExpiracao(java.util.Calendar dataPrevistaExpiracao) {
        this.dataPrevistaExpiracao = dataPrevistaExpiracao;
    }


    /**
     * Gets the observacao value for this ControleComando.
     * 
     * @return observacao
     */
    public java.lang.String getObservacao() {
        return observacao;
    }


    /**
     * Sets the observacao value for this ControleComando.
     * 
     * @param observacao
     */
    public void setObservacao(java.lang.String observacao) {
        this.observacao = observacao;
    }


    /**
     * Gets the status value for this ControleComando.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ControleComando.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ControleComando)) return false;
        ControleComando other = (ControleComando) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.idComandoPlataforma==null && other.getIdComandoPlataforma()==null) || 
             (this.idComandoPlataforma!=null &&
              this.idComandoPlataforma.equals(other.getIdComandoPlataforma()))) &&
            ((this.nomeComando==null && other.getNomeComando()==null) || 
             (this.nomeComando!=null &&
              this.nomeComando.equals(other.getNomeComando()))) &&
            ((this.idRecursoLogico==null && other.getIdRecursoLogico()==null) || 
             (this.idRecursoLogico!=null &&
              this.idRecursoLogico.equals(other.getIdRecursoLogico()))) &&
            ((this.idHomeGateway==null && other.getIdHomeGateway()==null) || 
             (this.idHomeGateway!=null &&
              this.idHomeGateway.equals(other.getIdHomeGateway()))) &&
            ((this.idPortaFXS==null && other.getIdPortaFXS()==null) || 
             (this.idPortaFXS!=null &&
              this.idPortaFXS.equals(other.getIdPortaFXS()))) &&
            ((this.designador==null && other.getDesignador()==null) || 
             (this.designador!=null &&
              this.designador.equals(other.getDesignador()))) &&
            ((this.dataRequisicao==null && other.getDataRequisicao()==null) || 
             (this.dataRequisicao!=null &&
              this.dataRequisicao.equals(other.getDataRequisicao()))) &&
            ((this.dataExecucao==null && other.getDataExecucao()==null) || 
             (this.dataExecucao!=null &&
              this.dataExecucao.equals(other.getDataExecucao()))) &&
            ((this.dataPrevistaExpiracao==null && other.getDataPrevistaExpiracao()==null) || 
             (this.dataPrevistaExpiracao!=null &&
              this.dataPrevistaExpiracao.equals(other.getDataPrevistaExpiracao()))) &&
            ((this.observacao==null && other.getObservacao()==null) || 
             (this.observacao!=null &&
              this.observacao.equals(other.getObservacao()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        _hashCode += new Long(getId()).hashCode();
        if (getIdComandoPlataforma() != null) {
            _hashCode += getIdComandoPlataforma().hashCode();
        }
        if (getNomeComando() != null) {
            _hashCode += getNomeComando().hashCode();
        }
        if (getIdRecursoLogico() != null) {
            _hashCode += getIdRecursoLogico().hashCode();
        }
        if (getIdHomeGateway() != null) {
            _hashCode += getIdHomeGateway().hashCode();
        }
        if (getIdPortaFXS() != null) {
            _hashCode += getIdPortaFXS().hashCode();
        }
        if (getDesignador() != null) {
            _hashCode += getDesignador().hashCode();
        }
        if (getDataRequisicao() != null) {
            _hashCode += getDataRequisicao().hashCode();
        }
        if (getDataExecucao() != null) {
            _hashCode += getDataExecucao().hashCode();
        }
        if (getDataPrevistaExpiracao() != null) {
            _hashCode += getDataPrevistaExpiracao().hashCode();
        }
        if (getObservacao() != null) {
            _hashCode += getObservacao().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ControleComando.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/controleComando", "ControleComando"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/controleComando", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idComandoPlataforma");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/controleComando", "idComandoPlataforma"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeComando");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/controleComando", "nomeComando"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idRecursoLogico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/controleComando", "idRecursoLogico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idHomeGateway");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/controleComando", "idHomeGateway"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPortaFXS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/controleComando", "idPortaFXS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/controleComando", "designador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataRequisicao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/controleComando", "dataRequisicao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataExecucao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/controleComando", "dataExecucao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataPrevistaExpiracao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/controleComando", "dataPrevistaExpiracao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/controleComando", "observacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/controleComando", "status"));
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
