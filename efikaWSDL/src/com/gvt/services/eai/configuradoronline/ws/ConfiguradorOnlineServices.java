/**
 * ConfiguradorOnlineServices.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.services.eai.configuradoronline.ws;

public interface ConfiguradorOnlineServices extends java.rmi.Remote {
    public com.gvt.www.services.trocarTecnologiaVoz.TrocarTecnologiaVozOut trocarTecnologiaVoz(com.gvt.www.services.trocarTecnologiaVoz.TrocarTecnologiaVozIn tecnologiaVozIn) throws java.rmi.RemoteException;
    public com.gvt.www.services.trocarModeloEquipamento.TrocarModeloEquipamentoOut trocarModeloEquipamento(com.gvt.www.services.trocarModeloEquipamento.TrocarModeloEquipamentoIn trocarModeloEquipamentoIn) throws java.rmi.RemoteException;
    public com.gvt.www.services.configurarEquipamento.ConfigurarEquipamentoOut configurarEquipamento(com.gvt.www.services.configurarEquipamento.ConfigurarEquipamentoIn configurarEquipamentoIn) throws java.rmi.RemoteException;
    public com.gvt.www.services.consultarEquipamento.ConsultarEquipamentoOut consultarEquipamentos(com.gvt.www.services.consultarEquipamento.ConsultarEquipamentoIn consultarEquipamentosIn) throws java.rmi.RemoteException;
    public com.gvt.www.services.consultarControleComando.ConsultarControlesComandosOut consultarControlesComandos(com.gvt.www.services.consultarControleComando.ConsultarControlesComandosIn consultarControleComandoIn) throws java.rmi.RemoteException;
    public com.gvt.www.services.configurarServico.ConfigurarServicoOut configurarServico(com.gvt.www.services.configurarServico.ConfigurarServicoIn configurarServicoIn) throws java.rmi.RemoteException;
    public com.gvt.www.services.listarModelos.ListarModelosOut listarModelos(com.gvt.www.services.listarModelos.ListarModelosIn listarModelosIn) throws java.rmi.RemoteException;
}
