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
package org.apache.camel.kafkaconnector.rest;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelRestSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_REST_PATH_METHOD_CONF = "camel.sink.path.method";
    public static final String CAMEL_SINK_REST_PATH_METHOD_DOC = "HTTP method to use. One of: [get] [post] [put] [delete] [patch] [head] [trace] [connect] [options]";
    public static final String CAMEL_SINK_REST_PATH_METHOD_DEFAULT = null;
    public static final String CAMEL_SINK_REST_PATH_PATH_CONF = "camel.sink.path.path";
    public static final String CAMEL_SINK_REST_PATH_PATH_DOC = "The base path";
    public static final String CAMEL_SINK_REST_PATH_PATH_DEFAULT = null;
    public static final String CAMEL_SINK_REST_PATH_URI_TEMPLATE_CONF = "camel.sink.path.uriTemplate";
    public static final String CAMEL_SINK_REST_PATH_URI_TEMPLATE_DOC = "The uri template";
    public static final String CAMEL_SINK_REST_PATH_URI_TEMPLATE_DEFAULT = null;
    public static final String CAMEL_SINK_REST_ENDPOINT_CONSUMES_CONF = "camel.sink.endpoint.consumes";
    public static final String CAMEL_SINK_REST_ENDPOINT_CONSUMES_DOC = "Media type such as: 'text/xml', or 'application/json' this REST service accepts. By default we accept all kinds of types.";
    public static final String CAMEL_SINK_REST_ENDPOINT_CONSUMES_DEFAULT = null;
    public static final String CAMEL_SINK_REST_ENDPOINT_IN_TYPE_CONF = "camel.sink.endpoint.inType";
    public static final String CAMEL_SINK_REST_ENDPOINT_IN_TYPE_DOC = "To declare the incoming POJO binding type as a FQN class name";
    public static final String CAMEL_SINK_REST_ENDPOINT_IN_TYPE_DEFAULT = null;
    public static final String CAMEL_SINK_REST_ENDPOINT_OUT_TYPE_CONF = "camel.sink.endpoint.outType";
    public static final String CAMEL_SINK_REST_ENDPOINT_OUT_TYPE_DOC = "To declare the outgoing POJO binding type as a FQN class name";
    public static final String CAMEL_SINK_REST_ENDPOINT_OUT_TYPE_DEFAULT = null;
    public static final String CAMEL_SINK_REST_ENDPOINT_PRODUCES_CONF = "camel.sink.endpoint.produces";
    public static final String CAMEL_SINK_REST_ENDPOINT_PRODUCES_DOC = "Media type such as: 'text/xml', or 'application/json' this REST service returns.";
    public static final String CAMEL_SINK_REST_ENDPOINT_PRODUCES_DEFAULT = null;
    public static final String CAMEL_SINK_REST_ENDPOINT_ROUTE_ID_CONF = "camel.sink.endpoint.routeId";
    public static final String CAMEL_SINK_REST_ENDPOINT_ROUTE_ID_DOC = "Name of the route this REST services creates";
    public static final String CAMEL_SINK_REST_ENDPOINT_ROUTE_ID_DEFAULT = null;
    public static final String CAMEL_SINK_REST_ENDPOINT_API_DOC_CONF = "camel.sink.endpoint.apiDoc";
    public static final String CAMEL_SINK_REST_ENDPOINT_API_DOC_DOC = "The openapi api doc resource to use. The resource is loaded from classpath by default and must be in JSon format.";
    public static final String CAMEL_SINK_REST_ENDPOINT_API_DOC_DEFAULT = null;
    public static final String CAMEL_SINK_REST_ENDPOINT_BINDING_MODE_CONF = "camel.sink.endpoint.bindingMode";
    public static final String CAMEL_SINK_REST_ENDPOINT_BINDING_MODE_DOC = "Configures the binding mode for the producer. If set to anything other than 'off' the producer will try to convert the body of the incoming message from inType to the json or xml, and the response from json or xml to outType. One of: [auto] [off] [json] [xml] [json_xml]";
    public static final String CAMEL_SINK_REST_ENDPOINT_BINDING_MODE_DEFAULT = null;
    public static final String CAMEL_SINK_REST_ENDPOINT_HOST_CONF = "camel.sink.endpoint.host";
    public static final String CAMEL_SINK_REST_ENDPOINT_HOST_DOC = "Host and port of HTTP service to use (override host in openapi schema)";
    public static final String CAMEL_SINK_REST_ENDPOINT_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_REST_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_REST_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_REST_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_REST_ENDPOINT_PRODUCER_COMPONENT_NAME_CONF = "camel.sink.endpoint.producerComponentName";
    public static final String CAMEL_SINK_REST_ENDPOINT_PRODUCER_COMPONENT_NAME_DOC = "The Camel Rest component to use for (producer) the REST transport, such as http, undertow. If no component has been explicit configured, then Camel will lookup if there is a Camel component that integrates with the Rest DSL, or if a org.apache.camel.spi.RestProducerFactory is registered in the registry. If either one is found, then that is being used.";
    public static final String CAMEL_SINK_REST_ENDPOINT_PRODUCER_COMPONENT_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_REST_ENDPOINT_QUERY_PARAMETERS_CONF = "camel.sink.endpoint.queryParameters";
    public static final String CAMEL_SINK_REST_ENDPOINT_QUERY_PARAMETERS_DOC = "Query parameters for the HTTP service to call";
    public static final String CAMEL_SINK_REST_ENDPOINT_QUERY_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SINK_REST_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_REST_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_REST_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_REST_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_REST_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_REST_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_REST_COMPONENT_API_DOC_CONF = "camel.component.rest.apiDoc";
    public static final String CAMEL_SINK_REST_COMPONENT_API_DOC_DOC = "The swagger api doc resource to use. The resource is loaded from classpath by default and must be in JSon format.";
    public static final String CAMEL_SINK_REST_COMPONENT_API_DOC_DEFAULT = null;
    public static final String CAMEL_SINK_REST_COMPONENT_COMPONENT_NAME_CONF = "camel.component.rest.componentName";
    public static final String CAMEL_SINK_REST_COMPONENT_COMPONENT_NAME_DOC = "The Camel Rest component to use for (producer) the REST transport, such as http, undertow. If no component has been explicit configured, then Camel will lookup if there is a Camel component that integrates with the Rest DSL, or if a org.apache.camel.spi.RestProducerFactory is registered in the registry. If either one is found, then that is being used.";
    public static final String CAMEL_SINK_REST_COMPONENT_COMPONENT_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_REST_COMPONENT_HOST_CONF = "camel.component.rest.host";
    public static final String CAMEL_SINK_REST_COMPONENT_HOST_DOC = "Host and port of HTTP service to use (override host in swagger schema)";
    public static final String CAMEL_SINK_REST_COMPONENT_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_REST_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.rest.lazyStartProducer";
    public static final String CAMEL_SINK_REST_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_REST_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_REST_COMPONENT_PRODUCER_COMPONENT_NAME_CONF = "camel.component.rest.producerComponentName";
    public static final String CAMEL_SINK_REST_COMPONENT_PRODUCER_COMPONENT_NAME_DOC = "The Camel Rest component to use for (producer) the REST transport, such as http, undertow. If no component has been explicit configured, then Camel will lookup if there is a Camel component that integrates with the Rest DSL, or if a org.apache.camel.spi.RestProducerFactory is registered in the registry. If either one is found, then that is being used.";
    public static final String CAMEL_SINK_REST_COMPONENT_PRODUCER_COMPONENT_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_REST_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.rest.basicPropertyBinding";
    public static final String CAMEL_SINK_REST_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_REST_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;

    public CamelRestSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelRestSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf(Map<String, String> parsedConfig) {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_REST_PATH_METHOD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_REST_PATH_METHOD_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_REST_PATH_METHOD_DOC);
        conf.define(CAMEL_SINK_REST_PATH_PATH_CONF, ConfigDef.Type.STRING, CAMEL_SINK_REST_PATH_PATH_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_REST_PATH_PATH_DOC);
        conf.define(CAMEL_SINK_REST_PATH_URI_TEMPLATE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_REST_PATH_URI_TEMPLATE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_REST_PATH_URI_TEMPLATE_DOC);
        conf.define(CAMEL_SINK_REST_ENDPOINT_CONSUMES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_REST_ENDPOINT_CONSUMES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_REST_ENDPOINT_CONSUMES_DOC);
        conf.define(CAMEL_SINK_REST_ENDPOINT_IN_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_REST_ENDPOINT_IN_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_REST_ENDPOINT_IN_TYPE_DOC);
        conf.define(CAMEL_SINK_REST_ENDPOINT_OUT_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_REST_ENDPOINT_OUT_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_REST_ENDPOINT_OUT_TYPE_DOC);
        conf.define(CAMEL_SINK_REST_ENDPOINT_PRODUCES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_REST_ENDPOINT_PRODUCES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_REST_ENDPOINT_PRODUCES_DOC);
        conf.define(CAMEL_SINK_REST_ENDPOINT_ROUTE_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_REST_ENDPOINT_ROUTE_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_REST_ENDPOINT_ROUTE_ID_DOC);
        conf.define(CAMEL_SINK_REST_ENDPOINT_API_DOC_CONF, ConfigDef.Type.STRING, CAMEL_SINK_REST_ENDPOINT_API_DOC_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_REST_ENDPOINT_API_DOC_DOC);
        conf.define(CAMEL_SINK_REST_ENDPOINT_BINDING_MODE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_REST_ENDPOINT_BINDING_MODE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_REST_ENDPOINT_BINDING_MODE_DOC);
        conf.define(CAMEL_SINK_REST_ENDPOINT_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_REST_ENDPOINT_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_REST_ENDPOINT_HOST_DOC);
        conf.define(CAMEL_SINK_REST_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_REST_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_REST_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_REST_ENDPOINT_PRODUCER_COMPONENT_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_REST_ENDPOINT_PRODUCER_COMPONENT_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_REST_ENDPOINT_PRODUCER_COMPONENT_NAME_DOC);
        conf.define(CAMEL_SINK_REST_ENDPOINT_QUERY_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_REST_ENDPOINT_QUERY_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_REST_ENDPOINT_QUERY_PARAMETERS_DOC);
        conf.define(CAMEL_SINK_REST_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_REST_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_REST_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_REST_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_REST_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_REST_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_REST_COMPONENT_API_DOC_CONF, ConfigDef.Type.STRING, CAMEL_SINK_REST_COMPONENT_API_DOC_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_REST_COMPONENT_API_DOC_DOC);
        conf.define(CAMEL_SINK_REST_COMPONENT_COMPONENT_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_REST_COMPONENT_COMPONENT_NAME_DEFAULT, ConfigDef.Importance.LOW, CAMEL_SINK_REST_COMPONENT_COMPONENT_NAME_DOC);
        conf.define(CAMEL_SINK_REST_COMPONENT_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_REST_COMPONENT_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_REST_COMPONENT_HOST_DOC);
        conf.define(CAMEL_SINK_REST_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_REST_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_REST_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_REST_COMPONENT_PRODUCER_COMPONENT_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_REST_COMPONENT_PRODUCER_COMPONENT_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_REST_COMPONENT_PRODUCER_COMPONENT_NAME_DOC);
        conf.define(CAMEL_SINK_REST_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_REST_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_REST_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        return conf;
    }
}