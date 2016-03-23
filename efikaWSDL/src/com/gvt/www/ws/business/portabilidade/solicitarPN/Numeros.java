/**
 * Numeros.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.solicitarPN;

public class Numeros  implements java.io.Serializable {
    private com.gvt.www.ws.business.portabilidade.solicitarPN.LineType lineType;

    private com.gvt.www.ws.business.portabilidade.solicitarPN.Numero_rpon_list[] numero;

    private java.util.Calendar dataAgendamento;

    private java.lang.String donnorServProvId;

    /* apenas CNG nao precisa passar */
    private java.lang.String cnl;

    private java.math.BigInteger groupGVT;

    public Numeros() {
    }

    public Numeros(
           com.gvt.www.ws.business.portabilidade.solicitarPN.LineType lineType,
           com.gvt.www.ws.business.portabilidade.solicitarPN.Numero_rpon_list[] numero,
           java.util.Calendar dataAgendamento,
           java.lang.String donnorServProvId,
           java.lang.String cnl,
           java.math.BigInteger groupGVT) {
           this.lineType = lineType;
           this.numero = numero;
           this.dataAgendamento = dataAgendamento;
           this.donnorServProvId = donnorServProvId;
           this.cnl = cnl;
           this.groupGVT = groupGVT;
    }


    /**
     * Gets the lineType value for this Numeros.
     * 
     * @return lineType
     */
    public com.gvt.www.ws.business.portabilidade.solicitarPN.LineType getLineType() {
        return lineType;
    }


    /**
     * Sets the lineType value for this Numeros.
     * 
     * @param lineType
     */
    public void setLineType(com.gvt.www.ws.business.portabilidade.solicitarPN.LineType lineType) {
        this.lineType = lineType;
    }


    /**
     * Gets the numero value for this Numeros.
     * 
     * @return numero
     */
    public com.gvt.www.ws.business.portabilidade.solicitarPN.Numero_rpon_list[] getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this Numeros.
     * 
     * @param numero
     */
    public void setNumero(com.gvt.www.ws.business.portabilidade.solicitarPN.Numero_rpon_list[] numero) {
        this.numero = numero;
    }

    public com.gvt.www.ws.business.portabilidade.solicitarPN.Numero_rpon_list getNumero(int i) {
        return this.numero[i];
    }

    public void setNumero(int i, com.gvt.www.ws.business.portabilidade.solicitarPN.Numero_rpon_list _value) {
        this.numero[i] = _value;
    }


    /**
     * Gets the dataAgendamento value for this Numeros.
     * 
     * @return dataAgendamento
     */
    public java.util.Calendar getDataAgendamento() {
        return dataAgendamento;
    }


    /**
     * Sets the dataAgendamento value for this Numeros.
     * 
     * @param dataAgendamento
     */
    public void setDataAgendamento(java.util.Calendar dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }


    /**
     * Gets the donnorServProvId value for this Numeros.
     * 
     * @return donnorServProvId
     */
    public java.lang.String getDonnorServProvId() {
        return donnorServProvId;
    }


    /**
     * Sets the donnorServProvId value for this Numeros.
     * 
     * @param donnorServProvId
     */
    public void setDonnorServProvId(java.lang.String donnorServProvId) {
        this.donnorServProvId = donnorServProvId;
    }


    /**
     * Gets the cnl value for this Numeros.
     * 
     * @return cnl   * apenas CNG nao precisa passar
     */
    public java.lang.String getCnl() {
        return cnl;
    }


    /**
     * Sets the cnl value for this Numeros.
     * 
     * @param cnl   * apenas CNG nao precisa passar
     */
    public void setCnl(java.lang.String cnl) {
        this.cnl = cnl;
    }


    /**
     * Gets the groupGVT value for this Numeros.
     * 
     * @return groupGVT
     */
    public java.math.BigInteger getGroupGVT() {
        return groupGVT;
    }


    /**
     * Sets the groupGVT value for this Numeros.
     * 
     * @param groupGVT
     */
    public void setGroupGVT(java.math.BigInteger groupGVT) {
        this.groupGVT = groupGVT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Numeros)) return false;
        Numeros other = (Numeros) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lineType==null && other.getLineType()==null) || 
             (this.lineType!=null &&
              this.lineType.equals(other.getLineType()))) &&
            ((this.numero==null && other.getNumero()==null) || 
             (this.numero!=null &&
              java.util.Arrays.equals(this.numero, other.getNumero()))) &&
            ((this.dataAgendamento==null && other.getDataAgendamento()==null) || 
             (this.dataAgendamento!=null &&
              this.dataAgendamento.equals(other.getDataAgendamento()))) &&
            ((this.donnorServProvId==null && other.getDonnorServProvId()==null) || 
             (this.donnorServProvId!=null &&
              this.donnorServProvId.equals(other.getDonnorServProvId()))) &&
            ((this.cnl==null && other.getCnl()==null) || 
             (this.cnl!=null &&
              this.cnl.equals(other.getCnl()))) &&
            ((this.groupGVT==null && other.getGroupGVT()==null) || 
             (this.groupGVT!=null &&
              this.groupGVT.equals(other.getGroupGVT())));
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
        if (getLineType() != null) {
            _hashCode += getLineType().hashCode();
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
        if (getDataAgendamento() != null) {
            _hashCode += getDataAgendamento().hashCode();
        }
        if (getDonnorServProvId() != null) {
            _hashCode += getDonnorServProvId().hashCode();
        }
        if (getCnl() != null) {
            _hashCode += getCnl().hashCode();
        }
        if (getGroupGVT() != null) {
            _hashCode += getGroupGVT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Numeros.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", "numeros"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", "lineType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", "LineType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", "numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", "numero_rpon_list"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataAgendamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", "dataAgendamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("donnorServProvId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", "donnorServProvId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cnl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", "cnl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupGVT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", "groupGVT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
