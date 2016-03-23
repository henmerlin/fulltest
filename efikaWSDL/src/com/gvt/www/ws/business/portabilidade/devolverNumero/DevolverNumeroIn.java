/**
 * DevolverNumeroIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.devolverNumero;

public class DevolverNumeroIn  implements java.io.Serializable {
    private com.gvt.www.metaData.security.Passport passport;

    private java.lang.String number;

    private java.util.Calendar dataDesconexao;

    private java.util.Calendar dataLiberacaoEfetiva;

    public DevolverNumeroIn() {
    }

    public DevolverNumeroIn(
           com.gvt.www.metaData.security.Passport passport,
           java.lang.String number,
           java.util.Calendar dataDesconexao,
           java.util.Calendar dataLiberacaoEfetiva) {
           this.passport = passport;
           this.number = number;
           this.dataDesconexao = dataDesconexao;
           this.dataLiberacaoEfetiva = dataLiberacaoEfetiva;
    }


    /**
     * Gets the passport value for this DevolverNumeroIn.
     * 
     * @return passport
     */
    public com.gvt.www.metaData.security.Passport getPassport() {
        return passport;
    }


    /**
     * Sets the passport value for this DevolverNumeroIn.
     * 
     * @param passport
     */
    public void setPassport(com.gvt.www.metaData.security.Passport passport) {
        this.passport = passport;
    }


    /**
     * Gets the number value for this DevolverNumeroIn.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this DevolverNumeroIn.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the dataDesconexao value for this DevolverNumeroIn.
     * 
     * @return dataDesconexao
     */
    public java.util.Calendar getDataDesconexao() {
        return dataDesconexao;
    }


    /**
     * Sets the dataDesconexao value for this DevolverNumeroIn.
     * 
     * @param dataDesconexao
     */
    public void setDataDesconexao(java.util.Calendar dataDesconexao) {
        this.dataDesconexao = dataDesconexao;
    }


    /**
     * Gets the dataLiberacaoEfetiva value for this DevolverNumeroIn.
     * 
     * @return dataLiberacaoEfetiva
     */
    public java.util.Calendar getDataLiberacaoEfetiva() {
        return dataLiberacaoEfetiva;
    }


    /**
     * Sets the dataLiberacaoEfetiva value for this DevolverNumeroIn.
     * 
     * @param dataLiberacaoEfetiva
     */
    public void setDataLiberacaoEfetiva(java.util.Calendar dataLiberacaoEfetiva) {
        this.dataLiberacaoEfetiva = dataLiberacaoEfetiva;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DevolverNumeroIn)) return false;
        DevolverNumeroIn other = (DevolverNumeroIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.passport==null && other.getPassport()==null) || 
             (this.passport!=null &&
              this.passport.equals(other.getPassport()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.dataDesconexao==null && other.getDataDesconexao()==null) || 
             (this.dataDesconexao!=null &&
              this.dataDesconexao.equals(other.getDataDesconexao()))) &&
            ((this.dataLiberacaoEfetiva==null && other.getDataLiberacaoEfetiva()==null) || 
             (this.dataLiberacaoEfetiva!=null &&
              this.dataLiberacaoEfetiva.equals(other.getDataLiberacaoEfetiva())));
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
        if (getPassport() != null) {
            _hashCode += getPassport().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getDataDesconexao() != null) {
            _hashCode += getDataDesconexao().hashCode();
        }
        if (getDataLiberacaoEfetiva() != null) {
            _hashCode += getDataLiberacaoEfetiva().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DevolverNumeroIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/devolverNumero", "devolverNumeroIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/devolverNumero", "passport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/security", "Passport"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/devolverNumero", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataDesconexao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/devolverNumero", "dataDesconexao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataLiberacaoEfetiva");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/devolverNumero", "dataLiberacaoEfetiva"));
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
