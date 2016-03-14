/**
 * UpdateEquipmentNumberIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.eai.NumberInventoryServicesWS;

public class UpdateEquipmentNumberIn  implements java.io.Serializable {
    private java.lang.String numeroLista;

    private java.lang.String central;

    private java.lang.String siglaCNL;

    private java.lang.Boolean oneNumber;

    private java.lang.Boolean cleanEquipmentNumber;

    private java.lang.String switchOriginal;

    public UpdateEquipmentNumberIn() {
    }

    public UpdateEquipmentNumberIn(
           java.lang.String numeroLista,
           java.lang.String central,
           java.lang.String siglaCNL,
           java.lang.Boolean oneNumber,
           java.lang.Boolean cleanEquipmentNumber,
           java.lang.String switchOriginal) {
           this.numeroLista = numeroLista;
           this.central = central;
           this.siglaCNL = siglaCNL;
           this.oneNumber = oneNumber;
           this.cleanEquipmentNumber = cleanEquipmentNumber;
           this.switchOriginal = switchOriginal;
    }


    /**
     * Gets the numeroLista value for this UpdateEquipmentNumberIn.
     * 
     * @return numeroLista
     */
    public java.lang.String getNumeroLista() {
        return numeroLista;
    }


    /**
     * Sets the numeroLista value for this UpdateEquipmentNumberIn.
     * 
     * @param numeroLista
     */
    public void setNumeroLista(java.lang.String numeroLista) {
        this.numeroLista = numeroLista;
    }


    /**
     * Gets the central value for this UpdateEquipmentNumberIn.
     * 
     * @return central
     */
    public java.lang.String getCentral() {
        return central;
    }


    /**
     * Sets the central value for this UpdateEquipmentNumberIn.
     * 
     * @param central
     */
    public void setCentral(java.lang.String central) {
        this.central = central;
    }


    /**
     * Gets the siglaCNL value for this UpdateEquipmentNumberIn.
     * 
     * @return siglaCNL
     */
    public java.lang.String getSiglaCNL() {
        return siglaCNL;
    }


    /**
     * Sets the siglaCNL value for this UpdateEquipmentNumberIn.
     * 
     * @param siglaCNL
     */
    public void setSiglaCNL(java.lang.String siglaCNL) {
        this.siglaCNL = siglaCNL;
    }


    /**
     * Gets the oneNumber value for this UpdateEquipmentNumberIn.
     * 
     * @return oneNumber
     */
    public java.lang.Boolean getOneNumber() {
        return oneNumber;
    }


    /**
     * Sets the oneNumber value for this UpdateEquipmentNumberIn.
     * 
     * @param oneNumber
     */
    public void setOneNumber(java.lang.Boolean oneNumber) {
        this.oneNumber = oneNumber;
    }


    /**
     * Gets the cleanEquipmentNumber value for this UpdateEquipmentNumberIn.
     * 
     * @return cleanEquipmentNumber
     */
    public java.lang.Boolean getCleanEquipmentNumber() {
        return cleanEquipmentNumber;
    }


    /**
     * Sets the cleanEquipmentNumber value for this UpdateEquipmentNumberIn.
     * 
     * @param cleanEquipmentNumber
     */
    public void setCleanEquipmentNumber(java.lang.Boolean cleanEquipmentNumber) {
        this.cleanEquipmentNumber = cleanEquipmentNumber;
    }


    /**
     * Gets the switchOriginal value for this UpdateEquipmentNumberIn.
     * 
     * @return switchOriginal
     */
    public java.lang.String getSwitchOriginal() {
        return switchOriginal;
    }


    /**
     * Sets the switchOriginal value for this UpdateEquipmentNumberIn.
     * 
     * @param switchOriginal
     */
    public void setSwitchOriginal(java.lang.String switchOriginal) {
        this.switchOriginal = switchOriginal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateEquipmentNumberIn)) return false;
        UpdateEquipmentNumberIn other = (UpdateEquipmentNumberIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numeroLista==null && other.getNumeroLista()==null) || 
             (this.numeroLista!=null &&
              this.numeroLista.equals(other.getNumeroLista()))) &&
            ((this.central==null && other.getCentral()==null) || 
             (this.central!=null &&
              this.central.equals(other.getCentral()))) &&
            ((this.siglaCNL==null && other.getSiglaCNL()==null) || 
             (this.siglaCNL!=null &&
              this.siglaCNL.equals(other.getSiglaCNL()))) &&
            ((this.oneNumber==null && other.getOneNumber()==null) || 
             (this.oneNumber!=null &&
              this.oneNumber.equals(other.getOneNumber()))) &&
            ((this.cleanEquipmentNumber==null && other.getCleanEquipmentNumber()==null) || 
             (this.cleanEquipmentNumber!=null &&
              this.cleanEquipmentNumber.equals(other.getCleanEquipmentNumber()))) &&
            ((this.switchOriginal==null && other.getSwitchOriginal()==null) || 
             (this.switchOriginal!=null &&
              this.switchOriginal.equals(other.getSwitchOriginal())));
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
        if (getNumeroLista() != null) {
            _hashCode += getNumeroLista().hashCode();
        }
        if (getCentral() != null) {
            _hashCode += getCentral().hashCode();
        }
        if (getSiglaCNL() != null) {
            _hashCode += getSiglaCNL().hashCode();
        }
        if (getOneNumber() != null) {
            _hashCode += getOneNumber().hashCode();
        }
        if (getCleanEquipmentNumber() != null) {
            _hashCode += getCleanEquipmentNumber().hashCode();
        }
        if (getSwitchOriginal() != null) {
            _hashCode += getSwitchOriginal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateEquipmentNumberIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "updateEquipmentNumberIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroLista");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroLista"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("central");
        elemField.setXmlName(new javax.xml.namespace.QName("", "central"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siglaCNL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "siglaCNL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cleanEquipmentNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cleanEquipmentNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchOriginal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "switchOriginal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
