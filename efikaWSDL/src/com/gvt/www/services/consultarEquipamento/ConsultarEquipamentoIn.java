/**
 * ConsultarEquipamentoIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.services.consultarEquipamento;

public class ConsultarEquipamentoIn  implements java.io.Serializable {
    private java.lang.String designador;

    private java.lang.String serial;

    private java.lang.String caid;

    private java.lang.String idOrdemCRM;

    private java.lang.String idOrdemWorkforce;

    public ConsultarEquipamentoIn() {
    }

    public ConsultarEquipamentoIn(
           java.lang.String designador,
           java.lang.String serial,
           java.lang.String caid,
           java.lang.String idOrdemCRM,
           java.lang.String idOrdemWorkforce) {
           this.designador = designador;
           this.serial = serial;
           this.caid = caid;
           this.idOrdemCRM = idOrdemCRM;
           this.idOrdemWorkforce = idOrdemWorkforce;
    }


    /**
     * Gets the designador value for this ConsultarEquipamentoIn.
     * 
     * @return designador
     */
    public java.lang.String getDesignador() {
        return designador;
    }


    /**
     * Sets the designador value for this ConsultarEquipamentoIn.
     * 
     * @param designador
     */
    public void setDesignador(java.lang.String designador) {
        this.designador = designador;
    }


    /**
     * Gets the serial value for this ConsultarEquipamentoIn.
     * 
     * @return serial
     */
    public java.lang.String getSerial() {
        return serial;
    }


    /**
     * Sets the serial value for this ConsultarEquipamentoIn.
     * 
     * @param serial
     */
    public void setSerial(java.lang.String serial) {
        this.serial = serial;
    }


    /**
     * Gets the caid value for this ConsultarEquipamentoIn.
     * 
     * @return caid
     */
    public java.lang.String getCaid() {
        return caid;
    }


    /**
     * Sets the caid value for this ConsultarEquipamentoIn.
     * 
     * @param caid
     */
    public void setCaid(java.lang.String caid) {
        this.caid = caid;
    }


    /**
     * Gets the idOrdemCRM value for this ConsultarEquipamentoIn.
     * 
     * @return idOrdemCRM
     */
    public java.lang.String getIdOrdemCRM() {
        return idOrdemCRM;
    }


    /**
     * Sets the idOrdemCRM value for this ConsultarEquipamentoIn.
     * 
     * @param idOrdemCRM
     */
    public void setIdOrdemCRM(java.lang.String idOrdemCRM) {
        this.idOrdemCRM = idOrdemCRM;
    }


    /**
     * Gets the idOrdemWorkforce value for this ConsultarEquipamentoIn.
     * 
     * @return idOrdemWorkforce
     */
    public java.lang.String getIdOrdemWorkforce() {
        return idOrdemWorkforce;
    }


    /**
     * Sets the idOrdemWorkforce value for this ConsultarEquipamentoIn.
     * 
     * @param idOrdemWorkforce
     */
    public void setIdOrdemWorkforce(java.lang.String idOrdemWorkforce) {
        this.idOrdemWorkforce = idOrdemWorkforce;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarEquipamentoIn)) return false;
        ConsultarEquipamentoIn other = (ConsultarEquipamentoIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.designador==null && other.getDesignador()==null) || 
             (this.designador!=null &&
              this.designador.equals(other.getDesignador()))) &&
            ((this.serial==null && other.getSerial()==null) || 
             (this.serial!=null &&
              this.serial.equals(other.getSerial()))) &&
            ((this.caid==null && other.getCaid()==null) || 
             (this.caid!=null &&
              this.caid.equals(other.getCaid()))) &&
            ((this.idOrdemCRM==null && other.getIdOrdemCRM()==null) || 
             (this.idOrdemCRM!=null &&
              this.idOrdemCRM.equals(other.getIdOrdemCRM()))) &&
            ((this.idOrdemWorkforce==null && other.getIdOrdemWorkforce()==null) || 
             (this.idOrdemWorkforce!=null &&
              this.idOrdemWorkforce.equals(other.getIdOrdemWorkforce())));
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
        if (getDesignador() != null) {
            _hashCode += getDesignador().hashCode();
        }
        if (getSerial() != null) {
            _hashCode += getSerial().hashCode();
        }
        if (getCaid() != null) {
            _hashCode += getCaid().hashCode();
        }
        if (getIdOrdemCRM() != null) {
            _hashCode += getIdOrdemCRM().hashCode();
        }
        if (getIdOrdemWorkforce() != null) {
            _hashCode += getIdOrdemWorkforce().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultarEquipamentoIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/consultarEquipamento", "ConsultarEquipamentoIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/consultarEquipamento", "designador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/consultarEquipamento", "serial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/consultarEquipamento", "caid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idOrdemCRM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/consultarEquipamento", "idOrdemCRM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idOrdemWorkforce");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/consultarEquipamento", "idOrdemWorkforce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
