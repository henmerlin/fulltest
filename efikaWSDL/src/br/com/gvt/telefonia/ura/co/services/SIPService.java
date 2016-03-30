/**
 * SIPService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.telefonia.ura.co.services;

public interface SIPService extends javax.xml.rpc.Service {
    public java.lang.String getSIPPortAddress();

    public br.com.gvt.telefonia.ura.co.services.SIP getSIPPort() throws javax.xml.rpc.ServiceException;

    public br.com.gvt.telefonia.ura.co.services.SIP getSIPPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
