/**
 * ValidarDataPNInTipoValidacao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade.validarDataPN;

public class ValidarDataPNInTipoValidacao implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ValidarDataPNInTipoValidacao(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Solicitacao = "Solicitacao";
    public static final java.lang.String _Reagendamento = "Reagendamento";
    public static final java.lang.String _Cancelamento = "Cancelamento";
    public static final java.lang.String _Estorno = "Estorno";
    public static final java.lang.String _RemoverSuspensao = "RemoverSuspensao";
    public static final java.lang.String _RemoverConflito = "RemoverConflito";
    public static final java.lang.String _Suspender = "Suspender";
    public static final java.lang.String _Intrinseca = "Intrinseca";
    public static final ValidarDataPNInTipoValidacao Solicitacao = new ValidarDataPNInTipoValidacao(_Solicitacao);
    public static final ValidarDataPNInTipoValidacao Reagendamento = new ValidarDataPNInTipoValidacao(_Reagendamento);
    public static final ValidarDataPNInTipoValidacao Cancelamento = new ValidarDataPNInTipoValidacao(_Cancelamento);
    public static final ValidarDataPNInTipoValidacao Estorno = new ValidarDataPNInTipoValidacao(_Estorno);
    public static final ValidarDataPNInTipoValidacao RemoverSuspensao = new ValidarDataPNInTipoValidacao(_RemoverSuspensao);
    public static final ValidarDataPNInTipoValidacao RemoverConflito = new ValidarDataPNInTipoValidacao(_RemoverConflito);
    public static final ValidarDataPNInTipoValidacao Suspender = new ValidarDataPNInTipoValidacao(_Suspender);
    public static final ValidarDataPNInTipoValidacao Intrinseca = new ValidarDataPNInTipoValidacao(_Intrinseca);
    public java.lang.String getValue() { return _value_;}
    public static ValidarDataPNInTipoValidacao fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ValidarDataPNInTipoValidacao enumeration = (ValidarDataPNInTipoValidacao)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ValidarDataPNInTipoValidacao fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ValidarDataPNInTipoValidacao.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/validarDataPN", ">validarDataPNIn>tipoValidacao"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
