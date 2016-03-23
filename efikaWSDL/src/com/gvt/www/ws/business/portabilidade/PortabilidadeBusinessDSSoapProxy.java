package com.gvt.www.ws.business.portabilidade;

public class PortabilidadeBusinessDSSoapProxy implements com.gvt.www.ws.business.portabilidade.PortabilidadeBusinessDSSoap {
  private String _endpoint = null;
  private com.gvt.www.ws.business.portabilidade.PortabilidadeBusinessDSSoap portabilidadeBusinessDSSoap = null;
  
  public PortabilidadeBusinessDSSoapProxy() {
    _initPortabilidadeBusinessDSSoapProxy();
  }
  
  public PortabilidadeBusinessDSSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initPortabilidadeBusinessDSSoapProxy();
  }
  
  private void _initPortabilidadeBusinessDSSoapProxy() {
    try {
      portabilidadeBusinessDSSoap = (new com.gvt.www.ws.business.portabilidade.PortabilidadeBusinessDSLocator()).getPortabilidadeBusinessDSSoap();
      if (portabilidadeBusinessDSSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)portabilidadeBusinessDSSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)portabilidadeBusinessDSSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (portabilidadeBusinessDSSoap != null)
      ((javax.xml.rpc.Stub)portabilidadeBusinessDSSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.gvt.www.ws.business.portabilidade.PortabilidadeBusinessDSSoap getPortabilidadeBusinessDSSoap() {
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    return portabilidadeBusinessDSSoap;
  }
  
  public com.gvt.www.ws.business.portabilidade.cancelarPN.CancelarPNOut cancelarPN(com.gvt.www.ws.business.portabilidade.cancelarPN.CancelarPNIn cancelarPNIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    return portabilidadeBusinessDSSoap.cancelarPN(cancelarPNIn);
  }
  
  public void devolverNumero(com.gvt.www.ws.business.portabilidade.devolverNumero.DevolverNumeroIn devolverNumeroIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    portabilidadeBusinessDSSoap.devolverNumero(devolverNumeroIn);
  }
  
  public com.gvt.www.ws.business.portabilidade.getJanelas.GetJanelasOut getJanelas(com.gvt.www.ws.business.portabilidade.getJanelas.GetJanelasIn getJanelasIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    return portabilidadeBusinessDSSoap.getJanelas(getJanelasIn);
  }
  
  public com.gvt.www.ws.business.portabilidade.isGVT.IsGVTOut isGVT(com.gvt.www.ws.business.portabilidade.isGVT.IsGVTIn isGVTIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    return portabilidadeBusinessDSSoap.isGVT(isGVTIn);
  }
  
  public com.gvt.www.ws.business.portabilidade.getDePara.DePara[] getDePara(com.gvt.www.ws.business.portabilidade.getDePara.GetDeParaIn getDeParaIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    return portabilidadeBusinessDSSoap.getDePara(getDeParaIn);
  }
  
  public com.gvt.www.ws.business.portabilidade.inserirNP.InserirNPOut inserirNP(com.gvt.www.ws.business.portabilidade.inserirNP.InserirNPIn inserirNPIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    return portabilidadeBusinessDSSoap.inserirNP(inserirNPIn);
  }
  
  public com.gvt.www.ws.business.portabilidade.getOperadoraByFilter.GetOperadoraByFilterOut getOperadoraByFilter(com.gvt.www.ws.business.portabilidade.getOperadoraByFilter.GetOperadoraByFilterIn getOperadoraByFilterIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    return portabilidadeBusinessDSSoap.getOperadoraByFilter(getOperadoraByFilterIn);
  }
  
  public void logPNWithNotificationReply(com.gvt.www.ws.business.portabilidade.logPNWithNotificationReply.LogPNWithNotificationReplyIn logPNWithNotificationReplyIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    portabilidadeBusinessDSSoap.logPNWithNotificationReply(logPNWithNotificationReplyIn);
  }
  
  public com.gvt.www.ws.business.portabilidade.cancelarPNByIdSolicitacao.CancelarPNByIdSolicitacaoOut cancelarPNByIdSolicitacao(com.gvt.www.ws.business.portabilidade.cancelarPNByIdSolicitacao.CancelarPNByIdSolicitacaoIn cancelarPNByIdSolicitacaoIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    return portabilidadeBusinessDSSoap.cancelarPNByIdSolicitacao(cancelarPNByIdSolicitacaoIn);
  }
  
  public com.gvt.www.ws.business.portabilidade.reagendarPN.ReagendarPNOut reagendarPN(com.gvt.www.ws.business.portabilidade.reagendarPN.ReagendarPNIn reagendarPNIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    return portabilidadeBusinessDSSoap.reagendarPN(reagendarPNIn);
  }
  
  public com.gvt.www.ws.business.portabilidade.solicitarPN.SolicitarPNOut solicitarPN(com.gvt.www.ws.business.portabilidade.solicitarPN.SolicitarPNIn solicitarPNIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    return portabilidadeBusinessDSSoap.solicitarPN(solicitarPNIn);
  }
  
  public void concluirDoacaoPN(com.gvt.www.ws.business.portabilidade.concluirDoacao.ConcluirDoacaoIn concluirDoacaoIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    portabilidadeBusinessDSSoap.concluirDoacaoPN(concluirDoacaoIn);
  }
  
  public void receberAutenticacaoDoadora(com.gvt.www.ws.business.portabilidade.receberAutenticacaoDoadora.ReceberAutenticacaoDoadoraIn receberAutenticacaoDoadoraIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    portabilidadeBusinessDSSoap.receberAutenticacaoDoadora(receberAutenticacaoDoadoraIn);
  }
  
  public void logPNWithDownloadReply(com.gvt.www.ws.business.portabilidade.logPNWithDownloadReply.LogPNWithDownloadReplyIn logPNWithDownloadReplyIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    portabilidadeBusinessDSSoap.logPNWithDownloadReply(logPNWithDownloadReplyIn);
  }
  
  public void receberSuspensaoPN(com.gvt.www.ws.business.portabilidade.receberSuspensaoPN.ReceberSuspensaoPNIn receberSuspensaoPNIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    portabilidadeBusinessDSSoap.receberSuspensaoPN(receberSuspensaoPNIn);
  }
  
  public void removerSuspensaoConflitoPN(com.gvt.www.ws.business.portabilidade.removerSuspensaoConflitoPN.RemoverSuspensaoConflitoPNIn removerSuspensaoConflitoPNIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    portabilidadeBusinessDSSoap.removerSuspensaoConflitoPN(removerSuspensaoConflitoPNIn);
  }
  
  public void reativarPN(com.gvt.www.ws.business.portabilidade.reativarPN.ReativarPNIn reativarPNIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    portabilidadeBusinessDSSoap.reativarPN(reativarPNIn);
  }
  
  public com.gvt.www.ws.business.portabilidade.isReativavel.IsReativavelOut isReativavel(com.gvt.www.ws.business.portabilidade.isReativavel.IsReativavelIn isReativavelIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    return portabilidadeBusinessDSSoap.isReativavel(isReativavelIn);
  }
  
  public void enviarTSAtivacao(com.gvt.www.ws.business.portabilidade.enviarTSAtivacao.EnviarTSAtivacaoIn enviarTSAtivacaoIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    portabilidadeBusinessDSSoap.enviarTSAtivacao(enviarTSAtivacaoIn);
  }
  
  public void configurarSwitch(com.gvt.www.ws.business.portabilidade.configurarSwitch.ConfigurarSwitchIn configurarSwitchIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    portabilidadeBusinessDSSoap.configurarSwitch(configurarSwitchIn);
  }
  
  public void retornoAutenticacaoManual(com.gvt.www.ws.business.portabilidade.retornoAutenticacaoManual.RetornoAutenticacaoManualIn retornoAutenticacaoManualIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    portabilidadeBusinessDSSoap.retornoAutenticacaoManual(retornoAutenticacaoManualIn);
  }
  
  public void logPN(com.gvt.www.ws.business.portabilidade.logPN.LogPNIn logPNIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    portabilidadeBusinessDSSoap.logPN(logPNIn);
  }
  
  public com.gvt.www.ws.business.portabilidade.validarDataPN.ValidarDataPNOut validarDataPN(com.gvt.www.ws.business.portabilidade.validarDataPN.ValidarDataPNIn validarDataPNIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    return portabilidadeBusinessDSSoap.validarDataPN(validarDataPNIn);
  }
  
  public com.gvt.www.ws.business.portabilidade.getHistoricoPNByFilter.GetHistoricoPNByFilterOut getHistoricoPNByFilter(com.gvt.www.ws.business.portabilidade.getHistoricoPNByFilter.GetHistoricoPNByFilterIn getHistoricoPNByFilterIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    return portabilidadeBusinessDSSoap.getHistoricoPNByFilter(getHistoricoPNByFilterIn);
  }
  
  public void receberCancelamentoPN(com.gvt.www.ws.business.portabilidade.receberCancelamentoPN.ReceberCancelamentoPNIn receberCancelamentoPNIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    portabilidadeBusinessDSSoap.receberCancelamentoPN(receberCancelamentoPNIn);
  }
  
  public void suspenderPN(com.gvt.www.ws.business.portabilidade.suspenderPNIn.SuspenderPNIn suspenderPNIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    portabilidadeBusinessDSSoap.suspenderPN(suspenderPNIn);
  }
  
  public void concluirAprovisionamento(com.gvt.www.ws.business.portabilidade.concluirAprovisionamento.ConcluirAprovisionamentoIn concluirAprovisionamentoIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    portabilidadeBusinessDSSoap.concluirAprovisionamento(concluirAprovisionamentoIn);
  }
  
  public void autenticarPN(com.gvt.www.ws.business.portabilidade.autenticarPN.AutenticarPNIn autenticarPNIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    portabilidadeBusinessDSSoap.autenticarPN(autenticarPNIn);
  }
  
  public com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.SolicitarPNIntrinsecaOut solicitarPNIntrinseca(com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.SolicitarPNIntrinsecaIn solicitarPNIntrinsecaIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    return portabilidadeBusinessDSSoap.solicitarPNIntrinseca(solicitarPNIntrinsecaIn);
  }
  
  public void informarDesconexaoPN(com.gvt.www.ws.business.portabilidade.informarDesconexaoPN.InformarDesconexaoIn informarDesconexaoPNIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    portabilidadeBusinessDSSoap.informarDesconexaoPN(informarDesconexaoPNIn);
  }
  
  public com.gvt.www.ws.business.portabilidade.isPortavel.IsPortavelOut isPortavel(com.gvt.www.ws.business.portabilidade.isPortavel.IsPortavelIn isPortavelIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    return portabilidadeBusinessDSSoap.isPortavel(isPortavelIn);
  }
  
  public com.gvt.www.ws.business.portabilidade.estornarPN.EstornarPNOut estornarPN(com.gvt.www.ws.business.portabilidade.estornarPN.EstornarPNIn estornarPNIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    return portabilidadeBusinessDSSoap.estornarPN(estornarPNIn);
  }
  
  public void receberReagendamentoPN(com.gvt.www.ws.business.portabilidade.receberReagendamentoPN.ReceberReagendamentoPNIn receberReagendamentoPNIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    portabilidadeBusinessDSSoap.receberReagendamentoPN(receberReagendamentoPNIn);
  }
  
  public void concluirMudancaEndereco(com.gvt.www.ws.business.portabilidade.concluirMudancaEndereco.ConcluirMudancaEnderecoIn concluirMudancaEnderecoIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    portabilidadeBusinessDSSoap.concluirMudancaEndereco(concluirMudancaEnderecoIn);
  }
  
  public com.gvt.www.ws.business.portabilidade.migrarPTSProdutoRI.MigrarPTSProdutoRIOut migrarPTSProdutoRI(com.gvt.www.ws.business.portabilidade.migrarPTSProdutoRI.MigrarPTSProdutoRIIn migrarPTSProdutoRIIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    return portabilidadeBusinessDSSoap.migrarPTSProdutoRI(migrarPTSProdutoRIIn);
  }
  
  public void concluirTarefaPortabilidade(com.gvt.www.ws.business.portabilidade.concluirTarefaPortabilidade.ConcluirTarefaPortabilidadeIn concluirTarefaPortabilidadeIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    portabilidadeBusinessDSSoap.concluirTarefaPortabilidade(concluirTarefaPortabilidadeIn);
  }
  
  public void receberPedidoAutenticacaoPN(com.gvt.www.ws.business.portabilidade.receberPedidoAutenticacaoPN.ReceberPedidoAutenticacaoPNIn receberPedidoAutenticacaoPNIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    portabilidadeBusinessDSSoap.receberPedidoAutenticacaoPN(receberPedidoAutenticacaoPNIn);
  }
  
  public void enviarTSDesconexao(com.gvt.www.ws.business.portabilidade.enviarTSDesconexao.EnviarTSDesconexaoIn enviarTSDesconexaoIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    portabilidadeBusinessDSSoap.enviarTSDesconexao(enviarTSDesconexaoIn);
  }
  
  public com.gvt.www.ws.eai.sisnum.AssociarNumeroEquipOut associarNumeroEquip(com.gvt.www.ws.eai.sisnum.AssociarNumeroEquipIn associarNumeroEquipIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    return portabilidadeBusinessDSSoap.associarNumeroEquip(associarNumeroEquipIn);
  }
  
  public com.gvt.www.ws.eai.sisnum.getNumeroEquip.GetNumeroEquipOut getNumeroEquip(com.gvt.www.ws.eai.sisnum.getNumeroEquip.GetNumeroEquipIn getNumeroEquipIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    return portabilidadeBusinessDSSoap.getNumeroEquip(getNumeroEquipIn);
  }
  
  public void liberarNumeroEquip(com.gvt.www.ws.eai.sisnum.liberarNumeroEquip.LiberarNumeroEquipIn liberarNumeroEquipIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    portabilidadeBusinessDSSoap.liberarNumeroEquip(liberarNumeroEquipIn);
  }
  
  public com.gvt.www.ws.business.portabilidade.getInformacoesInstancia.GetInformacoesInstanciaOut getInformacoesInstancia(com.gvt.www.ws.business.portabilidade.getInformacoesInstancia.GetInformacoesInstanciaIn getInformacoesInstanciaIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    return portabilidadeBusinessDSSoap.getInformacoesInstancia(getInformacoesInstanciaIn);
  }
  
  public com.gvt.www.ws.eai.siebel5.portabilidade.isFeriado.IsFeriadoOut isFeriado(com.gvt.www.ws.eai.siebel5.portabilidade.isFeriado.IsFeriadoIn isFeriadoIn) throws java.rmi.RemoteException{
    if (portabilidadeBusinessDSSoap == null)
      _initPortabilidadeBusinessDSSoapProxy();
    return portabilidadeBusinessDSSoap.isFeriado(isFeriadoIn);
  }
  
  
}