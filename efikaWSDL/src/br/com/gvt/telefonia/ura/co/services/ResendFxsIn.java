/**
 * ResendFxsIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.telefonia.ura.co.services;

public class ResendFxsIn  implements java.io.Serializable {
    private java.lang.String accessDesignator;

    private java.lang.String designator;

    private java.lang.String isGpon;

    public ResendFxsIn() {
    }

    public ResendFxsIn(
           java.lang.String accessDesignator,
           java.lang.String designator,
           java.lang.String isGpon) {
           this.accessDesignator = accessDesignator;
           this.designator = designator;
           this.isGpon = isGpon;
    }


    /**
     * Gets the accessDesignator value for this ResendFxsIn.
     * 
     * @return accessDesignator
     */
    public java.lang.String getAccessDesignator() {
        return accessDesignator;
    }


    /**
     * Sets the accessDesignator value for this ResendFxsIn.
     * 
     * @param accessDesignator
     */
    public void setAccessDesignator(java.lang.String accessDesignator) {
        this.accessDesignator = accessDesignator;
    }


    /**
     * Gets the designator value for this ResendFxsIn.
     * 
     * @return designator
     */
    public java.lang.String getDesignator() {
        return designator;
    }


    /**
     * Sets the designator value for this ResendFxsIn.
     * 
     * @param designator
     */
    public void setDesignator(java.lang.String designator) {
        this.designator = designator;
    }


    /**
     * Gets the isGpon value for this ResendFxsIn.
     * 
     * @return isGpon
     */
    public java.lang.String getIsGpon() {
        return isGpon;
    }


    /**
     * Sets the isGpon value for this ResendFxsIn.
     * 
     * @param isGpon
     */
    public void setIsGpon(java.lang.String isGpon) {
        this.isGpon = isGpon;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResendFxsIn)) return false;
        ResendFxsIn other = (ResendFxsIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accessDesignator==null && other.getAccessDesignator()==null) || 
             (this.accessDesignator!=null &&
              this.accessDesignator.equals(other.getAccessDesignator()))) &&
            ((this.designator==null && other.getDesignator()==null) || 
             (this.designator!=null &&
              this.designator.equals(other.getDesignator()))) &&
            ((this.isGpon==null && other.getIsGpon()==null) || 
             (this.isGpon!=null &&
              this.isGpon.equals(other.getIsGpon())));
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
        if (getAccessDesignator() != null) {
            _hashCode += getAccessDesignator().hashCode();
        }
        if (getDesignator() != null) {
            _hashCode += getDesignator().hashCode();
        }
        if (getIsGpon() != null) {
            _hashCode += getIsGpon().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResendFxsIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "resendFxsIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessDesignator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accessDesignator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "designator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isGpon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isGpon"));
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
