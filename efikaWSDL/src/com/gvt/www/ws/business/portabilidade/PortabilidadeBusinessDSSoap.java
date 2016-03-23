/**
 * PortabilidadeBusinessDSSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade;

public interface PortabilidadeBusinessDSSoap extends java.rmi.Remote {
    public com.gvt.www.ws.business.portabilidade.cancelarPN.CancelarPNOut cancelarPN(com.gvt.www.ws.business.portabilidade.cancelarPN.CancelarPNIn cancelarPNIn) throws java.rmi.RemoteException;
    public void devolverNumero(com.gvt.www.ws.business.portabilidade.devolverNumero.DevolverNumeroIn devolverNumeroIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.business.portabilidade.getJanelas.GetJanelasOut getJanelas(com.gvt.www.ws.business.portabilidade.getJanelas.GetJanelasIn getJanelasIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.business.portabilidade.isGVT.IsGVTOut isGVT(com.gvt.www.ws.business.portabilidade.isGVT.IsGVTIn isGVTIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.business.portabilidade.getDePara.DePara[] getDePara(com.gvt.www.ws.business.portabilidade.getDePara.GetDeParaIn getDeParaIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.business.portabilidade.inserirNP.InserirNPOut inserirNP(com.gvt.www.ws.business.portabilidade.inserirNP.InserirNPIn inserirNPIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.business.portabilidade.getOperadoraByFilter.GetOperadoraByFilterOut getOperadoraByFilter(com.gvt.www.ws.business.portabilidade.getOperadoraByFilter.GetOperadoraByFilterIn getOperadoraByFilterIn) throws java.rmi.RemoteException;
    public void logPNWithNotificationReply(com.gvt.www.ws.business.portabilidade.logPNWithNotificationReply.LogPNWithNotificationReplyIn logPNWithNotificationReplyIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.business.portabilidade.cancelarPNByIdSolicitacao.CancelarPNByIdSolicitacaoOut cancelarPNByIdSolicitacao(com.gvt.www.ws.business.portabilidade.cancelarPNByIdSolicitacao.CancelarPNByIdSolicitacaoIn cancelarPNByIdSolicitacaoIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.business.portabilidade.reagendarPN.ReagendarPNOut reagendarPN(com.gvt.www.ws.business.portabilidade.reagendarPN.ReagendarPNIn reagendarPNIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.business.portabilidade.solicitarPN.SolicitarPNOut solicitarPN(com.gvt.www.ws.business.portabilidade.solicitarPN.SolicitarPNIn solicitarPNIn) throws java.rmi.RemoteException;
    public void concluirDoacaoPN(com.gvt.www.ws.business.portabilidade.concluirDoacao.ConcluirDoacaoIn concluirDoacaoIn) throws java.rmi.RemoteException;
    public void receberAutenticacaoDoadora(com.gvt.www.ws.business.portabilidade.receberAutenticacaoDoadora.ReceberAutenticacaoDoadoraIn receberAutenticacaoDoadoraIn) throws java.rmi.RemoteException;
    public void logPNWithDownloadReply(com.gvt.www.ws.business.portabilidade.logPNWithDownloadReply.LogPNWithDownloadReplyIn logPNWithDownloadReplyIn) throws java.rmi.RemoteException;
    public void receberSuspensaoPN(com.gvt.www.ws.business.portabilidade.receberSuspensaoPN.ReceberSuspensaoPNIn receberSuspensaoPNIn) throws java.rmi.RemoteException;
    public void removerSuspensaoConflitoPN(com.gvt.www.ws.business.portabilidade.removerSuspensaoConflitoPN.RemoverSuspensaoConflitoPNIn removerSuspensaoConflitoPNIn) throws java.rmi.RemoteException;
    public void reativarPN(com.gvt.www.ws.business.portabilidade.reativarPN.ReativarPNIn reativarPNIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.business.portabilidade.isReativavel.IsReativavelOut isReativavel(com.gvt.www.ws.business.portabilidade.isReativavel.IsReativavelIn isReativavelIn) throws java.rmi.RemoteException;
    public void enviarTSAtivacao(com.gvt.www.ws.business.portabilidade.enviarTSAtivacao.EnviarTSAtivacaoIn enviarTSAtivacaoIn) throws java.rmi.RemoteException;
    public void configurarSwitch(com.gvt.www.ws.business.portabilidade.configurarSwitch.ConfigurarSwitchIn configurarSwitchIn) throws java.rmi.RemoteException;
    public void retornoAutenticacaoManual(com.gvt.www.ws.business.portabilidade.retornoAutenticacaoManual.RetornoAutenticacaoManualIn retornoAutenticacaoManualIn) throws java.rmi.RemoteException;
    public void logPN(com.gvt.www.ws.business.portabilidade.logPN.LogPNIn logPNIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.business.portabilidade.validarDataPN.ValidarDataPNOut validarDataPN(com.gvt.www.ws.business.portabilidade.validarDataPN.ValidarDataPNIn validarDataPNIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.business.portabilidade.getHistoricoPNByFilter.GetHistoricoPNByFilterOut getHistoricoPNByFilter(com.gvt.www.ws.business.portabilidade.getHistoricoPNByFilter.GetHistoricoPNByFilterIn getHistoricoPNByFilterIn) throws java.rmi.RemoteException;
    public void receberCancelamentoPN(com.gvt.www.ws.business.portabilidade.receberCancelamentoPN.ReceberCancelamentoPNIn receberCancelamentoPNIn) throws java.rmi.RemoteException;
    public void suspenderPN(com.gvt.www.ws.business.portabilidade.suspenderPNIn.SuspenderPNIn suspenderPNIn) throws java.rmi.RemoteException;
    public void concluirAprovisionamento(com.gvt.www.ws.business.portabilidade.concluirAprovisionamento.ConcluirAprovisionamentoIn concluirAprovisionamentoIn) throws java.rmi.RemoteException;
    public void autenticarPN(com.gvt.www.ws.business.portabilidade.autenticarPN.AutenticarPNIn autenticarPNIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.SolicitarPNIntrinsecaOut solicitarPNIntrinseca(com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.SolicitarPNIntrinsecaIn solicitarPNIntrinsecaIn) throws java.rmi.RemoteException;
    public void informarDesconexaoPN(com.gvt.www.ws.business.portabilidade.informarDesconexaoPN.InformarDesconexaoIn informarDesconexaoPNIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.business.portabilidade.isPortavel.IsPortavelOut isPortavel(com.gvt.www.ws.business.portabilidade.isPortavel.IsPortavelIn isPortavelIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.business.portabilidade.estornarPN.EstornarPNOut estornarPN(com.gvt.www.ws.business.portabilidade.estornarPN.EstornarPNIn estornarPNIn) throws java.rmi.RemoteException;
    public void receberReagendamentoPN(com.gvt.www.ws.business.portabilidade.receberReagendamentoPN.ReceberReagendamentoPNIn receberReagendamentoPNIn) throws java.rmi.RemoteException;
    public void concluirMudancaEndereco(com.gvt.www.ws.business.portabilidade.concluirMudancaEndereco.ConcluirMudancaEnderecoIn concluirMudancaEnderecoIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.business.portabilidade.migrarPTSProdutoRI.MigrarPTSProdutoRIOut migrarPTSProdutoRI(com.gvt.www.ws.business.portabilidade.migrarPTSProdutoRI.MigrarPTSProdutoRIIn migrarPTSProdutoRIIn) throws java.rmi.RemoteException;
    public void concluirTarefaPortabilidade(com.gvt.www.ws.business.portabilidade.concluirTarefaPortabilidade.ConcluirTarefaPortabilidadeIn concluirTarefaPortabilidadeIn) throws java.rmi.RemoteException;
    public void receberPedidoAutenticacaoPN(com.gvt.www.ws.business.portabilidade.receberPedidoAutenticacaoPN.ReceberPedidoAutenticacaoPNIn receberPedidoAutenticacaoPNIn) throws java.rmi.RemoteException;
    public void enviarTSDesconexao(com.gvt.www.ws.business.portabilidade.enviarTSDesconexao.EnviarTSDesconexaoIn enviarTSDesconexaoIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.sisnum.AssociarNumeroEquipOut associarNumeroEquip(com.gvt.www.ws.eai.sisnum.AssociarNumeroEquipIn associarNumeroEquipIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.sisnum.getNumeroEquip.GetNumeroEquipOut getNumeroEquip(com.gvt.www.ws.eai.sisnum.getNumeroEquip.GetNumeroEquipIn getNumeroEquipIn) throws java.rmi.RemoteException;
    public void liberarNumeroEquip(com.gvt.www.ws.eai.sisnum.liberarNumeroEquip.LiberarNumeroEquipIn liberarNumeroEquipIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.business.portabilidade.getInformacoesInstancia.GetInformacoesInstanciaOut getInformacoesInstancia(com.gvt.www.ws.business.portabilidade.getInformacoesInstancia.GetInformacoesInstanciaIn getInformacoesInstanciaIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.siebel5.portabilidade.isFeriado.IsFeriadoOut isFeriado(com.gvt.www.ws.eai.siebel5.portabilidade.isFeriado.IsFeriadoIn isFeriadoIn) throws java.rmi.RemoteException;
}
