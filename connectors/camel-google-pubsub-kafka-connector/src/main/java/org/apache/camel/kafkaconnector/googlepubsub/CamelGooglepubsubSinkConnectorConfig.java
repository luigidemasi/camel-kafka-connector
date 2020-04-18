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
package org.apache.camel.kafkaconnector.googlepubsub;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelGooglepubsubSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_GOOGLEPUBSUB_PATH_PROJECT_ID_CONF = "camel.sink.path.projectId";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_PATH_PROJECT_ID_DOC = "Project Id";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_PATH_PROJECT_ID_DEFAULT = null;
    public static final String CAMEL_SINK_GOOGLEPUBSUB_PATH_DESTINATION_NAME_CONF = "camel.sink.path.destinationName";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_PATH_DESTINATION_NAME_DOC = "Destination Name";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_PATH_DESTINATION_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_ACK_MODE_CONF = "camel.sink.endpoint.ackMode";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_ACK_MODE_DOC = "AUTO = exchange gets ack'ed/nack'ed on completion. NONE = downstream process has to ack/nack explicitly One of: [AUTO] [NONE]";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_ACK_MODE_DEFAULT = "AUTO";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_CONCURRENT_CONSUMERS_CONF = "camel.sink.endpoint.concurrentConsumers";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_CONCURRENT_CONSUMERS_DOC = "The number of parallel streams consuming from the subscription";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_CONCURRENT_CONSUMERS_DEFAULT = "1";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_CONNECTION_FACTORY_CONF = "camel.sink.endpoint.connectionFactory";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_CONNECTION_FACTORY_DOC = "ConnectionFactory to obtain connection to PubSub Service. If non provided the default one will be used";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_CONNECTION_FACTORY_DEFAULT = null;
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_LOGGER_ID_CONF = "camel.sink.endpoint.loggerId";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_LOGGER_ID_DOC = "Logger ID to use when a match to the parent route required";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_LOGGER_ID_DEFAULT = null;
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_MAX_MESSAGES_PER_POLL_CONF = "camel.sink.endpoint.maxMessagesPerPoll";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_MAX_MESSAGES_PER_POLL_DOC = "The max number of messages to receive from the server in a single API call";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_MAX_MESSAGES_PER_POLL_DEFAULT = "1";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_CONNECTION_FACTORY_CONF = "camel.component.google-pubsub.connectionFactory";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_CONNECTION_FACTORY_DOC = "Sets the connection factory to use: provides the ability to explicitly manage connection credentials: - the path to the key file - the Service Account Key / Email pair";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_CONNECTION_FACTORY_DEFAULT = null;
    public static final String CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.google-pubsub.lazyStartProducer";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.google-pubsub.basicPropertyBinding";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;

    public CamelGooglepubsubSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelGooglepubsubSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf(Map<String, String> parsedConfig) {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_GOOGLEPUBSUB_PATH_PROJECT_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GOOGLEPUBSUB_PATH_PROJECT_ID_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_GOOGLEPUBSUB_PATH_PROJECT_ID_DOC);
        conf.define(CAMEL_SINK_GOOGLEPUBSUB_PATH_DESTINATION_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GOOGLEPUBSUB_PATH_DESTINATION_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_GOOGLEPUBSUB_PATH_DESTINATION_NAME_DOC);
        conf.define(CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_ACK_MODE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_ACK_MODE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_ACK_MODE_DOC);
        conf.define(CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_CONCURRENT_CONSUMERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_CONCURRENT_CONSUMERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_CONCURRENT_CONSUMERS_DOC);
        conf.define(CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_CONNECTION_FACTORY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_CONNECTION_FACTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_CONNECTION_FACTORY_DOC);
        conf.define(CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_LOGGER_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_LOGGER_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_LOGGER_ID_DOC);
        conf.define(CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_MAX_MESSAGES_PER_POLL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_MAX_MESSAGES_PER_POLL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_MAX_MESSAGES_PER_POLL_DOC);
        conf.define(CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_CONNECTION_FACTORY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_CONNECTION_FACTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_CONNECTION_FACTORY_DOC);
        conf.define(CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        return conf;
    }
}