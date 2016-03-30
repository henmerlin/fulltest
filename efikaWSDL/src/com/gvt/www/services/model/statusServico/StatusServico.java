/**
 * StatusServico.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.services.model.statusServico;

public class StatusServico implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected StatusServico(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "Em aprovisionamento";
    public static final java.lang.String _value2 = "Ativado";
    public static final java.lang.String _value3 = "Desabilitado";
    public static final java.lang.String _value4 = "Suspenso";
    public static final java.lang.String _value5 = "Desconectado";
    public static final java.lang.String _value6 = "Cancelado";
    public static final java.lang.String _value7 = "Em desconexao";
    public static final java.lang.String _value8 = "Nao instalado";
    public static final java.lang.String _value9 = "Ativado temporariamente";
    public static final StatusServico value1 = new StatusServico(_value1);
    public static final StatusServico value2 = new StatusServico(_value2);
    public static final StatusServico value3 = new StatusServico(_value3);
    public static final StatusServico value4 = new StatusServico(_value4);
    public static final StatusServico value5 = new StatusServico(_value5);
    public static final StatusServico value6 = new StatusServico(_value6);
    public static final StatusServico value7 = new StatusServico(_value7);
    public static final StatusServico value8 = new StatusServico(_value8);
    public static final StatusServico value9 = new StatusServico(_value9);
    public java.lang.String getValue() { return _value_;}
    public static StatusServico fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        StatusServico enumeration = (StatusServico)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static StatusServico fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(StatusServico.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/statusServico", "StatusServico"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
