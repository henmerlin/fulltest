/**
 * InventoryItemResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.inventory.api;

public class InventoryItemResponse  extends com.gvt.www.ws.eai.oss.inventory.api.InventoryResponse  implements java.io.Serializable {
    private com.gvt.www.ws.eai.oss.inventory.api.Item[] items;

    public InventoryItemResponse() {
    }

    public InventoryItemResponse(
           int returnCode,
           java.lang.String message,
           com.gvt.www.ws.eai.oss.inventory.api.Item[] items) {
        super(
            returnCode,
            message);
        this.items = items;
    }


    /**
     * Gets the items value for this InventoryItemResponse.
     * 
     * @return items
     */
    public com.gvt.www.ws.eai.oss.inventory.api.Item[] getItems() {
        return items;
    }


    /**
     * Sets the items value for this InventoryItemResponse.
     * 
     * @param items
     */
    public void setItems(com.gvt.www.ws.eai.oss.inventory.api.Item[] items) {
        this.items = items;
    }

    public com.gvt.www.ws.eai.oss.inventory.api.Item getItems(int i) {
        return this.items[i];
    }

    public void setItems(int i, com.gvt.www.ws.eai.oss.inventory.api.Item _value) {
        this.items[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InventoryItemResponse)) return false;
        InventoryItemResponse other = (InventoryItemResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.items==null && other.getItems()==null) || 
             (this.items!=null &&
              java.util.Arrays.equals(this.items, other.getItems())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItems(), i);
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
        new org.apache.axis.description.TypeDesc(InventoryItemResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "InventoryItemResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("items");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "items"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "Item"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
