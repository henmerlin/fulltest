/**
 * ReceberPedidoAutenticacaoPNIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.receberPedidoAutenticacaoPN;

public class ReceberPedidoAutenticacaoPNIn  implements java.io.Serializable {
    private java.lang.String nomeCliente;

    private java.lang.String cpf;

    private java.lang.String cnpj;

    private java.lang.String rg;

    private java.lang.String telefone;

    private java.util.Calendar dataAgendamento;

    private java.math.BigInteger agrupadorEA;

    private java.math.BigInteger protocoloEA;

    private java.math.BigInteger invokeId;

    private boolean reAutenticacao;

    private java.lang.String recipientServProvId;

    /* O campo e opcional pois nao e utilizado para operacoes
     * quando porting_to_original */
    private java.lang.String recipientEot;

    /* nao ocorre quando CNG */
    private java.lang.String recipientCnl;

    private java.math.BigInteger donorActionId;

    /* usado apenas em estorno - GVT Doadora */
    private com.gvt.www.ws.business.portabilidade.receberPedidoAutenticacaoPN.ReversingInfoType reversingInfo;

    private com.gvt.www.ws.business.portabilidade.receberPedidoAutenticacaoPN.ReceberPedidoAutenticacaoPNInLineType lineType;

    /* Timestamp indicando quando a BDR espera uma resposta do Doador
     * em relação ao registro de portailidade. */
    private java.util.Calendar prazoParaAutenticacao;

    public ReceberPedidoAutenticacaoPNIn() {
    }

    public ReceberPedidoAutenticacaoPNIn(
           java.lang.String nomeCliente,
           java.lang.String cpf,
           java.lang.String cnpj,
           java.lang.String rg,
           java.lang.String telefone,
           java.util.Calendar dataAgendamento,
           java.math.BigInteger agrupadorEA,
           java.math.BigInteger protocoloEA,
           java.math.BigInteger invokeId,
           boolean reAutenticacao,
           java.lang.String recipientServProvId,
           java.lang.String recipientEot,
           java.lang.String recipientCnl,
           java.math.BigInteger donorActionId,
           com.gvt.www.ws.business.portabilidade.receberPedidoAutenticacaoPN.ReversingInfoType reversingInfo,
           com.gvt.www.ws.business.portabilidade.receberPedidoAutenticacaoPN.ReceberPedidoAutenticacaoPNInLineType lineType,
           java.util.Calendar prazoParaAutenticacao) {
           this.nomeCliente = nomeCliente;
           this.cpf = cpf;
           this.cnpj = cnpj;
           this.rg = rg;
           this.telefone = telefone;
           this.dataAgendamento = dataAgendamento;
           this.agrupadorEA = agrupadorEA;
           this.protocoloEA = protocoloEA;
           this.invokeId = invokeId;
           this.reAutenticacao = reAutenticacao;
           this.recipientServProvId = recipientServProvId;
           this.recipientEot = recipientEot;
           this.recipientCnl = recipientCnl;
           this.donorActionId = donorActionId;
           this.reversingInfo = reversingInfo;
           this.lineType = lineType;
           this.prazoParaAutenticacao = prazoParaAutenticacao;
    }


    /**
     * Gets the nomeCliente value for this ReceberPedidoAutenticacaoPNIn.
     * 
     * @return nomeCliente
     */
    public java.lang.String getNomeCliente() {
        return nomeCliente;
    }


    /**
     * Sets the nomeCliente value for this ReceberPedidoAutenticacaoPNIn.
     * 
     * @param nomeCliente
     */
    public void setNomeCliente(java.lang.String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }


    /**
     * Gets the cpf value for this ReceberPedidoAutenticacaoPNIn.
     * 
     * @return cpf
     */
    public java.lang.String getCpf() {
        return cpf;
    }


    /**
     * Sets the cpf value for this ReceberPedidoAutenticacaoPNIn.
     * 
     * @param cpf
     */
    public void setCpf(java.lang.String cpf) {
        this.cpf = cpf;
    }


    /**
     * Gets the cnpj value for this ReceberPedidoAutenticacaoPNIn.
     * 
     * @return cnpj
     */
    public java.lang.String getCnpj() {
        return cnpj;
    }


    /**
     * Sets the cnpj value for this ReceberPedidoAutenticacaoPNIn.
     * 
     * @param cnpj
     */
    public void setCnpj(java.lang.String cnpj) {
        this.cnpj = cnpj;
    }


    /**
     * Gets the rg value for this ReceberPedidoAutenticacaoPNIn.
     * 
     * @return rg
     */
    public java.lang.String getRg() {
        return rg;
    }


    /**
     * Sets the rg value for this ReceberPedidoAutenticacaoPNIn.
     * 
     * @param rg
     */
    public void setRg(java.lang.String rg) {
        this.rg = rg;
    }


    /**
     * Gets the telefone value for this ReceberPedidoAutenticacaoPNIn.
     * 
     * @return telefone
     */
    public java.lang.String getTelefone() {
        return telefone;
    }


    /**
     * Sets the telefone value for this ReceberPedidoAutenticacaoPNIn.
     * 
     * @param telefone
     */
    public void setTelefone(java.lang.String telefone) {
        this.telefone = telefone;
    }


    /**
     * Gets the dataAgendamento value for this ReceberPedidoAutenticacaoPNIn.
     * 
     * @return dataAgendamento
     */
    public java.util.Calendar getDataAgendamento() {
        return dataAgendamento;
    }


    /**
     * Sets the dataAgendamento value for this ReceberPedidoAutenticacaoPNIn.
     * 
     * @param dataAgendamento
     */
    public void setDataAgendamento(java.util.Calendar dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }


    /**
     * Gets the agrupadorEA value for this ReceberPedidoAutenticacaoPNIn.
     * 
     * @return agrupadorEA
     */
    public java.math.BigInteger getAgrupadorEA() {
        return agrupadorEA;
    }


    /**
     * Sets the agrupadorEA value for this ReceberPedidoAutenticacaoPNIn.
     * 
     * @param agrupadorEA
     */
    public void setAgrupadorEA(java.math.BigInteger agrupadorEA) {
        this.agrupadorEA = agrupadorEA;
    }


    /**
     * Gets the protocoloEA value for this ReceberPedidoAutenticacaoPNIn.
     * 
     * @return protocoloEA
     */
    public java.math.BigInteger getProtocoloEA() {
        return protocoloEA;
    }


    /**
     * Sets the protocoloEA value for this ReceberPedidoAutenticacaoPNIn.
     * 
     * @param protocoloEA
     */
    public void setProtocoloEA(java.math.BigInteger protocoloEA) {
        this.protocoloEA = protocoloEA;
    }


    /**
     * Gets the invokeId value for this ReceberPedidoAutenticacaoPNIn.
     * 
     * @return invokeId
     */
    public java.math.BigInteger getInvokeId() {
        return invokeId;
    }


    /**
     * Sets the invokeId value for this ReceberPedidoAutenticacaoPNIn.
     * 
     * @param invokeId
     */
    public void setInvokeId(java.math.BigInteger invokeId) {
        this.invokeId = invokeId;
    }


    /**
     * Gets the reAutenticacao value for this ReceberPedidoAutenticacaoPNIn.
     * 
     * @return reAutenticacao
     */
    public boolean isReAutenticacao() {
        return reAutenticacao;
    }


    /**
     * Sets the reAutenticacao value for this ReceberPedidoAutenticacaoPNIn.
     * 
     * @param reAutenticacao
     */
    public void setReAutenticacao(boolean reAutenticacao) {
        this.reAutenticacao = reAutenticacao;
    }


    /**
     * Gets the recipientServProvId value for this ReceberPedidoAutenticacaoPNIn.
     * 
     * @return recipientServProvId
     */
    public java.lang.String getRecipientServProvId() {
        return recipientServProvId;
    }


    /**
     * Sets the recipientServProvId value for this ReceberPedidoAutenticacaoPNIn.
     * 
     * @param recipientServProvId
     */
    public void setRecipientServProvId(java.lang.String recipientServProvId) {
        this.recipientServProvId = recipientServProvId;
    }


    /**
     * Gets the recipientEot value for this ReceberPedidoAutenticacaoPNIn.
     * 
     * @return recipientEot   * O campo e opcional pois nao e utilizado para operacoes
     * quando porting_to_original
     */
    public java.lang.String getRecipientEot() {
        return recipientEot;
    }


    /**
     * Sets the recipientEot value for this ReceberPedidoAutenticacaoPNIn.
     * 
     * @param recipientEot   * O campo e opcional pois nao e utilizado para operacoes
     * quando porting_to_original
     */
    public void setRecipientEot(java.lang.String recipientEot) {
        this.recipientEot = recipientEot;
    }


    /**
     * Gets the recipientCnl value for this ReceberPedidoAutenticacaoPNIn.
     * 
     * @return recipientCnl   * nao ocorre quando CNG
     */
    public java.lang.String getRecipientCnl() {
        return recipientCnl;
    }


    /**
     * Sets the recipientCnl value for this ReceberPedidoAutenticacaoPNIn.
     * 
     * @param recipientCnl   * nao ocorre quando CNG
     */
    public void setRecipientCnl(java.lang.String recipientCnl) {
        this.recipientCnl = recipientCnl;
    }


    /**
     * Gets the donorActionId value for this ReceberPedidoAutenticacaoPNIn.
     * 
     * @return donorActionId
     */
    public java.math.BigInteger getDonorActionId() {
        return donorActionId;
    }


    /**
     * Sets the donorActionId value for this ReceberPedidoAutenticacaoPNIn.
     * 
     * @param donorActionId
     */
    public void setDonorActionId(java.math.BigInteger donorActionId) {
        this.donorActionId = donorActionId;
    }


    /**
     * Gets the reversingInfo value for this ReceberPedidoAutenticacaoPNIn.
     * 
     * @return reversingInfo   * usado apenas em estorno - GVT Doadora
     */
    public com.gvt.www.ws.business.portabilidade.receberPedidoAutenticacaoPN.ReversingInfoType getReversingInfo() {
        return reversingInfo;
    }


    /**
     * Sets the reversingInfo value for this ReceberPedidoAutenticacaoPNIn.
     * 
     * @param reversingInfo   * usado apenas em estorno - GVT Doadora
     */
    public void setReversingInfo(com.gvt.www.ws.business.portabilidade.receberPedidoAutenticacaoPN.ReversingInfoType reversingInfo) {
        this.reversingInfo = reversingInfo;
    }


    /**
     * Gets the lineType value for this ReceberPedidoAutenticacaoPNIn.
     * 
     * @return lineType
     */
    public com.gvt.www.ws.business.portabilidade.receberPedidoAutenticacaoPN.ReceberPedidoAutenticacaoPNInLineType getLineType() {
        return lineType;
    }


    /**
     * Sets the lineType value for this ReceberPedidoAutenticacaoPNIn.
     * 
     * @param lineType
     */
    public void setLineType(com.gvt.www.ws.business.portabilidade.receberPedidoAutenticacaoPN.ReceberPedidoAutenticacaoPNInLineType lineType) {
        this.lineType = lineType;
    }


    /**
     * Gets the prazoParaAutenticacao value for this ReceberPedidoAutenticacaoPNIn.
     * 
     * @return prazoParaAutenticacao   * Timestamp indicando quando a BDR espera uma resposta do Doador
     * em relação ao registro de portailidade.
     */
    public java.util.Calendar getPrazoParaAutenticacao() {
        return prazoParaAutenticacao;
    }


    /**
     * Sets the prazoParaAutenticacao value for this ReceberPedidoAutenticacaoPNIn.
     * 
     * @param prazoParaAutenticacao   * Timestamp indicando quando a BDR espera uma resposta do Doador
     * em relação ao registro de portailidade.
     */
    public void setPrazoParaAutenticacao(java.util.Calendar prazoParaAutenticacao) {
        this.prazoParaAutenticacao = prazoParaAutenticacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReceberPedidoAutenticacaoPNIn)) return false;
        ReceberPedidoAutenticacaoPNIn other = (ReceberPedidoAutenticacaoPNIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nomeCliente==null && other.getNomeCliente()==null) || 
             (this.nomeCliente!=null &&
              this.nomeCliente.equals(other.getNomeCliente()))) &&
            ((this.cpf==null && other.getCpf()==null) || 
             (this.cpf!=null &&
              this.cpf.equals(other.getCpf()))) &&
            ((this.cnpj==null && other.getCnpj()==null) || 
             (this.cnpj!=null &&
              this.cnpj.equals(other.getCnpj()))) &&
            ((this.rg==null && other.getRg()==null) || 
             (this.rg!=null &&
              this.rg.equals(other.getRg()))) &&
            ((this.telefone==null && other.getTelefone()==null) || 
             (this.telefone!=null &&
              this.telefone.equals(other.getTelefone()))) &&
            ((this.dataAgendamento==null && other.getDataAgendamento()==null) || 
             (this.dataAgendamento!=null &&
              this.dataAgendamento.equals(other.getDataAgendamento()))) &&
            ((this.agrupadorEA==null && other.getAgrupadorEA()==null) || 
             (this.agrupadorEA!=null &&
              this.agrupadorEA.equals(other.getAgrupadorEA()))) &&
            ((this.protocoloEA==null && other.getProtocoloEA()==null) || 
             (this.protocoloEA!=null &&
              this.protocoloEA.equals(other.getProtocoloEA()))) &&
            ((this.invokeId==null && other.getInvokeId()==null) || 
             (this.invokeId!=null &&
              this.invokeId.equals(other.getInvokeId()))) &&
            this.reAutenticacao == other.isReAutenticacao() &&
            ((this.recipientServProvId==null && other.getRecipientServProvId()==null) || 
             (this.recipientServProvId!=null &&
              this.recipientServProvId.equals(other.getRecipientServProvId()))) &&
            ((this.recipientEot==null && other.getRecipientEot()==null) || 
             (this.recipientEot!=null &&
              this.recipientEot.equals(other.getRecipientEot()))) &&
            ((this.recipientCnl==null && other.getRecipientCnl()==null) || 
             (this.recipientCnl!=null &&
              this.recipientCnl.equals(other.getRecipientCnl()))) &&
            ((this.donorActionId==null && other.getDonorActionId()==null) || 
             (this.donorActionId!=null &&
              this.donorActionId.equals(other.getDonorActionId()))) &&
            ((this.reversingInfo==null && other.getReversingInfo()==null) || 
             (this.reversingInfo!=null &&
              this.reversingInfo.equals(other.getReversingInfo()))) &&
            ((this.lineType==null && other.getLineType()==null) || 
             (this.lineType!=null &&
              this.lineType.equals(other.getLineType()))) &&
            ((this.prazoParaAutenticacao==null && other.getPrazoParaAutenticacao()==null) || 
             (this.prazoParaAutenticacao!=null &&
              this.prazoParaAutenticacao.equals(other.getPrazoParaAutenticacao())));
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
        if (getNomeCliente() != null) {
            _hashCode += getNomeCliente().hashCode();
        }
        if (getCpf() != null) {
            _hashCode += getCpf().hashCode();
        }
        if (getCnpj() != null) {
            _hashCode += getCnpj().hashCode();
        }
        if (getRg() != null) {
            _hashCode += getRg().hashCode();
        }
        if (getTelefone() != null) {
            _hashCode += getTelefone().hashCode();
        }
        if (getDataAgendamento() != null) {
            _hashCode += getDataAgendamento().hashCode();
        }
        if (getAgrupadorEA() != null) {
            _hashCode += getAgrupadorEA().hashCode();
        }
        if (getProtocoloEA() != null) {
            _hashCode += getProtocoloEA().hashCode();
        }
        if (getInvokeId() != null) {
            _hashCode += getInvokeId().hashCode();
        }
        _hashCode += (isReAutenticacao() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRecipientServProvId() != null) {
            _hashCode += getRecipientServProvId().hashCode();
        }
        if (getRecipientEot() != null) {
            _hashCode += getRecipientEot().hashCode();
        }
        if (getRecipientCnl() != null) {
            _hashCode += getRecipientCnl().hashCode();
        }
        if (getDonorActionId() != null) {
            _hashCode += getDonorActionId().hashCode();
        }
        if (getReversingInfo() != null) {
            _hashCode += getReversingInfo().hashCode();
        }
        if (getLineType() != null) {
            _hashCode += getLineType().hashCode();
        }
        if (getPrazoParaAutenticacao() != null) {
            _hashCode += getPrazoParaAutenticacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReceberPedidoAutenticacaoPNIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberPedidoAutenticacaoPN", "receberPedidoAutenticacaoPNIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberPedidoAutenticacaoPN", "nomeCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberPedidoAutenticacaoPN", "cpf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cnpj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberPedidoAutenticacaoPN", "cnpj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberPedidoAutenticacaoPN", "rg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberPedidoAutenticacaoPN", "telefone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataAgendamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberPedidoAutenticacaoPN", "dataAgendamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agrupadorEA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberPedidoAutenticacaoPN", "agrupadorEA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocoloEA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberPedidoAutenticacaoPN", "protocoloEA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invokeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberPedidoAutenticacaoPN", "invokeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reAutenticacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberPedidoAutenticacaoPN", "reAutenticacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientServProvId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberPedidoAutenticacaoPN", "recipientServProvId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientEot");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberPedidoAutenticacaoPN", "recipientEot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientCnl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberPedidoAutenticacaoPN", "recipientCnl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("donorActionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberPedidoAutenticacaoPN", "donorActionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reversingInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberPedidoAutenticacaoPN", "reversingInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberPedidoAutenticacaoPN", "ReversingInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberPedidoAutenticacaoPN", "lineType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberPedidoAutenticacaoPN", ">receberPedidoAutenticacaoPNIn>lineType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prazoParaAutenticacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberPedidoAutenticacaoPN", "prazoParaAutenticacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
