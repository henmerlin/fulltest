/**
 * ConfiguradorOnlineServicesServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.services.eai.configuradoronline.ws;

public class ConfiguradorOnlineServicesServiceLocator extends org.apache.axis.client.Service implements com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineServicesService {

    public ConfiguradorOnlineServicesServiceLocator() {
    }


    public ConfiguradorOnlineServicesServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ConfiguradorOnlineServicesServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ConfiguradorOnlineServicesSoapPort
    private java.lang.String ConfiguradorOnlineServicesSoapPort_address = "http://esbgvtna2.gvt.net.br:8888/eai/configuradorOnline/configuradorOnlineServices";

    public java.lang.String getConfiguradorOnlineServicesSoapPortAddress() {
        return ConfiguradorOnlineServicesSoapPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ConfiguradorOnlineServicesSoapPortWSDDServiceName = "ConfiguradorOnlineServicesSoapPort";

    public java.lang.String getConfiguradorOnlineServicesSoapPortWSDDServiceName() {
        return ConfiguradorOnlineServicesSoapPortWSDDServiceName;
    }

    public void setConfiguradorOnlineServicesSoapPortWSDDServiceName(java.lang.String name) {
        ConfiguradorOnlineServicesSoapPortWSDDServiceName = name;
    }

    public com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineServices getConfiguradorOnlineServicesSoapPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ConfiguradorOnlineServicesSoapPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getConfiguradorOnlineServicesSoapPort(endpoint);
    }

    public com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineServices getConfiguradorOnlineServicesSoapPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineServicesServiceSoapBindingStub _stub = new com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineServicesServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getConfiguradorOnlineServicesSoapPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setConfiguradorOnlineServicesSoapPortEndpointAddress(java.lang.String address) {
        ConfiguradorOnlineServicesSoapPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineServices.class.isAssignableFrom(serviceEndpointInterface)) {
                com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineServicesServiceSoapBindingStub _stub = new com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineServicesServiceSoapBindingStub(new java.net.URL(ConfiguradorOnlineServicesSoapPort_address), this);
                _stub.setPortName(getConfiguradorOnlineServicesSoapPortWSDDServiceName());
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
        if ("ConfiguradorOnlineServicesSoapPort".equals(inputPortName)) {
            return getConfiguradorOnlineServicesSoapPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "ConfiguradorOnlineServicesService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "ConfiguradorOnlineServicesSoapPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ConfiguradorOnlineServicesSoapPort".equals(portName)) {
            setConfiguradorOnlineServicesSoapPortEndpointAddress(address);
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
