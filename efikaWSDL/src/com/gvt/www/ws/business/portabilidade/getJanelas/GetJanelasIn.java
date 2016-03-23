/**
 * GetJanelasIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.getJanelas;

public class GetJanelasIn  implements java.io.Serializable {
    private com.gvt.www.metaData.security.Passport passport;

    /* Portabilidade ou Reagendamento */
    private com.gvt.www.ws.business.portabilidade.getJanelas.TipoJanelas tipoJanelas;

    /* RETAIL ou CORPORATE. Se nao for passado, entao assume-se CORPORATE. */
    private com.gvt.www.ws.business.portabilidade.getJanelas.TipoBu tipoBu;

    public GetJanelasIn() {
    }

    public GetJanelasIn(
           com.gvt.www.metaData.security.Passport passport,
           com.gvt.www.ws.business.portabilidade.getJanelas.TipoJanelas tipoJanelas,
           com.gvt.www.ws.business.portabilidade.getJanelas.TipoBu tipoBu) {
           this.passport = passport;
           this.tipoJanelas = tipoJanelas;
           this.tipoBu = tipoBu;
    }


    /**
     * Gets the passport value for this GetJanelasIn.
     * 
     * @return passport
     */
    public com.gvt.www.metaData.security.Passport getPassport() {
        return passport;
    }


    /**
     * Sets the passport value for this GetJanelasIn.
     * 
     * @param passport
     */
    public void setPassport(com.gvt.www.metaData.security.Passport passport) {
        this.passport = passport;
    }


    /**
     * Gets the tipoJanelas value for this GetJanelasIn.
     * 
     * @return tipoJanelas   * Portabilidade ou Reagendamento
     */
    public com.gvt.www.ws.business.portabilidade.getJanelas.TipoJanelas getTipoJanelas() {
        return tipoJanelas;
    }


    /**
     * Sets the tipoJanelas value for this GetJanelasIn.
     * 
     * @param tipoJanelas   * Portabilidade ou Reagendamento
     */
    public void setTipoJanelas(com.gvt.www.ws.business.portabilidade.getJanelas.TipoJanelas tipoJanelas) {
        this.tipoJanelas = tipoJanelas;
    }


    /**
     * Gets the tipoBu value for this GetJanelasIn.
     * 
     * @return tipoBu   * RETAIL ou CORPORATE. Se nao for passado, entao assume-se CORPORATE.
     */
    public com.gvt.www.ws.business.portabilidade.getJanelas.TipoBu getTipoBu() {
        return tipoBu;
    }


    /**
     * Sets the tipoBu value for this GetJanelasIn.
     * 
     * @param tipoBu   * RETAIL ou CORPORATE. Se nao for passado, entao assume-se CORPORATE.
     */
    public void setTipoBu(com.gvt.www.ws.business.portabilidade.getJanelas.TipoBu tipoBu) {
        this.tipoBu = tipoBu;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetJanelasIn)) return false;
        GetJanelasIn other = (GetJanelasIn) obj;
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
            ((this.tipoJanelas==null && other.getTipoJanelas()==null) || 
             (this.tipoJanelas!=null &&
              this.tipoJanelas.equals(other.getTipoJanelas()))) &&
            ((this.tipoBu==null && other.getTipoBu()==null) || 
             (this.tipoBu!=null &&
              this.tipoBu.equals(other.getTipoBu())));
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
        if (getTipoJanelas() != null) {
            _hashCode += getTipoJanelas().hashCode();
        }
        if (getTipoBu() != null) {
            _hashCode += getTipoBu().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetJanelasIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getJanelas", "getJanelasIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getJanelas", "passport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/security", "Passport"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoJanelas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getJanelas", "tipoJanelas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getJanelas", "tipoJanelas"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoBu");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getJanelas", "tipoBu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getJanelas", "tipoBu"));
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
