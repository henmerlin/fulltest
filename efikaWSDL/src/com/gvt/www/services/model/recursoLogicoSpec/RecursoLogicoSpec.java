/**
 * RecursoLogicoSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.services.model.recursoLogicoSpec;

public class RecursoLogicoSpec  implements java.io.Serializable {
    private java.lang.Integer id;

    private java.lang.String descricao;

    private com.gvt.www.services.model.tipoRecursoLogico.TipoRecursoLogico tipoRecursoLogico;

    private com.gvt.www.services.model.tecnologiaRecursoLogico.TecnologiaRecursoLogico[] tecnologiaRecursoLogico;

    private com.gvt.www.services.model.map.Map[] param;

    public RecursoLogicoSpec() {
    }

    public RecursoLogicoSpec(
           java.lang.Integer id,
           java.lang.String descricao,
           com.gvt.www.services.model.tipoRecursoLogico.TipoRecursoLogico tipoRecursoLogico,
           com.gvt.www.services.model.tecnologiaRecursoLogico.TecnologiaRecursoLogico[] tecnologiaRecursoLogico,
           com.gvt.www.services.model.map.Map[] param) {
           this.id = id;
           this.descricao = descricao;
           this.tipoRecursoLogico = tipoRecursoLogico;
           this.tecnologiaRecursoLogico = tecnologiaRecursoLogico;
           this.param = param;
    }


    /**
     * Gets the id value for this RecursoLogicoSpec.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this RecursoLogicoSpec.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the descricao value for this RecursoLogicoSpec.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this RecursoLogicoSpec.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the tipoRecursoLogico value for this RecursoLogicoSpec.
     * 
     * @return tipoRecursoLogico
     */
    public com.gvt.www.services.model.tipoRecursoLogico.TipoRecursoLogico getTipoRecursoLogico() {
        return tipoRecursoLogico;
    }


    /**
     * Sets the tipoRecursoLogico value for this RecursoLogicoSpec.
     * 
     * @param tipoRecursoLogico
     */
    public void setTipoRecursoLogico(com.gvt.www.services.model.tipoRecursoLogico.TipoRecursoLogico tipoRecursoLogico) {
        this.tipoRecursoLogico = tipoRecursoLogico;
    }


    /**
     * Gets the tecnologiaRecursoLogico value for this RecursoLogicoSpec.
     * 
     * @return tecnologiaRecursoLogico
     */
    public com.gvt.www.services.model.tecnologiaRecursoLogico.TecnologiaRecursoLogico[] getTecnologiaRecursoLogico() {
        return tecnologiaRecursoLogico;
    }


    /**
     * Sets the tecnologiaRecursoLogico value for this RecursoLogicoSpec.
     * 
     * @param tecnologiaRecursoLogico
     */
    public void setTecnologiaRecursoLogico(com.gvt.www.services.model.tecnologiaRecursoLogico.TecnologiaRecursoLogico[] tecnologiaRecursoLogico) {
        this.tecnologiaRecursoLogico = tecnologiaRecursoLogico;
    }

    public com.gvt.www.services.model.tecnologiaRecursoLogico.TecnologiaRecursoLogico getTecnologiaRecursoLogico(int i) {
        return this.tecnologiaRecursoLogico[i];
    }

    public void setTecnologiaRecursoLogico(int i, com.gvt.www.services.model.tecnologiaRecursoLogico.TecnologiaRecursoLogico _value) {
        this.tecnologiaRecursoLogico[i] = _value;
    }


    /**
     * Gets the param value for this RecursoLogicoSpec.
     * 
     * @return param
     */
    public com.gvt.www.services.model.map.Map[] getParam() {
        return param;
    }


    /**
     * Sets the param value for this RecursoLogicoSpec.
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

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecursoLogicoSpec)) return false;
        RecursoLogicoSpec other = (RecursoLogicoSpec) obj;
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
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            ((this.tipoRecursoLogico==null && other.getTipoRecursoLogico()==null) || 
             (this.tipoRecursoLogico!=null &&
              this.tipoRecursoLogico.equals(other.getTipoRecursoLogico()))) &&
            ((this.tecnologiaRecursoLogico==null && other.getTecnologiaRecursoLogico()==null) || 
             (this.tecnologiaRecursoLogico!=null &&
              java.util.Arrays.equals(this.tecnologiaRecursoLogico, other.getTecnologiaRecursoLogico()))) &&
            ((this.param==null && other.getParam()==null) || 
             (this.param!=null &&
              java.util.Arrays.equals(this.param, other.getParam())));
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
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        if (getTipoRecursoLogico() != null) {
            _hashCode += getTipoRecursoLogico().hashCode();
        }
        if (getTecnologiaRecursoLogico() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTecnologiaRecursoLogico());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTecnologiaRecursoLogico(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecursoLogicoSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/recursoLogicoSpec", "RecursoLogicoSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/recursoLogicoSpec", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/recursoLogicoSpec", "descricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoRecursoLogico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/recursoLogicoSpec", "tipoRecursoLogico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/tipoRecursoLogico", "TipoRecursoLogico"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tecnologiaRecursoLogico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/recursoLogicoSpec", "tecnologiaRecursoLogico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/tecnologiaRecursoLogico", "TecnologiaRecursoLogico"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("param");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/recursoLogicoSpec", "param"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/map", "Map"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
