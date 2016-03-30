/**
 * SIP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.telefonia.ura.co.services;

public interface SIP extends java.rmi.Remote {
    public br.com.gvt.telefonia.ura.co.services.IpVoiceOut hasIPVoice(br.com.gvt.telefonia.ura.co.services.IpVoiceIn ipVoiceIn) throws java.rmi.RemoteException;
    public br.com.gvt.telefonia.ura.co.services.DslamOut isDSLAMmanageable(br.com.gvt.telefonia.ura.co.services.DslamIn DSLAMIn) throws java.rmi.RemoteException;
    public br.com.gvt.telefonia.ura.co.services.BridgeVoiceOut isBgidgeVoiceCreated(br.com.gvt.telefonia.ura.co.services.BridgeVoiceIn bridgeVoiceIn) throws java.rmi.RemoteException;
    public br.com.gvt.telefonia.ura.co.services.SipOut verifySIPTecnology(br.com.gvt.telefonia.ura.co.services.SipIn SIPIn) throws java.rmi.RemoteException;
    public br.com.gvt.telefonia.ura.co.services.SipStatusOut getSIPStatus(br.com.gvt.telefonia.ura.co.services.SipStatusIn SIPStatusIn) throws java.rmi.RemoteException;
    public br.com.gvt.telefonia.ura.co.services.SipModemConfigurationOut isSipModemConfigured(br.com.gvt.telefonia.ura.co.services.SipModemConfigurationIn SIPModemConfigurationIn) throws java.rmi.RemoteException;
    public br.com.gvt.telefonia.ura.co.services.ResetModemSipInterfaceOut resetModemSipInterface(br.com.gvt.telefonia.ura.co.services.ResetModemSipInterfaceIn resetModemSipInterfaceIn) throws java.rmi.RemoteException;
    public br.com.gvt.telefonia.ura.co.services.ResendFxsOut resendFxs(br.com.gvt.telefonia.ura.co.services.ResendFxsIn resendFXSIn) throws java.rmi.RemoteException;
    public br.com.gvt.telefonia.ura.co.services.ConfigBridgeOut configBridgeVoice(br.com.gvt.telefonia.ura.co.services.ConfigBridgeIn configBridgeIn) throws java.rmi.RemoteException;
    public br.com.gvt.telefonia.ura.co.services.BridgeVoiceMetalOut bridgeVoiceMetal(br.com.gvt.telefonia.ura.co.services.BridgeVoiceMetalIn bridgeVoiceMetalIn) throws java.rmi.RemoteException;
    public br.com.gvt.telefonia.ura.co.services.SipLineOut sipLineIsOK(br.com.gvt.telefonia.ura.co.services.SipLineIn sipLineIn) throws java.rmi.RemoteException;
    public br.com.gvt.telefonia.ura.co.services.ConfigBridgeVoiceMetalOut configBridgeVoiceMetal(br.com.gvt.telefonia.ura.co.services.ConfigBridgeVoiceMetalIn configBridgeVoiceMetalIn) throws java.rmi.RemoteException;
    public br.com.gvt.telefonia.ura.co.services.ModemACSTimeOut upOnPlataformACSTime(br.com.gvt.telefonia.ura.co.services.ModemACSTimeIn modemACSTimeIn) throws java.rmi.RemoteException;
    public br.com.gvt.telefonia.ura.co.services.VersionOut getVersion(br.com.gvt.telefonia.ura.co.services.VersionIn versionIn) throws java.rmi.RemoteException;
}
