/**
 * ModeloEquipamento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.services.model.modeloEquipamento;

public class ModeloEquipamento  implements java.io.Serializable {
    private int id;

    private java.lang.String modelo;

    private java.lang.String descricao;

    private com.gvt.www.services.model.fabricante.Fabricante fabricante;

    private com.gvt.www.services.model.map.Map[] detalhe;

    private com.gvt.www.services.model.recursoLogicoSpec.RecursoLogicoSpec recursoLogicoSpec;

    public ModeloEquipamento() {
    }

    public ModeloEquipamento(
           int id,
           java.lang.String modelo,
           java.lang.String descricao,
           com.gvt.www.services.model.fabricante.Fabricante fabricante,
           com.gvt.www.services.model.map.Map[] detalhe,
           com.gvt.www.services.model.recursoLogicoSpec.RecursoLogicoSpec recursoLogicoSpec) {
           this.id = id;
           this.modelo = modelo;
           this.descricao = descricao;
           this.fabricante = fabricante;
           this.detalhe = detalhe;
           this.recursoLogicoSpec = recursoLogicoSpec;
    }


    /**
     * Gets the id value for this ModeloEquipamento.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this ModeloEquipamento.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the modelo value for this ModeloEquipamento.
     * 
     * @return modelo
     */
    public java.lang.String getModelo() {
        return modelo;
    }


    /**
     * Sets the modelo value for this ModeloEquipamento.
     * 
     * @param modelo
     */
    public void setModelo(java.lang.String modelo) {
        this.modelo = modelo;
    }


    /**
     * Gets the descricao value for this ModeloEquipamento.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this ModeloEquipamento.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the fabricante value for this ModeloEquipamento.
     * 
     * @return fabricante
     */
    public com.gvt.www.services.model.fabricante.Fabricante getFabricante() {
        return fabricante;
    }


    /**
     * Sets the fabricante value for this ModeloEquipamento.
     * 
     * @param fabricante
     */
    public void setFabricante(com.gvt.www.services.model.fabricante.Fabricante fabricante) {
        this.fabricante = fabricante;
    }


    /**
     * Gets the detalhe value for this ModeloEquipamento.
     * 
     * @return detalhe
     */
    public com.gvt.www.services.model.map.Map[] getDetalhe() {
        return detalhe;
    }


    /**
     * Sets the detalhe value for this ModeloEquipamento.
     * 
     * @param detalhe
     */
    public void setDetalhe(com.gvt.www.services.model.map.Map[] detalhe) {
        this.detalhe = detalhe;
    }

    public com.gvt.www.services.model.map.Map getDetalhe(int i) {
        return this.detalhe[i];
    }

    public void setDetalhe(int i, com.gvt.www.services.model.map.Map _value) {
        this.detalhe[i] = _value;
    }


    /**
     * Gets the recursoLogicoSpec value for this ModeloEquipamento.
     * 
     * @return recursoLogicoSpec
     */
    public com.gvt.www.services.model.recursoLogicoSpec.RecursoLogicoSpec getRecursoLogicoSpec() {
        return recursoLogicoSpec;
    }


    /**
     * Sets the recursoLogicoSpec value for this ModeloEquipamento.
     * 
     * @param recursoLogicoSpec
     */
    public void setRecursoLogicoSpec(com.gvt.www.services.model.recursoLogicoSpec.RecursoLogicoSpec recursoLogicoSpec) {
        this.recursoLogicoSpec = recursoLogicoSpec;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModeloEquipamento)) return false;
        ModeloEquipamento other = (ModeloEquipamento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.modelo==null && other.getModelo()==null) || 
             (this.modelo!=null &&
              this.modelo.equals(other.getModelo()))) &&
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            ((this.fabricante==null && other.getFabricante()==null) || 
             (this.fabricante!=null &&
              this.fabricante.equals(other.getFabricante()))) &&
            ((this.detalhe==null && other.getDetalhe()==null) || 
             (this.detalhe!=null &&
              java.util.Arrays.equals(this.detalhe, other.getDetalhe()))) &&
            ((this.recursoLogicoSpec==null && other.getRecursoLogicoSpec()==null) || 
             (this.recursoLogicoSpec!=null &&
              this.recursoLogicoSpec.equals(other.getRecursoLogicoSpec())));
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
        _hashCode += getId();
        if (getModelo() != null) {
            _hashCode += getModelo().hashCode();
        }
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        if (getFabricante() != null) {
            _hashCode += getFabricante().hashCode();
        }
        if (getDetalhe() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetalhe());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetalhe(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecursoLogicoSpec() != null) {
            _hashCode += getRecursoLogicoSpec().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModeloEquipamento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/modeloEquipamento", "ModeloEquipamento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/modeloEquipamento", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/modeloEquipamento", "modelo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/modeloEquipamento", "descricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fabricante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/modeloEquipamento", "fabricante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/fabricante", "Fabricante"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detalhe");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/modeloEquipamento", "detalhe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/map", "Map"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recursoLogicoSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/modeloEquipamento", "recursoLogicoSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/recursoLogicoSpec", "RecursoLogicoSpec"));
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
