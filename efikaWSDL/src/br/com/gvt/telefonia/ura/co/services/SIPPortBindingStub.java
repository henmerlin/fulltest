/**
 * SIPPortBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.telefonia.ura.co.services;

public class SIPPortBindingStub extends org.apache.axis.client.Stub implements br.com.gvt.telefonia.ura.co.services.SIP {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[14];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("hasIPVoice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "IpVoiceIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "ipVoiceIn"), br.com.gvt.telefonia.ura.co.services.IpVoiceIn.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "ipVoiceOut"));
        oper.setReturnClass(br.com.gvt.telefonia.ura.co.services.IpVoiceOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "IpVoiceOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isDSLAMmanageable");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "DSLAMIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "dslamIn"), br.com.gvt.telefonia.ura.co.services.DslamIn.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "dslamOut"));
        oper.setReturnClass(br.com.gvt.telefonia.ura.co.services.DslamOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "DSLAMOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isBgidgeVoiceCreated");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "BridgeVoiceIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "bridgeVoiceIn"), br.com.gvt.telefonia.ura.co.services.BridgeVoiceIn.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "bridgeVoiceOut"));
        oper.setReturnClass(br.com.gvt.telefonia.ura.co.services.BridgeVoiceOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "BridgeVoiceOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("verifySIPTecnology");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SIPIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "sipIn"), br.com.gvt.telefonia.ura.co.services.SipIn.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "sipOut"));
        oper.setReturnClass(br.com.gvt.telefonia.ura.co.services.SipOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "SIPOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSIPStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SIPStatusIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "sipStatusIn"), br.com.gvt.telefonia.ura.co.services.SipStatusIn.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "sipStatusOut"));
        oper.setReturnClass(br.com.gvt.telefonia.ura.co.services.SipStatusOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "SIPStatusOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isSipModemConfigured");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SIPModemConfigurationIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "sipModemConfigurationIn"), br.com.gvt.telefonia.ura.co.services.SipModemConfigurationIn.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "sipModemConfigurationOut"));
        oper.setReturnClass(br.com.gvt.telefonia.ura.co.services.SipModemConfigurationOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "SIPModemConfigurationOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("resetModemSipInterface");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ResetModemSipInterfaceIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "resetModemSipInterfaceIn"), br.com.gvt.telefonia.ura.co.services.ResetModemSipInterfaceIn.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "resetModemSipInterfaceOut"));
        oper.setReturnClass(br.com.gvt.telefonia.ura.co.services.ResetModemSipInterfaceOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ResetModemSipInterfaceOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("resendFxs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ResendFXSIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "resendFxsIn"), br.com.gvt.telefonia.ura.co.services.ResendFxsIn.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "resendFxsOut"));
        oper.setReturnClass(br.com.gvt.telefonia.ura.co.services.ResendFxsOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ResendFxsOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("configBridgeVoice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ConfigBridgeIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "configBridgeIn"), br.com.gvt.telefonia.ura.co.services.ConfigBridgeIn.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "configBridgeOut"));
        oper.setReturnClass(br.com.gvt.telefonia.ura.co.services.ConfigBridgeOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ConfigBridgeOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("bridgeVoiceMetal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "BridgeVoiceMetalIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "bridgeVoiceMetalIn"), br.com.gvt.telefonia.ura.co.services.BridgeVoiceMetalIn.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "bridgeVoiceMetalOut"));
        oper.setReturnClass(br.com.gvt.telefonia.ura.co.services.BridgeVoiceMetalOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "BridgeVoiceMetalOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sipLineIsOK");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SipLineIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "sipLineIn"), br.com.gvt.telefonia.ura.co.services.SipLineIn.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "sipLineOut"));
        oper.setReturnClass(br.com.gvt.telefonia.ura.co.services.SipLineOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "SipLineOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("configBridgeVoiceMetal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ConfigBridgeVoiceMetalIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "configBridgeVoiceMetalIn"), br.com.gvt.telefonia.ura.co.services.ConfigBridgeVoiceMetalIn.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "configBridgeVoiceMetalOut"));
        oper.setReturnClass(br.com.gvt.telefonia.ura.co.services.ConfigBridgeVoiceMetalOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ConfigBridgeVoiceMetalOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("upOnPlataformACSTime");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ModemACSTimeIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "modemACSTimeIn"), br.com.gvt.telefonia.ura.co.services.ModemACSTimeIn.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "modemACSTimeOut"));
        oper.setReturnClass(br.com.gvt.telefonia.ura.co.services.ModemACSTimeOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ModemACSTimeOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVersion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "VersionIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "versionIn"), br.com.gvt.telefonia.ura.co.services.VersionIn.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "versionOut"));
        oper.setReturnClass(br.com.gvt.telefonia.ura.co.services.VersionOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "VersionOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

    }

    public SIPPortBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public SIPPortBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public SIPPortBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "bridgeVoiceIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.telefonia.ura.co.services.BridgeVoiceIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "bridgeVoiceMetalIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.telefonia.ura.co.services.BridgeVoiceMetalIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "bridgeVoiceMetalOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.telefonia.ura.co.services.BridgeVoiceMetalOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "bridgeVoiceOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.telefonia.ura.co.services.BridgeVoiceOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "configBridgeIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.telefonia.ura.co.services.ConfigBridgeIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "configBridgeOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.telefonia.ura.co.services.ConfigBridgeOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "configBridgeVoiceMetalIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.telefonia.ura.co.services.ConfigBridgeVoiceMetalIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "configBridgeVoiceMetalOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.telefonia.ura.co.services.ConfigBridgeVoiceMetalOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "dslamIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.telefonia.ura.co.services.DslamIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "dslamOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.telefonia.ura.co.services.DslamOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "ipVoiceIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.telefonia.ura.co.services.IpVoiceIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "ipVoiceOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.telefonia.ura.co.services.IpVoiceOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "modemACSTimeIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.telefonia.ura.co.services.ModemACSTimeIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "modemACSTimeOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.telefonia.ura.co.services.ModemACSTimeOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "resendFxsIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.telefonia.ura.co.services.ResendFxsIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "resendFxsOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.telefonia.ura.co.services.ResendFxsOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "resetModemSipInterfaceIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.telefonia.ura.co.services.ResetModemSipInterfaceIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "resetModemSipInterfaceOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.telefonia.ura.co.services.ResetModemSipInterfaceOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "sipIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.telefonia.ura.co.services.SipIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "sipLineIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.telefonia.ura.co.services.SipLineIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "sipLineOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.telefonia.ura.co.services.SipLineOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "sipModemConfigurationIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.telefonia.ura.co.services.SipModemConfigurationIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "sipModemConfigurationOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.telefonia.ura.co.services.SipModemConfigurationOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "sipOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.telefonia.ura.co.services.SipOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "sipStatusIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.telefonia.ura.co.services.SipStatusIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "sipStatusOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.telefonia.ura.co.services.SipStatusOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "versionIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.telefonia.ura.co.services.VersionIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "versionOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.telefonia.ura.co.services.VersionOut.class;
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

    public br.com.gvt.telefonia.ura.co.services.IpVoiceOut hasIPVoice(br.com.gvt.telefonia.ura.co.services.IpVoiceIn ipVoiceIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "hasIPVoice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ipVoiceIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.telefonia.ura.co.services.IpVoiceOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.telefonia.ura.co.services.IpVoiceOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.telefonia.ura.co.services.IpVoiceOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.telefonia.ura.co.services.DslamOut isDSLAMmanageable(br.com.gvt.telefonia.ura.co.services.DslamIn DSLAMIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "isDSLAMmanageable"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {DSLAMIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.telefonia.ura.co.services.DslamOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.telefonia.ura.co.services.DslamOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.telefonia.ura.co.services.DslamOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.telefonia.ura.co.services.BridgeVoiceOut isBgidgeVoiceCreated(br.com.gvt.telefonia.ura.co.services.BridgeVoiceIn bridgeVoiceIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "isBgidgeVoiceCreated"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bridgeVoiceIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.telefonia.ura.co.services.BridgeVoiceOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.telefonia.ura.co.services.BridgeVoiceOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.telefonia.ura.co.services.BridgeVoiceOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.telefonia.ura.co.services.SipOut verifySIPTecnology(br.com.gvt.telefonia.ura.co.services.SipIn SIPIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "verifySIPTecnology"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {SIPIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.telefonia.ura.co.services.SipOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.telefonia.ura.co.services.SipOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.telefonia.ura.co.services.SipOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.telefonia.ura.co.services.SipStatusOut getSIPStatus(br.com.gvt.telefonia.ura.co.services.SipStatusIn SIPStatusIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "getSIPStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {SIPStatusIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.telefonia.ura.co.services.SipStatusOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.telefonia.ura.co.services.SipStatusOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.telefonia.ura.co.services.SipStatusOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.telefonia.ura.co.services.SipModemConfigurationOut isSipModemConfigured(br.com.gvt.telefonia.ura.co.services.SipModemConfigurationIn SIPModemConfigurationIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "isSipModemConfigured"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {SIPModemConfigurationIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.telefonia.ura.co.services.SipModemConfigurationOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.telefonia.ura.co.services.SipModemConfigurationOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.telefonia.ura.co.services.SipModemConfigurationOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.telefonia.ura.co.services.ResetModemSipInterfaceOut resetModemSipInterface(br.com.gvt.telefonia.ura.co.services.ResetModemSipInterfaceIn resetModemSipInterfaceIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "resetModemSipInterface"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {resetModemSipInterfaceIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.telefonia.ura.co.services.ResetModemSipInterfaceOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.telefonia.ura.co.services.ResetModemSipInterfaceOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.telefonia.ura.co.services.ResetModemSipInterfaceOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.telefonia.ura.co.services.ResendFxsOut resendFxs(br.com.gvt.telefonia.ura.co.services.ResendFxsIn resendFXSIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "resendFxs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {resendFXSIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.telefonia.ura.co.services.ResendFxsOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.telefonia.ura.co.services.ResendFxsOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.telefonia.ura.co.services.ResendFxsOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.telefonia.ura.co.services.ConfigBridgeOut configBridgeVoice(br.com.gvt.telefonia.ura.co.services.ConfigBridgeIn configBridgeIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "configBridgeVoice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {configBridgeIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.telefonia.ura.co.services.ConfigBridgeOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.telefonia.ura.co.services.ConfigBridgeOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.telefonia.ura.co.services.ConfigBridgeOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.telefonia.ura.co.services.BridgeVoiceMetalOut bridgeVoiceMetal(br.com.gvt.telefonia.ura.co.services.BridgeVoiceMetalIn bridgeVoiceMetalIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "bridgeVoiceMetal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bridgeVoiceMetalIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.telefonia.ura.co.services.BridgeVoiceMetalOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.telefonia.ura.co.services.BridgeVoiceMetalOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.telefonia.ura.co.services.BridgeVoiceMetalOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.telefonia.ura.co.services.SipLineOut sipLineIsOK(br.com.gvt.telefonia.ura.co.services.SipLineIn sipLineIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "sipLineIsOK"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sipLineIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.telefonia.ura.co.services.SipLineOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.telefonia.ura.co.services.SipLineOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.telefonia.ura.co.services.SipLineOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.telefonia.ura.co.services.ConfigBridgeVoiceMetalOut configBridgeVoiceMetal(br.com.gvt.telefonia.ura.co.services.ConfigBridgeVoiceMetalIn configBridgeVoiceMetalIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "configBridgeVoiceMetal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {configBridgeVoiceMetalIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.telefonia.ura.co.services.ConfigBridgeVoiceMetalOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.telefonia.ura.co.services.ConfigBridgeVoiceMetalOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.telefonia.ura.co.services.ConfigBridgeVoiceMetalOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.telefonia.ura.co.services.ModemACSTimeOut upOnPlataformACSTime(br.com.gvt.telefonia.ura.co.services.ModemACSTimeIn modemACSTimeIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "upOnPlataformACSTime"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {modemACSTimeIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.telefonia.ura.co.services.ModemACSTimeOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.telefonia.ura.co.services.ModemACSTimeOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.telefonia.ura.co.services.ModemACSTimeOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.telefonia.ura.co.services.VersionOut getVersion(br.com.gvt.telefonia.ura.co.services.VersionIn versionIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.co.ura.telefonia.gvt.com.br/", "getVersion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {versionIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.telefonia.ura.co.services.VersionOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.telefonia.ura.co.services.VersionOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.telefonia.ura.co.services.VersionOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
