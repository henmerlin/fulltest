/**
 * OperationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.getInformacoesInstancia;

public class OperationResponse  implements java.io.Serializable {
    /* Detalhe sobre o retorno do serviço. Em caso de sucesso a message
     * sera SUCESSO, em caso de erros sera descrito a causa do problema */
    private java.lang.String message;

    /* Codigo para identificacao de erro ou sucesso, onde 0 (zero)
     * e sucesso, numeros negativos sao excecoes de runTime e numeros positivos
     * excecoes de negocio */
    private long code;

    public OperationResponse() {
    }

    public OperationResponse(
           java.lang.String message,
           long code) {
           this.message = message;
           this.code = code;
    }


    /**
     * Gets the message value for this OperationResponse.
     * 
     * @return message   * Detalhe sobre o retorno do serviço. Em caso de sucesso a message
     * sera SUCESSO, em caso de erros sera descrito a causa do problema
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this OperationResponse.
     * 
     * @param message   * Detalhe sobre o retorno do serviço. Em caso de sucesso a message
     * sera SUCESSO, em caso de erros sera descrito a causa do problema
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the code value for this OperationResponse.
     * 
     * @return code   * Codigo para identificacao de erro ou sucesso, onde 0 (zero)
     * e sucesso, numeros negativos sao excecoes de runTime e numeros positivos
     * excecoes de negocio
     */
    public long getCode() {
        return code;
    }


    /**
     * Sets the code value for this OperationResponse.
     * 
     * @param code   * Codigo para identificacao de erro ou sucesso, onde 0 (zero)
     * e sucesso, numeros negativos sao excecoes de runTime e numeros positivos
     * excecoes de negocio
     */
    public void setCode(long code) {
        this.code = code;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperationResponse)) return false;
        OperationResponse other = (OperationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            this.code == other.getCode();
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
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        _hashCode += new Long(getCode()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OperationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getInformacoesInstancia", "OperationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getInformacoesInstancia", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getInformacoesInstancia", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
