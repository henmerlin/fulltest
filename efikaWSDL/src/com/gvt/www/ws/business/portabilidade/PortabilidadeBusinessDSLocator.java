/**
 * PortabilidadeBusinessDSLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade;

public class PortabilidadeBusinessDSLocator extends org.apache.axis.client.Service implements com.gvt.www.ws.business.portabilidade.PortabilidadeBusinessDS {

    public PortabilidadeBusinessDSLocator() {
    }


    public PortabilidadeBusinessDSLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PortabilidadeBusinessDSLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PortabilidadeBusinessDSSoap
    private java.lang.String PortabilidadeBusinessDSSoap_address = "http://esbgvtna2.gvt.net.br:8888/business/portabilidade/portabilidadeWS";

    public java.lang.String getPortabilidadeBusinessDSSoapAddress() {
        return PortabilidadeBusinessDSSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PortabilidadeBusinessDSSoapWSDDServiceName = "PortabilidadeBusinessDSSoap";

    public java.lang.String getPortabilidadeBusinessDSSoapWSDDServiceName() {
        return PortabilidadeBusinessDSSoapWSDDServiceName;
    }

    public void setPortabilidadeBusinessDSSoapWSDDServiceName(java.lang.String name) {
        PortabilidadeBusinessDSSoapWSDDServiceName = name;
    }

    public com.gvt.www.ws.business.portabilidade.PortabilidadeBusinessDSSoap getPortabilidadeBusinessDSSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PortabilidadeBusinessDSSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPortabilidadeBusinessDSSoap(endpoint);
    }

    public com.gvt.www.ws.business.portabilidade.PortabilidadeBusinessDSSoap getPortabilidadeBusinessDSSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.gvt.www.ws.business.portabilidade.PortabilidadeBusinessDSSoapStub _stub = new com.gvt.www.ws.business.portabilidade.PortabilidadeBusinessDSSoapStub(portAddress, this);
            _stub.setPortName(getPortabilidadeBusinessDSSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPortabilidadeBusinessDSSoapEndpointAddress(java.lang.String address) {
        PortabilidadeBusinessDSSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.gvt.www.ws.business.portabilidade.PortabilidadeBusinessDSSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.gvt.www.ws.business.portabilidade.PortabilidadeBusinessDSSoapStub _stub = new com.gvt.www.ws.business.portabilidade.PortabilidadeBusinessDSSoapStub(new java.net.URL(PortabilidadeBusinessDSSoap_address), this);
                _stub.setPortName(getPortabilidadeBusinessDSSoapWSDDServiceName());
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
        if ("PortabilidadeBusinessDSSoap".equals(inputPortName)) {
            return getPortabilidadeBusinessDSSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "PortabilidadeBusinessDS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "PortabilidadeBusinessDSSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PortabilidadeBusinessDSSoap".equals(portName)) {
            setPortabilidadeBusinessDSSoapEndpointAddress(address);
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
