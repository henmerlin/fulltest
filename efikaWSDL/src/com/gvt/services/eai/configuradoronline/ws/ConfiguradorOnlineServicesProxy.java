package com.gvt.services.eai.configuradoronline.ws;

public class ConfiguradorOnlineServicesProxy implements com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineServices {
  private String _endpoint = null;
  private com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineServices configuradorOnlineServices = null;
  
  public ConfiguradorOnlineServicesProxy() {
    _initConfiguradorOnlineServicesProxy();
  }
  
  public ConfiguradorOnlineServicesProxy(String endpoint) {
    _endpoint = endpoint;
    _initConfiguradorOnlineServicesProxy();
  }
  
  private void _initConfiguradorOnlineServicesProxy() {
    try {
      configuradorOnlineServices = (new com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineServicesServiceLocator()).getConfiguradorOnlineServicesSoapPort();
      if (configuradorOnlineServices != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)configuradorOnlineServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)configuradorOnlineServices)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (configuradorOnlineServices != null)
      ((javax.xml.rpc.Stub)configuradorOnlineServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineServices getConfiguradorOnlineServices() {
    if (configuradorOnlineServices == null)
      _initConfiguradorOnlineServicesProxy();
    return configuradorOnlineServices;
  }
  
  public com.gvt.www.services.trocarTecnologiaVoz.TrocarTecnologiaVozOut trocarTecnologiaVoz(com.gvt.www.services.trocarTecnologiaVoz.TrocarTecnologiaVozIn tecnologiaVozIn) throws java.rmi.RemoteException{
    if (configuradorOnlineServices == null)
      _initConfiguradorOnlineServicesProxy();
    return configuradorOnlineServices.trocarTecnologiaVoz(tecnologiaVozIn);
  }
  
  public com.gvt.www.services.trocarModeloEquipamento.TrocarModeloEquipamentoOut trocarModeloEquipamento(com.gvt.www.services.trocarModeloEquipamento.TrocarModeloEquipamentoIn trocarModeloEquipamentoIn) throws java.rmi.RemoteException{
    if (configuradorOnlineServices == null)
      _initConfiguradorOnlineServicesProxy();
    return configuradorOnlineServices.trocarModeloEquipamento(trocarModeloEquipamentoIn);
  }
  
  public com.gvt.www.services.configurarEquipamento.ConfigurarEquipamentoOut configurarEquipamento(com.gvt.www.services.configurarEquipamento.ConfigurarEquipamentoIn configurarEquipamentoIn) throws java.rmi.RemoteException{
    if (configuradorOnlineServices == null)
      _initConfiguradorOnlineServicesProxy();
    return configuradorOnlineServices.configurarEquipamento(configurarEquipamentoIn);
  }
  
  public com.gvt.www.services.consultarEquipamento.ConsultarEquipamentoOut consultarEquipamentos(com.gvt.www.services.consultarEquipamento.ConsultarEquipamentoIn consultarEquipamentosIn) throws java.rmi.RemoteException{
    if (configuradorOnlineServices == null)
      _initConfiguradorOnlineServicesProxy();
    return configuradorOnlineServices.consultarEquipamentos(consultarEquipamentosIn);
  }
  
  public com.gvt.www.services.consultarControleComando.ConsultarControlesComandosOut consultarControlesComandos(com.gvt.www.services.consultarControleComando.ConsultarControlesComandosIn consultarControleComandoIn) throws java.rmi.RemoteException{
    if (configuradorOnlineServices == null)
      _initConfiguradorOnlineServicesProxy();
    return configuradorOnlineServices.consultarControlesComandos(consultarControleComandoIn);
  }
  
  public com.gvt.www.services.configurarServico.ConfigurarServicoOut configurarServico(com.gvt.www.services.configurarServico.ConfigurarServicoIn configurarServicoIn) throws java.rmi.RemoteException{
    if (configuradorOnlineServices == null)
      _initConfiguradorOnlineServicesProxy();
    return configuradorOnlineServices.configurarServico(configurarServicoIn);
  }
  
  public com.gvt.www.services.listarModelos.ListarModelosOut listarModelos(com.gvt.www.services.listarModelos.ListarModelosIn listarModelosIn) throws java.rmi.RemoteException{
    if (configuradorOnlineServices == null)
      _initConfiguradorOnlineServicesProxy();
    return configuradorOnlineServices.listarModelos(listarModelosIn);
  }
  
  
}