/**
 * Designador.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.services.model.designador;

public class Designador  implements java.io.Serializable {
    private java.lang.String idDesignador;

    private java.lang.String tipo;

    private java.lang.String tecnologia;

    private com.gvt.www.services.model.tipoAcao.TipoAcao acao;

    private com.gvt.www.services.model.linhaInfo.LinhaInfo linhaInfo;

    private com.gvt.www.services.model.adslInfo.ADSLInfo adslInfo;

    private com.gvt.www.services.model.tvInfo.TVInfo tvInfo;

    private com.gvt.www.services.model.item.Item[] items;

    public Designador() {
    }

    public Designador(
           java.lang.String idDesignador,
           java.lang.String tipo,
           java.lang.String tecnologia,
           com.gvt.www.services.model.tipoAcao.TipoAcao acao,
           com.gvt.www.services.model.linhaInfo.LinhaInfo linhaInfo,
           com.gvt.www.services.model.adslInfo.ADSLInfo adslInfo,
           com.gvt.www.services.model.tvInfo.TVInfo tvInfo,
           com.gvt.www.services.model.item.Item[] items) {
           this.idDesignador = idDesignador;
           this.tipo = tipo;
           this.tecnologia = tecnologia;
           this.acao = acao;
           this.linhaInfo = linhaInfo;
           this.adslInfo = adslInfo;
           this.tvInfo = tvInfo;
           this.items = items;
    }


    /**
     * Gets the idDesignador value for this Designador.
     * 
     * @return idDesignador
     */
    public java.lang.String getIdDesignador() {
        return idDesignador;
    }


    /**
     * Sets the idDesignador value for this Designador.
     * 
     * @param idDesignador
     */
    public void setIdDesignador(java.lang.String idDesignador) {
        this.idDesignador = idDesignador;
    }


    /**
     * Gets the tipo value for this Designador.
     * 
     * @return tipo
     */
    public java.lang.String getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this Designador.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the tecnologia value for this Designador.
     * 
     * @return tecnologia
     */
    public java.lang.String getTecnologia() {
        return tecnologia;
    }


    /**
     * Sets the tecnologia value for this Designador.
     * 
     * @param tecnologia
     */
    public void setTecnologia(java.lang.String tecnologia) {
        this.tecnologia = tecnologia;
    }


    /**
     * Gets the acao value for this Designador.
     * 
     * @return acao
     */
    public com.gvt.www.services.model.tipoAcao.TipoAcao getAcao() {
        return acao;
    }


    /**
     * Sets the acao value for this Designador.
     * 
     * @param acao
     */
    public void setAcao(com.gvt.www.services.model.tipoAcao.TipoAcao acao) {
        this.acao = acao;
    }


    /**
     * Gets the linhaInfo value for this Designador.
     * 
     * @return linhaInfo
     */
    public com.gvt.www.services.model.linhaInfo.LinhaInfo getLinhaInfo() {
        return linhaInfo;
    }


    /**
     * Sets the linhaInfo value for this Designador.
     * 
     * @param linhaInfo
     */
    public void setLinhaInfo(com.gvt.www.services.model.linhaInfo.LinhaInfo linhaInfo) {
        this.linhaInfo = linhaInfo;
    }


    /**
     * Gets the adslInfo value for this Designador.
     * 
     * @return adslInfo
     */
    public com.gvt.www.services.model.adslInfo.ADSLInfo getAdslInfo() {
        return adslInfo;
    }


    /**
     * Sets the adslInfo value for this Designador.
     * 
     * @param adslInfo
     */
    public void setAdslInfo(com.gvt.www.services.model.adslInfo.ADSLInfo adslInfo) {
        this.adslInfo = adslInfo;
    }


    /**
     * Gets the tvInfo value for this Designador.
     * 
     * @return tvInfo
     */
    public com.gvt.www.services.model.tvInfo.TVInfo getTvInfo() {
        return tvInfo;
    }


    /**
     * Sets the tvInfo value for this Designador.
     * 
     * @param tvInfo
     */
    public void setTvInfo(com.gvt.www.services.model.tvInfo.TVInfo tvInfo) {
        this.tvInfo = tvInfo;
    }


    /**
     * Gets the items value for this Designador.
     * 
     * @return items
     */
    public com.gvt.www.services.model.item.Item[] getItems() {
        return items;
    }


    /**
     * Sets the items value for this Designador.
     * 
     * @param items
     */
    public void setItems(com.gvt.www.services.model.item.Item[] items) {
        this.items = items;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Designador)) return false;
        Designador other = (Designador) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idDesignador==null && other.getIdDesignador()==null) || 
             (this.idDesignador!=null &&
              this.idDesignador.equals(other.getIdDesignador()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.tecnologia==null && other.getTecnologia()==null) || 
             (this.tecnologia!=null &&
              this.tecnologia.equals(other.getTecnologia()))) &&
            ((this.acao==null && other.getAcao()==null) || 
             (this.acao!=null &&
              this.acao.equals(other.getAcao()))) &&
            ((this.linhaInfo==null && other.getLinhaInfo()==null) || 
             (this.linhaInfo!=null &&
              this.linhaInfo.equals(other.getLinhaInfo()))) &&
            ((this.adslInfo==null && other.getAdslInfo()==null) || 
             (this.adslInfo!=null &&
              this.adslInfo.equals(other.getAdslInfo()))) &&
            ((this.tvInfo==null && other.getTvInfo()==null) || 
             (this.tvInfo!=null &&
              this.tvInfo.equals(other.getTvInfo()))) &&
            ((this.items==null && other.getItems()==null) || 
             (this.items!=null &&
              java.util.Arrays.equals(this.items, other.getItems())));
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
        if (getIdDesignador() != null) {
            _hashCode += getIdDesignador().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getTecnologia() != null) {
            _hashCode += getTecnologia().hashCode();
        }
        if (getAcao() != null) {
            _hashCode += getAcao().hashCode();
        }
        if (getLinhaInfo() != null) {
            _hashCode += getLinhaInfo().hashCode();
        }
        if (getAdslInfo() != null) {
            _hashCode += getAdslInfo().hashCode();
        }
        if (getTvInfo() != null) {
            _hashCode += getTvInfo().hashCode();
        }
        if (getItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItems(), i);
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
        new org.apache.axis.description.TypeDesc(Designador.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/designador", "Designador"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idDesignador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/designador", "idDesignador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/designador", "tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tecnologia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/designador", "tecnologia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/designador", "acao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/tipoAcao", "TipoAcao"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linhaInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/designador", "linhaInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/linhaInfo", "LinhaInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adslInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/designador", "adslInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/adslInfo", "ADSLInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tvInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/designador", "tvInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/tvInfo", "TVInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("items");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/designador", "items"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/item", "Item"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/item", "item"));
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
