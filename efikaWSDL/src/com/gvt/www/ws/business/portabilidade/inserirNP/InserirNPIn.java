/**
 * InserirNPIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.inserirNP;

public class InserirNPIn  implements java.io.Serializable {
    private com.gvt.www.metaData.security.Passport passport;

    private com.gvt.www.ws.business.portabilidade.inserirNP.InserirNPInOperacao operacao;

    private com.gvt.www.ws.business.portabilidade.inserirNP.Numero[] numeros;

    /* Obrigatorio se o produto for Corporate */
    private com.gvt.www.ws.business.portabilidade.inserirNP.ReservaInfo reserva_info;

    public InserirNPIn() {
    }

    public InserirNPIn(
           com.gvt.www.metaData.security.Passport passport,
           com.gvt.www.ws.business.portabilidade.inserirNP.InserirNPInOperacao operacao,
           com.gvt.www.ws.business.portabilidade.inserirNP.Numero[] numeros,
           com.gvt.www.ws.business.portabilidade.inserirNP.ReservaInfo reserva_info) {
           this.passport = passport;
           this.operacao = operacao;
           this.numeros = numeros;
           this.reserva_info = reserva_info;
    }


    /**
     * Gets the passport value for this InserirNPIn.
     * 
     * @return passport
     */
    public com.gvt.www.metaData.security.Passport getPassport() {
        return passport;
    }


    /**
     * Sets the passport value for this InserirNPIn.
     * 
     * @param passport
     */
    public void setPassport(com.gvt.www.metaData.security.Passport passport) {
        this.passport = passport;
    }


    /**
     * Gets the operacao value for this InserirNPIn.
     * 
     * @return operacao
     */
    public com.gvt.www.ws.business.portabilidade.inserirNP.InserirNPInOperacao getOperacao() {
        return operacao;
    }


    /**
     * Sets the operacao value for this InserirNPIn.
     * 
     * @param operacao
     */
    public void setOperacao(com.gvt.www.ws.business.portabilidade.inserirNP.InserirNPInOperacao operacao) {
        this.operacao = operacao;
    }


    /**
     * Gets the numeros value for this InserirNPIn.
     * 
     * @return numeros
     */
    public com.gvt.www.ws.business.portabilidade.inserirNP.Numero[] getNumeros() {
        return numeros;
    }


    /**
     * Sets the numeros value for this InserirNPIn.
     * 
     * @param numeros
     */
    public void setNumeros(com.gvt.www.ws.business.portabilidade.inserirNP.Numero[] numeros) {
        this.numeros = numeros;
    }

    public com.gvt.www.ws.business.portabilidade.inserirNP.Numero getNumeros(int i) {
        return this.numeros[i];
    }

    public void setNumeros(int i, com.gvt.www.ws.business.portabilidade.inserirNP.Numero _value) {
        this.numeros[i] = _value;
    }


    /**
     * Gets the reserva_info value for this InserirNPIn.
     * 
     * @return reserva_info   * Obrigatorio se o produto for Corporate
     */
    public com.gvt.www.ws.business.portabilidade.inserirNP.ReservaInfo getReserva_info() {
        return reserva_info;
    }


    /**
     * Sets the reserva_info value for this InserirNPIn.
     * 
     * @param reserva_info   * Obrigatorio se o produto for Corporate
     */
    public void setReserva_info(com.gvt.www.ws.business.portabilidade.inserirNP.ReservaInfo reserva_info) {
        this.reserva_info = reserva_info;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InserirNPIn)) return false;
        InserirNPIn other = (InserirNPIn) obj;
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
            ((this.operacao==null && other.getOperacao()==null) || 
             (this.operacao!=null &&
              this.operacao.equals(other.getOperacao()))) &&
            ((this.numeros==null && other.getNumeros()==null) || 
             (this.numeros!=null &&
              java.util.Arrays.equals(this.numeros, other.getNumeros()))) &&
            ((this.reserva_info==null && other.getReserva_info()==null) || 
             (this.reserva_info!=null &&
              this.reserva_info.equals(other.getReserva_info())));
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
        if (getOperacao() != null) {
            _hashCode += getOperacao().hashCode();
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
        if (getReserva_info() != null) {
            _hashCode += getReserva_info().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InserirNPIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/inserirNP", "inserirNPIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/inserirNP", "passport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/security", "Passport"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/inserirNP", "operacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/inserirNP", ">inserirNPIn>operacao"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeros");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/inserirNP", "numeros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/inserirNP", "Numero"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reserva_info");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/inserirNP", "reserva_info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/inserirNP", "ReservaInfo"));
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
