/**
 * SolicitarPNIntrinsecaIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca;

public class SolicitarPNIntrinsecaIn  implements java.io.Serializable {
    private com.gvt.www.metaData.security.Passport passport;

    private com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.InfoCliente cliente;

    private java.util.Calendar dataAgendamento;

    private com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.LineType lineType;

    private java.lang.String cnlNovo;

    private com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.Numeros[] numeros;

    /* usado apenas pelo retail */
    private java.lang.String pon;

    private com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.SolicitarPNIntrinsecaInBu bu;

    public SolicitarPNIntrinsecaIn() {
    }

    public SolicitarPNIntrinsecaIn(
           com.gvt.www.metaData.security.Passport passport,
           com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.InfoCliente cliente,
           java.util.Calendar dataAgendamento,
           com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.LineType lineType,
           java.lang.String cnlNovo,
           com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.Numeros[] numeros,
           java.lang.String pon,
           com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.SolicitarPNIntrinsecaInBu bu) {
           this.passport = passport;
           this.cliente = cliente;
           this.dataAgendamento = dataAgendamento;
           this.lineType = lineType;
           this.cnlNovo = cnlNovo;
           this.numeros = numeros;
           this.pon = pon;
           this.bu = bu;
    }


    /**
     * Gets the passport value for this SolicitarPNIntrinsecaIn.
     * 
     * @return passport
     */
    public com.gvt.www.metaData.security.Passport getPassport() {
        return passport;
    }


    /**
     * Sets the passport value for this SolicitarPNIntrinsecaIn.
     * 
     * @param passport
     */
    public void setPassport(com.gvt.www.metaData.security.Passport passport) {
        this.passport = passport;
    }


    /**
     * Gets the cliente value for this SolicitarPNIntrinsecaIn.
     * 
     * @return cliente
     */
    public com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.InfoCliente getCliente() {
        return cliente;
    }


    /**
     * Sets the cliente value for this SolicitarPNIntrinsecaIn.
     * 
     * @param cliente
     */
    public void setCliente(com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.InfoCliente cliente) {
        this.cliente = cliente;
    }


    /**
     * Gets the dataAgendamento value for this SolicitarPNIntrinsecaIn.
     * 
     * @return dataAgendamento
     */
    public java.util.Calendar getDataAgendamento() {
        return dataAgendamento;
    }


    /**
     * Sets the dataAgendamento value for this SolicitarPNIntrinsecaIn.
     * 
     * @param dataAgendamento
     */
    public void setDataAgendamento(java.util.Calendar dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }


    /**
     * Gets the lineType value for this SolicitarPNIntrinsecaIn.
     * 
     * @return lineType
     */
    public com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.LineType getLineType() {
        return lineType;
    }


    /**
     * Sets the lineType value for this SolicitarPNIntrinsecaIn.
     * 
     * @param lineType
     */
    public void setLineType(com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.LineType lineType) {
        this.lineType = lineType;
    }


    /**
     * Gets the cnlNovo value for this SolicitarPNIntrinsecaIn.
     * 
     * @return cnlNovo
     */
    public java.lang.String getCnlNovo() {
        return cnlNovo;
    }


    /**
     * Sets the cnlNovo value for this SolicitarPNIntrinsecaIn.
     * 
     * @param cnlNovo
     */
    public void setCnlNovo(java.lang.String cnlNovo) {
        this.cnlNovo = cnlNovo;
    }


    /**
     * Gets the numeros value for this SolicitarPNIntrinsecaIn.
     * 
     * @return numeros
     */
    public com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.Numeros[] getNumeros() {
        return numeros;
    }


    /**
     * Sets the numeros value for this SolicitarPNIntrinsecaIn.
     * 
     * @param numeros
     */
    public void setNumeros(com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.Numeros[] numeros) {
        this.numeros = numeros;
    }

    public com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.Numeros getNumeros(int i) {
        return this.numeros[i];
    }

    public void setNumeros(int i, com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.Numeros _value) {
        this.numeros[i] = _value;
    }


    /**
     * Gets the pon value for this SolicitarPNIntrinsecaIn.
     * 
     * @return pon   * usado apenas pelo retail
     */
    public java.lang.String getPon() {
        return pon;
    }


    /**
     * Sets the pon value for this SolicitarPNIntrinsecaIn.
     * 
     * @param pon   * usado apenas pelo retail
     */
    public void setPon(java.lang.String pon) {
        this.pon = pon;
    }


    /**
     * Gets the bu value for this SolicitarPNIntrinsecaIn.
     * 
     * @return bu
     */
    public com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.SolicitarPNIntrinsecaInBu getBu() {
        return bu;
    }


    /**
     * Sets the bu value for this SolicitarPNIntrinsecaIn.
     * 
     * @param bu
     */
    public void setBu(com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.SolicitarPNIntrinsecaInBu bu) {
        this.bu = bu;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SolicitarPNIntrinsecaIn)) return false;
        SolicitarPNIntrinsecaIn other = (SolicitarPNIntrinsecaIn) obj;
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
            ((this.cliente==null && other.getCliente()==null) || 
             (this.cliente!=null &&
              this.cliente.equals(other.getCliente()))) &&
            ((this.dataAgendamento==null && other.getDataAgendamento()==null) || 
             (this.dataAgendamento!=null &&
              this.dataAgendamento.equals(other.getDataAgendamento()))) &&
            ((this.lineType==null && other.getLineType()==null) || 
             (this.lineType!=null &&
              this.lineType.equals(other.getLineType()))) &&
            ((this.cnlNovo==null && other.getCnlNovo()==null) || 
             (this.cnlNovo!=null &&
              this.cnlNovo.equals(other.getCnlNovo()))) &&
            ((this.numeros==null && other.getNumeros()==null) || 
             (this.numeros!=null &&
              java.util.Arrays.equals(this.numeros, other.getNumeros()))) &&
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
        if (getCliente() != null) {
            _hashCode += getCliente().hashCode();
        }
        if (getDataAgendamento() != null) {
            _hashCode += getDataAgendamento().hashCode();
        }
        if (getLineType() != null) {
            _hashCode += getLineType().hashCode();
        }
        if (getCnlNovo() != null) {
            _hashCode += getCnlNovo().hashCode();
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
        new org.apache.axis.description.TypeDesc(SolicitarPNIntrinsecaIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca", "solicitarPNIntrinsecaIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca", "passport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/security", "Passport"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca", "cliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca", "InfoCliente"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataAgendamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca", "dataAgendamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca", "lineType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca", "LineType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cnlNovo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca", "cnlNovo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeros");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca", "numeros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca", "numeros"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca", "pon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bu");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca", "bu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca", ">solicitarPNIntrinsecaIn>bu"));
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
