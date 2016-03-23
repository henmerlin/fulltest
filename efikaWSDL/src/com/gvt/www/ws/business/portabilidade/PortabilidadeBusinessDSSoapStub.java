/**
 * PortabilidadeBusinessDSSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.business.portabilidade;

public class PortabilidadeBusinessDSSoapStub extends org.apache.axis.client.Stub implements com.gvt.www.ws.business.portabilidade.PortabilidadeBusinessDSSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[43];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelarPN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/cancelarPN", "cancelarPNIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/cancelarPN", "cancelarPNIn"), com.gvt.www.ws.business.portabilidade.cancelarPN.CancelarPNIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/cancelarPN", "cancelarPNOut"));
        oper.setReturnClass(com.gvt.www.ws.business.portabilidade.cancelarPN.CancelarPNOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/cancelarPN", "cancelarPNOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("devolverNumero");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/devolverNumero", "devolverNumeroIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/devolverNumero", "devolverNumeroIn"), com.gvt.www.ws.business.portabilidade.devolverNumero.DevolverNumeroIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getJanelas");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getJanelas", "getJanelasIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getJanelas", "getJanelasIn"), com.gvt.www.ws.business.portabilidade.getJanelas.GetJanelasIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getJanelas", "getJanelasOut"));
        oper.setReturnClass(com.gvt.www.ws.business.portabilidade.getJanelas.GetJanelasOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getJanelas", "getJanelasOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isGVT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isGVT", "isGVTIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isGVT", "isGVTIn"), com.gvt.www.ws.business.portabilidade.isGVT.IsGVTIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isGVT", "isGVTOut"));
        oper.setReturnClass(com.gvt.www.ws.business.portabilidade.isGVT.IsGVTOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isGVT", "isGVTOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDePara");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getDePara", "getDeParaIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getDePara", "getDeParaIn"), com.gvt.www.ws.business.portabilidade.getDePara.GetDeParaIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getDePara", ">getDeParaOut"));
        oper.setReturnClass(com.gvt.www.ws.business.portabilidade.getDePara.DePara[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getDePara", "getDeParaOut"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getDePara", "dePara"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("inserirNP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/inserirNP", "inserirNPIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/inserirNP", "inserirNPIn"), com.gvt.www.ws.business.portabilidade.inserirNP.InserirNPIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/inserirNP", "inserirNPOut"));
        oper.setReturnClass(com.gvt.www.ws.business.portabilidade.inserirNP.InserirNPOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/inserirNP", "inserirNPOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOperadoraByFilter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getOperadoraByFilter", "getOperadoraByFilterIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getOperadoraByFilter", "getOperadoraByFilterIn"), com.gvt.www.ws.business.portabilidade.getOperadoraByFilter.GetOperadoraByFilterIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getOperadoraByFilter", "getOperadoraByFilterOut"));
        oper.setReturnClass(com.gvt.www.ws.business.portabilidade.getOperadoraByFilter.GetOperadoraByFilterOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getOperadoraByFilter", "getOperadoraByFilterOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("logPNWithNotificationReply");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPNWithNotificationReply", "logPNWithNotificationReplyIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPNWithNotificationReply", "logPNWithNotificationReplyIn"), com.gvt.www.ws.business.portabilidade.logPNWithNotificationReply.LogPNWithNotificationReplyIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelarPNByIdSolicitacao");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/cancelarPNByIdSolicitacao", "cancelarPNByIdSolicitacaoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/cancelarPNByIdSolicitacao", "cancelarPNByIdSolicitacaoIn"), com.gvt.www.ws.business.portabilidade.cancelarPNByIdSolicitacao.CancelarPNByIdSolicitacaoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/cancelarPNByIdSolicitacao", "cancelarPNByIdSolicitacaoOut"));
        oper.setReturnClass(com.gvt.www.ws.business.portabilidade.cancelarPNByIdSolicitacao.CancelarPNByIdSolicitacaoOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/cancelarPNByIdSolicitacao", "cancelarPNByIdSolicitacaoOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("reagendarPN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/reagendarPN", "reagendarPNIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/reagendarPN", "reagendarPNIn"), com.gvt.www.ws.business.portabilidade.reagendarPN.ReagendarPNIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/reagendarPN", "reagendarPNOut"));
        oper.setReturnClass(com.gvt.www.ws.business.portabilidade.reagendarPN.ReagendarPNOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/reagendarPN", "reagendarPNOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("solicitarPN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", "solicitarPNIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", "solicitarPNIn"), com.gvt.www.ws.business.portabilidade.solicitarPN.SolicitarPNIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", "solicitarPNOut"));
        oper.setReturnClass(com.gvt.www.ws.business.portabilidade.solicitarPN.SolicitarPNOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", "solicitarPNOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("concluirDoacaoPN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/concluirDoacao", "concluirDoacaoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/concluirDoacao", "concluirDoacaoIn"), com.gvt.www.ws.business.portabilidade.concluirDoacao.ConcluirDoacaoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("receberAutenticacaoDoadora");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberAutenticacaoDoadora", "receberAutenticacaoDoadoraIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberAutenticacaoDoadora", "receberAutenticacaoDoadoraIn"), com.gvt.www.ws.business.portabilidade.receberAutenticacaoDoadora.ReceberAutenticacaoDoadoraIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("logPNWithDownloadReply");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPNWithDownloadReply", "logPNWithDownloadReplyIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPNWithDownloadReply", "logPNWithDownloadReplyIn"), com.gvt.www.ws.business.portabilidade.logPNWithDownloadReply.LogPNWithDownloadReplyIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("receberSuspensaoPN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberSuspensaoPN", "receberSuspensaoPNIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberSuspensaoPN", "receberSuspensaoPNIn"), com.gvt.www.ws.business.portabilidade.receberSuspensaoPN.ReceberSuspensaoPNIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removerSuspensaoConflitoPN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/removerSuspensaoConflitoPN", "removerSuspensaoConflitoPNIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/removerSuspensaoConflitoPN", "removerSuspensaoConflitoPNIn"), com.gvt.www.ws.business.portabilidade.removerSuspensaoConflitoPN.RemoverSuspensaoConflitoPNIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("reativarPN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/reativarPN", "reativarPNIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/reativarPN", "reativarPNIn"), com.gvt.www.ws.business.portabilidade.reativarPN.ReativarPNIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isReativavel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isReativavel", "isReativavelIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isReativavel", "isReativavelIn"), com.gvt.www.ws.business.portabilidade.isReativavel.IsReativavelIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isReativavel", "isReativavelOut"));
        oper.setReturnClass(com.gvt.www.ws.business.portabilidade.isReativavel.IsReativavelOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isReativavel", "isReativavelOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("enviarTSAtivacao");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/enviarTSAtivacao", "enviarTSAtivacaoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/enviarTSAtivacao", "enviarTSAtivacaoIn"), com.gvt.www.ws.business.portabilidade.enviarTSAtivacao.EnviarTSAtivacaoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("configurarSwitch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/configurarSwitch", "configurarSwitchIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/configurarSwitch", "configurarSwitchIn"), com.gvt.www.ws.business.portabilidade.configurarSwitch.ConfigurarSwitchIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("retornoAutenticacaoManual");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/retornoAutenticacaoManual", "retornoAutenticacaoManualIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/retornoAutenticacaoManual", "retornoAutenticacaoManualIn"), com.gvt.www.ws.business.portabilidade.retornoAutenticacaoManual.RetornoAutenticacaoManualIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("logPN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPN", "logPNIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPN", "logPNIn"), com.gvt.www.ws.business.portabilidade.logPN.LogPNIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validarDataPN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/validarDataPN", "validarDataPNIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/validarDataPN", "validarDataPNIn"), com.gvt.www.ws.business.portabilidade.validarDataPN.ValidarDataPNIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/validarDataPN", "validarDataPNOut"));
        oper.setReturnClass(com.gvt.www.ws.business.portabilidade.validarDataPN.ValidarDataPNOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/validarDataPN", "validarDataPNOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getHistoricoPNByFilter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getHistoricoPNByFilter", "getHistoricoPNByFilterIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getHistoricoPNByFilter", "getHistoricoPNByFilterIn"), com.gvt.www.ws.business.portabilidade.getHistoricoPNByFilter.GetHistoricoPNByFilterIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getHistoricoPNByFilter", "getHistoricoPNByFilterOut"));
        oper.setReturnClass(com.gvt.www.ws.business.portabilidade.getHistoricoPNByFilter.GetHistoricoPNByFilterOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getHistoricoPNByFilter", "getHistoricoPNByFilterOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("receberCancelamentoPN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberCancelamentoPN", "receberCancelamentoPNIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberCancelamentoPN", "receberCancelamentoPNIn"), com.gvt.www.ws.business.portabilidade.receberCancelamentoPN.ReceberCancelamentoPNIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("suspenderPN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/suspenderPNIn", "suspenderPNIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/suspenderPNIn", "suspenderPNIn"), com.gvt.www.ws.business.portabilidade.suspenderPNIn.SuspenderPNIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("concluirAprovisionamento");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/concluirAprovisionamento", "concluirAprovisionamentoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/concluirAprovisionamento", "concluirAprovisionamentoIn"), com.gvt.www.ws.business.portabilidade.concluirAprovisionamento.ConcluirAprovisionamentoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("autenticarPN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/autenticarPN", "autenticarPNIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/autenticarPN", "autenticarPNIn"), com.gvt.www.ws.business.portabilidade.autenticarPN.AutenticarPNIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("solicitarPNIntrinseca");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca", "solicitarPNIntrinsecaIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca", "solicitarPNIntrinsecaIn"), com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.SolicitarPNIntrinsecaIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca", "solicitarPNIntrinsecaOut"));
        oper.setReturnClass(com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.SolicitarPNIntrinsecaOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca", "solicitarPNIntrinsecaOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("informarDesconexaoPN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/informarDesconexaoPN", "informarDesconexaoPNIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/informarDesconexaoPN", "informarDesconexaoIn"), com.gvt.www.ws.business.portabilidade.informarDesconexaoPN.InformarDesconexaoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isPortavel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isPortavel", "isPortavelIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isPortavel", "isPortavelIn"), com.gvt.www.ws.business.portabilidade.isPortavel.IsPortavelIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isPortavel", "isPortavelOut"));
        oper.setReturnClass(com.gvt.www.ws.business.portabilidade.isPortavel.IsPortavelOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isPortavel", "isPortavelOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("estornarPN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", "estornarPNIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", "estornarPNIn"), com.gvt.www.ws.business.portabilidade.estornarPN.EstornarPNIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", "estornarPNOut"));
        oper.setReturnClass(com.gvt.www.ws.business.portabilidade.estornarPN.EstornarPNOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", "estornarPNOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("receberReagendamentoPN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberReagendamentoPN", "receberReagendamentoPNIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberReagendamentoPN", "receberReagendamentoPNIn"), com.gvt.www.ws.business.portabilidade.receberReagendamentoPN.ReceberReagendamentoPNIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("concluirMudancaEndereco");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/concluirMudancaEndereco", "concluirMudancaEnderecoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/concluirMudancaEndereco", "concluirMudancaEnderecoIn"), com.gvt.www.ws.business.portabilidade.concluirMudancaEndereco.ConcluirMudancaEnderecoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("migrarPTSProdutoRI");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/migrarPTSProdutoRI", "migrarPTSProdutoRIIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/migrarPTSProdutoRI", "migrarPTSProdutoRIIn"), com.gvt.www.ws.business.portabilidade.migrarPTSProdutoRI.MigrarPTSProdutoRIIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/migrarPTSProdutoRI", "migrarPTSProdutoRIOut"));
        oper.setReturnClass(com.gvt.www.ws.business.portabilidade.migrarPTSProdutoRI.MigrarPTSProdutoRIOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/migrarPTSProdutoRI", "migrarPTSProdutoRIOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("concluirTarefaPortabilidade");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/concluirTarefaPortabilidade", "concluirTarefaPortabilidadeIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/concluirTarefaPortabilidade", "concluirTarefaPortabilidadeIn"), com.gvt.www.ws.business.portabilidade.concluirTarefaPortabilidade.ConcluirTarefaPortabilidadeIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("receberPedidoAutenticacaoPN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberPedidoAutenticacaoPN", "receberPedidoAutenticacaoPNIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberPedidoAutenticacaoPN", "receberPedidoAutenticacaoPNIn"), com.gvt.www.ws.business.portabilidade.receberPedidoAutenticacaoPN.ReceberPedidoAutenticacaoPNIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("enviarTSDesconexao");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/enviarTSDesconexao", "enviarTSDesconexaoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/enviarTSDesconexao", "enviarTSDesconexaoIn"), com.gvt.www.ws.business.portabilidade.enviarTSDesconexao.EnviarTSDesconexaoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("associarNumeroEquip");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/sisnum", "associarNumeroEquipIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/sisnum", "associarNumeroEquipIn"), com.gvt.www.ws.eai.sisnum.AssociarNumeroEquipIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/sisnum", "associarNumeroEquipOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.sisnum.AssociarNumeroEquipOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/sisnum", "associarNumeroEquipOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNumeroEquip");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/sisnum/getNumeroEquip", "getNumeroEquipIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/sisnum/getNumeroEquip", "getNumeroEquipIn"), com.gvt.www.ws.eai.sisnum.getNumeroEquip.GetNumeroEquipIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/sisnum/getNumeroEquip", "getNumeroEquipOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.sisnum.getNumeroEquip.GetNumeroEquipOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/sisnum/getNumeroEquip", "getNumeroEquipOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("liberarNumeroEquip");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/sisnum/liberarNumeroEquip", "liberarNumeroEquipIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/sisnum/liberarNumeroEquip", "liberarNumeroEquipIn"), com.gvt.www.ws.eai.sisnum.liberarNumeroEquip.LiberarNumeroEquipIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInformacoesInstancia");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getInformacoesInstancia", "getInformacoesInstanciaIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getInformacoesInstancia", "getInformacoesInstanciaIn"), com.gvt.www.ws.business.portabilidade.getInformacoesInstancia.GetInformacoesInstanciaIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getInformacoesInstancia", "getInformacoesInstanciaOut"));
        oper.setReturnClass(com.gvt.www.ws.business.portabilidade.getInformacoesInstancia.GetInformacoesInstanciaOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getInformacoesInstancia", "getInformacoesInstanciaOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isFeriado");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/siebel5/portabilidade/isFeriado", "isFeriadoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/siebel5/portabilidade/isFeriado", "isFeriadoIn"), com.gvt.www.ws.eai.siebel5.portabilidade.isFeriado.IsFeriadoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/siebel5/portabilidade/isFeriado", "isFeriadoOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.siebel5.portabilidade.isFeriado.IsFeriadoOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/siebel5/portabilidade/isFeriado", "isFeriadoOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

    }

    public PortabilidadeBusinessDSSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public PortabilidadeBusinessDSSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public PortabilidadeBusinessDSSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/portabilidade", "Janela");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.portabilidade.Janela.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/security", "Passport");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.security.Passport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/autenticarPN", "autenticarPNIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.autenticarPN.AutenticarPNIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/cancelarPNByIdSolicitacao", "cancelarPNByIdSolicitacaoIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.cancelarPNByIdSolicitacao.CancelarPNByIdSolicitacaoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/cancelarPNByIdSolicitacao", "cancelarPNByIdSolicitacaoOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.cancelarPNByIdSolicitacao.CancelarPNByIdSolicitacaoOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/cancelarPN", "cancelarPNIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.cancelarPN.CancelarPNIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/cancelarPN", "cancelarPNOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.cancelarPN.CancelarPNOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/concluirAprovisionamento", "concluirAprovisionamentoIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.concluirAprovisionamento.ConcluirAprovisionamentoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/concluirDoacao", "concluirDoacaoIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.concluirDoacao.ConcluirDoacaoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/concluirMudancaEndereco", "concluirMudancaEnderecoIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.concluirMudancaEndereco.ConcluirMudancaEnderecoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/concluirMudancaEndereco", "LineType");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.concluirMudancaEndereco.LineType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/concluirMudancaEndereco", "numero_rpon_list");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.concluirMudancaEndereco.Numero_rpon_list.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/concluirTarefaPortabilidade", "concluirTarefaPortabilidadeIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.concluirTarefaPortabilidade.ConcluirTarefaPortabilidadeIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/configurarSwitch", "configurarSwitchIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.configurarSwitch.ConfigurarSwitchIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/devolverNumero", "devolverNumeroIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.devolverNumero.DevolverNumeroIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/enviarTSAtivacao", "enviarTSAtivacaoIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.enviarTSAtivacao.EnviarTSAtivacaoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/enviarTSDesconexao", "enviarTSDesconexaoIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.enviarTSDesconexao.EnviarTSDesconexaoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", ">estornarPNIn>bu");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.estornarPN.EstornarPNInBu.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", ">estornarPNIn>justificativaEstorno");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", ">estornarPNIn>tipoEstorno");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.estornarPN.EstornarPNInTipoEstorno.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", "estornarPNIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.estornarPN.EstornarPNIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", "estornarPNOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.estornarPN.EstornarPNOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", "LineType");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.estornarPN.LineType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", "numero_groupGvt_list");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.estornarPN.Numero_groupGvt_list.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", "numero_rpon_list");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.estornarPN.Numero_rpon_list.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", "numeroListType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/estornarPN", "numero");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getDePara", ">getDeParaIn>tipoNumero");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.getDePara.GetDeParaInTipoNumero.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getDePara", ">getDeParaOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.getDePara.DePara[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getDePara", "DePara");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getDePara", "dePara");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getDePara", "DePara");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.getDePara.DePara.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getDePara", "getDeParaIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.getDePara.GetDeParaIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getHistoricoPNByFilter", "actionType");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.getHistoricoPNByFilter.ActionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getHistoricoPNByFilter", "getHistoricoPNByFilterIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.getHistoricoPNByFilter.GetHistoricoPNByFilterIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getHistoricoPNByFilter", "getHistoricoPNByFilterOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.getHistoricoPNByFilter.GetHistoricoPNByFilterOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getInformacoesInstancia", "getInformacoesInstanciaIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.getInformacoesInstancia.GetInformacoesInstanciaIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getInformacoesInstancia", "getInformacoesInstanciaOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.getInformacoesInstancia.GetInformacoesInstanciaOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getInformacoesInstancia", "OperationResponse");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.getInformacoesInstancia.OperationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getJanelas", "getJanelasIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.getJanelas.GetJanelasIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getJanelas", "getJanelasOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.getJanelas.GetJanelasOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getJanelas", "tipoBu");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.getJanelas.TipoBu.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getJanelas", "tipoJanelas");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.getJanelas.TipoJanelas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getOperadoraByFilter", "getOperadoraByFilterIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.getOperadoraByFilter.GetOperadoraByFilterIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/getOperadoraByFilter", "getOperadoraByFilterOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.getOperadoraByFilter.GetOperadoraByFilterOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/informarDesconexaoPN", "informarDesconexaoIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.informarDesconexaoPN.InformarDesconexaoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/inserirNP", ">inserirNPIn>operacao");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.inserirNP.InserirNPInOperacao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/inserirNP", "inserirNPIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.inserirNP.InserirNPIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/inserirNP", "inserirNPOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.inserirNP.InserirNPOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/inserirNP", "Numero");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.inserirNP.Numero.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/inserirNP", "ReservaInfo");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.inserirNP.ReservaInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/inserirNP", "Resultado");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.inserirNP.Resultado.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isGVT", "isGVTIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.isGVT.IsGVTIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isGVT", "isGVTOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.isGVT.IsGVTOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isGVT", "numero");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.isGVT.Numero.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isPortavel", "isPortavelIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.isPortavel.IsPortavelIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isPortavel", "isPortavelOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.isPortavel.IsPortavelOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isPortavel", "resultadoIsPortavel");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.isPortavel.ResultadoIsPortavel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isReativavel", "isReativavelIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.isReativavel.IsReativavelIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isReativavel", "isReativavelOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.isReativavel.IsReativavelOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/isReativavel", "numeroStatus");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.isReativavel.NumeroStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPNWithDownloadReply", "DownloadReason");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.logPNWithDownloadReply.DownloadReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPNWithDownloadReply", "logPNWithDownloadReplyIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.logPNWithDownloadReply.LogPNWithDownloadReplyIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPNWithNotificationReply", "logPNWithNotificationReplyIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.logPNWithNotificationReply.LogPNWithNotificationReplyIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPNWithNotificationReply", "numberListType");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.logPNWithNotificationReply.NumberListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPN", "logPNIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.logPN.LogPNIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/logPN", "numberListType");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.logPN.NumberListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/migrarPTSProdutoRI", "migrarPTSProdutoRIIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.migrarPTSProdutoRI.MigrarPTSProdutoRIIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/migrarPTSProdutoRI", "migrarPTSProdutoRIOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.migrarPTSProdutoRI.MigrarPTSProdutoRIOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/reagendarPN", "reagendarPNIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.reagendarPN.ReagendarPNIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/reagendarPN", "reagendarPNOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.reagendarPN.ReagendarPNOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/reativarPN", "reativarPNIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.reativarPN.ReativarPNIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberAutenticacaoDoadora", ">receberAutenticacaoDoadoraIn>fraudError");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.receberAutenticacaoDoadora.ReceberAutenticacaoDoadoraInFraudError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberAutenticacaoDoadora", "receberAutenticacaoDoadoraIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.receberAutenticacaoDoadora.ReceberAutenticacaoDoadoraIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberCancelamentoPN", ">receberCancelamentoPNIn>status");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.receberCancelamentoPN.ReceberCancelamentoPNInStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberCancelamentoPN", "receberCancelamentoPNIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.receberCancelamentoPN.ReceberCancelamentoPNIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberPedidoAutenticacaoPN", ">receberPedidoAutenticacaoPNIn>lineType");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.receberPedidoAutenticacaoPN.ReceberPedidoAutenticacaoPNInLineType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberPedidoAutenticacaoPN", ">ReversingInfoType>reversingJustification");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberPedidoAutenticacaoPN", ">ReversingInfoType>reversingType");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.receberPedidoAutenticacaoPN.ReversingInfoTypeReversingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberPedidoAutenticacaoPN", "receberPedidoAutenticacaoPNIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.receberPedidoAutenticacaoPN.ReceberPedidoAutenticacaoPNIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberPedidoAutenticacaoPN", "ReversingInfoType");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.receberPedidoAutenticacaoPN.ReversingInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberReagendamentoPN", "receberReagendamentoPNIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.receberReagendamentoPN.ReceberReagendamentoPNIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/receberSuspensaoPN", "receberSuspensaoPNIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.receberSuspensaoPN.ReceberSuspensaoPNIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/removerSuspensaoConflitoPN", ">removerSuspensaoConflitoPNIn>tipoRemocao");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.removerSuspensaoConflitoPN.RemoverSuspensaoConflitoPNInTipoRemocao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/removerSuspensaoConflitoPN", "removerSuspensaoConflitoPNIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.removerSuspensaoConflitoPN.RemoverSuspensaoConflitoPNIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/retornoAutenticacaoManual", "retornoAutenticacaoManualIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.retornoAutenticacaoManual.RetornoAutenticacaoManualIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca", ">solicitarPNIntrinsecaIn>bu");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.SolicitarPNIntrinsecaInBu.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca", "InfoCliente");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.InfoCliente.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca", "LineType");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.LineType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca", "numero_rpon_list");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.Numero_rpon_list.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca", "numeros");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.Numeros.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca", "solicitarPNIntrinsecaIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.SolicitarPNIntrinsecaIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca", "solicitarPNIntrinsecaOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.SolicitarPNIntrinsecaOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", ">solicitarPNIn>bu");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.solicitarPN.SolicitarPNInBu.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", ">solicitarPNIn>processoGVT");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.solicitarPN.SolicitarPNInProcessoGVT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", "LineType");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.solicitarPN.LineType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", "numero_rpon_list");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.solicitarPN.Numero_rpon_list.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", "numeros");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.solicitarPN.Numeros.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", "solicitarPNIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.solicitarPN.SolicitarPNIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/solicitarPN", "solicitarPNOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.solicitarPN.SolicitarPNOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/suspenderPNIn", "suspenderPNIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.suspenderPNIn.SuspenderPNIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/validarDataPN", ">validarDataPNIn>tipoValidacao");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.validarDataPN.ValidarDataPNInTipoValidacao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/validarDataPN", "validarDataPNIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.validarDataPN.ValidarDataPNIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade/validarDataPN", "validarDataPNOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.business.portabilidade.validarDataPN.ValidarDataPNOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/siebel5/portabilidade/isFeriado", "isFeriadoIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.siebel5.portabilidade.isFeriado.IsFeriadoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/siebel5/portabilidade/isFeriado", "isFeriadoOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.siebel5.portabilidade.isFeriado.IsFeriadoOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/sisnum/getNumeroEquip", "getNumeroEquipIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.sisnum.getNumeroEquip.GetNumeroEquipIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/sisnum/getNumeroEquip", "getNumeroEquipOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.sisnum.getNumeroEquip.GetNumeroEquipOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/sisnum/liberarNumeroEquip", "liberarNumeroEquipIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.sisnum.liberarNumeroEquip.LiberarNumeroEquipIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/sisnum", "associarNumeroEquipIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.sisnum.AssociarNumeroEquipIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/sisnum", "associarNumeroEquipOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.sisnum.AssociarNumeroEquipOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.gvt.www.ws.business.portabilidade.cancelarPN.CancelarPNOut cancelarPN(com.gvt.www.ws.business.portabilidade.cancelarPN.CancelarPNIn cancelarPNIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/cancelarPN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "cancelarPN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cancelarPNIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.business.portabilidade.cancelarPN.CancelarPNOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.business.portabilidade.cancelarPN.CancelarPNOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.business.portabilidade.cancelarPN.CancelarPNOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void devolverNumero(com.gvt.www.ws.business.portabilidade.devolverNumero.DevolverNumeroIn devolverNumeroIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/devolverNumero");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "devolverNumero"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {devolverNumeroIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.business.portabilidade.getJanelas.GetJanelasOut getJanelas(com.gvt.www.ws.business.portabilidade.getJanelas.GetJanelasIn getJanelasIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/getJanelas");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "getJanelas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getJanelasIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.business.portabilidade.getJanelas.GetJanelasOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.business.portabilidade.getJanelas.GetJanelasOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.business.portabilidade.getJanelas.GetJanelasOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.business.portabilidade.isGVT.IsGVTOut isGVT(com.gvt.www.ws.business.portabilidade.isGVT.IsGVTIn isGVTIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/isGVT");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "isGVT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {isGVTIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.business.portabilidade.isGVT.IsGVTOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.business.portabilidade.isGVT.IsGVTOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.business.portabilidade.isGVT.IsGVTOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.business.portabilidade.getDePara.DePara[] getDePara(com.gvt.www.ws.business.portabilidade.getDePara.GetDeParaIn getDeParaIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/getDePara");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "getDePara"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getDeParaIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.business.portabilidade.getDePara.DePara[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.business.portabilidade.getDePara.DePara[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.business.portabilidade.getDePara.DePara[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.business.portabilidade.inserirNP.InserirNPOut inserirNP(com.gvt.www.ws.business.portabilidade.inserirNP.InserirNPIn inserirNPIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/inserirNP");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "inserirNP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inserirNPIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.business.portabilidade.inserirNP.InserirNPOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.business.portabilidade.inserirNP.InserirNPOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.business.portabilidade.inserirNP.InserirNPOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.business.portabilidade.getOperadoraByFilter.GetOperadoraByFilterOut getOperadoraByFilter(com.gvt.www.ws.business.portabilidade.getOperadoraByFilter.GetOperadoraByFilterIn getOperadoraByFilterIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/getOperadoraByFilter");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "getOperadoraByFilter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getOperadoraByFilterIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.business.portabilidade.getOperadoraByFilter.GetOperadoraByFilterOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.business.portabilidade.getOperadoraByFilter.GetOperadoraByFilterOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.business.portabilidade.getOperadoraByFilter.GetOperadoraByFilterOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void logPNWithNotificationReply(com.gvt.www.ws.business.portabilidade.logPNWithNotificationReply.LogPNWithNotificationReplyIn logPNWithNotificationReplyIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/logPNWithNotificationReply");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "logPNWithNotificationReply"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {logPNWithNotificationReplyIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.business.portabilidade.cancelarPNByIdSolicitacao.CancelarPNByIdSolicitacaoOut cancelarPNByIdSolicitacao(com.gvt.www.ws.business.portabilidade.cancelarPNByIdSolicitacao.CancelarPNByIdSolicitacaoIn cancelarPNByIdSolicitacaoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/cancelarPNByIdSolicitacao");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "cancelarPNByIdSolicitacao"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cancelarPNByIdSolicitacaoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.business.portabilidade.cancelarPNByIdSolicitacao.CancelarPNByIdSolicitacaoOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.business.portabilidade.cancelarPNByIdSolicitacao.CancelarPNByIdSolicitacaoOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.business.portabilidade.cancelarPNByIdSolicitacao.CancelarPNByIdSolicitacaoOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.business.portabilidade.reagendarPN.ReagendarPNOut reagendarPN(com.gvt.www.ws.business.portabilidade.reagendarPN.ReagendarPNIn reagendarPNIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/reagendarPN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "reagendarPN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {reagendarPNIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.business.portabilidade.reagendarPN.ReagendarPNOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.business.portabilidade.reagendarPN.ReagendarPNOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.business.portabilidade.reagendarPN.ReagendarPNOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.business.portabilidade.solicitarPN.SolicitarPNOut solicitarPN(com.gvt.www.ws.business.portabilidade.solicitarPN.SolicitarPNIn solicitarPNIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/solicitarPN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "solicitarPN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {solicitarPNIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.business.portabilidade.solicitarPN.SolicitarPNOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.business.portabilidade.solicitarPN.SolicitarPNOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.business.portabilidade.solicitarPN.SolicitarPNOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void concluirDoacaoPN(com.gvt.www.ws.business.portabilidade.concluirDoacao.ConcluirDoacaoIn concluirDoacaoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/concluirDoacaoPN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "concluirDoacaoPN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {concluirDoacaoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void receberAutenticacaoDoadora(com.gvt.www.ws.business.portabilidade.receberAutenticacaoDoadora.ReceberAutenticacaoDoadoraIn receberAutenticacaoDoadoraIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/receberAutenticacaoDoadora");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "receberAutenticacaoDoadora"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receberAutenticacaoDoadoraIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void logPNWithDownloadReply(com.gvt.www.ws.business.portabilidade.logPNWithDownloadReply.LogPNWithDownloadReplyIn logPNWithDownloadReplyIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/logPNWithDownloadReply");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "logPNWithDownloadReply"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {logPNWithDownloadReplyIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void receberSuspensaoPN(com.gvt.www.ws.business.portabilidade.receberSuspensaoPN.ReceberSuspensaoPNIn receberSuspensaoPNIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/receberSuspensaoPN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "receberSuspensaoPN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receberSuspensaoPNIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void removerSuspensaoConflitoPN(com.gvt.www.ws.business.portabilidade.removerSuspensaoConflitoPN.RemoverSuspensaoConflitoPNIn removerSuspensaoConflitoPNIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/removerSuspensaoConflitoPN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "removerSuspensaoConflitoPN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {removerSuspensaoConflitoPNIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void reativarPN(com.gvt.www.ws.business.portabilidade.reativarPN.ReativarPNIn reativarPNIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/reativarPN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "reativarPN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {reativarPNIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.business.portabilidade.isReativavel.IsReativavelOut isReativavel(com.gvt.www.ws.business.portabilidade.isReativavel.IsReativavelIn isReativavelIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/isReativavel");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "isReativavel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {isReativavelIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.business.portabilidade.isReativavel.IsReativavelOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.business.portabilidade.isReativavel.IsReativavelOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.business.portabilidade.isReativavel.IsReativavelOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void enviarTSAtivacao(com.gvt.www.ws.business.portabilidade.enviarTSAtivacao.EnviarTSAtivacaoIn enviarTSAtivacaoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/enviarTSAtivacao");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "enviarTSAtivacao"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {enviarTSAtivacaoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void configurarSwitch(com.gvt.www.ws.business.portabilidade.configurarSwitch.ConfigurarSwitchIn configurarSwitchIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/configurarSwitch");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "configurarSwitch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {configurarSwitchIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void retornoAutenticacaoManual(com.gvt.www.ws.business.portabilidade.retornoAutenticacaoManual.RetornoAutenticacaoManualIn retornoAutenticacaoManualIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/retornoAutenticacaoManual");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "retornoAutenticacaoManual"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {retornoAutenticacaoManualIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void logPN(com.gvt.www.ws.business.portabilidade.logPN.LogPNIn logPNIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/logPN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "logPN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {logPNIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.business.portabilidade.validarDataPN.ValidarDataPNOut validarDataPN(com.gvt.www.ws.business.portabilidade.validarDataPN.ValidarDataPNIn validarDataPNIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/validarDataPN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "validarDataPN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {validarDataPNIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.business.portabilidade.validarDataPN.ValidarDataPNOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.business.portabilidade.validarDataPN.ValidarDataPNOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.business.portabilidade.validarDataPN.ValidarDataPNOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.business.portabilidade.getHistoricoPNByFilter.GetHistoricoPNByFilterOut getHistoricoPNByFilter(com.gvt.www.ws.business.portabilidade.getHistoricoPNByFilter.GetHistoricoPNByFilterIn getHistoricoPNByFilterIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/getHistoricoPNByFilter");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "getHistoricoPNByFilter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getHistoricoPNByFilterIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.business.portabilidade.getHistoricoPNByFilter.GetHistoricoPNByFilterOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.business.portabilidade.getHistoricoPNByFilter.GetHistoricoPNByFilterOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.business.portabilidade.getHistoricoPNByFilter.GetHistoricoPNByFilterOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void receberCancelamentoPN(com.gvt.www.ws.business.portabilidade.receberCancelamentoPN.ReceberCancelamentoPNIn receberCancelamentoPNIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/receberCancelamentoPN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "receberCancelamentoPN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receberCancelamentoPNIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void suspenderPN(com.gvt.www.ws.business.portabilidade.suspenderPNIn.SuspenderPNIn suspenderPNIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/suspenderPN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "suspenderPN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {suspenderPNIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void concluirAprovisionamento(com.gvt.www.ws.business.portabilidade.concluirAprovisionamento.ConcluirAprovisionamentoIn concluirAprovisionamentoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/concluirAprovisionamento");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "concluirAprovisionamento"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {concluirAprovisionamentoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void autenticarPN(com.gvt.www.ws.business.portabilidade.autenticarPN.AutenticarPNIn autenticarPNIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/autenticarPN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "autenticarPN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {autenticarPNIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.SolicitarPNIntrinsecaOut solicitarPNIntrinseca(com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.SolicitarPNIntrinsecaIn solicitarPNIntrinsecaIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/solicitarPNIntrinseca");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "solicitarPNIntrinseca"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {solicitarPNIntrinsecaIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.SolicitarPNIntrinsecaOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.SolicitarPNIntrinsecaOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.business.portabilidade.solicitarPNIntrinseca.SolicitarPNIntrinsecaOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void informarDesconexaoPN(com.gvt.www.ws.business.portabilidade.informarDesconexaoPN.InformarDesconexaoIn informarDesconexaoPNIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/informarDesconexaoPN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "informarDesconexaoPN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {informarDesconexaoPNIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.business.portabilidade.isPortavel.IsPortavelOut isPortavel(com.gvt.www.ws.business.portabilidade.isPortavel.IsPortavelIn isPortavelIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/isPortavel");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "isPortavel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {isPortavelIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.business.portabilidade.isPortavel.IsPortavelOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.business.portabilidade.isPortavel.IsPortavelOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.business.portabilidade.isPortavel.IsPortavelOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.business.portabilidade.estornarPN.EstornarPNOut estornarPN(com.gvt.www.ws.business.portabilidade.estornarPN.EstornarPNIn estornarPNIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/estornarPN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "estornarPN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {estornarPNIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.business.portabilidade.estornarPN.EstornarPNOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.business.portabilidade.estornarPN.EstornarPNOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.business.portabilidade.estornarPN.EstornarPNOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void receberReagendamentoPN(com.gvt.www.ws.business.portabilidade.receberReagendamentoPN.ReceberReagendamentoPNIn receberReagendamentoPNIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/receberReagendamentoPN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "receberReagendamentoPN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receberReagendamentoPNIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void concluirMudancaEndereco(com.gvt.www.ws.business.portabilidade.concluirMudancaEndereco.ConcluirMudancaEnderecoIn concluirMudancaEnderecoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/concluirMudancaEndereco");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "concluirMudancaEndereco"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {concluirMudancaEnderecoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.business.portabilidade.migrarPTSProdutoRI.MigrarPTSProdutoRIOut migrarPTSProdutoRI(com.gvt.www.ws.business.portabilidade.migrarPTSProdutoRI.MigrarPTSProdutoRIIn migrarPTSProdutoRIIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/migrarPTSProdutoRI");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "migrarPTSProdutoRI"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {migrarPTSProdutoRIIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.business.portabilidade.migrarPTSProdutoRI.MigrarPTSProdutoRIOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.business.portabilidade.migrarPTSProdutoRI.MigrarPTSProdutoRIOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.business.portabilidade.migrarPTSProdutoRI.MigrarPTSProdutoRIOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void concluirTarefaPortabilidade(com.gvt.www.ws.business.portabilidade.concluirTarefaPortabilidade.ConcluirTarefaPortabilidadeIn concluirTarefaPortabilidadeIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/concluirTarefaPortabilidade");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "concluirTarefaPortabilidade"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {concluirTarefaPortabilidadeIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void receberPedidoAutenticacaoPN(com.gvt.www.ws.business.portabilidade.receberPedidoAutenticacaoPN.ReceberPedidoAutenticacaoPNIn receberPedidoAutenticacaoPNIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/receberPedidoAutenticacaoPN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "receberPedidoAutenticacaoPN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receberPedidoAutenticacaoPNIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void enviarTSDesconexao(com.gvt.www.ws.business.portabilidade.enviarTSDesconexao.EnviarTSDesconexaoIn enviarTSDesconexaoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/enviarTSDesconexao");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "enviarTSDesconexao"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {enviarTSDesconexaoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.sisnum.AssociarNumeroEquipOut associarNumeroEquip(com.gvt.www.ws.eai.sisnum.AssociarNumeroEquipIn associarNumeroEquipIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/associarNumeroEquip");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "associarNumeroEquip"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {associarNumeroEquipIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.sisnum.AssociarNumeroEquipOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.sisnum.AssociarNumeroEquipOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.sisnum.AssociarNumeroEquipOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.sisnum.getNumeroEquip.GetNumeroEquipOut getNumeroEquip(com.gvt.www.ws.eai.sisnum.getNumeroEquip.GetNumeroEquipIn getNumeroEquipIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/getNumeroEquip");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "getNumeroEquip"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getNumeroEquipIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.sisnum.getNumeroEquip.GetNumeroEquipOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.sisnum.getNumeroEquip.GetNumeroEquipOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.sisnum.getNumeroEquip.GetNumeroEquipOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void liberarNumeroEquip(com.gvt.www.ws.eai.sisnum.liberarNumeroEquip.LiberarNumeroEquipIn liberarNumeroEquipIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/liberarNumeroEquip");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "liberarNumeroEquip"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {liberarNumeroEquipIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.business.portabilidade.getInformacoesInstancia.GetInformacoesInstanciaOut getInformacoesInstancia(com.gvt.www.ws.business.portabilidade.getInformacoesInstancia.GetInformacoesInstanciaIn getInformacoesInstanciaIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/getInformacoesInstancia");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "getInformacoesInstancia"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getInformacoesInstanciaIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.business.portabilidade.getInformacoesInstancia.GetInformacoesInstanciaOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.business.portabilidade.getInformacoesInstancia.GetInformacoesInstanciaOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.business.portabilidade.getInformacoesInstancia.GetInformacoesInstanciaOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.siebel5.portabilidade.isFeriado.IsFeriadoOut isFeriado(com.gvt.www.ws.eai.siebel5.portabilidade.isFeriado.IsFeriadoIn isFeriadoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.gvt.com/ws/business/portabilidade/isFeriado");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/business/portabilidade", "isFeriado"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {isFeriadoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.siebel5.portabilidade.isFeriado.IsFeriadoOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.siebel5.portabilidade.isFeriado.IsFeriadoOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.siebel5.portabilidade.isFeriado.IsFeriadoOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
