/**
 * ReagendarPNIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.reagendarPN;

public class ReagendarPNIn  implements java.io.Serializable {
    private com.gvt.www.metaData.security.Passport passport;

    private java.util.Calendar dataAgendamento;

    private java.lang.String[] numero;

    private java.lang.String motivo;

    public ReagendarPNIn() {
    }

    public ReagendarPNIn(
           com.gvt.www.metaData.security.Passport passport,
           java.util.Calendar dataAgendamento,
           java.lang.String[] numero,
           java.lang.String motivo) {
           this.passport = passport;
           this.dataAgendamento = dataAgendamento;
           this.numero = numero;
           this.motivo = motivo;
    }


    /**
     * Gets the passport value for this ReagendarPNIn.
     * 
     * @return passport
     */
    public com.gvt.www.metaData.security.Passport getPassport() {
        return passport;
    }


    /**
     * Sets the passport value for this ReagendarPNIn.
     * 
     * @param passport
     */
    public void setPassport(com.gvt.www.metaData.security.Passport passport) {
        this.passport = passport;
    }


    /**
     * Gets the dataAgendamento value for this ReagendarPNIn.
     * 
     * @return dataAgendamento
     */
    public java.util.Calendar getDataAgendamento() {
        return dataAgendamento;
    }


    /**
     * Sets the dataAgendamento value for this ReagendarPNIn.
     * 
     * @param dataAgendamento
     */
    public void setDataAgendamento(java.util.Calendar dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }


    /**
     * Gets the numero value for this ReagendarPNIn.
     * 
     * @return numero
     */
    public java.lang.String[] getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this ReagendarPNIn.
     * 
     * @param numero
     */
    public void setNumero(java.lang.String[] numero) {
        this.numero = numero;
    }

    public java.lang.String getNumero(int i) {
        return this.numero[i];
    }

    public void setNumero(int i, java.lang.String _value) {
        this.numero[i] = _value;
    }


    /**
     * Gets the motivo value for this ReagendarPNIn.
     * 
     * @return motivo
     */
    public java.lang.String getMotivo() {
        return motivo;
    }


    /**
     * Sets the motivo value for this ReagendarPNIn.
     * 
     * @param motivo
     */
    public void setMotivo(java.lang.String motivo) {
        this.motivo = motivo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReagendarPNIn)) return false;
        ReagendarPNIn other = (ReagendarPNIn) obj;
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
            ((this.dataAgendamento==null && other.getDataAgendamento()==null) || 
             (this.dataAgendamento!=null &&
              this.dataAgendamento.equals(other.getDataAgendamento()))) &&
            ((this.numero==null && other.getNumero()==null) || 
             (this.numero!=null &&
              java.util.Arrays.equals(this.numero, other.getNumero()))) &&
            ((this.motivo==null && other.getMotivo()==null) || 
             (this.motivo!=null &&
              this.motivo.equals(other.getMotivo())));
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
        if (getDataAgendamento() != null) {
            _hashCode += getDataAgendamento().hashCode();
        }
        if (getNumero() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNumero());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNumero(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMotivo() != null) {
            _hashCode += getMotivo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReagendarPNIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/reagendarPN", "reagendarPNIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/reagendarPN", "passport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/security", "Passport"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataAgendamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/reagendarPN", "dataAgendamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/reagendarPN", "numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motivo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/reagendarPN", "motivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
