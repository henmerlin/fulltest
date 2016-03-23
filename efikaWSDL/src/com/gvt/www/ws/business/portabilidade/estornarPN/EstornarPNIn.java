/**
 * EstornarPNIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.estornarPN;

public class EstornarPNIn  implements java.io.Serializable {
    private com.gvt.www.metaData.security.Passport passport;

    private com.gvt.www.ws.business.portabilidade.estornarPN.LineType lineType;

    private com.gvt.www.ws.business.portabilidade.estornarPN.Numero_rpon_list[] numeros;

    private java.util.Calendar dataAgendamento;

    private int cnl;

    /* enviado somente pelo corporate */
    private java.math.BigInteger groupGVT;

    /* enviado somente pelo retail */
    private java.lang.String pon;

    private com.gvt.www.ws.business.portabilidade.estornarPN.EstornarPNInBu bu;

    private com.gvt.www.ws.business.portabilidade.estornarPN.EstornarPNInTipoEstorno tipoEstorno;

    private java.lang.String justificativaEstorno;

    private java.lang.String nome;

    private java.lang.String cpf;

    private java.lang.String cnpj;

    public EstornarPNIn() {
    }

    public EstornarPNIn(
           com.gvt.www.metaData.security.Passport passport,
           com.gvt.www.ws.business.portabilidade.estornarPN.LineType lineType,
           com.gvt.www.ws.business.portabilidade.estornarPN.Numero_rpon_list[] numeros,
           java.util.Calendar dataAgendamento,
           int cnl,
           java.math.BigInteger groupGVT,
           java.lang.String pon,
           com.gvt.www.ws.business.portabilidade.estornarPN.EstornarPNInBu bu,
           com.gvt.www.ws.business.portabilidade.estornarPN.EstornarPNInTipoEstorno tipoEstorno,
           java.lang.String justificativaEstorno,
           java.lang.String nome,
           java.lang.String cpf,
           java.lang.String cnpj) {
           this.passport = passport;
           this.lineType = lineType;
           this.numeros = numeros;
           this.dataAgendamento = dataAgendamento;
           this.cnl = cnl;
           this.groupGVT = groupGVT;
           this.pon = pon;
           this.bu = bu;
           this.tipoEstorno = tipoEstorno;
           this.justificativaEstorno = justificativaEstorno;
           this.nome = nome;
           this.cpf = cpf;
           this.cnpj = cnpj;
    }


    /**
     * Gets the passport value for this EstornarPNIn.
     * 
     * @return passport
     */
    public com.gvt.www.metaData.security.Passport getPassport() {
        return passport;
    }


    /**
     * Sets the passport value for this EstornarPNIn.
     * 
     * @param passport
     */
    public void setPassport(com.gvt.www.metaData.security.Passport passport) {
        this.passport = passport;
    }


    /**
     * Gets the lineType value for this EstornarPNIn.
     * 
     * @return lineType
     */
    public com.gvt.www.ws.business.portabilidade.estornarPN.LineType getLineType() {
        return lineType;
    }


    /**
     * Sets the lineType value for this EstornarPNIn.
     * 
     * @param lineType
     */
    public void setLineType(com.gvt.www.ws.business.portabilidade.estornarPN.LineType lineType) {
        this.lineType = lineType;
    }


    /**
     * Gets the numeros value for this EstornarPNIn.
     * 
     * @return numeros
     */
    public com.gvt.www.ws.business.portabilidade.estornarPN.Numero_rpon_list[] getNumeros() {
        return numeros;
    }


    /**
     * Sets the numeros value for this EstornarPNIn.
     * 
     * @param numeros
     */
    public void setNumeros(com.gvt.www.ws.business.portabilidade.estornarPN.Numero_rpon_list[] numeros) {
        this.numeros = numeros;
    }

    public com.gvt.www.ws.business.portabilidade.estornarPN.Numero_rpon_list getNumeros(int i) {
        return this.numeros[i];
    }

    public void setNumeros(int i, com.gvt.www.ws.business.portabilidade.estornarPN.Numero_rpon_list _value) {
        this.numeros[i] = _value;
    }


    /**
     * Gets the dataAgendamento value for this EstornarPNIn.
     * 
     * @return dataAgendamento
     */
    public java.util.Calendar getDataAgendamento() {
        return dataAgendamento;
    }


    /**
     * Sets the dataAgendamento value for this EstornarPNIn.
     * 
     * @param dataAgendamento
     */
    public void setDataAgendamento(java.util.Calendar dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }


    /**
     * Gets the cnl value for this EstornarPNIn.
     * 
     * @return cnl
     */
    public int getCnl() {
        return cnl;
    }


    /**
     * Sets the cnl value for this EstornarPNIn.
     * 
     * @param cnl
     */
    public void setCnl(int cnl) {
        this.cnl = cnl;
    }


    /**
     * Gets the groupGVT value for this EstornarPNIn.
     * 
     * @return groupGVT   * enviado somente pelo corporate
     */
    public java.math.BigInteger getGroupGVT() {
        return groupGVT;
    }


    /**
     * Sets the groupGVT value for this EstornarPNIn.
     * 
     * @param groupGVT   * enviado somente pelo corporate
     */
    public void setGroupGVT(java.math.BigInteger groupGVT) {
        this.groupGVT = groupGVT;
    }


    /**
     * Gets the pon value for this EstornarPNIn.
     * 
     * @return pon   * enviado somente pelo retail
     */
    public java.lang.String getPon() {
        return pon;
    }


    /**
     * Sets the pon value for this EstornarPNIn.
     * 
     * @param pon   * enviado somente pelo retail
     */
    public void setPon(java.lang.String pon) {
        this.pon = pon;
    }


    /**
     * Gets the bu value for this EstornarPNIn.
     * 
     * @return bu
     */
    public com.gvt.www.ws.business.portabilidade.estornarPN.EstornarPNInBu getBu() {
        return bu;
    }


    /**
     * Sets the bu value for this EstornarPNIn.
     * 
     * @param bu
     */
    public void setBu(com.gvt.www.ws.business.portabilidade.estornarPN.EstornarPNInBu bu) {
        this.bu = bu;
    }


    /**
     * Gets the tipoEstorno value for this EstornarPNIn.
     * 
     * @return tipoEstorno
     */
    public com.gvt.www.ws.business.portabilidade.estornarPN.EstornarPNInTipoEstorno getTipoEstorno() {
        return tipoEstorno;
    }


    /**
     * Sets the tipoEstorno value for this EstornarPNIn.
     * 
     * @param tipoEstorno
     */
    public void setTipoEstorno(com.gvt.www.ws.business.portabilidade.estornarPN.EstornarPNInTipoEstorno tipoEstorno) {
        this.tipoEstorno = tipoEstorno;
    }


    /**
     * Gets the justificativaEstorno value for this EstornarPNIn.
     * 
     * @return justificativaEstorno
     */
    public java.lang.String getJustificativaEstorno() {
        return justificativaEstorno;
    }


    /**
     * Sets the justificativaEstorno value for this EstornarPNIn.
     * 
     * @param justificativaEstorno
     */
    public void setJustificativaEstorno(java.lang.String justificativaEstorno) {
        this.justificativaEstorno = justificativaEstorno;
    }


    /**
     * Gets the nome value for this EstornarPNIn.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this EstornarPNIn.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the cpf value for this EstornarPNIn.
     * 
     * @return cpf
     */
    public java.lang.String getCpf() {
        return cpf;
    }


    /**
     * Sets the cpf value for this EstornarPNIn.
     * 
     * @param cpf
     */
    public void setCpf(java.lang.String cpf) {
        this.cpf = cpf;
    }


    /**
     * Gets the cnpj value for this EstornarPNIn.
     * 
     * @return cnpj
     */
    public java.lang.String getCnpj() {
        return cnpj;
    }


    /**
     * Sets the cnpj value for this EstornarPNIn.
     * 
     * @param cnpj
     */
    public void setCnpj(java.lang.String cnpj) {
        this.cnpj = cnpj;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EstornarPNIn)) return false;
        EstornarPNIn other = (EstornarPNIn) obj;
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
            ((this.lineType==null && other.getLineType()==null) || 
             (this.lineType!=null &&
              this.lineType.equals(other.getLineType()))) &&
            ((this.numeros==null && other.getNumeros()==null) || 
             (this.numeros!=null &&
              java.util.Arrays.equals(this.numeros, other.getNumeros()))) &&
            ((this.dataAgendamento==null && other.getDataAgendamento()==null) || 
             (this.dataAgendamento!=null &&
              this.dataAgendamento.equals(other.getDataAgendamento()))) &&
            this.cnl == other.getCnl() &&
            ((this.groupGVT==null && other.getGroupGVT()==null) || 
             (this.groupGVT!=null &&
              this.groupGVT.equals(other.getGroupGVT()))) &&
            ((this.pon==null && other.getPon()==null) || 
             (this.pon!=null &&
              this.pon.equals(other.getPon()))) &&
            ((this.bu==null && other.getBu()==null) || 
             (this.bu!=null &&
              this.bu.equals(other.getBu()))) &&
            ((this.tipoEstorno==null && other.getTipoEstorno()==null) || 
             (this.tipoEstorno!=null &&
              this.tipoEstorno.equals(other.getTipoEstorno()))) &&
            ((this.justificativaEstorno==null && other.getJustificativaEstorno()==null) || 
             (this.justificativaEstorno!=null &&
              this.justificativaEstorno.equals(other.getJustificativaEstorno()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.cpf==null && other.getCpf()==null) || 
             (this.cpf!=null &&
              this.cpf.equals(other.getCpf()))) &&
            ((this.cnpj==null && other.getCnpj()==null) || 
             (this.cnpj!=null &&
              this.cnpj.equals(other.getCnpj())));
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
        if (getLineType() != null) {
            _hashCode += getLineType().hashCode();
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
        if (getDataAgendamento() != null) {
            _hashCode += getDataAgendamento().hashCode();
        }
        _hashCode += getCnl();
        if (getGroupGVT() != null) {
            _hashCode += getGroupGVT().hashCode();
        }
        if (getPon() != null) {
            _hashCode += getPon().hashCode();
        }
        if (getBu() != null) {
            _hashCode += getBu().hashCode();
        }
        if (getTipoEstorno() != null) {
            _hashCode += getTipoEstorno().hashCode();
        }
        if (getJustificativaEstorno() != null) {
            _hashCode += getJustificativaEstorno().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getCpf() != null) {
            _hashCode += getCpf().hashCode();
        }
        if (getCnpj() != null) {
            _hashCode += getCnpj().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EstornarPNIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", "estornarPNIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", "passport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/security", "Passport"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", "lineType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", "LineType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeros");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", "numeros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", "numero_rpon_list"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataAgendamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", "dataAgendamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cnl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", "cnl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupGVT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", "groupGVT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", "pon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bu");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", "bu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", ">estornarPNIn>bu"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoEstorno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", "tipoEstorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", ">estornarPNIn>tipoEstorno"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("justificativaEstorno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", "justificativaEstorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", "cpf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cnpj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", "cnpj"));
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
