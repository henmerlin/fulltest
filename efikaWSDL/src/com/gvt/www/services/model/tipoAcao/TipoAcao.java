/**
 * TipoAcao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.services.model.tipoAcao;

public class TipoAcao implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TipoAcao(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ADICIONAR = "ADICIONAR";
    public static final java.lang.String _MODIFICAR = "MODIFICAR";
    public static final java.lang.String _TROCAR = "TROCAR";
    public static final java.lang.String _RECOLHER = "RECOLHER";
    public static final java.lang.String _REMOVER = "REMOVER";
    public static final java.lang.String _APROVISIONAR = "APROVISIONAR";
    public static final java.lang.String _DESAPROVISIONAR = "DESAPROVISIONAR";
    public static final java.lang.String _CANCELAR = "CANCELAR";
    public static final java.lang.String _DESCONECTAR = "DESCONECTAR";
    public static final java.lang.String _SEM_ACAO = "SEM_ACAO";
    public static final TipoAcao ADICIONAR = new TipoAcao(_ADICIONAR);
    public static final TipoAcao MODIFICAR = new TipoAcao(_MODIFICAR);
    public static final TipoAcao TROCAR = new TipoAcao(_TROCAR);
    public static final TipoAcao RECOLHER = new TipoAcao(_RECOLHER);
    public static final TipoAcao REMOVER = new TipoAcao(_REMOVER);
    public static final TipoAcao APROVISIONAR = new TipoAcao(_APROVISIONAR);
    public static final TipoAcao DESAPROVISIONAR = new TipoAcao(_DESAPROVISIONAR);
    public static final TipoAcao CANCELAR = new TipoAcao(_CANCELAR);
    public static final TipoAcao DESCONECTAR = new TipoAcao(_DESCONECTAR);
    public static final TipoAcao SEM_ACAO = new TipoAcao(_SEM_ACAO);
    public java.lang.String getValue() { return _value_;}
    public static TipoAcao fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TipoAcao enumeration = (TipoAcao)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TipoAcao fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TipoAcao.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/tipoAcao", "TipoAcao"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
