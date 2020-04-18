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
package org.apache.camel.kafkaconnector.paho;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelPahoSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_PAHO_PATH_TOPIC_CONF = "camel.source.path.topic";
    public static final String CAMEL_SOURCE_PAHO_PATH_TOPIC_DOC = "Name of the topic";
    public static final String CAMEL_SOURCE_PAHO_PATH_TOPIC_DEFAULT = null;
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_AUTOMATIC_RECONNECT_CONF = "camel.source.endpoint.automaticReconnect";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_AUTOMATIC_RECONNECT_DOC = "Sets whether the client will automatically attempt to reconnect to the server if the connection is lost. If set to false, the client will not attempt to automatically reconnect to the server in the event that the connection is lost. If set to true, in the event that the connection is lost, the client will attempt to reconnect to the server. It will initially wait 1 second before it attempts to reconnect, for every failed reconnect attempt, the delay will double until it is at 2 minutes at which point the delay will stay at 2 minutes.";
    public static final Boolean CAMEL_SOURCE_PAHO_ENDPOINT_AUTOMATIC_RECONNECT_DEFAULT = true;
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_BROKER_URL_CONF = "camel.source.endpoint.brokerUrl";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_BROKER_URL_DOC = "The URL of the MQTT broker.";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_BROKER_URL_DEFAULT = "tcp://localhost:1883";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_CLEAN_SESSION_CONF = "camel.source.endpoint.cleanSession";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_CLEAN_SESSION_DOC = "Sets whether the client and server should remember state across restarts and reconnects. If set to false both the client and server will maintain state across restarts of the client, the server and the connection. As state is maintained: Message delivery will be reliable meeting the specified QOS even if the client, server or connection are restarted. The server will treat a subscription as durable. If set to true the client and server will not maintain state across restarts of the client, the server or the connection. This means Message delivery to the specified QOS cannot be maintained if the client, server or connection are restarted The server will treat a subscription as non-durable";
    public static final Boolean CAMEL_SOURCE_PAHO_ENDPOINT_CLEAN_SESSION_DEFAULT = true;
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_CLIENT_ID_CONF = "camel.source.endpoint.clientId";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_CLIENT_ID_DOC = "MQTT client identifier. The identifier must be unique.";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_CLIENT_ID_DEFAULT = null;
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_CONNECTION_TIMEOUT_CONF = "camel.source.endpoint.connectionTimeout";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_CONNECTION_TIMEOUT_DOC = "Sets the connection timeout value. This value, measured in seconds, defines the maximum time interval the client will wait for the network connection to the MQTT server to be established. The default timeout is 30 seconds. A value of 0 disables timeout processing meaning the client will wait until the network connection is made successfully or fails.";
    public static final Integer CAMEL_SOURCE_PAHO_ENDPOINT_CONNECTION_TIMEOUT_DEFAULT = 30;
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_FILE_PERSISTENCE_DIRECTORY_CONF = "camel.source.endpoint.filePersistenceDirectory";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_FILE_PERSISTENCE_DIRECTORY_DOC = "Base directory used by file persistence. Will by default use user directory.";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_FILE_PERSISTENCE_DIRECTORY_DEFAULT = null;
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_KEEP_ALIVE_INTERVAL_CONF = "camel.source.endpoint.keepAliveInterval";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_KEEP_ALIVE_INTERVAL_DOC = "Sets the keep alive interval. This value, measured in seconds, defines the maximum time interval between messages sent or received. It enables the client to detect if the server is no longer available, without having to wait for the TCP/IP timeout. The client will ensure that at least one message travels across the network within each keep alive period. In the absence of a data-related message during the time period, the client sends a very small ping message, which the server will acknowledge. A value of 0 disables keepalive processing in the client. The default value is 60 seconds";
    public static final Integer CAMEL_SOURCE_PAHO_ENDPOINT_KEEP_ALIVE_INTERVAL_DEFAULT = 60;
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_MAX_INFLIGHT_CONF = "camel.source.endpoint.maxInflight";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_MAX_INFLIGHT_DOC = "Sets the max inflight. please increase this value in a high traffic environment. The default value is 10";
    public static final Integer CAMEL_SOURCE_PAHO_ENDPOINT_MAX_INFLIGHT_DEFAULT = 10;
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_MAX_RECONNECT_DELAY_CONF = "camel.source.endpoint.maxReconnectDelay";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_MAX_RECONNECT_DELAY_DOC = "Get the maximum time (in millis) to wait between reconnects";
    public static final Integer CAMEL_SOURCE_PAHO_ENDPOINT_MAX_RECONNECT_DELAY_DEFAULT = 128000;
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_MQTT_VERSION_CONF = "camel.source.endpoint.mqttVersion";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_MQTT_VERSION_DOC = "Sets the MQTT version. The default action is to connect with version 3.1.1, and to fall back to 3.1 if that fails. Version 3.1.1 or 3.1 can be selected specifically, with no fall back, by using the MQTT_VERSION_3_1_1 or MQTT_VERSION_3_1 options respectively.";
    public static final Integer CAMEL_SOURCE_PAHO_ENDPOINT_MQTT_VERSION_DEFAULT = null;
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_PERSISTENCE_CONF = "camel.source.endpoint.persistence";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_PERSISTENCE_DOC = "Client persistence to be used - memory or file. One of: [FILE] [MEMORY]";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_PERSISTENCE_DEFAULT = "MEMORY";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_QOS_CONF = "camel.source.endpoint.qos";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_QOS_DOC = "Client quality of service level (0-2).";
    public static final Integer CAMEL_SOURCE_PAHO_ENDPOINT_QOS_DEFAULT = 2;
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_RETAINED_CONF = "camel.source.endpoint.retained";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_RETAINED_DOC = "Retain option";
    public static final Boolean CAMEL_SOURCE_PAHO_ENDPOINT_RETAINED_DEFAULT = false;
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_SERVER_URIS_CONF = "camel.source.endpoint.serverURIs";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_SERVER_URIS_DOC = "Set a list of one or more serverURIs the client may connect to. Multiple servers can be separated by comma. Each serverURI specifies the address of a server that the client may connect to. Two types of connection are supported tcp:// for a TCP connection and ssl:// for a TCP connection secured by SSL/TLS. For example: tcp://localhost:1883 ssl://localhost:8883 If the port is not specified, it will default to 1883 for tcp:// URIs, and 8883 for ssl:// URIs. If serverURIs is set then it overrides the serverURI parameter passed in on the constructor of the MQTT client. When an attempt to connect is initiated the client will start with the first serverURI in the list and work through the list until a connection is established with a server. If a connection cannot be made to any of the servers then the connect attempt fails. Specifying a list of servers that a client may connect to has several uses: High Availability and reliable message delivery Some MQTT servers support a high availability feature where two or more equal MQTT servers share state. An MQTT client can connect to any of the equal servers and be assured that messages are reliably delivered and durable subscriptions are maintained no matter which server the client connects to. The cleansession flag must be set to false if durable subscriptions and/or reliable message delivery is required. Hunt List A set of servers may be specified that are not equal (as in the high availability option). As no state is shared across the servers reliable message delivery and durable subscriptions are not valid. The cleansession flag must be set to true if the hunt list mode is used";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_SERVER_URIS_DEFAULT = null;
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_WILL_PAYLOAD_CONF = "camel.source.endpoint.willPayload";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_WILL_PAYLOAD_DOC = "Sets the Last Will and Testament (LWT) for the connection. In the event that this client unexpectedly loses its connection to the server, the server will publish a message to itself using the supplied details. The topic to publish to The byte payload for the message. The quality of service to publish the message at (0, 1 or 2). Whether or not the message should be retained.";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_WILL_PAYLOAD_DEFAULT = null;
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_WILL_QOS_CONF = "camel.source.endpoint.willQos";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_WILL_QOS_DOC = "Sets the Last Will and Testament (LWT) for the connection. In the event that this client unexpectedly loses its connection to the server, the server will publish a message to itself using the supplied details. The topic to publish to The byte payload for the message. The quality of service to publish the message at (0, 1 or 2). Whether or not the message should be retained.";
    public static final Integer CAMEL_SOURCE_PAHO_ENDPOINT_WILL_QOS_DEFAULT = null;
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_WILL_RETAINED_CONF = "camel.source.endpoint.willRetained";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_WILL_RETAINED_DOC = "Sets the Last Will and Testament (LWT) for the connection. In the event that this client unexpectedly loses its connection to the server, the server will publish a message to itself using the supplied details. The topic to publish to The byte payload for the message. The quality of service to publish the message at (0, 1 or 2). Whether or not the message should be retained.";
    public static final Boolean CAMEL_SOURCE_PAHO_ENDPOINT_WILL_RETAINED_DEFAULT = false;
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_WILL_TOPIC_CONF = "camel.source.endpoint.willTopic";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_WILL_TOPIC_DOC = "Sets the Last Will and Testament (LWT) for the connection. In the event that this client unexpectedly loses its connection to the server, the server will publish a message to itself using the supplied details. The topic to publish to The byte payload for the message. The quality of service to publish the message at (0, 1 or 2). Whether or not the message should be retained.";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_WILL_TOPIC_DEFAULT = null;
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_PAHO_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.source.endpoint.basicPropertyBinding";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_PAHO_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_CLIENT_CONF = "camel.source.endpoint.client";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_CLIENT_DOC = "To use an existing mqtt client";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_CLIENT_DEFAULT = null;
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_CUSTOM_WEB_SOCKET_HEADERS_CONF = "camel.source.endpoint.customWebSocketHeaders";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_CUSTOM_WEB_SOCKET_HEADERS_DOC = "Sets the Custom WebSocket Headers for the WebSocket Connection.";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_CUSTOM_WEB_SOCKET_HEADERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_EXECUTOR_SERVICE_TIMEOUT_CONF = "camel.source.endpoint.executorServiceTimeout";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_EXECUTOR_SERVICE_TIMEOUT_DOC = "Set the time in seconds that the executor service should wait when terminating before forcefully terminating. It is not recommended to change this value unless you are absolutely sure that you need to.";
    public static final Integer CAMEL_SOURCE_PAHO_ENDPOINT_EXECUTOR_SERVICE_TIMEOUT_DEFAULT = 1;
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_PAHO_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_HTTPS_HOSTNAME_VERIFICATION_ENABLED_CONF = "camel.source.endpoint.httpsHostnameVerificationEnabled";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_HTTPS_HOSTNAME_VERIFICATION_ENABLED_DOC = "Whether SSL HostnameVerifier is enabled or not. The default value is true.";
    public static final Boolean CAMEL_SOURCE_PAHO_ENDPOINT_HTTPS_HOSTNAME_VERIFICATION_ENABLED_DEFAULT = true;
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_PASSWORD_CONF = "camel.source.endpoint.password";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_PASSWORD_DOC = "Password to be used for authentication against the MQTT broker";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_SOCKET_FACTORY_CONF = "camel.source.endpoint.socketFactory";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_SOCKET_FACTORY_DOC = "Sets the SocketFactory to use. This allows an application to apply its own policies around the creation of network sockets. If using an SSL connection, an SSLSocketFactory can be used to supply application-specific security settings.";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_SOCKET_FACTORY_DEFAULT = null;
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_SSL_CLIENT_PROPS_CONF = "camel.source.endpoint.sslClientProps";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_SSL_CLIENT_PROPS_DOC = "Sets the SSL properties for the connection. Note that these properties are only valid if an implementation of the Java Secure Socket Extensions (JSSE) is available. These properties are not used if a custom SocketFactory has been set. The following properties can be used: com.ibm.ssl.protocol One of: SSL, SSLv3, TLS, TLSv1, SSL_TLS. com.ibm.ssl.contextProvider Underlying JSSE provider. For example IBMJSSE2 or SunJSSE com.ibm.ssl.keyStore The name of the file that contains the KeyStore object that you want the KeyManager to use. For example /mydir/etc/key.p12 com.ibm.ssl.keyStorePassword The password for the KeyStore object that you want the KeyManager to use. The password can either be in plain-text, or may be obfuscated using the static method: com.ibm.micro.security.Password.obfuscate(char password). This obfuscates the password using a simple and insecure XOR and Base64 encoding mechanism. Note that this is only a simple scrambler to obfuscate clear-text passwords. com.ibm.ssl.keyStoreType Type of key store, for example PKCS12, JKS, or JCEKS. com.ibm.ssl.keyStoreProvider Key store provider, for example IBMJCE or IBMJCEFIPS. com.ibm.ssl.trustStore The name of the file that contains the KeyStore object that you want the TrustManager to use. com.ibm.ssl.trustStorePassword The password for the TrustStore object that you want the TrustManager to use. The password can either be in plain-text, or may be obfuscated using the static method: com.ibm.micro.security.Password.obfuscate(char password). This obfuscates the password using a simple and insecure XOR and Base64 encoding mechanism. Note that this is only a simple scrambler to obfuscate clear-text passwords. com.ibm.ssl.trustStoreType The type of KeyStore object that you want the default TrustManager to use. Same possible values as keyStoreType. com.ibm.ssl.trustStoreProvider Trust store provider, for example IBMJCE or IBMJCEFIPS. com.ibm.ssl.enabledCipherSuites A list of which ciphers are enabled. Values are dependent on the provider, for example: SSL_RSA_WITH_AES_128_CBC_SHA;SSL_RSA_WITH_3DES_EDE_CBC_SHA. com.ibm.ssl.keyManager Sets the algorithm that will be used to instantiate a KeyManagerFactory object instead of using the default algorithm available in the platform. Example values: IbmX509 or IBMJ9X509. com.ibm.ssl.trustManager Sets the algorithm that will be used to instantiate a TrustManagerFactory object instead of using the default algorithm available in the platform. Example values: PKIX or IBMJ9X509.";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_SSL_CLIENT_PROPS_DEFAULT = null;
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_SSL_HOSTNAME_VERIFIER_CONF = "camel.source.endpoint.sslHostnameVerifier";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_SSL_HOSTNAME_VERIFIER_DOC = "Sets the HostnameVerifier for the SSL connection. Note that it will be used after handshake on a connection and you should do actions by yourself when hostname is verified error. There is no default HostnameVerifier";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_SSL_HOSTNAME_VERIFIER_DEFAULT = null;
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_USER_NAME_CONF = "camel.source.endpoint.userName";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_USER_NAME_DOC = "Username to be used for authentication against the MQTT broker";
    public static final String CAMEL_SOURCE_PAHO_ENDPOINT_USER_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_PAHO_COMPONENT_BROKER_URL_CONF = "camel.component.paho.brokerUrl";
    public static final String CAMEL_SOURCE_PAHO_COMPONENT_BROKER_URL_DOC = "The URL of the MQTT broker.";
    public static final String CAMEL_SOURCE_PAHO_COMPONENT_BROKER_URL_DEFAULT = null;
    public static final String CAMEL_SOURCE_PAHO_COMPONENT_CONFIGURATION_CONF = "camel.component.paho.configuration";
    public static final String CAMEL_SOURCE_PAHO_COMPONENT_CONFIGURATION_DOC = "To use the shared Paho configuration";
    public static final String CAMEL_SOURCE_PAHO_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SOURCE_PAHO_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.paho.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_PAHO_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_PAHO_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_PAHO_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.paho.basicPropertyBinding";
    public static final String CAMEL_SOURCE_PAHO_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_PAHO_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_PAHO_COMPONENT_CLIENT_CONF = "camel.component.paho.client";
    public static final String CAMEL_SOURCE_PAHO_COMPONENT_CLIENT_DOC = "To use a shared Paho client";
    public static final String CAMEL_SOURCE_PAHO_COMPONENT_CLIENT_DEFAULT = null;

    public CamelPahoSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelPahoSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf(Map<String, String> parsedConfig) {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_PAHO_PATH_TOPIC_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_PAHO_PATH_TOPIC_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_PAHO_PATH_TOPIC_DOC);
        conf.define(CAMEL_SOURCE_PAHO_ENDPOINT_AUTOMATIC_RECONNECT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_PAHO_ENDPOINT_AUTOMATIC_RECONNECT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_ENDPOINT_AUTOMATIC_RECONNECT_DOC);
        conf.define(CAMEL_SOURCE_PAHO_ENDPOINT_BROKER_URL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_PAHO_ENDPOINT_BROKER_URL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_ENDPOINT_BROKER_URL_DOC);
        conf.define(CAMEL_SOURCE_PAHO_ENDPOINT_CLEAN_SESSION_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_PAHO_ENDPOINT_CLEAN_SESSION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_ENDPOINT_CLEAN_SESSION_DOC);
        conf.define(CAMEL_SOURCE_PAHO_ENDPOINT_CLIENT_ID_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_PAHO_ENDPOINT_CLIENT_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_ENDPOINT_CLIENT_ID_DOC);
        conf.define(CAMEL_SOURCE_PAHO_ENDPOINT_CONNECTION_TIMEOUT_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_PAHO_ENDPOINT_CONNECTION_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_ENDPOINT_CONNECTION_TIMEOUT_DOC);
        conf.define(CAMEL_SOURCE_PAHO_ENDPOINT_FILE_PERSISTENCE_DIRECTORY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_PAHO_ENDPOINT_FILE_PERSISTENCE_DIRECTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_ENDPOINT_FILE_PERSISTENCE_DIRECTORY_DOC);
        conf.define(CAMEL_SOURCE_PAHO_ENDPOINT_KEEP_ALIVE_INTERVAL_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_PAHO_ENDPOINT_KEEP_ALIVE_INTERVAL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_ENDPOINT_KEEP_ALIVE_INTERVAL_DOC);
        conf.define(CAMEL_SOURCE_PAHO_ENDPOINT_MAX_INFLIGHT_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_PAHO_ENDPOINT_MAX_INFLIGHT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_ENDPOINT_MAX_INFLIGHT_DOC);
        conf.define(CAMEL_SOURCE_PAHO_ENDPOINT_MAX_RECONNECT_DELAY_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_PAHO_ENDPOINT_MAX_RECONNECT_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_ENDPOINT_MAX_RECONNECT_DELAY_DOC);
        conf.define(CAMEL_SOURCE_PAHO_ENDPOINT_MQTT_VERSION_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_PAHO_ENDPOINT_MQTT_VERSION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_ENDPOINT_MQTT_VERSION_DOC);
        conf.define(CAMEL_SOURCE_PAHO_ENDPOINT_PERSISTENCE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_PAHO_ENDPOINT_PERSISTENCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_ENDPOINT_PERSISTENCE_DOC);
        conf.define(CAMEL_SOURCE_PAHO_ENDPOINT_QOS_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_PAHO_ENDPOINT_QOS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_ENDPOINT_QOS_DOC);
        conf.define(CAMEL_SOURCE_PAHO_ENDPOINT_RETAINED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_PAHO_ENDPOINT_RETAINED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_ENDPOINT_RETAINED_DOC);
        conf.define(CAMEL_SOURCE_PAHO_ENDPOINT_SERVER_URIS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_PAHO_ENDPOINT_SERVER_URIS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_ENDPOINT_SERVER_URIS_DOC);
        conf.define(CAMEL_SOURCE_PAHO_ENDPOINT_WILL_PAYLOAD_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_PAHO_ENDPOINT_WILL_PAYLOAD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_ENDPOINT_WILL_PAYLOAD_DOC);
        conf.define(CAMEL_SOURCE_PAHO_ENDPOINT_WILL_QOS_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_PAHO_ENDPOINT_WILL_QOS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_ENDPOINT_WILL_QOS_DOC);
        conf.define(CAMEL_SOURCE_PAHO_ENDPOINT_WILL_RETAINED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_PAHO_ENDPOINT_WILL_RETAINED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_ENDPOINT_WILL_RETAINED_DOC);
        conf.define(CAMEL_SOURCE_PAHO_ENDPOINT_WILL_TOPIC_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_PAHO_ENDPOINT_WILL_TOPIC_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_ENDPOINT_WILL_TOPIC_DOC);
        conf.define(CAMEL_SOURCE_PAHO_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_PAHO_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_PAHO_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_PAHO_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_PAHO_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_PAHO_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_PAHO_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_PAHO_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_PAHO_ENDPOINT_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_PAHO_ENDPOINT_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_ENDPOINT_CLIENT_DOC);
        conf.define(CAMEL_SOURCE_PAHO_ENDPOINT_CUSTOM_WEB_SOCKET_HEADERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_PAHO_ENDPOINT_CUSTOM_WEB_SOCKET_HEADERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_ENDPOINT_CUSTOM_WEB_SOCKET_HEADERS_DOC);
        conf.define(CAMEL_SOURCE_PAHO_ENDPOINT_EXECUTOR_SERVICE_TIMEOUT_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_PAHO_ENDPOINT_EXECUTOR_SERVICE_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_ENDPOINT_EXECUTOR_SERVICE_TIMEOUT_DOC);
        conf.define(CAMEL_SOURCE_PAHO_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_PAHO_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_PAHO_ENDPOINT_HTTPS_HOSTNAME_VERIFICATION_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_PAHO_ENDPOINT_HTTPS_HOSTNAME_VERIFICATION_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_ENDPOINT_HTTPS_HOSTNAME_VERIFICATION_ENABLED_DOC);
        conf.define(CAMEL_SOURCE_PAHO_ENDPOINT_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_PAHO_ENDPOINT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_ENDPOINT_PASSWORD_DOC);
        conf.define(CAMEL_SOURCE_PAHO_ENDPOINT_SOCKET_FACTORY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_PAHO_ENDPOINT_SOCKET_FACTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_ENDPOINT_SOCKET_FACTORY_DOC);
        conf.define(CAMEL_SOURCE_PAHO_ENDPOINT_SSL_CLIENT_PROPS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_PAHO_ENDPOINT_SSL_CLIENT_PROPS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_ENDPOINT_SSL_CLIENT_PROPS_DOC);
        conf.define(CAMEL_SOURCE_PAHO_ENDPOINT_SSL_HOSTNAME_VERIFIER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_PAHO_ENDPOINT_SSL_HOSTNAME_VERIFIER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_ENDPOINT_SSL_HOSTNAME_VERIFIER_DOC);
        conf.define(CAMEL_SOURCE_PAHO_ENDPOINT_USER_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_PAHO_ENDPOINT_USER_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_ENDPOINT_USER_NAME_DOC);
        conf.define(CAMEL_SOURCE_PAHO_COMPONENT_BROKER_URL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_PAHO_COMPONENT_BROKER_URL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_COMPONENT_BROKER_URL_DOC);
        conf.define(CAMEL_SOURCE_PAHO_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_PAHO_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SOURCE_PAHO_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_PAHO_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_PAHO_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_PAHO_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_PAHO_COMPONENT_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_PAHO_COMPONENT_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PAHO_COMPONENT_CLIENT_DOC);
        return conf;
    }
}