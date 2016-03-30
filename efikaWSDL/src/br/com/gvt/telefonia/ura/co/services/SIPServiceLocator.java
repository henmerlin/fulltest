/**
 * SIPServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.telefonia.ura.co.services;

public class SIPServiceLocator extends org.apache.axis.client.Service implements br.com.gvt.telefonia.ura.co.services.SIPService {

    public SIPServiceLocator() {
    }


    public SIPServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SIPServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SIPPort
    private java.lang.String SIPPort_address = "http://ura-oper-app.gvt.net.br:80/telefonia-ura-co-services/SIPService";

    public java.lang.String getSIPPortAddress() {
        return SIPPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SIPPortWSDDServiceName = "SIPPort";

    public java.lang.String getSIPPortWSDDServiceName() {
        return SIPPortWSDDServiceName;
    }

    public void setSIPPortWSDDServiceName(java.lang.String name) {
        SIPPortWSDDServiceName = name;
    }

    public br.com.gvt.telefonia.ura.co.services.SIP getSIPPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SIPPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSIPPort(endpoint);
    }

    public br.com.gvt.telefonia.ura.co.services.SIP getSIPPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.gvt.telefonia.ura.co.services.SIPPortBindingStub _stub = new br.com.gvt.telefonia.ura.co.services.SIPPortBindingStub(portAddress, this);
            _stub.setPortName(getSIPPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSIPPortEndpointAddress(java.lang.String address) {
        SIPPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.gvt.telefonia.ura.co.services.SIP.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.gvt.telefonia.ura.co.services.SIPPortBindingStub _stub = new br.com.gvt.telefonia.ura.co.services.SIPPortBindingStub(new java.net.URL(SIPPort_address), this);
                _stub.setPortName(getSIPPortWSDDServiceName());
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
        if ("SIPPort".equals(inputPortName)) {
            return getSIPPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "SIPService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "SIPPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SIPPort".equals(portName)) {
            setSIPPortEndpointAddress(address);
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
