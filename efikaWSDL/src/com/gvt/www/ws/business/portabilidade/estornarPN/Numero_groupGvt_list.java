/**
 * Numero_groupGvt_list.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.estornarPN;

public class Numero_groupGvt_list  implements java.io.Serializable {
    private java.math.BigInteger groupGvt;

    private java.lang.String[] numeroList;

    public Numero_groupGvt_list() {
    }

    public Numero_groupGvt_list(
           java.math.BigInteger groupGvt,
           java.lang.String[] numeroList) {
           this.groupGvt = groupGvt;
           this.numeroList = numeroList;
    }


    /**
     * Gets the groupGvt value for this Numero_groupGvt_list.
     * 
     * @return groupGvt
     */
    public java.math.BigInteger getGroupGvt() {
        return groupGvt;
    }


    /**
     * Sets the groupGvt value for this Numero_groupGvt_list.
     * 
     * @param groupGvt
     */
    public void setGroupGvt(java.math.BigInteger groupGvt) {
        this.groupGvt = groupGvt;
    }


    /**
     * Gets the numeroList value for this Numero_groupGvt_list.
     * 
     * @return numeroList
     */
    public java.lang.String[] getNumeroList() {
        return numeroList;
    }


    /**
     * Sets the numeroList value for this Numero_groupGvt_list.
     * 
     * @param numeroList
     */
    public void setNumeroList(java.lang.String[] numeroList) {
        this.numeroList = numeroList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Numero_groupGvt_list)) return false;
        Numero_groupGvt_list other = (Numero_groupGvt_list) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.groupGvt==null && other.getGroupGvt()==null) || 
             (this.groupGvt!=null &&
              this.groupGvt.equals(other.getGroupGvt()))) &&
            ((this.numeroList==null && other.getNumeroList()==null) || 
             (this.numeroList!=null &&
              java.util.Arrays.equals(this.numeroList, other.getNumeroList())));
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
        if (getGroupGvt() != null) {
            _hashCode += getGroupGvt().hashCode();
        }
        if (getNumeroList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNumeroList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNumeroList(), i);
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
        new org.apache.axis.description.TypeDesc(Numero_groupGvt_list.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", "numero_groupGvt_list"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupGvt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", "groupGvt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", "numeroList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", "numero"));
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
