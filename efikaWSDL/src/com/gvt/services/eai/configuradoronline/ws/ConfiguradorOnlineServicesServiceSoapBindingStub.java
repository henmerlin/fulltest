/**
 * ConfiguradorOnlineServicesServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.services.eai.configuradoronline.ws;

public class ConfiguradorOnlineServicesServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineServices {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[7];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("trocarTecnologiaVoz");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "tecnologiaVozIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/services/trocarTecnologiaVoz", "TrocarTecnologiaVozIn"), com.gvt.www.services.trocarTecnologiaVoz.TrocarTecnologiaVozIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/services/trocarTecnologiaVoz", "TrocarTecnologiaVozOut"));
        oper.setReturnClass(com.gvt.www.services.trocarTecnologiaVoz.TrocarTecnologiaVozOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "TrocarTecnologiaVozOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("trocarModeloEquipamento");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "trocarModeloEquipamentoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/services/trocarModeloEquipamento", "TrocarModeloEquipamentoIn"), com.gvt.www.services.trocarModeloEquipamento.TrocarModeloEquipamentoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/services/trocarModeloEquipamento", "TrocarModeloEquipamentoOut"));
        oper.setReturnClass(com.gvt.www.services.trocarModeloEquipamento.TrocarModeloEquipamentoOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "TrocarModeloEquipamentoOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("configurarEquipamento");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "configurarEquipamentoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/services/configurarEquipamento", "ConfigurarEquipamentoIn"), com.gvt.www.services.configurarEquipamento.ConfigurarEquipamentoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/services/configurarEquipamento", "ConfigurarEquipamentoOut"));
        oper.setReturnClass(com.gvt.www.services.configurarEquipamento.ConfigurarEquipamentoOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "ConfigurarEquipamentoOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarEquipamentos");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultarEquipamentosIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/services/consultarEquipamento", "ConsultarEquipamentoIn"), com.gvt.www.services.consultarEquipamento.ConsultarEquipamentoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/services/consultarEquipamento", "ConsultarEquipamentoOut"));
        oper.setReturnClass(com.gvt.www.services.consultarEquipamento.ConsultarEquipamentoOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "ConsultarEquipamentoOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarControlesComandos");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultarControleComandoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/services/consultarControleComando", "ConsultarControlesComandosIn"), com.gvt.www.services.consultarControleComando.ConsultarControlesComandosIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/services/consultarControleComando", "ConsultarControlesComandosOut"));
        oper.setReturnClass(com.gvt.www.services.consultarControleComando.ConsultarControlesComandosOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "ConsultarControlesComandosOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("configurarServico");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "configurarServicoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/services/configurarServico", "ConfigurarServicoIn"), com.gvt.www.services.configurarServico.ConfigurarServicoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/services/configurarServico", "ConfigurarServicoOut"));
        oper.setReturnClass(com.gvt.www.services.configurarServico.ConfigurarServicoOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "ConfigurarServicoOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listarModelos");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "listarModelosIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/services/listarModelos", "ListarModelosIn"), com.gvt.www.services.listarModelos.ListarModelosIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/services/listarModelos", "ListarModelosOut"));
        oper.setReturnClass(com.gvt.www.services.listarModelos.ListarModelosOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "ListarModelosOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

    }

    public ConfiguradorOnlineServicesServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ConfiguradorOnlineServicesServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ConfiguradorOnlineServicesServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/configurarEquipamento", "ConfigurarEquipamentoIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.configurarEquipamento.ConfigurarEquipamentoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/configurarEquipamento", "ConfigurarEquipamentoOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.configurarEquipamento.ConfigurarEquipamentoOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/configurarServico", "ConfigurarServicoIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.configurarServico.ConfigurarServicoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/configurarServico", "ConfigurarServicoOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.configurarServico.ConfigurarServicoOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/consultarControleComando", "ConsultarControlesComandosIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.consultarControleComando.ConsultarControlesComandosIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/consultarControleComando", "ConsultarControlesComandosOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.consultarControleComando.ConsultarControlesComandosOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/consultarEquipamento", "ConsultarEquipamentoIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.consultarEquipamento.ConsultarEquipamentoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/consultarEquipamento", "ConsultarEquipamentoOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.consultarEquipamento.ConsultarEquipamentoOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/listarModelos", "ListarModelosIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.listarModelos.ListarModelosIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/listarModelos", "ListarModelosOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.listarModelos.ListarModelosOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/model/acesso", "Acesso");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.model.acesso.Acesso.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/model/adslInfo", "ADSLInfo");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.model.adslInfo.ADSLInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/model/controleComando", "ControleComando");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.model.controleComando.ControleComando.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/model/designador", "Designador");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.model.designador.Designador.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/model/designador", "Designadores");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.model.designador.Designador[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/model/designador", "Designador");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com/services/model/designador", "designador");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/model/equipamentoFisico", "EquipamentoFisico");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.model.equipamentoFisico.EquipamentoFisico.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/model/fabricante", "Fabricante");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.model.fabricante.Fabricante.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/model/item", "Item");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.model.item.Item.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/model/item", "Items");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.model.item.Item[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/model/item", "Item");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com/services/model/item", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/model/linhaInfo", "LinhaInfo");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.model.linhaInfo.LinhaInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/model/linhaInfo", "TrocaLinhaInfo");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.model.linhaInfo.TrocaLinhaInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/model/map", "Map");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.model.map.Map.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/model/map", "Parametros");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.model.map.Map[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/model/map", "Map");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com/services/model/map", "parametro");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/model/modeloEquipamento", "ModeloEquipamento");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.model.modeloEquipamento.ModeloEquipamento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/model/ordemServico", "OrdemServico");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.model.ordemServico.OrdemServico.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/model/origem", "Origem");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.model.origem.Origem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/model/portaFXS", "PortaFXSWS");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.model.portaFXS.PortaFXSWS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/model/portaFXS", "TrocaPortaFXSWS");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.model.portaFXS.TrocaPortaFXSWS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/model/recursoLogicoSpec", "RecursoLogicoSpec");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.model.recursoLogicoSpec.RecursoLogicoSpec.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/model/recursoLogico", "RecursoLogicoWS");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.model.recursoLogico.RecursoLogicoWS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/model/retorno", "Retorno");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.model.retorno.Retorno.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/model/sessionBorder", "SessionBorder");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.model.sessionBorder.SessionBorder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/model/statusServico", "StatusServico");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.model.statusServico.StatusServico.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/model/tecnologiaRecursoLogico", "TecnologiaRecursoLogico");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.model.tecnologiaRecursoLogico.TecnologiaRecursoLogico.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/model/tecnologiaRecursoLogico", "TecnologiaRecursoLogicoEnum");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.model.tecnologiaRecursoLogico.TecnologiaRecursoLogicoEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/model/tipoAcao", "TipoAcao");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.model.tipoAcao.TipoAcao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/model/tipoRecursoLogico", "TipoRecursoLogico");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.model.tipoRecursoLogico.TipoRecursoLogico.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/model/tipoTecnologiaRecursoLogico", "TipoTecnologiaRecursoLogico");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.model.tipoTecnologiaRecursoLogico.TipoTecnologiaRecursoLogico.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/model/trocaAcesso", "TrocaAcesso");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.model.trocaAcesso.TrocaAcesso.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/model/tvInfo", "TVInfo");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.model.tvInfo.TVInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/trocarModeloEquipamento", "TrocaEquipamento");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.trocarModeloEquipamento.TrocaEquipamento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/trocarModeloEquipamento", "TrocarModeloEquipamentoIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.trocarModeloEquipamento.TrocarModeloEquipamentoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/trocarModeloEquipamento", "TrocarModeloEquipamentoOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.trocarModeloEquipamento.TrocarModeloEquipamentoOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/trocarTecnologiaVoz", "TrocarTecnologiaVozIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.trocarTecnologiaVoz.TrocarTecnologiaVozIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/services/trocarTecnologiaVoz", "TrocarTecnologiaVozOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.services.trocarTecnologiaVoz.TrocarTecnologiaVozOut.class;
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

    public com.gvt.www.services.trocarTecnologiaVoz.TrocarTecnologiaVozOut trocarTecnologiaVoz(com.gvt.www.services.trocarTecnologiaVoz.TrocarTecnologiaVozIn tecnologiaVozIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "trocarTecnologiaVoz"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {tecnologiaVozIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.services.trocarTecnologiaVoz.TrocarTecnologiaVozOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.services.trocarTecnologiaVoz.TrocarTecnologiaVozOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.services.trocarTecnologiaVoz.TrocarTecnologiaVozOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.services.trocarModeloEquipamento.TrocarModeloEquipamentoOut trocarModeloEquipamento(com.gvt.www.services.trocarModeloEquipamento.TrocarModeloEquipamentoIn trocarModeloEquipamentoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "trocarModeloEquipamento"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {trocarModeloEquipamentoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.services.trocarModeloEquipamento.TrocarModeloEquipamentoOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.services.trocarModeloEquipamento.TrocarModeloEquipamentoOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.services.trocarModeloEquipamento.TrocarModeloEquipamentoOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.services.configurarEquipamento.ConfigurarEquipamentoOut configurarEquipamento(com.gvt.www.services.configurarEquipamento.ConfigurarEquipamentoIn configurarEquipamentoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "configurarEquipamento"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {configurarEquipamentoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.services.configurarEquipamento.ConfigurarEquipamentoOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.services.configurarEquipamento.ConfigurarEquipamentoOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.services.configurarEquipamento.ConfigurarEquipamentoOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.services.consultarEquipamento.ConsultarEquipamentoOut consultarEquipamentos(com.gvt.www.services.consultarEquipamento.ConsultarEquipamentoIn consultarEquipamentosIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultarEquipamentos"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultarEquipamentosIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.services.consultarEquipamento.ConsultarEquipamentoOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.services.consultarEquipamento.ConsultarEquipamentoOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.services.consultarEquipamento.ConsultarEquipamentoOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.services.consultarControleComando.ConsultarControlesComandosOut consultarControlesComandos(com.gvt.www.services.consultarControleComando.ConsultarControlesComandosIn consultarControleComandoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultarControlesComandos"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultarControleComandoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.services.consultarControleComando.ConsultarControlesComandosOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.services.consultarControleComando.ConsultarControlesComandosOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.services.consultarControleComando.ConsultarControlesComandosOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.services.configurarServico.ConfigurarServicoOut configurarServico(com.gvt.www.services.configurarServico.ConfigurarServicoIn configurarServicoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "configurarServico"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {configurarServicoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.services.configurarServico.ConfigurarServicoOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.services.configurarServico.ConfigurarServicoOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.services.configurarServico.ConfigurarServicoOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.services.listarModelos.ListarModelosOut listarModelos(com.gvt.www.services.listarModelos.ListarModelosIn listarModelosIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "listarModelos"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {listarModelosIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.services.listarModelos.ListarModelosOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.services.listarModelos.ListarModelosOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.services.listarModelos.ListarModelosOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
