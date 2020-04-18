/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.kafkaconnector.xsltsaxon;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelXsltsaxonSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_XSLTSAXON_PATH_RESOURCE_URI_CONF = "camel.sink.path.resourceUri";
    public static final String CAMEL_SINK_XSLTSAXON_PATH_RESOURCE_URI_DOC = "Path to the template. The following is supported by the default URIResolver. You can prefix with: classpath, file, http, ref, or bean. classpath, file and http loads the resource using these protocols (classpath is default). ref will lookup the resource in the registry. bean will call a method on a bean to be used as the resource. For bean you can specify the method name after dot, eg bean:myBean.myMethod";
    public static final String CAMEL_SINK_XSLTSAXON_PATH_RESOURCE_URI_DEFAULT = null;
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_ALLOW_ST_AXCONF = "camel.sink.endpoint.allowStAX";
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_ALLOW_ST_AXDOC = "Whether to allow using StAX as the javax.xml.transform.Source. You can enable this if the XSLT library supports StAX such as the Saxon library (camel-saxon). The Xalan library (default in JVM) does not support StAXSource.";
    public static final Boolean CAMEL_SINK_XSLTSAXON_ENDPOINT_ALLOW_ST_AXDEFAULT = true;
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_CONTENT_CACHE_CONF = "camel.sink.endpoint.contentCache";
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_CONTENT_CACHE_DOC = "Cache for the resource content (the stylesheet file) when it is loaded. If set to false Camel will reload the stylesheet file on each message processing. This is good for development. A cached stylesheet can be forced to reload at runtime via JMX using the clearCachedStylesheet operation.";
    public static final Boolean CAMEL_SINK_XSLTSAXON_ENDPOINT_CONTENT_CACHE_DEFAULT = true;
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_DELETE_OUTPUT_FILE_CONF = "camel.sink.endpoint.deleteOutputFile";
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_DELETE_OUTPUT_FILE_DOC = "If you have output=file then this option dictates whether or not the output file should be deleted when the Exchange is done processing. For example suppose the output file is a temporary file, then it can be a good idea to delete it after use.";
    public static final Boolean CAMEL_SINK_XSLTSAXON_ENDPOINT_DELETE_OUTPUT_FILE_DEFAULT = false;
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_FAIL_ON_NULL_BODY_CONF = "camel.sink.endpoint.failOnNullBody";
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_FAIL_ON_NULL_BODY_DOC = "Whether or not to throw an exception if the input body is null.";
    public static final Boolean CAMEL_SINK_XSLTSAXON_ENDPOINT_FAIL_ON_NULL_BODY_DEFAULT = true;
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_XSLTSAXON_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_OUTPUT_CONF = "camel.sink.endpoint.output";
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_OUTPUT_DOC = "Option to specify which output type to use. Possible values are: string, bytes, DOM, file. The first three options are all in memory based, where as file is streamed directly to a java.io.File. For file you must specify the filename in the IN header with the key Exchange.XSLT_FILE_NAME which is also CamelXsltFileName. Also any paths leading to the filename must be created beforehand, otherwise an exception is thrown at runtime. One of: [string] [bytes] [DOM] [file]";
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_OUTPUT_DEFAULT = "string";
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_TRANSFORMER_CACHE_SIZE_CONF = "camel.sink.endpoint.transformerCacheSize";
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_TRANSFORMER_CACHE_SIZE_DOC = "The number of javax.xml.transform.Transformer object that are cached for reuse to avoid calls to Template.newTransformer().";
    public static final Integer CAMEL_SINK_XSLTSAXON_ENDPOINT_TRANSFORMER_CACHE_SIZE_DEFAULT = 0;
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_XSLTSAXON_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_ENTITY_RESOLVER_CONF = "camel.sink.endpoint.entityResolver";
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_ENTITY_RESOLVER_DOC = "To use a custom org.xml.sax.EntityResolver with javax.xml.transform.sax.SAXSource.";
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_ENTITY_RESOLVER_DEFAULT = null;
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_ERROR_LISTENER_CONF = "camel.sink.endpoint.errorListener";
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_ERROR_LISTENER_DOC = "Allows to configure to use a custom javax.xml.transform.ErrorListener. Beware when doing this then the default error listener which captures any errors or fatal errors and store information on the Exchange as properties is not in use. So only use this option for special use-cases.";
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_ERROR_LISTENER_DEFAULT = null;
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_RESULT_HANDLER_FACTORY_CONF = "camel.sink.endpoint.resultHandlerFactory";
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_RESULT_HANDLER_FACTORY_DOC = "Allows you to use a custom org.apache.camel.builder.xml.ResultHandlerFactory which is capable of using custom org.apache.camel.builder.xml.ResultHandler types.";
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_RESULT_HANDLER_FACTORY_DEFAULT = null;
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_SAXON_CONFIGURATION_CONF = "camel.sink.endpoint.saxonConfiguration";
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_SAXON_CONFIGURATION_DOC = "To use a custom Saxon configuration";
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_SAXON_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_SAXON_EXTENSION_FUNCTIONS_CONF = "camel.sink.endpoint.saxonExtensionFunctions";
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_SAXON_EXTENSION_FUNCTIONS_DOC = "Allows you to use a custom net.sf.saxon.lib.ExtensionFunctionDefinition. You would need to add camel-saxon to the classpath. The function is looked up in the registry, where you can comma to separate multiple values to lookup.";
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_SAXON_EXTENSION_FUNCTIONS_DEFAULT = null;
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_XSLTSAXON_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_TRANSFORMER_FACTORY_CONF = "camel.sink.endpoint.transformerFactory";
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_TRANSFORMER_FACTORY_DOC = "To use a custom XSLT transformer factory";
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_TRANSFORMER_FACTORY_DEFAULT = null;
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_TRANSFORMER_FACTORY_CLASS_CONF = "camel.sink.endpoint.transformerFactoryClass";
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_TRANSFORMER_FACTORY_CLASS_DOC = "To use a custom XSLT transformer factory, specified as a FQN class name";
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_TRANSFORMER_FACTORY_CLASS_DEFAULT = null;
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_TRANSFORMER_FACTORY_CONFIGURATION_STRATEGY_CONF = "camel.sink.endpoint.transformerFactoryConfigurationStrategy";
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_TRANSFORMER_FACTORY_CONFIGURATION_STRATEGY_DOC = "A configuration strategy to apply on freshly created instances of TransformerFactory.";
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_TRANSFORMER_FACTORY_CONFIGURATION_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_URI_RESOLVER_CONF = "camel.sink.endpoint.uriResolver";
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_URI_RESOLVER_DOC = "To use a custom javax.xml.transform.URIResolver";
    public static final String CAMEL_SINK_XSLTSAXON_ENDPOINT_URI_RESOLVER_DEFAULT = null;
    public static final String CAMEL_SINK_XSLTSAXON_COMPONENT_CONTENT_CACHE_CONF = "camel.component.xslt-saxon.contentCache";
    public static final String CAMEL_SINK_XSLTSAXON_COMPONENT_CONTENT_CACHE_DOC = "Cache for the resource content (the stylesheet file) when it is loaded. If set to false Camel will reload the stylesheet file on each message processing. This is good for development. A cached stylesheet can be forced to reload at runtime via JMX using the clearCachedStylesheet operation.";
    public static final Boolean CAMEL_SINK_XSLTSAXON_COMPONENT_CONTENT_CACHE_DEFAULT = true;
    public static final String CAMEL_SINK_XSLTSAXON_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.xslt-saxon.lazyStartProducer";
    public static final String CAMEL_SINK_XSLTSAXON_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_XSLTSAXON_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_XSLTSAXON_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.xslt-saxon.basicPropertyBinding";
    public static final String CAMEL_SINK_XSLTSAXON_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_XSLTSAXON_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_XSLTSAXON_COMPONENT_SAXON_CONFIGURATION_CONF = "camel.component.xslt-saxon.saxonConfiguration";
    public static final String CAMEL_SINK_XSLTSAXON_COMPONENT_SAXON_CONFIGURATION_DOC = "To use a custom Saxon configuration";
    public static final String CAMEL_SINK_XSLTSAXON_COMPONENT_SAXON_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_XSLTSAXON_COMPONENT_SAXON_CONFIGURATION_PROPERTIES_CONF = "camel.component.xslt-saxon.saxonConfigurationProperties";
    public static final String CAMEL_SINK_XSLTSAXON_COMPONENT_SAXON_CONFIGURATION_PROPERTIES_DOC = "To set custom Saxon configuration properties";
    public static final String CAMEL_SINK_XSLTSAXON_COMPONENT_SAXON_CONFIGURATION_PROPERTIES_DEFAULT = null;
    public static final String CAMEL_SINK_XSLTSAXON_COMPONENT_SAXON_EXTENSION_FUNCTIONS_CONF = "camel.component.xslt-saxon.saxonExtensionFunctions";
    public static final String CAMEL_SINK_XSLTSAXON_COMPONENT_SAXON_EXTENSION_FUNCTIONS_DOC = "Allows you to use a custom net.sf.saxon.lib.ExtensionFunctionDefinition. You would need to add camel-saxon to the classpath. The function is looked up in the registry, where you can comma to separate multiple values to lookup.";
    public static final String CAMEL_SINK_XSLTSAXON_COMPONENT_SAXON_EXTENSION_FUNCTIONS_DEFAULT = null;
    public static final String CAMEL_SINK_XSLTSAXON_COMPONENT_TRANSFORMER_FACTORY_CLASS_CONF = "camel.component.xslt-saxon.transformerFactoryClass";
    public static final String CAMEL_SINK_XSLTSAXON_COMPONENT_TRANSFORMER_FACTORY_CLASS_DOC = "To use a custom XSLT transformer factory, specified as a FQN class name";
    public static final String CAMEL_SINK_XSLTSAXON_COMPONENT_TRANSFORMER_FACTORY_CLASS_DEFAULT = null;
    public static final String CAMEL_SINK_XSLTSAXON_COMPONENT_TRANSFORMER_FACTORY_CONFIGURATION_STRATEGY_CONF = "camel.component.xslt-saxon.transformerFactoryConfigurationStrategy";
    public static final String CAMEL_SINK_XSLTSAXON_COMPONENT_TRANSFORMER_FACTORY_CONFIGURATION_STRATEGY_DOC = "A configuration strategy to apply on freshly created instances of TransformerFactory.";
    public static final String CAMEL_SINK_XSLTSAXON_COMPONENT_TRANSFORMER_FACTORY_CONFIGURATION_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SINK_XSLTSAXON_COMPONENT_URI_RESOLVER_CONF = "camel.component.xslt-saxon.uriResolver";
    public static final String CAMEL_SINK_XSLTSAXON_COMPONENT_URI_RESOLVER_DOC = "To use a custom UriResolver. Should not be used together with the option 'uriResolverFactory'.";
    public static final String CAMEL_SINK_XSLTSAXON_COMPONENT_URI_RESOLVER_DEFAULT = null;
    public static final String CAMEL_SINK_XSLTSAXON_COMPONENT_URI_RESOLVER_FACTORY_CONF = "camel.component.xslt-saxon.uriResolverFactory";
    public static final String CAMEL_SINK_XSLTSAXON_COMPONENT_URI_RESOLVER_FACTORY_DOC = "To use a custom UriResolver which depends on a dynamic endpoint resource URI. Should not be used together with the option 'uriResolver'.";
    public static final String CAMEL_SINK_XSLTSAXON_COMPONENT_URI_RESOLVER_FACTORY_DEFAULT = null;

    public CamelXsltsaxonSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelXsltsaxonSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf(Map<String, String> parsedConfig) {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_XSLTSAXON_PATH_RESOURCE_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XSLTSAXON_PATH_RESOURCE_URI_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_XSLTSAXON_PATH_RESOURCE_URI_DOC);
        conf.define(CAMEL_SINK_XSLTSAXON_ENDPOINT_ALLOW_ST_AXCONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_XSLTSAXON_ENDPOINT_ALLOW_ST_AXDEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XSLTSAXON_ENDPOINT_ALLOW_ST_AXDOC);
        conf.define(CAMEL_SINK_XSLTSAXON_ENDPOINT_CONTENT_CACHE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_XSLTSAXON_ENDPOINT_CONTENT_CACHE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XSLTSAXON_ENDPOINT_CONTENT_CACHE_DOC);
        conf.define(CAMEL_SINK_XSLTSAXON_ENDPOINT_DELETE_OUTPUT_FILE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_XSLTSAXON_ENDPOINT_DELETE_OUTPUT_FILE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XSLTSAXON_ENDPOINT_DELETE_OUTPUT_FILE_DOC);
        conf.define(CAMEL_SINK_XSLTSAXON_ENDPOINT_FAIL_ON_NULL_BODY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_XSLTSAXON_ENDPOINT_FAIL_ON_NULL_BODY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XSLTSAXON_ENDPOINT_FAIL_ON_NULL_BODY_DOC);
        conf.define(CAMEL_SINK_XSLTSAXON_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_XSLTSAXON_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XSLTSAXON_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_XSLTSAXON_ENDPOINT_OUTPUT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XSLTSAXON_ENDPOINT_OUTPUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XSLTSAXON_ENDPOINT_OUTPUT_DOC);
        conf.define(CAMEL_SINK_XSLTSAXON_ENDPOINT_TRANSFORMER_CACHE_SIZE_CONF, ConfigDef.Type.INT, CAMEL_SINK_XSLTSAXON_ENDPOINT_TRANSFORMER_CACHE_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XSLTSAXON_ENDPOINT_TRANSFORMER_CACHE_SIZE_DOC);
        conf.define(CAMEL_SINK_XSLTSAXON_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_XSLTSAXON_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XSLTSAXON_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_XSLTSAXON_ENDPOINT_ENTITY_RESOLVER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XSLTSAXON_ENDPOINT_ENTITY_RESOLVER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XSLTSAXON_ENDPOINT_ENTITY_RESOLVER_DOC);
        conf.define(CAMEL_SINK_XSLTSAXON_ENDPOINT_ERROR_LISTENER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XSLTSAXON_ENDPOINT_ERROR_LISTENER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XSLTSAXON_ENDPOINT_ERROR_LISTENER_DOC);
        conf.define(CAMEL_SINK_XSLTSAXON_ENDPOINT_RESULT_HANDLER_FACTORY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XSLTSAXON_ENDPOINT_RESULT_HANDLER_FACTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XSLTSAXON_ENDPOINT_RESULT_HANDLER_FACTORY_DOC);
        conf.define(CAMEL_SINK_XSLTSAXON_ENDPOINT_SAXON_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XSLTSAXON_ENDPOINT_SAXON_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XSLTSAXON_ENDPOINT_SAXON_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_XSLTSAXON_ENDPOINT_SAXON_EXTENSION_FUNCTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XSLTSAXON_ENDPOINT_SAXON_EXTENSION_FUNCTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XSLTSAXON_ENDPOINT_SAXON_EXTENSION_FUNCTIONS_DOC);
        conf.define(CAMEL_SINK_XSLTSAXON_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_XSLTSAXON_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XSLTSAXON_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_XSLTSAXON_ENDPOINT_TRANSFORMER_FACTORY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XSLTSAXON_ENDPOINT_TRANSFORMER_FACTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XSLTSAXON_ENDPOINT_TRANSFORMER_FACTORY_DOC);
        conf.define(CAMEL_SINK_XSLTSAXON_ENDPOINT_TRANSFORMER_FACTORY_CLASS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XSLTSAXON_ENDPOINT_TRANSFORMER_FACTORY_CLASS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XSLTSAXON_ENDPOINT_TRANSFORMER_FACTORY_CLASS_DOC);
        conf.define(CAMEL_SINK_XSLTSAXON_ENDPOINT_TRANSFORMER_FACTORY_CONFIGURATION_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XSLTSAXON_ENDPOINT_TRANSFORMER_FACTORY_CONFIGURATION_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XSLTSAXON_ENDPOINT_TRANSFORMER_FACTORY_CONFIGURATION_STRATEGY_DOC);
        conf.define(CAMEL_SINK_XSLTSAXON_ENDPOINT_URI_RESOLVER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XSLTSAXON_ENDPOINT_URI_RESOLVER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XSLTSAXON_ENDPOINT_URI_RESOLVER_DOC);
        conf.define(CAMEL_SINK_XSLTSAXON_COMPONENT_CONTENT_CACHE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_XSLTSAXON_COMPONENT_CONTENT_CACHE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XSLTSAXON_COMPONENT_CONTENT_CACHE_DOC);
        conf.define(CAMEL_SINK_XSLTSAXON_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_XSLTSAXON_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XSLTSAXON_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_XSLTSAXON_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_XSLTSAXON_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XSLTSAXON_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_XSLTSAXON_COMPONENT_SAXON_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XSLTSAXON_COMPONENT_SAXON_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XSLTSAXON_COMPONENT_SAXON_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_XSLTSAXON_COMPONENT_SAXON_CONFIGURATION_PROPERTIES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XSLTSAXON_COMPONENT_SAXON_CONFIGURATION_PROPERTIES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XSLTSAXON_COMPONENT_SAXON_CONFIGURATION_PROPERTIES_DOC);
        conf.define(CAMEL_SINK_XSLTSAXON_COMPONENT_SAXON_EXTENSION_FUNCTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XSLTSAXON_COMPONENT_SAXON_EXTENSION_FUNCTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XSLTSAXON_COMPONENT_SAXON_EXTENSION_FUNCTIONS_DOC);
        conf.define(CAMEL_SINK_XSLTSAXON_COMPONENT_TRANSFORMER_FACTORY_CLASS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XSLTSAXON_COMPONENT_TRANSFORMER_FACTORY_CLASS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XSLTSAXON_COMPONENT_TRANSFORMER_FACTORY_CLASS_DOC);
        conf.define(CAMEL_SINK_XSLTSAXON_COMPONENT_TRANSFORMER_FACTORY_CONFIGURATION_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XSLTSAXON_COMPONENT_TRANSFORMER_FACTORY_CONFIGURATION_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XSLTSAXON_COMPONENT_TRANSFORMER_FACTORY_CONFIGURATION_STRATEGY_DOC);
        conf.define(CAMEL_SINK_XSLTSAXON_COMPONENT_URI_RESOLVER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XSLTSAXON_COMPONENT_URI_RESOLVER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XSLTSAXON_COMPONENT_URI_RESOLVER_DOC);
        conf.define(CAMEL_SINK_XSLTSAXON_COMPONENT_URI_RESOLVER_FACTORY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XSLTSAXON_COMPONENT_URI_RESOLVER_FACTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XSLTSAXON_COMPONENT_URI_RESOLVER_FACTORY_DOC);
        return conf;
    }
}