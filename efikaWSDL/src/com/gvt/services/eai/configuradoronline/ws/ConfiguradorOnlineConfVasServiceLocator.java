/**
 * ConfiguradorOnlineConfVasServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.services.eai.configuradoronline.ws;

public class ConfiguradorOnlineConfVasServiceLocator extends org.apache.axis.client.Service implements com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineConfVasService {

    public ConfiguradorOnlineConfVasServiceLocator() {
    }


    public ConfiguradorOnlineConfVasServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ConfiguradorOnlineConfVasServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ConfiguradorOnlineConfVasSoapPort
    private java.lang.String ConfiguradorOnlineConfVasSoapPort_address = "http://esbgvtna2.gvt.net.br:8888/eai/configuradorOnline/ConfiguradorOnlineServicoAgregado";

    public java.lang.String getConfiguradorOnlineConfVasSoapPortAddress() {
        return ConfiguradorOnlineConfVasSoapPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ConfiguradorOnlineConfVasSoapPortWSDDServiceName = "ConfiguradorOnlineConfVasSoapPort";

    public java.lang.String getConfiguradorOnlineConfVasSoapPortWSDDServiceName() {
        return ConfiguradorOnlineConfVasSoapPortWSDDServiceName;
    }

    public void setConfiguradorOnlineConfVasSoapPortWSDDServiceName(java.lang.String name) {
        ConfiguradorOnlineConfVasSoapPortWSDDServiceName = name;
    }

    public com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineConfVas getConfiguradorOnlineConfVasSoapPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ConfiguradorOnlineConfVasSoapPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getConfiguradorOnlineConfVasSoapPort(endpoint);
    }

    public com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineConfVas getConfiguradorOnlineConfVasSoapPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineConfVasServiceSoapBindingStub _stub = new com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineConfVasServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getConfiguradorOnlineConfVasSoapPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setConfiguradorOnlineConfVasSoapPortEndpointAddress(java.lang.String address) {
        ConfiguradorOnlineConfVasSoapPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineConfVas.class.isAssignableFrom(serviceEndpointInterface)) {
                com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineConfVasServiceSoapBindingStub _stub = new com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineConfVasServiceSoapBindingStub(new java.net.URL(ConfiguradorOnlineConfVasSoapPort_address), this);
                _stub.setPortName(getConfiguradorOnlineConfVasSoapPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ConfiguradorOnlineConfVasSoapPort".equals(inputPortName)) {
            return getConfiguradorOnlineConfVasSoapPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "ConfiguradorOnlineConfVasService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "ConfiguradorOnlineConfVasSoapPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ConfiguradorOnlineConfVasSoapPort".equals(portName)) {
            setConfiguradorOnlineConfVasSoapPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
