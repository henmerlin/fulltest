/**
 * LineType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca;

public class LineType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LineType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _Basic = new org.apache.axis.types.Token("Basic");
    public static final org.apache.axis.types.Token _DDR = new org.apache.axis.types.Token("DDR");
    public static final org.apache.axis.types.Token _CNG = new org.apache.axis.types.Token("CNG");
    public static final LineType Basic = new LineType(_Basic);
    public static final LineType DDR = new LineType(_DDR);
    public static final LineType CNG = new LineType(_CNG);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static LineType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        LineType enumeration = (LineType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LineType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        try {
            return fromValue(new org.apache.axis.types.Token(value));
        } catch (Exception e) {
            throw new java.lang.IllegalArgumentException();
        }
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_.toString();}
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
        new org.apache.axis.description.TypeDesc(LineType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca", "LineType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
