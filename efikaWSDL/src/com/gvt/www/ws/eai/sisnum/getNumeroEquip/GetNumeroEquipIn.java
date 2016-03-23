/**
 * GetNumeroEquipIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.sisnum.getNumeroEquip;

public class GetNumeroEquipIn  implements java.io.Serializable {
    private java.lang.String nrLista;

    private java.lang.String _switch;

    /* exemplo: CTA */
    private java.lang.String siglaCNL;

    public GetNumeroEquipIn() {
    }

    public GetNumeroEquipIn(
           java.lang.String nrLista,
           java.lang.String _switch,
           java.lang.String siglaCNL) {
           this.nrLista = nrLista;
           this._switch = _switch;
           this.siglaCNL = siglaCNL;
    }


    /**
     * Gets the nrLista value for this GetNumeroEquipIn.
     * 
     * @return nrLista
     */
    public java.lang.String getNrLista() {
        return nrLista;
    }


    /**
     * Sets the nrLista value for this GetNumeroEquipIn.
     * 
     * @param nrLista
     */
    public void setNrLista(java.lang.String nrLista) {
        this.nrLista = nrLista;
    }


    /**
     * Gets the _switch value for this GetNumeroEquipIn.
     * 
     * @return _switch
     */
    public java.lang.String get_switch() {
        return _switch;
    }


    /**
     * Sets the _switch value for this GetNumeroEquipIn.
     * 
     * @param _switch
     */
    public void set_switch(java.lang.String _switch) {
        this._switch = _switch;
    }


    /**
     * Gets the siglaCNL value for this GetNumeroEquipIn.
     * 
     * @return siglaCNL   * exemplo: CTA
     */
    public java.lang.String getSiglaCNL() {
        return siglaCNL;
    }


    /**
     * Sets the siglaCNL value for this GetNumeroEquipIn.
     * 
     * @param siglaCNL   * exemplo: CTA
     */
    public void setSiglaCNL(java.lang.String siglaCNL) {
        this.siglaCNL = siglaCNL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetNumeroEquipIn)) return false;
        GetNumeroEquipIn other = (GetNumeroEquipIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nrLista==null && other.getNrLista()==null) || 
             (this.nrLista!=null &&
              this.nrLista.equals(other.getNrLista()))) &&
            ((this._switch==null && other.get_switch()==null) || 
             (this._switch!=null &&
              this._switch.equals(other.get_switch()))) &&
            ((this.siglaCNL==null && other.getSiglaCNL()==null) || 
             (this.siglaCNL!=null &&
              this.siglaCNL.equals(other.getSiglaCNL())));
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
        if (getNrLista() != null) {
            _hashCode += getNrLista().hashCode();
        }
        if (get_switch() != null) {
            _hashCode += get_switch().hashCode();
        }
        if (getSiglaCNL() != null) {
            _hashCode += getSiglaCNL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetNumeroEquipIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/sisnum/getNumeroEquip", "getNumeroEquipIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nrLista");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/sisnum/getNumeroEquip", "nrLista"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_switch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/sisnum/getNumeroEquip", "switch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siglaCNL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/sisnum/getNumeroEquip", "siglaCNL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
