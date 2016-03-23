/**
 * IsReativavelOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.isReativavel;

public class IsReativavelOut  implements java.io.Serializable {
    private boolean todosReativaveis;

    private com.gvt.www.ws.business.portabilidade.isReativavel.NumeroStatus[] statusDetalhado;

    public IsReativavelOut() {
    }

    public IsReativavelOut(
           boolean todosReativaveis,
           com.gvt.www.ws.business.portabilidade.isReativavel.NumeroStatus[] statusDetalhado) {
           this.todosReativaveis = todosReativaveis;
           this.statusDetalhado = statusDetalhado;
    }


    /**
     * Gets the todosReativaveis value for this IsReativavelOut.
     * 
     * @return todosReativaveis
     */
    public boolean isTodosReativaveis() {
        return todosReativaveis;
    }


    /**
     * Sets the todosReativaveis value for this IsReativavelOut.
     * 
     * @param todosReativaveis
     */
    public void setTodosReativaveis(boolean todosReativaveis) {
        this.todosReativaveis = todosReativaveis;
    }


    /**
     * Gets the statusDetalhado value for this IsReativavelOut.
     * 
     * @return statusDetalhado
     */
    public com.gvt.www.ws.business.portabilidade.isReativavel.NumeroStatus[] getStatusDetalhado() {
        return statusDetalhado;
    }


    /**
     * Sets the statusDetalhado value for this IsReativavelOut.
     * 
     * @param statusDetalhado
     */
    public void setStatusDetalhado(com.gvt.www.ws.business.portabilidade.isReativavel.NumeroStatus[] statusDetalhado) {
        this.statusDetalhado = statusDetalhado;
    }

    public com.gvt.www.ws.business.portabilidade.isReativavel.NumeroStatus getStatusDetalhado(int i) {
        return this.statusDetalhado[i];
    }

    public void setStatusDetalhado(int i, com.gvt.www.ws.business.portabilidade.isReativavel.NumeroStatus _value) {
        this.statusDetalhado[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IsReativavelOut)) return false;
        IsReativavelOut other = (IsReativavelOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.todosReativaveis == other.isTodosReativaveis() &&
            ((this.statusDetalhado==null && other.getStatusDetalhado()==null) || 
             (this.statusDetalhado!=null &&
              java.util.Arrays.equals(this.statusDetalhado, other.getStatusDetalhado())));
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
        _hashCode += (isTodosReativaveis() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getStatusDetalhado() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatusDetalhado());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatusDetalhado(), i);
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
        new org.apache.axis.description.TypeDesc(IsReativavelOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isReativavel", "isReativavelOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("todosReativaveis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isReativavel", "todosReativaveis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusDetalhado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isReativavel", "statusDetalhado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isReativavel", "numeroStatus"));
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
