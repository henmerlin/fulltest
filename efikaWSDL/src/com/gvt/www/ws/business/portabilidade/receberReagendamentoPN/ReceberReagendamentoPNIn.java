/**
 * ReceberReagendamentoPNIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.receberReagendamentoPN;

public class ReceberReagendamentoPNIn  implements java.io.Serializable {
    private java.math.BigInteger protocoloEA;

    private java.lang.String numero;

    private java.util.Calendar novaDataAgendamento;

    private java.math.BigInteger invokeId;

    public ReceberReagendamentoPNIn() {
    }

    public ReceberReagendamentoPNIn(
           java.math.BigInteger protocoloEA,
           java.lang.String numero,
           java.util.Calendar novaDataAgendamento,
           java.math.BigInteger invokeId) {
           this.protocoloEA = protocoloEA;
           this.numero = numero;
           this.novaDataAgendamento = novaDataAgendamento;
           this.invokeId = invokeId;
    }


    /**
     * Gets the protocoloEA value for this ReceberReagendamentoPNIn.
     * 
     * @return protocoloEA
     */
    public java.math.BigInteger getProtocoloEA() {
        return protocoloEA;
    }


    /**
     * Sets the protocoloEA value for this ReceberReagendamentoPNIn.
     * 
     * @param protocoloEA
     */
    public void setProtocoloEA(java.math.BigInteger protocoloEA) {
        this.protocoloEA = protocoloEA;
    }


    /**
     * Gets the numero value for this ReceberReagendamentoPNIn.
     * 
     * @return numero
     */
    public java.lang.String getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this ReceberReagendamentoPNIn.
     * 
     * @param numero
     */
    public void setNumero(java.lang.String numero) {
        this.numero = numero;
    }


    /**
     * Gets the novaDataAgendamento value for this ReceberReagendamentoPNIn.
     * 
     * @return novaDataAgendamento
     */
    public java.util.Calendar getNovaDataAgendamento() {
        return novaDataAgendamento;
    }


    /**
     * Sets the novaDataAgendamento value for this ReceberReagendamentoPNIn.
     * 
     * @param novaDataAgendamento
     */
    public void setNovaDataAgendamento(java.util.Calendar novaDataAgendamento) {
        this.novaDataAgendamento = novaDataAgendamento;
    }


    /**
     * Gets the invokeId value for this ReceberReagendamentoPNIn.
     * 
     * @return invokeId
     */
    public java.math.BigInteger getInvokeId() {
        return invokeId;
    }


    /**
     * Sets the invokeId value for this ReceberReagendamentoPNIn.
     * 
     * @param invokeId
     */
    public void setInvokeId(java.math.BigInteger invokeId) {
        this.invokeId = invokeId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReceberReagendamentoPNIn)) return false;
        ReceberReagendamentoPNIn other = (ReceberReagendamentoPNIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.protocoloEA==null && other.getProtocoloEA()==null) || 
             (this.protocoloEA!=null &&
              this.protocoloEA.equals(other.getProtocoloEA()))) &&
            ((this.numero==null && other.getNumero()==null) || 
             (this.numero!=null &&
              this.numero.equals(other.getNumero()))) &&
            ((this.novaDataAgendamento==null && other.getNovaDataAgendamento()==null) || 
             (this.novaDataAgendamento!=null &&
              this.novaDataAgendamento.equals(other.getNovaDataAgendamento()))) &&
            ((this.invokeId==null && other.getInvokeId()==null) || 
             (this.invokeId!=null &&
              this.invokeId.equals(other.getInvokeId())));
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
        if (getProtocoloEA() != null) {
            _hashCode += getProtocoloEA().hashCode();
        }
        if (getNumero() != null) {
            _hashCode += getNumero().hashCode();
        }
        if (getNovaDataAgendamento() != null) {
            _hashCode += getNovaDataAgendamento().hashCode();
        }
        if (getInvokeId() != null) {
            _hashCode += getInvokeId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReceberReagendamentoPNIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberReagendamentoPN", "receberReagendamentoPNIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocoloEA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberReagendamentoPN", "protocoloEA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberReagendamentoPN", "numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("novaDataAgendamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberReagendamentoPN", "novaDataAgendamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invokeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberReagendamentoPN", "invokeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
