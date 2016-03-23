/**
 * GetDeParaIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.getDePara;

public class GetDeParaIn  implements java.io.Serializable {
    private com.gvt.www.metaData.security.Passport passport;

    /* Valores possiveis: 
     * - 'E' números de equipamento
     * - 'L' números de lista */
    private com.gvt.www.ws.business.portabilidade.getDePara.GetDeParaInTipoNumero tipoNumero;

    /* ex: 4130251234 */
    private java.lang.String[] numeros;

    public GetDeParaIn() {
    }

    public GetDeParaIn(
           com.gvt.www.metaData.security.Passport passport,
           com.gvt.www.ws.business.portabilidade.getDePara.GetDeParaInTipoNumero tipoNumero,
           java.lang.String[] numeros) {
           this.passport = passport;
           this.tipoNumero = tipoNumero;
           this.numeros = numeros;
    }


    /**
     * Gets the passport value for this GetDeParaIn.
     * 
     * @return passport
     */
    public com.gvt.www.metaData.security.Passport getPassport() {
        return passport;
    }


    /**
     * Sets the passport value for this GetDeParaIn.
     * 
     * @param passport
     */
    public void setPassport(com.gvt.www.metaData.security.Passport passport) {
        this.passport = passport;
    }


    /**
     * Gets the tipoNumero value for this GetDeParaIn.
     * 
     * @return tipoNumero   * Valores possiveis: 
     * - 'E' números de equipamento
     * - 'L' números de lista
     */
    public com.gvt.www.ws.business.portabilidade.getDePara.GetDeParaInTipoNumero getTipoNumero() {
        return tipoNumero;
    }


    /**
     * Sets the tipoNumero value for this GetDeParaIn.
     * 
     * @param tipoNumero   * Valores possiveis: 
     * - 'E' números de equipamento
     * - 'L' números de lista
     */
    public void setTipoNumero(com.gvt.www.ws.business.portabilidade.getDePara.GetDeParaInTipoNumero tipoNumero) {
        this.tipoNumero = tipoNumero;
    }


    /**
     * Gets the numeros value for this GetDeParaIn.
     * 
     * @return numeros   * ex: 4130251234
     */
    public java.lang.String[] getNumeros() {
        return numeros;
    }


    /**
     * Sets the numeros value for this GetDeParaIn.
     * 
     * @param numeros   * ex: 4130251234
     */
    public void setNumeros(java.lang.String[] numeros) {
        this.numeros = numeros;
    }

    public java.lang.String getNumeros(int i) {
        return this.numeros[i];
    }

    public void setNumeros(int i, java.lang.String _value) {
        this.numeros[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDeParaIn)) return false;
        GetDeParaIn other = (GetDeParaIn) obj;
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
            ((this.tipoNumero==null && other.getTipoNumero()==null) || 
             (this.tipoNumero!=null &&
              this.tipoNumero.equals(other.getTipoNumero()))) &&
            ((this.numeros==null && other.getNumeros()==null) || 
             (this.numeros!=null &&
              java.util.Arrays.equals(this.numeros, other.getNumeros())));
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
        if (getTipoNumero() != null) {
            _hashCode += getTipoNumero().hashCode();
        }
        if (getNumeros() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNumeros());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNumeros(), i);
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
        new org.apache.axis.description.TypeDesc(GetDeParaIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getDePara", "getDeParaIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getDePara", "passport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/security", "Passport"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoNumero");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getDePara", "tipoNumero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getDePara", ">getDeParaIn>tipoNumero"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeros");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getDePara", "numeros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
