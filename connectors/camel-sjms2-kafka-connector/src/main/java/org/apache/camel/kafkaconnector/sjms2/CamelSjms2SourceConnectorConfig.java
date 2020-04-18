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
package org.apache.camel.kafkaconnector.sjms2;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelSjms2SourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_SJMS2_PATH_DESTINATION_TYPE_CONF = "camel.source.path.destinationType";
    public static final String CAMEL_SOURCE_SJMS2_PATH_DESTINATION_TYPE_DOC = "The kind of destination to use One of: [queue] [topic]";
    public static final String CAMEL_SOURCE_SJMS2_PATH_DESTINATION_TYPE_DEFAULT = "queue";
    public static final String CAMEL_SOURCE_SJMS2_PATH_DESTINATION_NAME_CONF = "camel.source.path.destinationName";
    public static final String CAMEL_SOURCE_SJMS2_PATH_DESTINATION_NAME_DOC = "DestinationName is a JMS queue or topic name. By default, the destinationName is interpreted as a queue name.";
    public static final String CAMEL_SOURCE_SJMS2_PATH_DESTINATION_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_ACKNOWLEDGEMENT_MODE_CONF = "camel.source.endpoint.acknowledgementMode";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_ACKNOWLEDGEMENT_MODE_DOC = "The JMS acknowledgement name, which is one of: SESSION_TRANSACTED, CLIENT_ACKNOWLEDGE, AUTO_ACKNOWLEDGE, DUPS_OK_ACKNOWLEDGE One of: [SESSION_TRANSACTED] [CLIENT_ACKNOWLEDGE] [AUTO_ACKNOWLEDGE] [DUPS_OK_ACKNOWLEDGE]";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_ACKNOWLEDGEMENT_MODE_DEFAULT = "AUTO_ACKNOWLEDGE";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_SJMS2_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_CONSUMER_COUNT_CONF = "camel.source.endpoint.consumerCount";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_CONSUMER_COUNT_DOC = "Sets the number of consumer listeners used for this endpoint.";
    public static final Integer CAMEL_SOURCE_SJMS2_ENDPOINT_CONSUMER_COUNT_DEFAULT = 1;
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_DURABLE_CONF = "camel.source.endpoint.durable";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_DURABLE_DOC = "Sets topic consumer to durable.";
    public static final Boolean CAMEL_SOURCE_SJMS2_ENDPOINT_DURABLE_DEFAULT = false;
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_DURABLE_SUBSCRIPTION_ID_CONF = "camel.source.endpoint.durableSubscriptionId";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_DURABLE_SUBSCRIPTION_ID_DOC = "Sets the durable subscription Id required for durable topics.";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_DURABLE_SUBSCRIPTION_ID_DEFAULT = null;
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_RECONNECT_BACK_OFF_CONF = "camel.source.endpoint.reconnectBackOff";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_RECONNECT_BACK_OFF_DOC = "Backoff in millis on consumer pool reconnection attempts";
    public static final Long CAMEL_SOURCE_SJMS2_ENDPOINT_RECONNECT_BACK_OFF_DEFAULT = 5000L;
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_RECONNECT_ON_ERROR_CONF = "camel.source.endpoint.reconnectOnError";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_RECONNECT_ON_ERROR_DOC = "Try to apply reconnection logic on consumer pool";
    public static final Boolean CAMEL_SOURCE_SJMS2_ENDPOINT_RECONNECT_ON_ERROR_DEFAULT = true;
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_SHARED_CONF = "camel.source.endpoint.shared";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_SHARED_DOC = "Sets the consumer to shared.";
    public static final Boolean CAMEL_SOURCE_SJMS2_ENDPOINT_SHARED_DEFAULT = false;
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_SUBSCRIPTION_ID_CONF = "camel.source.endpoint.subscriptionId";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_SUBSCRIPTION_ID_DOC = "Sets the subscription Id, required for durable or shared topics.";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_SUBSCRIPTION_ID_DEFAULT = null;
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_SJMS2_ENDPOINT_SYNCHRONOUS_DEFAULT = true;
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_MESSAGE_SELECTOR_CONF = "camel.source.endpoint.messageSelector";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_MESSAGE_SELECTOR_DOC = "Sets the JMS Message selector syntax.";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_MESSAGE_SELECTOR_DEFAULT = null;
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_ASYNC_START_LISTENER_CONF = "camel.source.endpoint.asyncStartListener";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_ASYNC_START_LISTENER_DOC = "Whether to startup the consumer message listener asynchronously, when starting a route. For example if a JmsConsumer cannot get a connection to a remote JMS broker, then it may block while retrying and/or failover. This will cause Camel to block while starting routes. By setting this option to true, you will let routes startup, while the JmsConsumer connects to the JMS broker using a dedicated thread in asynchronous mode. If this option is used, then beware that if the connection could not be established, then an exception is logged at WARN level, and the consumer will not be able to receive messages; You can then restart the route to retry.";
    public static final Boolean CAMEL_SOURCE_SJMS2_ENDPOINT_ASYNC_START_LISTENER_DEFAULT = false;
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_ASYNC_STOP_LISTENER_CONF = "camel.source.endpoint.asyncStopListener";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_ASYNC_STOP_LISTENER_DOC = "Whether to stop the consumer message listener asynchronously, when stopping a route.";
    public static final Boolean CAMEL_SOURCE_SJMS2_ENDPOINT_ASYNC_STOP_LISTENER_DEFAULT = false;
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.source.endpoint.basicPropertyBinding";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_SJMS2_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_CONNECTION_COUNT_CONF = "camel.source.endpoint.connectionCount";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_CONNECTION_COUNT_DOC = "The maximum number of connections available to this endpoint";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_CONNECTION_COUNT_DEFAULT = null;
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_CONNECTION_FACTORY_CONF = "camel.source.endpoint.connectionFactory";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_CONNECTION_FACTORY_DOC = "Initializes the connectionFactory for the endpoint, which takes precedence over the component's connectionFactory, if any";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_CONNECTION_FACTORY_DEFAULT = null;
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_CONNECTION_RESOURCE_CONF = "camel.source.endpoint.connectionResource";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_CONNECTION_RESOURCE_DOC = "Initializes the connectionResource for the endpoint, which takes precedence over the component's connectionResource, if any";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_CONNECTION_RESOURCE_DEFAULT = null;
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_DESTINATION_CREATION_STRATEGY_CONF = "camel.source.endpoint.destinationCreationStrategy";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_DESTINATION_CREATION_STRATEGY_DOC = "To use a custom DestinationCreationStrategy.";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_DESTINATION_CREATION_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_EXCEPTION_LISTENER_CONF = "camel.source.endpoint.exceptionListener";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_EXCEPTION_LISTENER_DOC = "Specifies the JMS Exception Listener that is to be notified of any underlying JMS exceptions.";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_EXCEPTION_LISTENER_DEFAULT = null;
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_HEADER_FILTER_STRATEGY_CONF = "camel.source.endpoint.headerFilterStrategy";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_HEADER_FILTER_STRATEGY_DOC = "To use a custom HeaderFilterStrategy to filter header to and from Camel message.";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_HEADER_FILTER_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_INCLUDE_ALL_JMSXPROPERTIES_CONF = "camel.source.endpoint.includeAllJMSXProperties";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_INCLUDE_ALL_JMSXPROPERTIES_DOC = "Whether to include all JMSXxxx properties when mapping from JMS to Camel Message. Setting this to true will include properties such as JMSXAppID, and JMSXUserID etc. Note: If you are using a custom headerFilterStrategy then this option does not apply.";
    public static final Boolean CAMEL_SOURCE_SJMS2_ENDPOINT_INCLUDE_ALL_JMSXPROPERTIES_DEFAULT = false;
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_JMS_KEY_FORMAT_STRATEGY_CONF = "camel.source.endpoint.jmsKeyFormatStrategy";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_JMS_KEY_FORMAT_STRATEGY_DOC = "Pluggable strategy for encoding and decoding JMS keys so they can be compliant with the JMS specification. Camel provides two implementations out of the box: default and passthrough. The default strategy will safely marshal dots and hyphens (. and -). The passthrough strategy leaves the key as is. Can be used for JMS brokers which do not care whether JMS header keys contain illegal characters. You can provide your own implementation of the org.apache.camel.component.jms.JmsKeyFormatStrategy and refer to it using the # notation.";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_JMS_KEY_FORMAT_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_MAP_JMS_MESSAGE_CONF = "camel.source.endpoint.mapJmsMessage";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_MAP_JMS_MESSAGE_DOC = "Specifies whether Camel should auto map the received JMS message to a suited payload type, such as javax.jms.TextMessage to a String etc. See section about how mapping works below for more details.";
    public static final Boolean CAMEL_SOURCE_SJMS2_ENDPOINT_MAP_JMS_MESSAGE_DEFAULT = true;
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_MESSAGE_CREATED_STRATEGY_CONF = "camel.source.endpoint.messageCreatedStrategy";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_MESSAGE_CREATED_STRATEGY_DOC = "To use the given MessageCreatedStrategy which are invoked when Camel creates new instances of javax.jms.Message objects when Camel is sending a JMS message.";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_MESSAGE_CREATED_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_ERROR_HANDLER_LOGGING_LEVEL_CONF = "camel.source.endpoint.errorHandlerLoggingLevel";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_ERROR_HANDLER_LOGGING_LEVEL_DOC = "Allows to configure the default errorHandler logging level for logging uncaught exceptions. One of: [TRACE] [DEBUG] [INFO] [WARN] [ERROR] [OFF]";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_ERROR_HANDLER_LOGGING_LEVEL_DEFAULT = "WARN";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_ERROR_HANDLER_LOG_STACK_TRACE_CONF = "camel.source.endpoint.errorHandlerLogStackTrace";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_ERROR_HANDLER_LOG_STACK_TRACE_DOC = "Allows to control whether stacktraces should be logged or not, by the default errorHandler.";
    public static final Boolean CAMEL_SOURCE_SJMS2_ENDPOINT_ERROR_HANDLER_LOG_STACK_TRACE_DEFAULT = true;
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_TRANSACTED_CONF = "camel.source.endpoint.transacted";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_TRANSACTED_DOC = "Specifies whether to use transacted mode";
    public static final Boolean CAMEL_SOURCE_SJMS2_ENDPOINT_TRANSACTED_DEFAULT = false;
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_TRANSACTION_BATCH_COUNT_CONF = "camel.source.endpoint.transactionBatchCount";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_TRANSACTION_BATCH_COUNT_DOC = "If transacted sets the number of messages to process before committing a transaction.";
    public static final Integer CAMEL_SOURCE_SJMS2_ENDPOINT_TRANSACTION_BATCH_COUNT_DEFAULT = -1;
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_TRANSACTION_BATCH_TIMEOUT_CONF = "camel.source.endpoint.transactionBatchTimeout";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_TRANSACTION_BATCH_TIMEOUT_DOC = "Sets timeout (in millis) for batch transactions, the value should be 1000 or higher.";
    public static final Long CAMEL_SOURCE_SJMS2_ENDPOINT_TRANSACTION_BATCH_TIMEOUT_DEFAULT = 5000L;
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_TRANSACTION_COMMIT_STRATEGY_CONF = "camel.source.endpoint.transactionCommitStrategy";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_TRANSACTION_COMMIT_STRATEGY_DOC = "Sets the commit strategy.";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_TRANSACTION_COMMIT_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_SHARED_JMSSESSION_CONF = "camel.source.endpoint.sharedJMSSession";
    public static final String CAMEL_SOURCE_SJMS2_ENDPOINT_SHARED_JMSSESSION_DOC = "Specifies whether to share JMS session with other SJMS endpoints. Turn this off if your route is accessing to multiple JMS providers. If you need transaction against multiple JMS providers, use jms component to leverage XA transaction.";
    public static final Boolean CAMEL_SOURCE_SJMS2_ENDPOINT_SHARED_JMSSESSION_DEFAULT = true;
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_COUNT_CONF = "camel.component.sjms2.connectionCount";
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_COUNT_DOC = "The maximum number of connections available to endpoints started under this component";
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_COUNT_DEFAULT = "1";
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.sjms2.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_SJMS2_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_RECONNECT_BACK_OFF_CONF = "camel.component.sjms2.reconnectBackOff";
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_RECONNECT_BACK_OFF_DOC = "Backoff in millis on consumer pool reconnection attempts";
    public static final Long CAMEL_SOURCE_SJMS2_COMPONENT_RECONNECT_BACK_OFF_DEFAULT = 5000L;
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_RECONNECT_ON_ERROR_CONF = "camel.component.sjms2.reconnectOnError";
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_RECONNECT_ON_ERROR_DOC = "Try to apply reconnection logic on consumer pool";
    public static final Boolean CAMEL_SOURCE_SJMS2_COMPONENT_RECONNECT_ON_ERROR_DEFAULT = true;
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.sjms2.basicPropertyBinding";
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_SJMS2_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_CLIENT_ID_CONF = "camel.component.sjms2.connectionClientId";
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_CLIENT_ID_DOC = "The client ID to use when creating javax.jms.Connection when using the default org.apache.camel.component.sjms.jms.ConnectionFactoryResource.";
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_CLIENT_ID_DEFAULT = null;
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_FACTORY_CONF = "camel.component.sjms2.connectionFactory";
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_FACTORY_DOC = "A ConnectionFactory is required to enable the SjmsComponent. It can be set directly or set set as part of a ConnectionResource.";
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_FACTORY_DEFAULT = null;
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_MAX_WAIT_CONF = "camel.component.sjms2.connectionMaxWait";
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_MAX_WAIT_DOC = "The max wait time in millis to block and wait on free connection when the pool is exhausted when using the default org.apache.camel.component.sjms.jms.ConnectionFactoryResource.";
    public static final Long CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_MAX_WAIT_DEFAULT = 5000L;
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_RESOURCE_CONF = "camel.component.sjms2.connectionResource";
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_RESOURCE_DOC = "A ConnectionResource is an interface that allows for customization and container control of the ConnectionFactory. See Plugable Connection Resource Management for further details.";
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_RESOURCE_DEFAULT = null;
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_TEST_ON_BORROW_CONF = "camel.component.sjms2.connectionTestOnBorrow";
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_TEST_ON_BORROW_DOC = "When using the default org.apache.camel.component.sjms.jms.ConnectionFactoryResource then should each javax.jms.Connection be tested (calling start) before returned from the pool.";
    public static final Boolean CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_TEST_ON_BORROW_DEFAULT = true;
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_DESTINATION_CREATION_STRATEGY_CONF = "camel.component.sjms2.destinationCreationStrategy";
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_DESTINATION_CREATION_STRATEGY_DOC = "To use a custom DestinationCreationStrategy.";
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_DESTINATION_CREATION_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_JMS_KEY_FORMAT_STRATEGY_CONF = "camel.component.sjms2.jmsKeyFormatStrategy";
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_JMS_KEY_FORMAT_STRATEGY_DOC = "Pluggable strategy for encoding and decoding JMS keys so they can be compliant with the JMS specification. Camel provides one implementation out of the box: default. The default strategy will safely marshal dots and hyphens (. and -). Can be used for JMS brokers which do not care whether JMS header keys contain illegal characters. You can provide your own implementation of the org.apache.camel.component.jms.JmsKeyFormatStrategy and refer to it using the # notation.";
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_JMS_KEY_FORMAT_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_MESSAGE_CREATED_STRATEGY_CONF = "camel.component.sjms2.messageCreatedStrategy";
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_MESSAGE_CREATED_STRATEGY_DOC = "To use the given MessageCreatedStrategy which are invoked when Camel creates new instances of javax.jms.Message objects when Camel is sending a JMS message.";
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_MESSAGE_CREATED_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_TIMED_TASK_MANAGER_CONF = "camel.component.sjms2.timedTaskManager";
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_TIMED_TASK_MANAGER_DOC = "To use a custom TimedTaskManager";
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_TIMED_TASK_MANAGER_DEFAULT = null;
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_HEADER_FILTER_STRATEGY_CONF = "camel.component.sjms2.headerFilterStrategy";
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_HEADER_FILTER_STRATEGY_DOC = "To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter header to and from Camel message.";
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_HEADER_FILTER_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_PASSWORD_CONF = "camel.component.sjms2.connectionPassword";
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_PASSWORD_DOC = "The password to use when creating javax.jms.Connection when using the default org.apache.camel.component.sjms.jms.ConnectionFactoryResource.";
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_USERNAME_CONF = "camel.component.sjms2.connectionUsername";
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_USERNAME_DOC = "The username to use when creating javax.jms.Connection when using the default org.apache.camel.component.sjms.jms.ConnectionFactoryResource.";
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_USERNAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_TRANSACTION_COMMIT_STRATEGY_CONF = "camel.component.sjms2.transactionCommitStrategy";
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_TRANSACTION_COMMIT_STRATEGY_DOC = "To configure which kind of commit strategy to use. Camel provides two implementations out of the box, default and batch.";
    public static final String CAMEL_SOURCE_SJMS2_COMPONENT_TRANSACTION_COMMIT_STRATEGY_DEFAULT = null;

    public CamelSjms2SourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelSjms2SourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf(Map<String, String> parsedConfig) {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_SJMS2_PATH_DESTINATION_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMS2_PATH_DESTINATION_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_PATH_DESTINATION_TYPE_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_PATH_DESTINATION_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMS2_PATH_DESTINATION_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_SJMS2_PATH_DESTINATION_NAME_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_ENDPOINT_ACKNOWLEDGEMENT_MODE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMS2_ENDPOINT_ACKNOWLEDGEMENT_MODE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_ENDPOINT_ACKNOWLEDGEMENT_MODE_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SJMS2_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_ENDPOINT_CONSUMER_COUNT_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_SJMS2_ENDPOINT_CONSUMER_COUNT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_ENDPOINT_CONSUMER_COUNT_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_ENDPOINT_DURABLE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SJMS2_ENDPOINT_DURABLE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_ENDPOINT_DURABLE_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_ENDPOINT_DURABLE_SUBSCRIPTION_ID_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMS2_ENDPOINT_DURABLE_SUBSCRIPTION_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_ENDPOINT_DURABLE_SUBSCRIPTION_ID_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_ENDPOINT_RECONNECT_BACK_OFF_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_SJMS2_ENDPOINT_RECONNECT_BACK_OFF_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_ENDPOINT_RECONNECT_BACK_OFF_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_ENDPOINT_RECONNECT_ON_ERROR_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SJMS2_ENDPOINT_RECONNECT_ON_ERROR_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_ENDPOINT_RECONNECT_ON_ERROR_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_ENDPOINT_SHARED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SJMS2_ENDPOINT_SHARED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_ENDPOINT_SHARED_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_ENDPOINT_SUBSCRIPTION_ID_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMS2_ENDPOINT_SUBSCRIPTION_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_ENDPOINT_SUBSCRIPTION_ID_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SJMS2_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMS2_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMS2_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_ENDPOINT_MESSAGE_SELECTOR_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMS2_ENDPOINT_MESSAGE_SELECTOR_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_ENDPOINT_MESSAGE_SELECTOR_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_ENDPOINT_ASYNC_START_LISTENER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SJMS2_ENDPOINT_ASYNC_START_LISTENER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_ENDPOINT_ASYNC_START_LISTENER_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_ENDPOINT_ASYNC_STOP_LISTENER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SJMS2_ENDPOINT_ASYNC_STOP_LISTENER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_ENDPOINT_ASYNC_STOP_LISTENER_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SJMS2_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_ENDPOINT_CONNECTION_COUNT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMS2_ENDPOINT_CONNECTION_COUNT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_ENDPOINT_CONNECTION_COUNT_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_ENDPOINT_CONNECTION_FACTORY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMS2_ENDPOINT_CONNECTION_FACTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_ENDPOINT_CONNECTION_FACTORY_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_ENDPOINT_CONNECTION_RESOURCE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMS2_ENDPOINT_CONNECTION_RESOURCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_ENDPOINT_CONNECTION_RESOURCE_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_ENDPOINT_DESTINATION_CREATION_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMS2_ENDPOINT_DESTINATION_CREATION_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_ENDPOINT_DESTINATION_CREATION_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_ENDPOINT_EXCEPTION_LISTENER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMS2_ENDPOINT_EXCEPTION_LISTENER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_ENDPOINT_EXCEPTION_LISTENER_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_ENDPOINT_HEADER_FILTER_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMS2_ENDPOINT_HEADER_FILTER_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_ENDPOINT_HEADER_FILTER_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_ENDPOINT_INCLUDE_ALL_JMSXPROPERTIES_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SJMS2_ENDPOINT_INCLUDE_ALL_JMSXPROPERTIES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_ENDPOINT_INCLUDE_ALL_JMSXPROPERTIES_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_ENDPOINT_JMS_KEY_FORMAT_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMS2_ENDPOINT_JMS_KEY_FORMAT_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_ENDPOINT_JMS_KEY_FORMAT_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_ENDPOINT_MAP_JMS_MESSAGE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SJMS2_ENDPOINT_MAP_JMS_MESSAGE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_ENDPOINT_MAP_JMS_MESSAGE_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_ENDPOINT_MESSAGE_CREATED_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMS2_ENDPOINT_MESSAGE_CREATED_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_ENDPOINT_MESSAGE_CREATED_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_ENDPOINT_ERROR_HANDLER_LOGGING_LEVEL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMS2_ENDPOINT_ERROR_HANDLER_LOGGING_LEVEL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_ENDPOINT_ERROR_HANDLER_LOGGING_LEVEL_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_ENDPOINT_ERROR_HANDLER_LOG_STACK_TRACE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SJMS2_ENDPOINT_ERROR_HANDLER_LOG_STACK_TRACE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_ENDPOINT_ERROR_HANDLER_LOG_STACK_TRACE_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_ENDPOINT_TRANSACTED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SJMS2_ENDPOINT_TRANSACTED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_ENDPOINT_TRANSACTED_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_ENDPOINT_TRANSACTION_BATCH_COUNT_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_SJMS2_ENDPOINT_TRANSACTION_BATCH_COUNT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_ENDPOINT_TRANSACTION_BATCH_COUNT_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_ENDPOINT_TRANSACTION_BATCH_TIMEOUT_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_SJMS2_ENDPOINT_TRANSACTION_BATCH_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_ENDPOINT_TRANSACTION_BATCH_TIMEOUT_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_ENDPOINT_TRANSACTION_COMMIT_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMS2_ENDPOINT_TRANSACTION_COMMIT_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_ENDPOINT_TRANSACTION_COMMIT_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_ENDPOINT_SHARED_JMSSESSION_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SJMS2_ENDPOINT_SHARED_JMSSESSION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_ENDPOINT_SHARED_JMSSESSION_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_COUNT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_COUNT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_COUNT_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SJMS2_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_COMPONENT_RECONNECT_BACK_OFF_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_SJMS2_COMPONENT_RECONNECT_BACK_OFF_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_COMPONENT_RECONNECT_BACK_OFF_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_COMPONENT_RECONNECT_ON_ERROR_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SJMS2_COMPONENT_RECONNECT_ON_ERROR_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_COMPONENT_RECONNECT_ON_ERROR_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SJMS2_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_CLIENT_ID_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_CLIENT_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_CLIENT_ID_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_FACTORY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_FACTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_FACTORY_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_MAX_WAIT_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_MAX_WAIT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_MAX_WAIT_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_RESOURCE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_RESOURCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_RESOURCE_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_TEST_ON_BORROW_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_TEST_ON_BORROW_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_TEST_ON_BORROW_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_COMPONENT_DESTINATION_CREATION_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMS2_COMPONENT_DESTINATION_CREATION_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_COMPONENT_DESTINATION_CREATION_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_COMPONENT_JMS_KEY_FORMAT_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMS2_COMPONENT_JMS_KEY_FORMAT_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_COMPONENT_JMS_KEY_FORMAT_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_COMPONENT_MESSAGE_CREATED_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMS2_COMPONENT_MESSAGE_CREATED_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_COMPONENT_MESSAGE_CREATED_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_COMPONENT_TIMED_TASK_MANAGER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMS2_COMPONENT_TIMED_TASK_MANAGER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_COMPONENT_TIMED_TASK_MANAGER_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_COMPONENT_HEADER_FILTER_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMS2_COMPONENT_HEADER_FILTER_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_COMPONENT_HEADER_FILTER_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_PASSWORD_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_USERNAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_USERNAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_COMPONENT_CONNECTION_USERNAME_DOC);
        conf.define(CAMEL_SOURCE_SJMS2_COMPONENT_TRANSACTION_COMMIT_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMS2_COMPONENT_TRANSACTION_COMMIT_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMS2_COMPONENT_TRANSACTION_COMMIT_STRATEGY_DOC);
        return conf;
    }
}