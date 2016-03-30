/**
 * SipStatusOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.telefonia.ura.co.services;

public class SipStatusOut  implements java.io.Serializable {
    private java.lang.String designator;

    private java.lang.Boolean hasMore2SipNumber;

    private java.lang.Boolean hasRegisterSas;

    private java.lang.String instance;

    private java.lang.Boolean isModemACS;

    private java.lang.String tecnology;

    public SipStatusOut() {
    }

    public SipStatusOut(
           java.lang.String designator,
           java.lang.Boolean hasMore2SipNumber,
           java.lang.Boolean hasRegisterSas,
           java.lang.String instance,
           java.lang.Boolean isModemACS,
           java.lang.String tecnology) {
           this.designator = designator;
           this.hasMore2SipNumber = hasMore2SipNumber;
           this.hasRegisterSas = hasRegisterSas;
           this.instance = instance;
           this.isModemACS = isModemACS;
           this.tecnology = tecnology;
    }


    /**
     * Gets the designator value for this SipStatusOut.
     * 
     * @return designator
     */
    public java.lang.String getDesignator() {
        return designator;
    }


    /**
     * Sets the designator value for this SipStatusOut.
     * 
     * @param designator
     */
    public void setDesignator(java.lang.String designator) {
        this.designator = designator;
    }


    /**
     * Gets the hasMore2SipNumber value for this SipStatusOut.
     * 
     * @return hasMore2SipNumber
     */
    public java.lang.Boolean getHasMore2SipNumber() {
        return hasMore2SipNumber;
    }


    /**
     * Sets the hasMore2SipNumber value for this SipStatusOut.
     * 
     * @param hasMore2SipNumber
     */
    public void setHasMore2SipNumber(java.lang.Boolean hasMore2SipNumber) {
        this.hasMore2SipNumber = hasMore2SipNumber;
    }


    /**
     * Gets the hasRegisterSas value for this SipStatusOut.
     * 
     * @return hasRegisterSas
     */
    public java.lang.Boolean getHasRegisterSas() {
        return hasRegisterSas;
    }


    /**
     * Sets the hasRegisterSas value for this SipStatusOut.
     * 
     * @param hasRegisterSas
     */
    public void setHasRegisterSas(java.lang.Boolean hasRegisterSas) {
        this.hasRegisterSas = hasRegisterSas;
    }


    /**
     * Gets the instance value for this SipStatusOut.
     * 
     * @return instance
     */
    public java.lang.String getInstance() {
        return instance;
    }


    /**
     * Sets the instance value for this SipStatusOut.
     * 
     * @param instance
     */
    public void setInstance(java.lang.String instance) {
        this.instance = instance;
    }


    /**
     * Gets the isModemACS value for this SipStatusOut.
     * 
     * @return isModemACS
     */
    public java.lang.Boolean getIsModemACS() {
        return isModemACS;
    }


    /**
     * Sets the isModemACS value for this SipStatusOut.
     * 
     * @param isModemACS
     */
    public void setIsModemACS(java.lang.Boolean isModemACS) {
        this.isModemACS = isModemACS;
    }


    /**
     * Gets the tecnology value for this SipStatusOut.
     * 
     * @return tecnology
     */
    public java.lang.String getTecnology() {
        return tecnology;
    }


    /**
     * Sets the tecnology value for this SipStatusOut.
     * 
     * @param tecnology
     */
    public void setTecnology(java.lang.String tecnology) {
        this.tecnology = tecnology;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SipStatusOut)) return false;
        SipStatusOut other = (SipStatusOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.designator==null && other.getDesignator()==null) || 
             (this.designator!=null &&
              this.designator.equals(other.getDesignator()))) &&
            ((this.hasMore2SipNumber==null && other.getHasMore2SipNumber()==null) || 
             (this.hasMore2SipNumber!=null &&
              this.hasMore2SipNumber.equals(other.getHasMore2SipNumber()))) &&
            ((this.hasRegisterSas==null && other.getHasRegisterSas()==null) || 
             (this.hasRegisterSas!=null &&
              this.hasRegisterSas.equals(other.getHasRegisterSas()))) &&
            ((this.instance==null && other.getInstance()==null) || 
             (this.instance!=null &&
              this.instance.equals(other.getInstance()))) &&
            ((this.isModemACS==null && other.getIsModemACS()==null) || 
             (this.isModemACS!=null &&
              this.isModemACS.equals(other.getIsModemACS()))) &&
            ((this.tecnology==null && other.getTecnology()==null) || 
             (this.tecnology!=null &&
              this.tecnology.equals(other.getTecnology())));
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
        if (getDesignator() != null) {
            _hashCode += getDesignator().hashCode();
        }
        if (getHasMore2SipNumber() != null) {
            _hashCode += getHasMore2SipNumber().hashCode();
        }
        if (getHasRegisterSas() != null) {
            _hashCode += getHasRegisterSas().hashCode();
        }
        if (getInstance() != null) {
            _hashCode += getInstance().hashCode();
        }
        if (getIsModemACS() != null) {
            _hashCode += getIsModemACS().hashCode();
        }
        if (getTecnology() != null) {
            _hashCode += getTecnology().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SipStatusOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "sipStatusOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "designator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasMore2SipNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasMore2SipNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasRegisterSas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasRegisterSas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isModemACS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isModemACS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tecnology");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tecnology"));
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
