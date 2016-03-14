/**
 * ConfiguradorOnlineConfVasServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.services.eai.configuradoronline.ws;

public class ConfiguradorOnlineConfVasServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineConfVas {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[11];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("atualizarRotaRN2SoftPhone");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/atualizarRotaRN2SoftPhone", "atualizarRotaRN2SoftPhoneIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/atualizarRotaRN2SoftPhone", "AtualizarRotaRN2SoftPhoneIn"), com.gvt.www.ws.eai.configuradoronline.vas.atualizarRotaRN2SoftPhone.AtualizarRotaRN2SoftPhoneIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/baseSoftPhone", "BaseSoftPhoneOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.vas.baseSoftPhone.BaseSoftPhoneOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/atualizarRotaRN2SoftPhone", "atualizarRotaRN2SoftPhoneOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("configurarSoftphone");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/configurarSoftphone", "configurarSoftphoneIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/configurarSoftphone", "ConfigurarSoftphoneIn"), com.gvt.www.ws.eai.configuradoronline.vas.configurarSoftphone.ConfigurarSoftphoneIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/configurarSoftphone", "ConfigurarSoftphoneOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.vas.configurarSoftphone.ConfigurarSoftphoneOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/configurarSoftphone", "configurarSoftphoneOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("atualizarCredenciaisSIPSoftPhone");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/atualizarCredenciaisSIPSoftPhone", "atualizarCredenciaisSIPSoftPhoneIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/atualizarCredenciaisSIPSoftPhone", "AtualizarCredenciaisSIPSoftPhoneIn"), com.gvt.www.ws.eai.configuradoronline.vas.atualizarCredenciaisSIPSoftPhone.AtualizarCredenciaisSIPSoftPhoneIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/baseSoftPhone", "BaseSoftPhoneOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.vas.baseSoftPhone.BaseSoftPhoneOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/atualizarCredenciaisSIPSoftPhone", "atualizarCredenciaisSIPSoftPhoneOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("atualizarInventarioSIPSoftPhone");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/atualizarInventarioSIPSoftPhone", "atualizarInventarioSIPSoftPhoneIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/atualizarInventarioSIPSoftPhone", "AtualizarInventarioSIPSoftPhoneIn"), com.gvt.www.ws.eai.configuradoronline.vas.atualizarInventarioSIPSoftPhone.AtualizarInventarioSIPSoftPhoneIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/baseSoftPhone", "BaseSoftPhoneOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.vas.baseSoftPhone.BaseSoftPhoneOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/atualizarInventarioSIPSoftPhone", "atualizarInventarioSIPSoftPhoneOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("configuraSuspensaoTemporaria");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "configuraSuspensaoTemporariaIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "SuspensaoTemporariaIn"), com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.SuspensaoTemporariaIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "SuspensaoTemporariaOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.SuspensaoTemporariaOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "configuraSuspensaoTemporariaOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sincronizarVASFone2Go");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/sincronizarVASFone2Go", "sincronizarVASFone2GoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/sincronizarVASFone2Go", "SincronizarVASFone2GoIn"), com.gvt.www.ws.eai.configuradoronline.vas.sincronizarVASFone2Go.SincronizarVASFone2GoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/sincronizarVASFone2Go", "SincronizarVASFone2GoOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.vas.sincronizarVASFone2Go.SincronizarVASFone2GoOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/sincronizarVASFone2Go", "sincronizarVASFone2GoOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarTecnologiaLinhaIMS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/consultarTecnologiaLinhaIMS", "consultarTecnologiaLinhaIMSIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/consultarTecnologiaLinhaIMS", "ConsultarTecnologiaLinhaIMSIn"), com.gvt.www.ws.eai.configuradoronline.vas.consultarTecnologiaLinhaIMS.ConsultarTecnologiaLinhaIMSIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/consultarTecnologiaLinhaIMS", "ConsultarTecnologiaLinhaIMSOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.vas.consultarTecnologiaLinhaIMS.ConsultarTecnologiaLinhaIMSOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/consultarTecnologiaLinhaIMS", "consultarTecnologiaLinhaIMSOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changePasswordIMS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/changePasswordIMS", "changePasswordIMSIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/changePasswordIMS", "ChangePasswordIMSIn"), com.gvt.www.ws.eai.configuradoronline.vas.changePasswordIMS.ChangePasswordIMSIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/changePasswordIMS", "ChangePasswordIMSOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.vas.changePasswordIMS.ChangePasswordIMSOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/changePasswordIMS", "changePasswordIMSOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("atualizarAssociacoesIMSSoftphone");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/atualizarAssociacoesIMSSoftphone", "AtualizarAssociacoesIMSSoftphoneIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/atualizarAssociacoesIMSSoftphone", "AtualizarAssociacoesIMSSoftphoneIn"), com.gvt.www.ws.eai.configuradoronline.vas.atualizarAssociacoesIMSSoftphone.AtualizarAssociacoesIMSSoftphoneIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/baseSoftPhone", "BaseSoftPhoneOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.vas.baseSoftPhone.BaseSoftPhoneOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/atualizarAssociacoesIMSSoftphone", "AtualizarAssociacoesIMSSoftphoneOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removerCredenciaisSIPSoftPhone");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/removerCredenciaisSIPSoftPhone", "RemoverCredenciaisSIPSoftPhoneIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/removerCredenciaisSIPSoftPhone", "RemoverCredenciaisSIPSoftPhoneIn"), com.gvt.www.ws.eai.configuradoronline.vas.removerCredenciaisSIPSoftPhone.RemoverCredenciaisSIPSoftPhoneIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/removerCredenciaisSIPSoftPhone", "RemoverCredenciaisSIPSoftPhoneOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.vas.removerCredenciaisSIPSoftPhone.RemoverCredenciaisSIPSoftPhoneOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/removerCredenciaisSIPSoftPhone", "RemoverCredenciaisSIPSoftPhoneOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sincronizarVAS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/sincronizarVAS", "sincronizarVASIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/sincronizarVAS", "SincronizarVASIn"), com.gvt.www.ws.eai.configuradoronline.vas.sincronizarVAS.SincronizarVASIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/sincronizarVAS", "SincronizarVASOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.vas.sincronizarVAS.SincronizarVASOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/sincronizarVAS", "sincronizarVASOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

    }

    public ConfiguradorOnlineConfVasServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ConfiguradorOnlineConfVasServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ConfiguradorOnlineConfVasServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "ArrayOfConfigValue");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.col.metaData.NECService.ConfigValue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "ConfigValue");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "ConfigValue");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "ArrayOfInfoSiebel");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.col.metaData.NECService.InfoSiebel[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "InfoSiebel");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "InfoSiebel");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "ArrayOfItem");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.col.metaData.NECService.Item[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "Item");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "ConfigValue");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.col.metaData.NECService.ConfigValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "InfoSiebel");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.col.metaData.NECService.InfoSiebel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "Item");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.col.metaData.NECService.Item.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "LinhaInfo");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.col.metaData.NECService.LinhaInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "NECRequest");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.col.metaData.NECService.NECRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/acesso", "Acesso");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.acesso.Acesso.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/atualizarAssociacoesIMSSoftphone", "AtualizarAssociacoesIMSSoftphoneIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.vas.atualizarAssociacoesIMSSoftphone.AtualizarAssociacoesIMSSoftphoneIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/atualizarCredenciaisSIPSoftPhone", "AtualizarCredenciaisSIPSoftPhoneIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.vas.atualizarCredenciaisSIPSoftPhone.AtualizarCredenciaisSIPSoftPhoneIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/atualizarInventarioSIPSoftPhone", "AtualizarInventarioSIPSoftPhoneIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.vas.atualizarInventarioSIPSoftPhone.AtualizarInventarioSIPSoftPhoneIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/atualizarRotaRN2SoftPhone", "AtualizarRotaRN2SoftPhoneIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.vas.atualizarRotaRN2SoftPhone.AtualizarRotaRN2SoftPhoneIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/baseSoftPhone", "BaseSoftPhoneOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.vas.baseSoftPhone.BaseSoftPhoneOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/changePasswordIMS", "ChangePasswordIMSIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.vas.changePasswordIMS.ChangePasswordIMSIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/changePasswordIMS", "ChangePasswordIMSOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.vas.changePasswordIMS.ChangePasswordIMSOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/configurarSoftphone", "ConfigurarSoftphoneIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.vas.configurarSoftphone.ConfigurarSoftphoneIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/configurarSoftphone", "ConfigurarSoftphoneOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.vas.configurarSoftphone.ConfigurarSoftphoneOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/consultarTecnologiaLinhaIMS", "ConsultarTecnologiaLinhaIMSIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.vas.consultarTecnologiaLinhaIMS.ConsultarTecnologiaLinhaIMSIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/consultarTecnologiaLinhaIMS", "ConsultarTecnologiaLinhaIMSOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.vas.consultarTecnologiaLinhaIMS.ConsultarTecnologiaLinhaIMSOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/removerCredenciaisSIPSoftPhone", "RemoverCredenciaisSIPSoftPhoneIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.vas.removerCredenciaisSIPSoftPhone.RemoverCredenciaisSIPSoftPhoneIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/removerCredenciaisSIPSoftPhone", "RemoverCredenciaisSIPSoftPhoneOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.vas.removerCredenciaisSIPSoftPhone.RemoverCredenciaisSIPSoftPhoneOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/sincronizarVASFone2Go", "SincronizarVASFone2GoIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.vas.sincronizarVASFone2Go.SincronizarVASFone2GoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/sincronizarVASFone2Go", "SincronizarVASFone2GoOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.vas.sincronizarVASFone2Go.SincronizarVASFone2GoOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/sincronizarVAS", "SincronizarVASIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.vas.sincronizarVAS.SincronizarVASIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/sincronizarVAS", "SincronizarVASOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.vas.sincronizarVAS.SincronizarVASOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "Produto");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.Produto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "ProdutoBandaLarga");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.ProdutoBandaLarga.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "ProdutoLinha");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.ProdutoLinha.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "ProdutoTv");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.ProdutoTv.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "ProdutoVAS");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.ProdutoVAS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "SuspensaoTemporariaIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.SuspensaoTemporariaIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/vas/suspesaoTemporaria", "SuspensaoTemporariaOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.SuspensaoTemporariaOut.class;
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

    public com.gvt.www.ws.eai.configuradoronline.vas.baseSoftPhone.BaseSoftPhoneOut atualizarRotaRN2SoftPhone(com.gvt.www.ws.eai.configuradoronline.vas.atualizarRotaRN2SoftPhone.AtualizarRotaRN2SoftPhoneIn atualizarRotaRN2SoftPhoneIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "atualizarRotaRN2SoftPhone"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {atualizarRotaRN2SoftPhoneIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.vas.baseSoftPhone.BaseSoftPhoneOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.vas.baseSoftPhone.BaseSoftPhoneOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.vas.baseSoftPhone.BaseSoftPhoneOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.vas.configurarSoftphone.ConfigurarSoftphoneOut configurarSoftphone(com.gvt.www.ws.eai.configuradoronline.vas.configurarSoftphone.ConfigurarSoftphoneIn configurarSoftphoneIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "configurarSoftphone"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {configurarSoftphoneIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.vas.configurarSoftphone.ConfigurarSoftphoneOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.vas.configurarSoftphone.ConfigurarSoftphoneOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.vas.configurarSoftphone.ConfigurarSoftphoneOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.vas.baseSoftPhone.BaseSoftPhoneOut atualizarCredenciaisSIPSoftPhone(com.gvt.www.ws.eai.configuradoronline.vas.atualizarCredenciaisSIPSoftPhone.AtualizarCredenciaisSIPSoftPhoneIn atualizarCredenciaisSIPSoftPhoneIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "atualizarCredenciaisSIPSoftPhone"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {atualizarCredenciaisSIPSoftPhoneIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.vas.baseSoftPhone.BaseSoftPhoneOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.vas.baseSoftPhone.BaseSoftPhoneOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.vas.baseSoftPhone.BaseSoftPhoneOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.vas.baseSoftPhone.BaseSoftPhoneOut atualizarInventarioSIPSoftPhone(com.gvt.www.ws.eai.configuradoronline.vas.atualizarInventarioSIPSoftPhone.AtualizarInventarioSIPSoftPhoneIn atualizarInventarioSIPSoftPhoneIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "atualizarInventarioSIPSoftPhone"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {atualizarInventarioSIPSoftPhoneIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.vas.baseSoftPhone.BaseSoftPhoneOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.vas.baseSoftPhone.BaseSoftPhoneOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.vas.baseSoftPhone.BaseSoftPhoneOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.SuspensaoTemporariaOut configuraSuspensaoTemporaria(com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.SuspensaoTemporariaIn configuraSuspensaoTemporariaIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "configuraSuspensaoTemporaria"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {configuraSuspensaoTemporariaIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.SuspensaoTemporariaOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.SuspensaoTemporariaOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.vas.suspesaoTemporaria.SuspensaoTemporariaOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.vas.sincronizarVASFone2Go.SincronizarVASFone2GoOut sincronizarVASFone2Go(com.gvt.www.ws.eai.configuradoronline.vas.sincronizarVASFone2Go.SincronizarVASFone2GoIn sincronizarVASFone2GoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "sincronizarVASFone2Go"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sincronizarVASFone2GoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.vas.sincronizarVASFone2Go.SincronizarVASFone2GoOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.vas.sincronizarVASFone2Go.SincronizarVASFone2GoOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.vas.sincronizarVASFone2Go.SincronizarVASFone2GoOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.vas.consultarTecnologiaLinhaIMS.ConsultarTecnologiaLinhaIMSOut consultarTecnologiaLinhaIMS(com.gvt.www.ws.eai.configuradoronline.vas.consultarTecnologiaLinhaIMS.ConsultarTecnologiaLinhaIMSIn consultarTecnologiaLinhaIMSIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultarTecnologiaLinhaIMS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultarTecnologiaLinhaIMSIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.vas.consultarTecnologiaLinhaIMS.ConsultarTecnologiaLinhaIMSOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.vas.consultarTecnologiaLinhaIMS.ConsultarTecnologiaLinhaIMSOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.vas.consultarTecnologiaLinhaIMS.ConsultarTecnologiaLinhaIMSOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.vas.changePasswordIMS.ChangePasswordIMSOut changePasswordIMS(com.gvt.www.ws.eai.configuradoronline.vas.changePasswordIMS.ChangePasswordIMSIn changePasswordIMSIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "changePasswordIMS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {changePasswordIMSIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.vas.changePasswordIMS.ChangePasswordIMSOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.vas.changePasswordIMS.ChangePasswordIMSOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.vas.changePasswordIMS.ChangePasswordIMSOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.vas.baseSoftPhone.BaseSoftPhoneOut atualizarAssociacoesIMSSoftphone(com.gvt.www.ws.eai.configuradoronline.vas.atualizarAssociacoesIMSSoftphone.AtualizarAssociacoesIMSSoftphoneIn atualizarAssociacoesIMSSoftphoneIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "atualizarAssociacoesIMSSoftphone"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {atualizarAssociacoesIMSSoftphoneIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.vas.baseSoftPhone.BaseSoftPhoneOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.vas.baseSoftPhone.BaseSoftPhoneOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.vas.baseSoftPhone.BaseSoftPhoneOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.vas.removerCredenciaisSIPSoftPhone.RemoverCredenciaisSIPSoftPhoneOut removerCredenciaisSIPSoftPhone(com.gvt.www.ws.eai.configuradoronline.vas.removerCredenciaisSIPSoftPhone.RemoverCredenciaisSIPSoftPhoneIn removerCredenciaisSIPSoftPhoneIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "removerCredenciaisSIPSoftPhone"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {removerCredenciaisSIPSoftPhoneIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.vas.removerCredenciaisSIPSoftPhone.RemoverCredenciaisSIPSoftPhoneOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.vas.removerCredenciaisSIPSoftPhone.RemoverCredenciaisSIPSoftPhoneOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.vas.removerCredenciaisSIPSoftPhone.RemoverCredenciaisSIPSoftPhoneOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.vas.sincronizarVAS.SincronizarVASOut sincronizarVAS(com.gvt.www.ws.eai.configuradoronline.vas.sincronizarVAS.SincronizarVASIn sincronizarVASIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "sincronizarVAS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sincronizarVASIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.vas.sincronizarVAS.SincronizarVASOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.vas.sincronizarVAS.SincronizarVASOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.vas.sincronizarVAS.SincronizarVASOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
