/**
 * PortaFXSWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.services.model.portaFXS;

public class PortaFXSWS  implements java.io.Serializable {
    private java.lang.Integer id;

    private com.gvt.www.services.model.statusServico.StatusServico status;

    private com.gvt.www.services.model.tipoAcao.TipoAcao acao;

    private java.lang.String instancia;

    private com.gvt.www.services.model.portaFXS.TrocaPortaFXSWS troca;

    private java.lang.Integer numeroPorta;

    private com.gvt.www.services.model.sessionBorder.SessionBorder sessionBorder;

    public PortaFXSWS() {
    }

    public PortaFXSWS(
           java.lang.Integer id,
           com.gvt.www.services.model.statusServico.StatusServico status,
           com.gvt.www.services.model.tipoAcao.TipoAcao acao,
           java.lang.String instancia,
           com.gvt.www.services.model.portaFXS.TrocaPortaFXSWS troca,
           java.lang.Integer numeroPorta,
           com.gvt.www.services.model.sessionBorder.SessionBorder sessionBorder) {
           this.id = id;
           this.status = status;
           this.acao = acao;
           this.instancia = instancia;
           this.troca = troca;
           this.numeroPorta = numeroPorta;
           this.sessionBorder = sessionBorder;
    }


    /**
     * Gets the id value for this PortaFXSWS.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this PortaFXSWS.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the status value for this PortaFXSWS.
     * 
     * @return status
     */
    public com.gvt.www.services.model.statusServico.StatusServico getStatus() {
        return status;
    }


    /**
     * Sets the status value for this PortaFXSWS.
     * 
     * @param status
     */
    public void setStatus(com.gvt.www.services.model.statusServico.StatusServico status) {
        this.status = status;
    }


    /**
     * Gets the acao value for this PortaFXSWS.
     * 
     * @return acao
     */
    public com.gvt.www.services.model.tipoAcao.TipoAcao getAcao() {
        return acao;
    }


    /**
     * Sets the acao value for this PortaFXSWS.
     * 
     * @param acao
     */
    public void setAcao(com.gvt.www.services.model.tipoAcao.TipoAcao acao) {
        this.acao = acao;
    }


    /**
     * Gets the instancia value for this PortaFXSWS.
     * 
     * @return instancia
     */
    public java.lang.String getInstancia() {
        return instancia;
    }


    /**
     * Sets the instancia value for this PortaFXSWS.
     * 
     * @param instancia
     */
    public void setInstancia(java.lang.String instancia) {
        this.instancia = instancia;
    }


    /**
     * Gets the troca value for this PortaFXSWS.
     * 
     * @return troca
     */
    public com.gvt.www.services.model.portaFXS.TrocaPortaFXSWS getTroca() {
        return troca;
    }


    /**
     * Sets the troca value for this PortaFXSWS.
     * 
     * @param troca
     */
    public void setTroca(com.gvt.www.services.model.portaFXS.TrocaPortaFXSWS troca) {
        this.troca = troca;
    }


    /**
     * Gets the numeroPorta value for this PortaFXSWS.
     * 
     * @return numeroPorta
     */
    public java.lang.Integer getNumeroPorta() {
        return numeroPorta;
    }


    /**
     * Sets the numeroPorta value for this PortaFXSWS.
     * 
     * @param numeroPorta
     */
    public void setNumeroPorta(java.lang.Integer numeroPorta) {
        this.numeroPorta = numeroPorta;
    }


    /**
     * Gets the sessionBorder value for this PortaFXSWS.
     * 
     * @return sessionBorder
     */
    public com.gvt.www.services.model.sessionBorder.SessionBorder getSessionBorder() {
        return sessionBorder;
    }


    /**
     * Sets the sessionBorder value for this PortaFXSWS.
     * 
     * @param sessionBorder
     */
    public void setSessionBorder(com.gvt.www.services.model.sessionBorder.SessionBorder sessionBorder) {
        this.sessionBorder = sessionBorder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PortaFXSWS)) return false;
        PortaFXSWS other = (PortaFXSWS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.acao==null && other.getAcao()==null) || 
             (this.acao!=null &&
              this.acao.equals(other.getAcao()))) &&
            ((this.instancia==null && other.getInstancia()==null) || 
             (this.instancia!=null &&
              this.instancia.equals(other.getInstancia()))) &&
            ((this.troca==null && other.getTroca()==null) || 
             (this.troca!=null &&
              this.troca.equals(other.getTroca()))) &&
            ((this.numeroPorta==null && other.getNumeroPorta()==null) || 
             (this.numeroPorta!=null &&
              this.numeroPorta.equals(other.getNumeroPorta()))) &&
            ((this.sessionBorder==null && other.getSessionBorder()==null) || 
             (this.sessionBorder!=null &&
              this.sessionBorder.equals(other.getSessionBorder())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getAcao() != null) {
            _hashCode += getAcao().hashCode();
        }
        if (getInstancia() != null) {
            _hashCode += getInstancia().hashCode();
        }
        if (getTroca() != null) {
            _hashCode += getTroca().hashCode();
        }
        if (getNumeroPorta() != null) {
            _hashCode += getNumeroPorta().hashCode();
        }
        if (getSessionBorder() != null) {
            _hashCode += getSessionBorder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PortaFXSWS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/portaFXS", "PortaFXSWS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/portaFXS", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/portaFXS", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/statusServico", "StatusServico"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/portaFXS", "acao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/tipoAcao", "TipoAcao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instancia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/portaFXS", "instancia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("troca");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/portaFXS", "troca"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/portaFXS", "TrocaPortaFXSWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroPorta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/portaFXS", "numeroPorta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionBorder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/portaFXS", "sessionBorder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/sessionBorder", "SessionBorder"));
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
