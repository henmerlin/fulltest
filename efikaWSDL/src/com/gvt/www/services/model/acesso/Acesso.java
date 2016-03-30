/**
 * Acesso.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.services.model.acesso;

public class Acesso  implements java.io.Serializable {
    private java.lang.String idAcesso;

    private java.lang.String tecnologia;

    private com.gvt.www.services.model.designador.Designador[] designadores;

    public Acesso() {
    }

    public Acesso(
           java.lang.String idAcesso,
           java.lang.String tecnologia,
           com.gvt.www.services.model.designador.Designador[] designadores) {
           this.idAcesso = idAcesso;
           this.tecnologia = tecnologia;
           this.designadores = designadores;
    }


    /**
     * Gets the idAcesso value for this Acesso.
     * 
     * @return idAcesso
     */
    public java.lang.String getIdAcesso() {
        return idAcesso;
    }


    /**
     * Sets the idAcesso value for this Acesso.
     * 
     * @param idAcesso
     */
    public void setIdAcesso(java.lang.String idAcesso) {
        this.idAcesso = idAcesso;
    }


    /**
     * Gets the tecnologia value for this Acesso.
     * 
     * @return tecnologia
     */
    public java.lang.String getTecnologia() {
        return tecnologia;
    }


    /**
     * Sets the tecnologia value for this Acesso.
     * 
     * @param tecnologia
     */
    public void setTecnologia(java.lang.String tecnologia) {
        this.tecnologia = tecnologia;
    }


    /**
     * Gets the designadores value for this Acesso.
     * 
     * @return designadores
     */
    public com.gvt.www.services.model.designador.Designador[] getDesignadores() {
        return designadores;
    }


    /**
     * Sets the designadores value for this Acesso.
     * 
     * @param designadores
     */
    public void setDesignadores(com.gvt.www.services.model.designador.Designador[] designadores) {
        this.designadores = designadores;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Acesso)) return false;
        Acesso other = (Acesso) obj;
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
            ((this.tecnologia==null && other.getTecnologia()==null) || 
             (this.tecnologia!=null &&
              this.tecnologia.equals(other.getTecnologia()))) &&
            ((this.designadores==null && other.getDesignadores()==null) || 
             (this.designadores!=null &&
              java.util.Arrays.equals(this.designadores, other.getDesignadores())));
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
        if (getTecnologia() != null) {
            _hashCode += getTecnologia().hashCode();
        }
        if (getDesignadores() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDesignadores());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDesignadores(), i);
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
        new org.apache.axis.description.TypeDesc(Acesso.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/acesso", "Acesso"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idAcesso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/acesso", "idAcesso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tecnologia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/acesso", "tecnologia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadores");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/acesso", "designadores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/designador", "Designador"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/designador", "designador"));
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
