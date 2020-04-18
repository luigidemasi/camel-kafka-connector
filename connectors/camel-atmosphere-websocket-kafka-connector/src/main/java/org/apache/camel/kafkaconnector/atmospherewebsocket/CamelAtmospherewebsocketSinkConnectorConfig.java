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
package org.apache.camel.kafkaconnector.atmospherewebsocket;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelAtmospherewebsocketSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_PATH_SERVICE_PATH_CONF = "camel.sink.path.servicePath";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_PATH_SERVICE_PATH_DOC = "Name of websocket endpoint";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_PATH_SERVICE_PATH_DEFAULT = null;
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_CHUNKED_CONF = "camel.sink.endpoint.chunked";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_CHUNKED_DOC = "If this option is false the Servlet will disable the HTTP streaming and set the content-length header on the response";
    public static final Boolean CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_CHUNKED_DEFAULT = true;
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_DISABLE_STREAM_CACHE_CONF = "camel.sink.endpoint.disableStreamCache";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_DISABLE_STREAM_CACHE_DOC = "Determines whether or not the raw input stream from Servlet is cached or not (Camel will read the stream into a in memory/overflow to file, Stream caching) cache. By default Camel will cache the Servlet input stream to support reading it multiple times to ensure it Camel can retrieve all data from the stream. However you can set this option to true when you for example need to access the raw stream, such as streaming it directly to a file or other persistent store. DefaultHttpBinding will copy the request input stream into a stream cache and put it into message body if this option is false to support reading the stream multiple times. If you use Servlet to bridge/proxy an endpoint then consider enabling this option to improve performance, in case you do not need to read the message payload multiple times. The http producer will by default cache the response body stream. If setting this option to true, then the producers will not cache the response body stream but use the response stream as-is as the message body.";
    public static final Boolean CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_DISABLE_STREAM_CACHE_DEFAULT = false;
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_HEADER_FILTER_STRATEGY_CONF = "camel.sink.endpoint.headerFilterStrategy";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_HEADER_FILTER_STRATEGY_DOC = "To use a custom HeaderFilterStrategy to filter header to and from Camel message.";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_HEADER_FILTER_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_SEND_TO_ALL_CONF = "camel.sink.endpoint.sendToAll";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_SEND_TO_ALL_DOC = "Whether to send to all (broadcast) or send to a single receiver.";
    public static final Boolean CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_SEND_TO_ALL_DEFAULT = false;
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_TRANSFER_EXCEPTION_CONF = "camel.sink.endpoint.transferException";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_TRANSFER_EXCEPTION_DOC = "If enabled and an Exchange failed processing on the consumer side, and if the caused Exception was send back serialized in the response as a application/x-java-serialized-object content type. On the producer side the exception will be deserialized and thrown as is, instead of the HttpOperationFailedException. The caused exception is required to be serialized. This is by default turned off. If you enable this then be aware that Java will deserialize the incoming data from the request to Java and that can be a potential security risk.";
    public static final Boolean CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_TRANSFER_EXCEPTION_DEFAULT = false;
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_USE_STREAMING_CONF = "camel.sink.endpoint.useStreaming";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_USE_STREAMING_DOC = "To enable streaming to send data as multiple text fragments.";
    public static final Boolean CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_USE_STREAMING_DEFAULT = false;
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_HTTP_BINDING_CONF = "camel.sink.endpoint.httpBinding";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_HTTP_BINDING_DOC = "To use a custom HttpBinding to control the mapping between Camel message and HttpClient.";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_HTTP_BINDING_DEFAULT = null;
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_BRIDGE_ENDPOINT_CONF = "camel.sink.endpoint.bridgeEndpoint";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_BRIDGE_ENDPOINT_DOC = "If the option is true, HttpProducer will ignore the Exchange.HTTP_URI header, and use the endpoint's URI for request. You may also set the option throwExceptionOnFailure to be false to let the HttpProducer send all the fault response back.";
    public static final Boolean CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_BRIDGE_ENDPOINT_DEFAULT = false;
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_CONNECTION_CLOSE_CONF = "camel.sink.endpoint.connectionClose";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_CONNECTION_CLOSE_DOC = "Specifies whether a Connection Close header must be added to HTTP Request. By default connectionClose is false.";
    public static final Boolean CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_CONNECTION_CLOSE_DEFAULT = false;
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_COPY_HEADERS_CONF = "camel.sink.endpoint.copyHeaders";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_COPY_HEADERS_DOC = "If this option is true then IN exchange headers will be copied to OUT exchange headers according to copy strategy. Setting this to false, allows to only include the headers from the HTTP response (not propagating IN headers).";
    public static final Boolean CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_COPY_HEADERS_DEFAULT = true;
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_HTTP_METHOD_CONF = "camel.sink.endpoint.httpMethod";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_HTTP_METHOD_DOC = "Configure the HTTP method to use. The HttpMethod header cannot override this option if set. One of: [GET] [POST] [PUT] [DELETE] [HEAD] [OPTIONS] [TRACE] [PATCH]";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_HTTP_METHOD_DEFAULT = null;
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_IGNORE_RESPONSE_BODY_CONF = "camel.sink.endpoint.ignoreResponseBody";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_IGNORE_RESPONSE_BODY_DOC = "If this option is true, The http producer won't read response body and cache the input stream";
    public static final Boolean CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_IGNORE_RESPONSE_BODY_DEFAULT = false;
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_PRESERVE_HOST_HEADER_CONF = "camel.sink.endpoint.preserveHostHeader";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_PRESERVE_HOST_HEADER_DOC = "If the option is true, HttpProducer will set the Host header to the value contained in the current exchange Host header, useful in reverse proxy applications where you want the Host header received by the downstream server to reflect the URL called by the upstream client, this allows applications which use the Host header to generate accurate URL's for a proxied service";
    public static final Boolean CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_PRESERVE_HOST_HEADER_DEFAULT = false;
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_THROW_EXCEPTION_ON_FAILURE_CONF = "camel.sink.endpoint.throwExceptionOnFailure";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_THROW_EXCEPTION_ON_FAILURE_DOC = "Option to disable throwing the HttpOperationFailedException in case of failed responses from the remote server. This allows you to get all responses regardless of the HTTP status code.";
    public static final Boolean CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_THROW_EXCEPTION_ON_FAILURE_DEFAULT = true;
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_COOKIE_HANDLER_CONF = "camel.sink.endpoint.cookieHandler";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_COOKIE_HANDLER_DOC = "Configure a cookie handler to maintain a HTTP session";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_COOKIE_HANDLER_DEFAULT = null;
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_OK_STATUS_CODE_RANGE_CONF = "camel.sink.endpoint.okStatusCodeRange";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_OK_STATUS_CODE_RANGE_DOC = "The status codes which are considered a success response. The values are inclusive. Multiple ranges can be defined, separated by comma, e.g. 200-204,209,301-304. Each range must be a single number or from-to with the dash included.";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_OK_STATUS_CODE_RANGE_DEFAULT = "200-299";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_MAP_HTTP_MESSAGE_BODY_CONF = "camel.sink.endpoint.mapHttpMessageBody";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_MAP_HTTP_MESSAGE_BODY_DOC = "If this option is true then IN exchange Body of the exchange will be mapped to HTTP body. Setting this to false will avoid the HTTP mapping.";
    public static final Boolean CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_MAP_HTTP_MESSAGE_BODY_DEFAULT = true;
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_MAP_HTTP_MESSAGE_FORM_URL_ENCODED_BODY_CONF = "camel.sink.endpoint.mapHttpMessageFormUrlEncodedBody";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_MAP_HTTP_MESSAGE_FORM_URL_ENCODED_BODY_DOC = "If this option is true then IN exchange Form Encoded body of the exchange will be mapped to HTTP. Setting this to false will avoid the HTTP Form Encoded body mapping.";
    public static final Boolean CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_MAP_HTTP_MESSAGE_FORM_URL_ENCODED_BODY_DEFAULT = true;
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_MAP_HTTP_MESSAGE_HEADERS_CONF = "camel.sink.endpoint.mapHttpMessageHeaders";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_MAP_HTTP_MESSAGE_HEADERS_DOC = "If this option is true then IN exchange Headers of the exchange will be mapped to HTTP headers. Setting this to false will avoid the HTTP Headers mapping.";
    public static final Boolean CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_MAP_HTTP_MESSAGE_HEADERS_DEFAULT = true;
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_PROXY_AUTH_SCHEME_CONF = "camel.sink.endpoint.proxyAuthScheme";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_PROXY_AUTH_SCHEME_DOC = "Proxy authentication scheme to use One of: [http] [https]";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_PROXY_AUTH_SCHEME_DEFAULT = null;
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_PROXY_HOST_CONF = "camel.sink.endpoint.proxyHost";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_PROXY_HOST_DOC = "Proxy hostname to use";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_PROXY_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_PROXY_PORT_CONF = "camel.sink.endpoint.proxyPort";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_PROXY_PORT_DOC = "Proxy port to use";
    public static final Integer CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_PROXY_PORT_DEFAULT = null;
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_AUTH_HOST_CONF = "camel.sink.endpoint.authHost";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_AUTH_HOST_DOC = "Authentication host to use with NTML";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_AUTH_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.atmosphere-websocket.lazyStartProducer";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_ATMOSPHEREWEBSOCKET_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_COMPONENT_ALLOW_JAVA_SERIALIZED_OBJECT_CONF = "camel.component.atmosphere-websocket.allowJavaSerializedObject";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_COMPONENT_ALLOW_JAVA_SERIALIZED_OBJECT_DOC = "Whether to allow java serialization when a request uses context-type=application/x-java-serialized-object. This is by default turned off. If you enable this then be aware that Java will deserialize the incoming data from the request to Java and that can be a potential security risk.";
    public static final Boolean CAMEL_SINK_ATMOSPHEREWEBSOCKET_COMPONENT_ALLOW_JAVA_SERIALIZED_OBJECT_DEFAULT = false;
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.atmosphere-websocket.basicPropertyBinding";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_ATMOSPHEREWEBSOCKET_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_COMPONENT_HTTP_BINDING_CONF = "camel.component.atmosphere-websocket.httpBinding";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_COMPONENT_HTTP_BINDING_DOC = "To use a custom HttpBinding to control the mapping between Camel message and HttpClient.";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_COMPONENT_HTTP_BINDING_DEFAULT = null;
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_COMPONENT_HTTP_CONFIGURATION_CONF = "camel.component.atmosphere-websocket.httpConfiguration";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_COMPONENT_HTTP_CONFIGURATION_DOC = "To use the shared HttpConfiguration as base configuration.";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_COMPONENT_HTTP_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_COMPONENT_HEADER_FILTER_STRATEGY_CONF = "camel.component.atmosphere-websocket.headerFilterStrategy";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_COMPONENT_HEADER_FILTER_STRATEGY_DOC = "To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter header to and from Camel message.";
    public static final String CAMEL_SINK_ATMOSPHEREWEBSOCKET_COMPONENT_HEADER_FILTER_STRATEGY_DEFAULT = null;

    public CamelAtmospherewebsocketSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelAtmospherewebsocketSinkConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf(Map<String, String> parsedConfig) {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_ATMOSPHEREWEBSOCKET_PATH_SERVICE_PATH_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATMOSPHEREWEBSOCKET_PATH_SERVICE_PATH_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_ATMOSPHEREWEBSOCKET_PATH_SERVICE_PATH_DOC);
        conf.define(CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_CHUNKED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_CHUNKED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_CHUNKED_DOC);
        conf.define(CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_DISABLE_STREAM_CACHE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_DISABLE_STREAM_CACHE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_DISABLE_STREAM_CACHE_DOC);
        conf.define(CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_HEADER_FILTER_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_HEADER_FILTER_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_HEADER_FILTER_STRATEGY_DOC);
        conf.define(CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_SEND_TO_ALL_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_SEND_TO_ALL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_SEND_TO_ALL_DOC);
        conf.define(CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_TRANSFER_EXCEPTION_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_TRANSFER_EXCEPTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_TRANSFER_EXCEPTION_DOC);
        conf.define(CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_USE_STREAMING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_USE_STREAMING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_USE_STREAMING_DOC);
        conf.define(CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_HTTP_BINDING_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_HTTP_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_HTTP_BINDING_DOC);
        conf.define(CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_BRIDGE_ENDPOINT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_BRIDGE_ENDPOINT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_BRIDGE_ENDPOINT_DOC);
        conf.define(CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_CONNECTION_CLOSE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_CONNECTION_CLOSE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_CONNECTION_CLOSE_DOC);
        conf.define(CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_COPY_HEADERS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_COPY_HEADERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_COPY_HEADERS_DOC);
        conf.define(CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_HTTP_METHOD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_HTTP_METHOD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_HTTP_METHOD_DOC);
        conf.define(CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_IGNORE_RESPONSE_BODY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_IGNORE_RESPONSE_BODY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_IGNORE_RESPONSE_BODY_DOC);
        conf.define(CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_PRESERVE_HOST_HEADER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_PRESERVE_HOST_HEADER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_PRESERVE_HOST_HEADER_DOC);
        conf.define(CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_THROW_EXCEPTION_ON_FAILURE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_THROW_EXCEPTION_ON_FAILURE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_THROW_EXCEPTION_ON_FAILURE_DOC);
        conf.define(CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_COOKIE_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_COOKIE_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_COOKIE_HANDLER_DOC);
        conf.define(CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_OK_STATUS_CODE_RANGE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_OK_STATUS_CODE_RANGE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_OK_STATUS_CODE_RANGE_DOC);
        conf.define(CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_MAP_HTTP_MESSAGE_BODY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_MAP_HTTP_MESSAGE_BODY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_MAP_HTTP_MESSAGE_BODY_DOC);
        conf.define(CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_MAP_HTTP_MESSAGE_FORM_URL_ENCODED_BODY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_MAP_HTTP_MESSAGE_FORM_URL_ENCODED_BODY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_MAP_HTTP_MESSAGE_FORM_URL_ENCODED_BODY_DOC);
        conf.define(CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_MAP_HTTP_MESSAGE_HEADERS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_MAP_HTTP_MESSAGE_HEADERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_MAP_HTTP_MESSAGE_HEADERS_DOC);
        conf.define(CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_PROXY_AUTH_SCHEME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_PROXY_AUTH_SCHEME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_PROXY_AUTH_SCHEME_DOC);
        conf.define(CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_PROXY_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_PROXY_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_PROXY_HOST_DOC);
        conf.define(CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_PROXY_PORT_CONF, ConfigDef.Type.INT, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_PROXY_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_PROXY_PORT_DOC);
        conf.define(CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_AUTH_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_AUTH_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATMOSPHEREWEBSOCKET_ENDPOINT_AUTH_HOST_DOC);
        conf.define(CAMEL_SINK_ATMOSPHEREWEBSOCKET_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ATMOSPHEREWEBSOCKET_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATMOSPHEREWEBSOCKET_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_ATMOSPHEREWEBSOCKET_COMPONENT_ALLOW_JAVA_SERIALIZED_OBJECT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ATMOSPHEREWEBSOCKET_COMPONENT_ALLOW_JAVA_SERIALIZED_OBJECT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATMOSPHEREWEBSOCKET_COMPONENT_ALLOW_JAVA_SERIALIZED_OBJECT_DOC);
        conf.define(CAMEL_SINK_ATMOSPHEREWEBSOCKET_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ATMOSPHEREWEBSOCKET_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATMOSPHEREWEBSOCKET_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_ATMOSPHEREWEBSOCKET_COMPONENT_HTTP_BINDING_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATMOSPHEREWEBSOCKET_COMPONENT_HTTP_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATMOSPHEREWEBSOCKET_COMPONENT_HTTP_BINDING_DOC);
        conf.define(CAMEL_SINK_ATMOSPHEREWEBSOCKET_COMPONENT_HTTP_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATMOSPHEREWEBSOCKET_COMPONENT_HTTP_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATMOSPHEREWEBSOCKET_COMPONENT_HTTP_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_ATMOSPHEREWEBSOCKET_COMPONENT_HEADER_FILTER_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATMOSPHEREWEBSOCKET_COMPONENT_HEADER_FILTER_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATMOSPHEREWEBSOCKET_COMPONENT_HEADER_FILTER_STRATEGY_DOC);
        return conf;
    }
}