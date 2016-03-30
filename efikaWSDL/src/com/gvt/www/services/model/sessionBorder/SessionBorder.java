/**
 * SessionBorder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.services.model.sessionBorder;

public class SessionBorder  implements java.io.Serializable {
    private java.lang.Integer id;

    private java.lang.String regiaoAtendimento;

    private java.lang.String proxyServerIp;

    private java.lang.String outboundProxyIp;

    private java.lang.String userAgentDomain;

    private java.lang.String registraServer;

    public SessionBorder() {
    }

    public SessionBorder(
           java.lang.Integer id,
           java.lang.String regiaoAtendimento,
           java.lang.String proxyServerIp,
           java.lang.String outboundProxyIp,
           java.lang.String userAgentDomain,
           java.lang.String registraServer) {
           this.id = id;
           this.regiaoAtendimento = regiaoAtendimento;
           this.proxyServerIp = proxyServerIp;
           this.outboundProxyIp = outboundProxyIp;
           this.userAgentDomain = userAgentDomain;
           this.registraServer = registraServer;
    }


    /**
     * Gets the id value for this SessionBorder.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this SessionBorder.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the regiaoAtendimento value for this SessionBorder.
     * 
     * @return regiaoAtendimento
     */
    public java.lang.String getRegiaoAtendimento() {
        return regiaoAtendimento;
    }


    /**
     * Sets the regiaoAtendimento value for this SessionBorder.
     * 
     * @param regiaoAtendimento
     */
    public void setRegiaoAtendimento(java.lang.String regiaoAtendimento) {
        this.regiaoAtendimento = regiaoAtendimento;
    }


    /**
     * Gets the proxyServerIp value for this SessionBorder.
     * 
     * @return proxyServerIp
     */
    public java.lang.String getProxyServerIp() {
        return proxyServerIp;
    }


    /**
     * Sets the proxyServerIp value for this SessionBorder.
     * 
     * @param proxyServerIp
     */
    public void setProxyServerIp(java.lang.String proxyServerIp) {
        this.proxyServerIp = proxyServerIp;
    }


    /**
     * Gets the outboundProxyIp value for this SessionBorder.
     * 
     * @return outboundProxyIp
     */
    public java.lang.String getOutboundProxyIp() {
        return outboundProxyIp;
    }


    /**
     * Sets the outboundProxyIp value for this SessionBorder.
     * 
     * @param outboundProxyIp
     */
    public void setOutboundProxyIp(java.lang.String outboundProxyIp) {
        this.outboundProxyIp = outboundProxyIp;
    }


    /**
     * Gets the userAgentDomain value for this SessionBorder.
     * 
     * @return userAgentDomain
     */
    public java.lang.String getUserAgentDomain() {
        return userAgentDomain;
    }


    /**
     * Sets the userAgentDomain value for this SessionBorder.
     * 
     * @param userAgentDomain
     */
    public void setUserAgentDomain(java.lang.String userAgentDomain) {
        this.userAgentDomain = userAgentDomain;
    }


    /**
     * Gets the registraServer value for this SessionBorder.
     * 
     * @return registraServer
     */
    public java.lang.String getRegistraServer() {
        return registraServer;
    }


    /**
     * Sets the registraServer value for this SessionBorder.
     * 
     * @param registraServer
     */
    public void setRegistraServer(java.lang.String registraServer) {
        this.registraServer = registraServer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SessionBorder)) return false;
        SessionBorder other = (SessionBorder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.regiaoAtendimento==null && other.getRegiaoAtendimento()==null) || 
             (this.regiaoAtendimento!=null &&
              this.regiaoAtendimento.equals(other.getRegiaoAtendimento()))) &&
            ((this.proxyServerIp==null && other.getProxyServerIp()==null) || 
             (this.proxyServerIp!=null &&
              this.proxyServerIp.equals(other.getProxyServerIp()))) &&
            ((this.outboundProxyIp==null && other.getOutboundProxyIp()==null) || 
             (this.outboundProxyIp!=null &&
              this.outboundProxyIp.equals(other.getOutboundProxyIp()))) &&
            ((this.userAgentDomain==null && other.getUserAgentDomain()==null) || 
             (this.userAgentDomain!=null &&
              this.userAgentDomain.equals(other.getUserAgentDomain()))) &&
            ((this.registraServer==null && other.getRegistraServer()==null) || 
             (this.registraServer!=null &&
              this.registraServer.equals(other.getRegistraServer())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getRegiaoAtendimento() != null) {
            _hashCode += getRegiaoAtendimento().hashCode();
        }
        if (getProxyServerIp() != null) {
            _hashCode += getProxyServerIp().hashCode();
        }
        if (getOutboundProxyIp() != null) {
            _hashCode += getOutboundProxyIp().hashCode();
        }
        if (getUserAgentDomain() != null) {
            _hashCode += getUserAgentDomain().hashCode();
        }
        if (getRegistraServer() != null) {
            _hashCode += getRegistraServer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SessionBorder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/services/model/sessionBorder", "SessionBorder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/sessionBorder", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regiaoAtendimento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/sessionBorder", "regiaoAtendimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proxyServerIp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/sessionBorder", "proxyServerIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outboundProxyIp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/sessionBorder", "outboundProxyIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userAgentDomain");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/sessionBorder", "userAgentDomain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registraServer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/services/model/sessionBorder", "registraServer"));
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
