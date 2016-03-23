/**
 * SolicitarPNInProcessoGVT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.solicitarPN;

public class SolicitarPNInProcessoGVT implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SolicitarPNInProcessoGVT(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _VENDA = "VENDA";
    public static final java.lang.String _MUDANCA_DE_NUMERO = "MUDANCA_DE_NUMERO";
    public static final java.lang.String _MUDANCA_DE_ENDERECO = "MUDANCA_DE_ENDERECO";
    public static final SolicitarPNInProcessoGVT VENDA = new SolicitarPNInProcessoGVT(_VENDA);
    public static final SolicitarPNInProcessoGVT MUDANCA_DE_NUMERO = new SolicitarPNInProcessoGVT(_MUDANCA_DE_NUMERO);
    public static final SolicitarPNInProcessoGVT MUDANCA_DE_ENDERECO = new SolicitarPNInProcessoGVT(_MUDANCA_DE_ENDERECO);
    public java.lang.String getValue() { return _value_;}
    public static SolicitarPNInProcessoGVT fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SolicitarPNInProcessoGVT enumeration = (SolicitarPNInProcessoGVT)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SolicitarPNInProcessoGVT fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SolicitarPNInProcessoGVT.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", ">solicitarPNIn>processoGVT"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
