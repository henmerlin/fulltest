/**
 * RecursoLogicoWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.services.model.recursoLogico;

public class RecursoLogicoWS  implements java.io.Serializable {
    private java.lang.String idAcesso;

    private java.lang.Long id;

    private java.lang.Integer idLegado;

    private java.lang.String designador;

    private com.gvt.www.services.model.statusServico.StatusServico status;

    private com.gvt.www.services.model.tipoAcao.TipoAcao acao;

    private java.lang.String motivo;

    private java.lang.Integer xGvtProdCod;

    private com.gvt.www.services.model.map.Map[] param;

    private com.gvt.www.services.model.recursoLogicoSpec.RecursoLogicoSpec recursoLogicoSpec;

    private com.gvt.www.services.model.equipamentoFisico.EquipamentoFisico equipamentoFisico;

    private com.gvt.www.services.model.recursoLogico.RecursoLogicoWS[] recursosLogicos;

    private com.gvt.www.services.model.portaFXS.PortaFXSWS[] portasFXS;

    private com.gvt.www.services.model.portaFXS.PortaFXSWS portaFXS;

    public RecursoLogicoWS() {
    }

    public RecursoLogicoWS(
           java.lang.String idAcesso,
           java.lang.Long id,
           java.lang.Integer idLegado,
           java.lang.String designador,
           com.gvt.www.services.model.statusServico.StatusServico status,
           com.gvt.www.services.model.tipoAcao.TipoAcao acao,
           java.lang.String motivo,
           java.lang.Integer xGvtProdCod,
           com.gvt.www.services.model.map.Map[] param,
           com.gvt.www.services.model.recursoLogicoSpec.RecursoLogicoSpec recursoLogicoSpec,
           com.gvt.www.services.model.equipamentoFisico.EquipamentoFisico equipamentoFisico,
           com.gvt.www.services.model.recursoLogico.RecursoLogicoWS[] recursosLogicos,
           com.gvt.www.services.model.portaFXS.PortaFXSWS[] portasFXS,
           com.gvt.www.services.model.portaFXS.PortaFXSWS portaFXS) {
           this.idAcesso = idAcesso;
           this.id = id;
           this.idLegado = idLegado;
           this.designador = designador;
           this.status = status;
           this.acao = acao;
           this.motivo = motivo;
           this.xGvtProdCod = xGvtProdCod;
           this.param = param;
           this.recursoLogicoSpec = recursoLogicoSpec;
           this.equipamentoFisico = equipamentoFisico;
           this.recursosLogicos = recursosLogicos;
           this.portasFXS = portasFXS;
           this.portaFXS = portaFXS;
    }


    /**
     * Gets the idAcesso value for this RecursoLogicoWS.
     * 
     * @return idAcesso
     */
    public java.lang.String getIdAcesso() {
        return idAcesso;
    }


    /**
     * Sets the idAcesso value for this RecursoLogicoWS.
     * 
     * @param idAcesso
     */
    public void setIdAcesso(java.lang.String idAcesso) {
        this.idAcesso = idAcesso;
    }


    /**
     * Gets the id value for this RecursoLogicoWS.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this RecursoLogicoWS.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the idLegado value for this RecursoLogicoWS.
     * 
     * @return idLegado
     */
    public java.lang.Integer getIdLegado() {
        return idLegado;
    }


    /**
     * Sets the idLegado value for this RecursoLogicoWS.
     * 
     * @param idLegado
     */
    public void setIdLegado(java.lang.Integer idLegado) {
        this.idLegado = idLegado;
    }


    /**
     * Gets the designador value for this RecursoLogicoWS.
     * 
     * @return designador
     */
    public java.lang.String getDesignador() {
        return designador;
    }


    /**
     * Sets the designador value for this RecursoLogicoWS.
     * 
     * @param designador
     */
    public void setDesignador(java.lang.String designador) {
        this.designador = designador;
    }


    /**
     * Gets the status value for this RecursoLogicoWS.
     * 
     * @return status
     */
    public com.gvt.www.services.model.statusServico.StatusServico getStatus() {
        return status;
    }


    /**
     * Sets the status value for this RecursoLogicoWS.
     * 
     * @param status
     */
    public void setStatus(com.gvt.www.services.model.statusServico.StatusServico status) {
        this.status = status;
    }


    /**
     * Gets the acao value for this RecursoLogicoWS.
     * 
     * @return acao
     */
    public com.gvt.www.services.model.tipoAcao.TipoAcao getAcao() {
        return acao;
    }


    /**
     * Sets the acao value for this RecursoLogicoWS.
     * 
     * @param acao
     */
    public void setAcao(com.gvt.www.services.model.tipoAcao.TipoAcao acao) {
        this.acao = acao;
    }


    /**
     * Gets the motivo value for this RecursoLogicoWS.
     * 
     * @return motivo
     */
    public java.lang.String getMotivo() {
        return motivo;
    }


    /**
     * Sets the motivo value for this RecursoLogicoWS.
     * 
     * @param motivo
     */
    public void setMotivo(java.lang.String motivo) {
        this.motivo = motivo;
    }


    /**
     * Gets the xGvtProdCod value for this RecursoLogicoWS.
     * 
     * @return xGvtProdCod
     */
    public java.lang.Integer getXGvtProdCod() {
        return xGvtProdCod;
    }


    /**
     * Sets the xGvtProdCod value for this RecursoLogicoWS.
     * 
     * @param xGvtProdCod
     */
    public void setXGvtProdCod(java.lang.Integer xGvtProdCod) {
        this.xGvtProdCod = xGvtProdCod;
    }


    /**
     * Gets the param value for this RecursoLogicoWS.
     * 
     * @return param
     */
    public com.gvt.www.services.model.map.Map[] getParam() {
        return param;
    }


    /**
     * Sets the param value for this RecursoLogicoWS.
     * 
     * @param param
     */
    public void setParam(com.gvt.www.services.model.map.Map[] param) {
        this.param = param;
    }

    public com.gvt.www.services.model.map.Map getParam(int i) {
        return this.param[i];
    }

    public void setParam(int i, com.gvt.www.services.model.map.Map _value) {
        this.param[i] = _value;
    }


    /**
     * Gets the recursoLogicoSpec value for this RecursoLogicoWS.
     * 
     * @return recursoLogicoSpec
     */
    public com.gvt.www.services.model.recursoLogicoSpec.RecursoLogicoSpec getRecursoLogicoSpec() {
        return recursoLogicoSpec;
    }


    /**
     * Sets the recursoLogicoSpec value for this RecursoLogicoWS.
     * 
     * @param recursoLogicoSpec
     */
    public void setRecursoLogicoSpec(com.gvt.www.services.model.recursoLogicoSpec.RecursoLogicoSpec recursoLogicoSpec) {
        this.recursoLogicoSpec = recursoLogicoSpec;
    }


    /**
     * Gets the equipamentoFisico value for this RecursoLogicoWS.
     * 
     * @return equipamentoFisico
     */
    public com.gvt.www.services.model.equipamentoFisico.EquipamentoFisico getEquipamentoFisico() {
        return equipamentoFisico;
    }


    /**
     * Sets the equipamentoFisico value for this RecursoLogicoWS.
     * 
     * @param equipamentoFisico
     */
    public void setEquipamentoFisico(com.gvt.www.services.model.equipamentoFisico.EquipamentoFisico equipamentoFisico) {
        this.equipamentoFisico = equipamentoFisico;
    }


    /**
     * Gets the recursosLogicos value for this RecursoLogicoWS.
     * 
     * @return recursosLogicos
     */
    public com.gvt.www.services.model.recursoLogico.RecursoLogicoWS[] getRecursosLogicos() {
        return recursosLogicos;
    }


    /**
     * Sets the recursosLogicos value for this RecursoLogicoWS.
     * 
     * @param recursosLogicos
     */
    public void setRecursosLogicos(com.gvt.www.services.model.recursoLogico.RecursoLogicoWS[] recursosLogicos) {
        this.recursosLogicos = recursosLogicos;
    }

    public com.gvt.www.services.model.recursoLogico.RecursoLogicoWS getRecursosLogicos(int i) {
        return this.recursosLogicos[i];
    }

    public void setRecursosLogicos(int i, com.gvt.www.services.model.recursoLogico.RecursoLogicoWS _value) {
        this.recursosLogicos[i] = _value;
    }


    /**
     * Gets the portasFXS value for this RecursoLogicoWS.
     * 
     * @return portasFXS
     */
    public com.gvt.www.services.model.portaFXS.PortaFXSWS[] getPortasFXS() {
        return portasFXS;
    }


    /**
     * Sets the portasFXS value for this RecursoLogicoWS.
     * 
     * @param portasFXS
     */
    public void setPortasFXS(com.gvt.www.services.model.portaFXS.PortaFXSWS[] portasFXS) {
        this.portasFXS = portasFXS;
    }

    public com.gvt.www.services.model.portaFXS.PortaFXSWS getPortasFXS(int i) {
        return this.portasFXS[i];
    }

    public void setPortasFXS(int i, com.gvt.www.services.model.portaFXS.PortaFXSWS _value) {
        this.portasFXS[i] = _value;
    }


    /**
     * Gets the portaFXS value for this RecursoLogicoWS.
     * 
     * @return portaFXS
     */
    public com.gvt.www.services.model.portaFXS.PortaFXSWS getPortaFXS() {
        return portaFXS;
    }


    /**
     * Sets the portaFXS value for this RecursoLogicoWS.
     * 
     * @param portaFXS
     */
    public void setPortaFXS(com.gvt.www.services.model.portaFXS.PortaFXSWS portaFXS) {
        this.portaFXS = portaFXS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecursoLogicoWS)) return false;
        RecursoLogicoWS other = (RecursoLogicoWS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idAcesso==null && other.getIdAcesso()==null) || 
             (this.idAcesso!=null &&
              this.idAcesso.equals(other.getIdAcesso()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.idLegado==null && other.getIdLegado()==null) || 
             (this.idLegado!=null &&
              this.idLegado.equals(other.getIdLegado()))) &&
            ((this.designador==null && other.getDesignador()==null) || 
             (this.designador!=null &&
              this.designador.equals(other.getDesignador()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.acao==null && other.getAcao()==null) || 
             (this.acao!=null &&
              this.acao.equals(other.getAcao()))) &&
            ((this.motivo==null && other.getMotivo()==null) || 
             (this.motivo!=null &&
              this.motivo.equals(other.getMotivo()))) &&
            ((this.xGvtProdCod==null && other.getXGvtProdCod()==null) || 
             (this.xGvtProdCod!=null &&
              this.xGvtProdCod.equals(other.getXGvtProdCod()))) &&
            ((this.param==null && other.getParam()==null) || 
             (this.param!=null &&
              java.util.Arrays.equals(this.param, other.getParam()))) &&
            ((this.recursoLogicoSpec==null && other.getRecursoLogicoSpec()==null) || 
             (this.recursoLogicoSpec!=null &&
              this.recursoLogicoSpec.equals(other.getRecursoLogicoSpec()))) &&
            ((this.equipamentoFisico==null && other.getEquipamentoFisico()==null) || 
             (this.equipamentoFisico!=null &&
              this.equipamentoFisico.equals(other.getEquipamentoFisico()))) &&
            ((this.recursosLogicos==null && other.getRecursosLogicos()==null) || 
             (this.recursosLogicos!=null &&
              java.util.Arrays.equals(this.recursosLogicos, other.getRecursosLogicos()))) &&
            ((this.portasFXS==null && other.getPortasFXS()==null) || 
             (this.portasFXS!=null &&
              java.util.Arrays.equals(this.portasFXS, other.getPortasFXS()))) &&
            ((this.portaFXS==null && other.getPortaFXS()==null) || 
             (this.portaFXS!=null &&
              this.portaFXS.equals(other.getPortaFXS())));
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
        if (getIdAcesso() != null) {
            _hashCode += getIdAcesso().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getIdLegado() != null) {
            _hashCode += getIdLegado().hashCode();
        }
        if (getDesignador() != null) {
            _hashCode += getDesignador().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getAcao() != null) {
            _hashCode += getAcao().hashCode();
        }
        if (getMotivo() != null) {
            _hashCode += getMotivo().hashCode();
        }
        if (getXGvtProdCod() != null) {
            _hashCode += getXGvtProdCod().hashCode();
        }
        if (getParam() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParam());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParam(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecursoLogicoSpec() != null) {
            _hashCode += getRecursoLogicoSpec().hashCode();
        }
        if (getEquipamentoFisico() != null) {
            _hashCode += getEquipamentoFisico().hashCode();
        }
        if (getRecursosLogicos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecursosLogicos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecursosLogicos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPortasFXS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPortasFXS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPortasFXS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPortaFXS() != null) {
            _hashCode += getPortaFXS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecursoLogicoWS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/recursoLogico", "RecursoLogicoWS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idAcesso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/recursoLogico", "idAcesso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/recursoLogico", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idLegado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/recursoLogico", "idLegado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/recursoLogico", "designador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/recursoLogico", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/statusServico", "StatusServico"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/recursoLogico", "acao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/tipoAcao", "TipoAcao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motivo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/recursoLogico", "motivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XGvtProdCod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/recursoLogico", "xGvtProdCod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("param");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/recursoLogico", "param"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/map", "Map"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recursoLogicoSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/recursoLogico", "recursoLogicoSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/recursoLogicoSpec", "RecursoLogicoSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("equipamentoFisico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/recursoLogico", "equipamentoFisico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/equipamentoFisico", "EquipamentoFisico"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recursosLogicos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/recursoLogico", "recursosLogicos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/recursoLogico", "RecursoLogicoWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portasFXS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/recursoLogico", "portasFXS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/portaFXS", "PortaFXSWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portaFXS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/recursoLogico", "portaFXS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/portaFXS", "PortaFXSWS"));
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
