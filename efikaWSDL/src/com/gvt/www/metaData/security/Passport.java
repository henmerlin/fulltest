/**
 * Passport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.metaData.security;

public class Passport  implements java.io.Serializable {
    private java.lang.String system;

    private java.lang.String userName;

    private java.lang.String[] position;

    private java.lang.Integer viewMode;

    public Passport() {
    }

    public Passport(
           java.lang.String system,
           java.lang.String userName,
           java.lang.String[] position,
           java.lang.Integer viewMode) {
           this.system = system;
           this.userName = userName;
           this.position = position;
           this.viewMode = viewMode;
    }


    /**
     * Gets the system value for this Passport.
     * 
     * @return system
     */
    public java.lang.String getSystem() {
        return system;
    }


    /**
     * Sets the system value for this Passport.
     * 
     * @param system
     */
    public void setSystem(java.lang.String system) {
        this.system = system;
    }


    /**
     * Gets the userName value for this Passport.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this Passport.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the position value for this Passport.
     * 
     * @return position
     */
    public java.lang.String[] getPosition() {
        return position;
    }


    /**
     * Sets the position value for this Passport.
     * 
     * @param position
     */
    public void setPosition(java.lang.String[] position) {
        this.position = position;
    }

    public java.lang.String getPosition(int i) {
        return this.position[i];
    }

    public void setPosition(int i, java.lang.String _value) {
        this.position[i] = _value;
    }


    /**
     * Gets the viewMode value for this Passport.
     * 
     * @return viewMode
     */
    public java.lang.Integer getViewMode() {
        return viewMode;
    }


    /**
     * Sets the viewMode value for this Passport.
     * 
     * @param viewMode
     */
    public void setViewMode(java.lang.Integer viewMode) {
        this.viewMode = viewMode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Passport)) return false;
        Passport other = (Passport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.system==null && other.getSystem()==null) || 
             (this.system!=null &&
              this.system.equals(other.getSystem()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.position==null && other.getPosition()==null) || 
             (this.position!=null &&
              java.util.Arrays.equals(this.position, other.getPosition()))) &&
            ((this.viewMode==null && other.getViewMode()==null) || 
             (this.viewMode!=null &&
              this.viewMode.equals(other.getViewMode())));
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
        if (getSystem() != null) {
            _hashCode += getSystem().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getPosition() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPosition());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPosition(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getViewMode() != null) {
            _hashCode += getViewMode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Passport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/security", "Passport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("system");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/security", "system"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/security", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("position");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/security", "position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/security", "viewMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
