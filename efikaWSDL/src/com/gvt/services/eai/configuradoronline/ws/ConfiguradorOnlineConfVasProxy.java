package com.gvt.services.eai.configuradoronline.ws;

public class ConfiguradorOnlineConfVasProxy implements com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineConfVas {
  private String _endpoint = null;
  private com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineConfVas configuradorOnlineConfVas = null;
  
  public ConfiguradorOnlineConfVasProxy() {
    _initConfiguradorOnlineConfVasProxy();
  }
  
  public ConfiguradorOnlineConfVasProxy(String endpoint) {
    _endpoint = endpoint;
    _initConfiguradorOnlineConfVasProxy();
  }
  
  private void _initConfiguradorOnlineConfVasProxy() {
    try {
      configuradorOnlineConfVas = (new com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineConfVasServiceLocator()).getConfiguradorOnlineConfVasSoapPort();
      if (configuradorOnlineConfVas != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)configuradorOnlineConfVas)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)configuradorOnlineConfVas)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (configuradorOnlineConfVas != null)
      ((javax.xml.rpc.Stub)configuradorOnlineConfVas)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineConfVas getConfiguradorOnlineConfVas() {
    if (configuradorOnlineConfVas == null)
      _initConfiguradorOnlineConfVasProxy();
    return configuradorOnlineConfVas;
  }
  
  public com.gvt.www.ws.eai.configuradoronline.vas.baseSoftPhone.BaseSoftPhoneOut atualizarRotaRN2SoftPhone(com.gvt.www.ws.eai.configuradoronline.vas.atualizarRotaRN2SoftPhone.AtualizarRotaRN2SoftPhoneIn atualizarRotaRN2SoftPhoneIn) throws java.rmi.RemoteException{
    if (configuradorOnlineConfVas == null)
      _initConfiguradorOnlineConfVasProxy();
    return configuradorOnlineConfVas.atualizarRotaRN2SoftPhone(atualizarRotaRN2SoftPhoneIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.vas.configurarSoftphone.ConfigurarSoftphoneOut configurarSoftphone(com.gvt.www.ws.eai.configuradoronline.vas.configurarSoftphone.ConfigurarSoftphoneIn configurarSoftphoneIn) throws java.rmi.RemoteException{
    if (configuradorOnlineConfVas == null)
      _initConfiguradorOnlineConfVasProxy();
    return configuradorOnlineConfVas.configurarSoftphone(configurarSoftphoneIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.vas.baseSoftPhone.BaseSoftPhoneOut atualizarCredenciaisSIPSoftPhone(com.gvt.www.ws.eai.configuradoronline.vas.atualizarCredenciaisSIPSoftPhone.AtualizarCredenciaisSIPSoftPhoneIn atualizarCredenciaisSIPSoftPhoneIn) throws java.rmi.RemoteException{
    if (configuradorOnlineConfVas == null)
      _initConfiguradorOnlineConfVasProxy();
    return configuradorOnlineConfVas.atualizarCredenciaisSIPSoftPhone(atualizarCredenciaisSIPSoftPhoneIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.vas.baseSoftPhone.BaseSoftPhoneOut atualizarInventarioSIPSoftPhone(com.gvt.www.ws.eai.configuradoronline.vas.atualizarInventarioSIPSoftPhone.AtualizarInventarioSIPSoftPhoneIn atualizarInventarioSIPSoftPhoneIn) throws java.rmi.RemoteException{
    if (configuradorOnlineConfVas == null)
      _initConfiguradorOnlineConfVasProxy();
    return configuradorOnlineConfVas.atualizarInventarioSIPSoftPhone(atualizarInventarioSIPSoftPhoneIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.SuspensaoTemporariaOut configuraSuspensaoTemporaria(com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.SuspensaoTemporariaIn configuraSuspensaoTemporariaIn) throws java.rmi.RemoteException{
    if (configuradorOnlineConfVas == null)
      _initConfiguradorOnlineConfVasProxy();
    return configuradorOnlineConfVas.configuraSuspensaoTemporaria(configuraSuspensaoTemporariaIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.vas.sincronizarVASFone2Go.SincronizarVASFone2GoOut sincronizarVASFone2Go(com.gvt.www.ws.eai.configuradoronline.vas.sincronizarVASFone2Go.SincronizarVASFone2GoIn sincronizarVASFone2GoIn) throws java.rmi.RemoteException{
    if (configuradorOnlineConfVas == null)
      _initConfiguradorOnlineConfVasProxy();
    return configuradorOnlineConfVas.sincronizarVASFone2Go(sincronizarVASFone2GoIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.vas.consultarTecnologiaLinhaIMS.ConsultarTecnologiaLinhaIMSOut consultarTecnologiaLinhaIMS(com.gvt.www.ws.eai.configuradoronline.vas.consultarTecnologiaLinhaIMS.ConsultarTecnologiaLinhaIMSIn consultarTecnologiaLinhaIMSIn) throws java.rmi.RemoteException{
    if (configuradorOnlineConfVas == null)
      _initConfiguradorOnlineConfVasProxy();
    return configuradorOnlineConfVas.consultarTecnologiaLinhaIMS(consultarTecnologiaLinhaIMSIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.vas.changePasswordIMS.ChangePasswordIMSOut changePasswordIMS(com.gvt.www.ws.eai.configuradoronline.vas.changePasswordIMS.ChangePasswordIMSIn changePasswordIMSIn) throws java.rmi.RemoteException{
    if (configuradorOnlineConfVas == null)
      _initConfiguradorOnlineConfVasProxy();
    return configuradorOnlineConfVas.changePasswordIMS(changePasswordIMSIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.vas.baseSoftPhone.BaseSoftPhoneOut atualizarAssociacoesIMSSoftphone(com.gvt.www.ws.eai.configuradoronline.vas.atualizarAssociacoesIMSSoftphone.AtualizarAssociacoesIMSSoftphoneIn atualizarAssociacoesIMSSoftphoneIn) throws java.rmi.RemoteException{
    if (configuradorOnlineConfVas == null)
      _initConfiguradorOnlineConfVasProxy();
    return configuradorOnlineConfVas.atualizarAssociacoesIMSSoftphone(atualizarAssociacoesIMSSoftphoneIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.vas.removerCredenciaisSIPSoftPhone.RemoverCredenciaisSIPSoftPhoneOut removerCredenciaisSIPSoftPhone(com.gvt.www.ws.eai.configuradoronline.vas.removerCredenciaisSIPSoftPhone.RemoverCredenciaisSIPSoftPhoneIn removerCredenciaisSIPSoftPhoneIn) throws java.rmi.RemoteException{
    if (configuradorOnlineConfVas == null)
      _initConfiguradorOnlineConfVasProxy();
    return configuradorOnlineConfVas.removerCredenciaisSIPSoftPhone(removerCredenciaisSIPSoftPhoneIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.vas.sincronizarVAS.SincronizarVASOut sincronizarVAS(com.gvt.www.ws.eai.configuradoronline.vas.sincronizarVAS.SincronizarVASIn sincronizarVASIn) throws java.rmi.RemoteException{
    if (configuradorOnlineConfVas == null)
      _initConfiguradorOnlineConfVasProxy();
    return configuradorOnlineConfVas.sincronizarVAS(sincronizarVASIn);
  }
  
  
}