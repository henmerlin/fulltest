/**
 * OrdemServico.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.services.model.ordemServico;

public class OrdemServico  implements java.io.Serializable {
    private java.lang.String idOrdemCRM;

    private java.lang.String idOrdemWorkforce;

    private java.lang.String idCliente;

    private java.lang.String documento;

    private java.util.Calendar data;

    public OrdemServico() {
    }

    public OrdemServico(
           java.lang.String idOrdemCRM,
           java.lang.String idOrdemWorkforce,
           java.lang.String idCliente,
           java.lang.String documento,
           java.util.Calendar data) {
           this.idOrdemCRM = idOrdemCRM;
           this.idOrdemWorkforce = idOrdemWorkforce;
           this.idCliente = idCliente;
           this.documento = documento;
           this.data = data;
    }


    /**
     * Gets the idOrdemCRM value for this OrdemServico.
     * 
     * @return idOrdemCRM
     */
    public java.lang.String getIdOrdemCRM() {
        return idOrdemCRM;
    }


    /**
     * Sets the idOrdemCRM value for this OrdemServico.
     * 
     * @param idOrdemCRM
     */
    public void setIdOrdemCRM(java.lang.String idOrdemCRM) {
        this.idOrdemCRM = idOrdemCRM;
    }


    /**
     * Gets the idOrdemWorkforce value for this OrdemServico.
     * 
     * @return idOrdemWorkforce
     */
    public java.lang.String getIdOrdemWorkforce() {
        return idOrdemWorkforce;
    }


    /**
     * Sets the idOrdemWorkforce value for this OrdemServico.
     * 
     * @param idOrdemWorkforce
     */
    public void setIdOrdemWorkforce(java.lang.String idOrdemWorkforce) {
        this.idOrdemWorkforce = idOrdemWorkforce;
    }


    /**
     * Gets the idCliente value for this OrdemServico.
     * 
     * @return idCliente
     */
    public java.lang.String getIdCliente() {
        return idCliente;
    }


    /**
     * Sets the idCliente value for this OrdemServico.
     * 
     * @param idCliente
     */
    public void setIdCliente(java.lang.String idCliente) {
        this.idCliente = idCliente;
    }


    /**
     * Gets the documento value for this OrdemServico.
     * 
     * @return documento
     */
    public java.lang.String getDocumento() {
        return documento;
    }


    /**
     * Sets the documento value for this OrdemServico.
     * 
     * @param documento
     */
    public void setDocumento(java.lang.String documento) {
        this.documento = documento;
    }


    /**
     * Gets the data value for this OrdemServico.
     * 
     * @return data
     */
    public java.util.Calendar getData() {
        return data;
    }


    /**
     * Sets the data value for this OrdemServico.
     * 
     * @param data
     */
    public void setData(java.util.Calendar data) {
        this.data = data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrdemServico)) return false;
        OrdemServico other = (OrdemServico) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idOrdemCRM==null && other.getIdOrdemCRM()==null) || 
             (this.idOrdemCRM!=null &&
              this.idOrdemCRM.equals(other.getIdOrdemCRM()))) &&
            ((this.idOrdemWorkforce==null && other.getIdOrdemWorkforce()==null) || 
             (this.idOrdemWorkforce!=null &&
              this.idOrdemWorkforce.equals(other.getIdOrdemWorkforce()))) &&
            ((this.idCliente==null && other.getIdCliente()==null) || 
             (this.idCliente!=null &&
              this.idCliente.equals(other.getIdCliente()))) &&
            ((this.documento==null && other.getDocumento()==null) || 
             (this.documento!=null &&
              this.documento.equals(other.getDocumento()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData())));
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
        if (getIdOrdemCRM() != null) {
            _hashCode += getIdOrdemCRM().hashCode();
        }
        if (getIdOrdemWorkforce() != null) {
            _hashCode += getIdOrdemWorkforce().hashCode();
        }
        if (getIdCliente() != null) {
            _hashCode += getIdCliente().hashCode();
        }
        if (getDocumento() != null) {
            _hashCode += getDocumento().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrdemServico.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/ordemServico", "OrdemServico"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idOrdemCRM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/ordemServico", "idOrdemCRM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idOrdemWorkforce");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/ordemServico", "idOrdemWorkforce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/ordemServico", "idCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/ordemServico", "documento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/ordemServico", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
