/**
 * SolicitarPNIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.solicitarPN;

public class SolicitarPNIn  implements java.io.Serializable {
    private com.gvt.www.metaData.security.Passport passport;

    private java.lang.String nomeCliente;

    private java.lang.String nrDocumento;

    private java.lang.String tipoDocumento;

    private com.gvt.www.ws.business.portabilidade.solicitarPN.Numeros[] numeros;

    private com.gvt.www.ws.business.portabilidade.solicitarPN.SolicitarPNInProcessoGVT processoGVT;

    private java.lang.String pon;

    private com.gvt.www.ws.business.portabilidade.solicitarPN.SolicitarPNInBu bu;

    public SolicitarPNIn() {
    }

    public SolicitarPNIn(
           com.gvt.www.metaData.security.Passport passport,
           java.lang.String nomeCliente,
           java.lang.String nrDocumento,
           java.lang.String tipoDocumento,
           com.gvt.www.ws.business.portabilidade.solicitarPN.Numeros[] numeros,
           com.gvt.www.ws.business.portabilidade.solicitarPN.SolicitarPNInProcessoGVT processoGVT,
           java.lang.String pon,
           com.gvt.www.ws.business.portabilidade.solicitarPN.SolicitarPNInBu bu) {
           this.passport = passport;
           this.nomeCliente = nomeCliente;
           this.nrDocumento = nrDocumento;
           this.tipoDocumento = tipoDocumento;
           this.numeros = numeros;
           this.processoGVT = processoGVT;
           this.pon = pon;
           this.bu = bu;
    }


    /**
     * Gets the passport value for this SolicitarPNIn.
     * 
     * @return passport
     */
    public com.gvt.www.metaData.security.Passport getPassport() {
        return passport;
    }


    /**
     * Sets the passport value for this SolicitarPNIn.
     * 
     * @param passport
     */
    public void setPassport(com.gvt.www.metaData.security.Passport passport) {
        this.passport = passport;
    }


    /**
     * Gets the nomeCliente value for this SolicitarPNIn.
     * 
     * @return nomeCliente
     */
    public java.lang.String getNomeCliente() {
        return nomeCliente;
    }


    /**
     * Sets the nomeCliente value for this SolicitarPNIn.
     * 
     * @param nomeCliente
     */
    public void setNomeCliente(java.lang.String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }


    /**
     * Gets the nrDocumento value for this SolicitarPNIn.
     * 
     * @return nrDocumento
     */
    public java.lang.String getNrDocumento() {
        return nrDocumento;
    }


    /**
     * Sets the nrDocumento value for this SolicitarPNIn.
     * 
     * @param nrDocumento
     */
    public void setNrDocumento(java.lang.String nrDocumento) {
        this.nrDocumento = nrDocumento;
    }


    /**
     * Gets the tipoDocumento value for this SolicitarPNIn.
     * 
     * @return tipoDocumento
     */
    public java.lang.String getTipoDocumento() {
        return tipoDocumento;
    }


    /**
     * Sets the tipoDocumento value for this SolicitarPNIn.
     * 
     * @param tipoDocumento
     */
    public void setTipoDocumento(java.lang.String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }


    /**
     * Gets the numeros value for this SolicitarPNIn.
     * 
     * @return numeros
     */
    public com.gvt.www.ws.business.portabilidade.solicitarPN.Numeros[] getNumeros() {
        return numeros;
    }


    /**
     * Sets the numeros value for this SolicitarPNIn.
     * 
     * @param numeros
     */
    public void setNumeros(com.gvt.www.ws.business.portabilidade.solicitarPN.Numeros[] numeros) {
        this.numeros = numeros;
    }

    public com.gvt.www.ws.business.portabilidade.solicitarPN.Numeros getNumeros(int i) {
        return this.numeros[i];
    }

    public void setNumeros(int i, com.gvt.www.ws.business.portabilidade.solicitarPN.Numeros _value) {
        this.numeros[i] = _value;
    }


    /**
     * Gets the processoGVT value for this SolicitarPNIn.
     * 
     * @return processoGVT
     */
    public com.gvt.www.ws.business.portabilidade.solicitarPN.SolicitarPNInProcessoGVT getProcessoGVT() {
        return processoGVT;
    }


    /**
     * Sets the processoGVT value for this SolicitarPNIn.
     * 
     * @param processoGVT
     */
    public void setProcessoGVT(com.gvt.www.ws.business.portabilidade.solicitarPN.SolicitarPNInProcessoGVT processoGVT) {
        this.processoGVT = processoGVT;
    }


    /**
     * Gets the pon value for this SolicitarPNIn.
     * 
     * @return pon
     */
    public java.lang.String getPon() {
        return pon;
    }


    /**
     * Sets the pon value for this SolicitarPNIn.
     * 
     * @param pon
     */
    public void setPon(java.lang.String pon) {
        this.pon = pon;
    }


    /**
     * Gets the bu value for this SolicitarPNIn.
     * 
     * @return bu
     */
    public com.gvt.www.ws.business.portabilidade.solicitarPN.SolicitarPNInBu getBu() {
        return bu;
    }


    /**
     * Sets the bu value for this SolicitarPNIn.
     * 
     * @param bu
     */
    public void setBu(com.gvt.www.ws.business.portabilidade.solicitarPN.SolicitarPNInBu bu) {
        this.bu = bu;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SolicitarPNIn)) return false;
        SolicitarPNIn other = (SolicitarPNIn) obj;
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
            ((this.nomeCliente==null && other.getNomeCliente()==null) || 
             (this.nomeCliente!=null &&
              this.nomeCliente.equals(other.getNomeCliente()))) &&
            ((this.nrDocumento==null && other.getNrDocumento()==null) || 
             (this.nrDocumento!=null &&
              this.nrDocumento.equals(other.getNrDocumento()))) &&
            ((this.tipoDocumento==null && other.getTipoDocumento()==null) || 
             (this.tipoDocumento!=null &&
              this.tipoDocumento.equals(other.getTipoDocumento()))) &&
            ((this.numeros==null && other.getNumeros()==null) || 
             (this.numeros!=null &&
              java.util.Arrays.equals(this.numeros, other.getNumeros()))) &&
            ((this.processoGVT==null && other.getProcessoGVT()==null) || 
             (this.processoGVT!=null &&
              this.processoGVT.equals(other.getProcessoGVT()))) &&
            ((this.pon==null && other.getPon()==null) || 
             (this.pon!=null &&
              this.pon.equals(other.getPon()))) &&
            ((this.bu==null && other.getBu()==null) || 
             (this.bu!=null &&
              this.bu.equals(other.getBu())));
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
        if (getNomeCliente() != null) {
            _hashCode += getNomeCliente().hashCode();
        }
        if (getNrDocumento() != null) {
            _hashCode += getNrDocumento().hashCode();
        }
        if (getTipoDocumento() != null) {
            _hashCode += getTipoDocumento().hashCode();
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
        if (getProcessoGVT() != null) {
            _hashCode += getProcessoGVT().hashCode();
        }
        if (getPon() != null) {
            _hashCode += getPon().hashCode();
        }
        if (getBu() != null) {
            _hashCode += getBu().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SolicitarPNIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", "solicitarPNIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", "passport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/security", "Passport"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", "nomeCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nrDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", "nrDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", "tipoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeros");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", "numeros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", "numeros"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processoGVT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", "processoGVT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", ">solicitarPNIn>processoGVT"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", "pon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bu");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", "bu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", ">solicitarPNIn>bu"));
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
