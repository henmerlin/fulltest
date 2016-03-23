/**
 * EstornarPNOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.estornarPN;

public class EstornarPNOut  implements java.io.Serializable {
    private java.math.BigInteger idSolicitacaoPN;

    private com.gvt.www.ws.business.portabilidade.estornarPN.Numero_groupGvt_list[] numeroGroupGvt;

    public EstornarPNOut() {
    }

    public EstornarPNOut(
           java.math.BigInteger idSolicitacaoPN,
           com.gvt.www.ws.business.portabilidade.estornarPN.Numero_groupGvt_list[] numeroGroupGvt) {
           this.idSolicitacaoPN = idSolicitacaoPN;
           this.numeroGroupGvt = numeroGroupGvt;
    }


    /**
     * Gets the idSolicitacaoPN value for this EstornarPNOut.
     * 
     * @return idSolicitacaoPN
     */
    public java.math.BigInteger getIdSolicitacaoPN() {
        return idSolicitacaoPN;
    }


    /**
     * Sets the idSolicitacaoPN value for this EstornarPNOut.
     * 
     * @param idSolicitacaoPN
     */
    public void setIdSolicitacaoPN(java.math.BigInteger idSolicitacaoPN) {
        this.idSolicitacaoPN = idSolicitacaoPN;
    }


    /**
     * Gets the numeroGroupGvt value for this EstornarPNOut.
     * 
     * @return numeroGroupGvt
     */
    public com.gvt.www.ws.business.portabilidade.estornarPN.Numero_groupGvt_list[] getNumeroGroupGvt() {
        return numeroGroupGvt;
    }


    /**
     * Sets the numeroGroupGvt value for this EstornarPNOut.
     * 
     * @param numeroGroupGvt
     */
    public void setNumeroGroupGvt(com.gvt.www.ws.business.portabilidade.estornarPN.Numero_groupGvt_list[] numeroGroupGvt) {
        this.numeroGroupGvt = numeroGroupGvt;
    }

    public com.gvt.www.ws.business.portabilidade.estornarPN.Numero_groupGvt_list getNumeroGroupGvt(int i) {
        return this.numeroGroupGvt[i];
    }

    public void setNumeroGroupGvt(int i, com.gvt.www.ws.business.portabilidade.estornarPN.Numero_groupGvt_list _value) {
        this.numeroGroupGvt[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EstornarPNOut)) return false;
        EstornarPNOut other = (EstornarPNOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idSolicitacaoPN==null && other.getIdSolicitacaoPN()==null) || 
             (this.idSolicitacaoPN!=null &&
              this.idSolicitacaoPN.equals(other.getIdSolicitacaoPN()))) &&
            ((this.numeroGroupGvt==null && other.getNumeroGroupGvt()==null) || 
             (this.numeroGroupGvt!=null &&
              java.util.Arrays.equals(this.numeroGroupGvt, other.getNumeroGroupGvt())));
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
        if (getIdSolicitacaoPN() != null) {
            _hashCode += getIdSolicitacaoPN().hashCode();
        }
        if (getNumeroGroupGvt() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNumeroGroupGvt());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNumeroGroupGvt(), i);
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
        new org.apache.axis.description.TypeDesc(EstornarPNOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", "estornarPNOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSolicitacaoPN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", "idSolicitacaoPN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroGroupGvt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", "numeroGroupGvt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", "numero_groupGvt_list"));
        elemField.setMinOccurs(0);
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
