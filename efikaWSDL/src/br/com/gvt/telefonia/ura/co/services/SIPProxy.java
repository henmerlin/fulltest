package br.com.gvt.telefonia.ura.co.services;

public class SIPProxy implements br.com.gvt.telefonia.ura.co.services.SIP {
  private String _endpoint = null;
  private br.com.gvt.telefonia.ura.co.services.SIP sIP = null;
  
  public SIPProxy() {
    _initSIPProxy();
  }
  
  public SIPProxy(String endpoint) {
    _endpoint = endpoint;
    _initSIPProxy();
  }
  
  private void _initSIPProxy() {
    try {
      sIP = (new br.com.gvt.telefonia.ura.co.services.SIPServiceLocator()).getSIPPort();
      if (sIP != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sIP)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sIP)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sIP != null)
      ((javax.xml.rpc.Stub)sIP)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.gvt.telefonia.ura.co.services.SIP getSIP() {
    if (sIP == null)
      _initSIPProxy();
    return sIP;
  }
  
  public br.com.gvt.telefonia.ura.co.services.IpVoiceOut hasIPVoice(br.com.gvt.telefonia.ura.co.services.IpVoiceIn ipVoiceIn) throws java.rmi.RemoteException{
    if (sIP == null)
      _initSIPProxy();
    return sIP.hasIPVoice(ipVoiceIn);
  }
  
  public br.com.gvt.telefonia.ura.co.services.DslamOut isDSLAMmanageable(br.com.gvt.telefonia.ura.co.services.DslamIn DSLAMIn) throws java.rmi.RemoteException{
    if (sIP == null)
      _initSIPProxy();
    return sIP.isDSLAMmanageable(DSLAMIn);
  }
  
  public br.com.gvt.telefonia.ura.co.services.BridgeVoiceOut isBgidgeVoiceCreated(br.com.gvt.telefonia.ura.co.services.BridgeVoiceIn bridgeVoiceIn) throws java.rmi.RemoteException{
    if (sIP == null)
      _initSIPProxy();
    return sIP.isBgidgeVoiceCreated(bridgeVoiceIn);
  }
  
  public br.com.gvt.telefonia.ura.co.services.SipOut verifySIPTecnology(br.com.gvt.telefonia.ura.co.services.SipIn SIPIn) throws java.rmi.RemoteException{
    if (sIP == null)
      _initSIPProxy();
    return sIP.verifySIPTecnology(SIPIn);
  }
  
  public br.com.gvt.telefonia.ura.co.services.SipStatusOut getSIPStatus(br.com.gvt.telefonia.ura.co.services.SipStatusIn SIPStatusIn) throws java.rmi.RemoteException{
    if (sIP == null)
      _initSIPProxy();
    return sIP.getSIPStatus(SIPStatusIn);
  }
  
  public br.com.gvt.telefonia.ura.co.services.SipModemConfigurationOut isSipModemConfigured(br.com.gvt.telefonia.ura.co.services.SipModemConfigurationIn SIPModemConfigurationIn) throws java.rmi.RemoteException{
    if (sIP == null)
      _initSIPProxy();
    return sIP.isSipModemConfigured(SIPModemConfigurationIn);
  }
  
  public br.com.gvt.telefonia.ura.co.services.ResetModemSipInterfaceOut resetModemSipInterface(br.com.gvt.telefonia.ura.co.services.ResetModemSipInterfaceIn resetModemSipInterfaceIn) throws java.rmi.RemoteException{
    if (sIP == null)
      _initSIPProxy();
    return sIP.resetModemSipInterface(resetModemSipInterfaceIn);
  }
  
  public br.com.gvt.telefonia.ura.co.services.ResendFxsOut resendFxs(br.com.gvt.telefonia.ura.co.services.ResendFxsIn resendFXSIn) throws java.rmi.RemoteException{
    if (sIP == null)
      _initSIPProxy();
    return sIP.resendFxs(resendFXSIn);
  }
  
  public br.com.gvt.telefonia.ura.co.services.ConfigBridgeOut configBridgeVoice(br.com.gvt.telefonia.ura.co.services.ConfigBridgeIn configBridgeIn) throws java.rmi.RemoteException{
    if (sIP == null)
      _initSIPProxy();
    return sIP.configBridgeVoice(configBridgeIn);
  }
  
  public br.com.gvt.telefonia.ura.co.services.BridgeVoiceMetalOut bridgeVoiceMetal(br.com.gvt.telefonia.ura.co.services.BridgeVoiceMetalIn bridgeVoiceMetalIn) throws java.rmi.RemoteException{
    if (sIP == null)
      _initSIPProxy();
    return sIP.bridgeVoiceMetal(bridgeVoiceMetalIn);
  }
  
  public br.com.gvt.telefonia.ura.co.services.SipLineOut sipLineIsOK(br.com.gvt.telefonia.ura.co.services.SipLineIn sipLineIn) throws java.rmi.RemoteException{
    if (sIP == null)
      _initSIPProxy();
    return sIP.sipLineIsOK(sipLineIn);
  }
  
  public br.com.gvt.telefonia.ura.co.services.ConfigBridgeVoiceMetalOut configBridgeVoiceMetal(br.com.gvt.telefonia.ura.co.services.ConfigBridgeVoiceMetalIn configBridgeVoiceMetalIn) throws java.rmi.RemoteException{
    if (sIP == null)
      _initSIPProxy();
    return sIP.configBridgeVoiceMetal(configBridgeVoiceMetalIn);
  }
  
  public br.com.gvt.telefonia.ura.co.services.ModemACSTimeOut upOnPlataformACSTime(br.com.gvt.telefonia.ura.co.services.ModemACSTimeIn modemACSTimeIn) throws java.rmi.RemoteException{
    if (sIP == null)
      _initSIPProxy();
    return sIP.upOnPlataformACSTime(modemACSTimeIn);
  }
  
  public br.com.gvt.telefonia.ura.co.services.VersionOut getVersion(br.com.gvt.telefonia.ura.co.services.VersionIn versionIn) throws java.rmi.RemoteException{
    if (sIP == null)
      _initSIPProxy();
    return sIP.getVersion(versionIn);
  }
  
  
}