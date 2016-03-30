/**
 * TecnologiaRecursoLogicoEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.services.model.tecnologiaRecursoLogico;

public class TecnologiaRecursoLogicoEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TecnologiaRecursoLogicoEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ADSL = "ADSL";
    public static final java.lang.String _DTH = "DTH";
    public static final java.lang.String _FTTH = "FTTH";
    public static final java.lang.String _GPON = "GPON";
    public static final java.lang.String _HIBRIDA = "HIBRIDA";
    public static final java.lang.String _IPTV = "IPTV";
    public static final java.lang.String _METALICO = "METALICO";
    public static final java.lang.String _SIP = "SIP";
    public static final java.lang.String _TDM = "TDM";
    public static final java.lang.String _VDSL = "VDSL";
    public static final TecnologiaRecursoLogicoEnum ADSL = new TecnologiaRecursoLogicoEnum(_ADSL);
    public static final TecnologiaRecursoLogicoEnum DTH = new TecnologiaRecursoLogicoEnum(_DTH);
    public static final TecnologiaRecursoLogicoEnum FTTH = new TecnologiaRecursoLogicoEnum(_FTTH);
    public static final TecnologiaRecursoLogicoEnum GPON = new TecnologiaRecursoLogicoEnum(_GPON);
    public static final TecnologiaRecursoLogicoEnum HIBRIDA = new TecnologiaRecursoLogicoEnum(_HIBRIDA);
    public static final TecnologiaRecursoLogicoEnum IPTV = new TecnologiaRecursoLogicoEnum(_IPTV);
    public static final TecnologiaRecursoLogicoEnum METALICO = new TecnologiaRecursoLogicoEnum(_METALICO);
    public static final TecnologiaRecursoLogicoEnum SIP = new TecnologiaRecursoLogicoEnum(_SIP);
    public static final TecnologiaRecursoLogicoEnum TDM = new TecnologiaRecursoLogicoEnum(_TDM);
    public static final TecnologiaRecursoLogicoEnum VDSL = new TecnologiaRecursoLogicoEnum(_VDSL);
    public java.lang.String getValue() { return _value_;}
    public static TecnologiaRecursoLogicoEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TecnologiaRecursoLogicoEnum enumeration = (TecnologiaRecursoLogicoEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TecnologiaRecursoLogicoEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TecnologiaRecursoLogicoEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/tecnologiaRecursoLogico", "TecnologiaRecursoLogicoEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
