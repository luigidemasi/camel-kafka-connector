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
package org.apache.camel.kafkaconnector.stream;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelStreamSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_STREAM_PATH_KIND_CONF = "camel.source.path.kind";
    public static final String CAMEL_SOURCE_STREAM_PATH_KIND_DOC = "Kind of stream to use such as System.in or System.out. One of: [in] [out] [err] [header] [file]";
    public static final String CAMEL_SOURCE_STREAM_PATH_KIND_DEFAULT = null;
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_ENCODING_CONF = "camel.source.endpoint.encoding";
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_ENCODING_DOC = "You can configure the encoding (is a charset name) to use text-based streams (for example, message body is a String object). If not provided, Camel uses the JVM default Charset.";
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_ENCODING_DEFAULT = null;
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_FILE_NAME_CONF = "camel.source.endpoint.fileName";
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_FILE_NAME_DOC = "When using the stream:file URI format, this option specifies the filename to stream to/from.";
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_FILE_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_STREAM_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_FILE_WATCHER_CONF = "camel.source.endpoint.fileWatcher";
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_FILE_WATCHER_DOC = "To use JVM file watcher to listen for file change events to support re-loading files that may be overwritten, somewhat like tail --retry";
    public static final Boolean CAMEL_SOURCE_STREAM_ENDPOINT_FILE_WATCHER_DEFAULT = false;
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_GROUP_LINES_CONF = "camel.source.endpoint.groupLines";
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_GROUP_LINES_DOC = "To group X number of lines in the consumer. For example to group 10 lines and therefore only spit out an Exchange with 10 lines, instead of 1 Exchange per line.";
    public static final Integer CAMEL_SOURCE_STREAM_ENDPOINT_GROUP_LINES_DEFAULT = null;
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_GROUP_STRATEGY_CONF = "camel.source.endpoint.groupStrategy";
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_GROUP_STRATEGY_DOC = "Allows to use a custom GroupStrategy to control how to group lines.";
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_GROUP_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_INITIAL_PROMPT_DELAY_CONF = "camel.source.endpoint.initialPromptDelay";
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_INITIAL_PROMPT_DELAY_DOC = "Initial delay in milliseconds before showing the message prompt. This delay occurs only once. Can be used during system startup to avoid message prompts being written while other logging is done to the system out.";
    public static final Long CAMEL_SOURCE_STREAM_ENDPOINT_INITIAL_PROMPT_DELAY_DEFAULT = 2000L;
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_PROMPT_DELAY_CONF = "camel.source.endpoint.promptDelay";
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_PROMPT_DELAY_DOC = "Optional delay in milliseconds before showing the message prompt.";
    public static final Long CAMEL_SOURCE_STREAM_ENDPOINT_PROMPT_DELAY_DEFAULT = null;
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_PROMPT_MESSAGE_CONF = "camel.source.endpoint.promptMessage";
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_PROMPT_MESSAGE_DOC = "Message prompt to use when reading from stream:in; for example, you could set this to Enter a command:";
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_PROMPT_MESSAGE_DEFAULT = null;
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_RETRY_CONF = "camel.source.endpoint.retry";
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_RETRY_DOC = "Will retry opening the stream if it's overwritten, somewhat like tail --retry If reading from files then you should also enable the fileWatcher option, to make it work reliable.";
    public static final Boolean CAMEL_SOURCE_STREAM_ENDPOINT_RETRY_DEFAULT = false;
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_SCAN_STREAM_CONF = "camel.source.endpoint.scanStream";
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_SCAN_STREAM_DOC = "To be used for continuously reading a stream such as the unix tail command.";
    public static final Boolean CAMEL_SOURCE_STREAM_ENDPOINT_SCAN_STREAM_DEFAULT = false;
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_SCAN_STREAM_DELAY_CONF = "camel.source.endpoint.scanStreamDelay";
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_SCAN_STREAM_DELAY_DOC = "Delay in milliseconds between read attempts when using scanStream.";
    public static final Long CAMEL_SOURCE_STREAM_ENDPOINT_SCAN_STREAM_DELAY_DEFAULT = null;
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.source.endpoint.basicPropertyBinding";
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_STREAM_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_READ_TIMEOUT_CONF = "camel.source.endpoint.readTimeout";
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_READ_TIMEOUT_DOC = "Sets the read timeout to a specified timeout, in milliseconds. A non-zero value specifies the timeout when reading from Input stream when a connection is established to a resource. If the timeout expires before there is data available for read, a java.net.SocketTimeoutException is raised. A timeout of zero is interpreted as an infinite timeout.";
    public static final Integer CAMEL_SOURCE_STREAM_ENDPOINT_READ_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_STREAM_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_STREAM_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_STREAM_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.stream.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_STREAM_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_STREAM_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_STREAM_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.stream.basicPropertyBinding";
    public static final String CAMEL_SOURCE_STREAM_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_STREAM_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;

    public CamelStreamSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelStreamSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf(Map<String, String> parsedConfig) {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_STREAM_PATH_KIND_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_STREAM_PATH_KIND_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_STREAM_PATH_KIND_DOC);
        conf.define(CAMEL_SOURCE_STREAM_ENDPOINT_ENCODING_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_STREAM_ENDPOINT_ENCODING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STREAM_ENDPOINT_ENCODING_DOC);
        conf.define(CAMEL_SOURCE_STREAM_ENDPOINT_FILE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_STREAM_ENDPOINT_FILE_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STREAM_ENDPOINT_FILE_NAME_DOC);
        conf.define(CAMEL_SOURCE_STREAM_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_STREAM_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STREAM_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_STREAM_ENDPOINT_FILE_WATCHER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_STREAM_ENDPOINT_FILE_WATCHER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STREAM_ENDPOINT_FILE_WATCHER_DOC);
        conf.define(CAMEL_SOURCE_STREAM_ENDPOINT_GROUP_LINES_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_STREAM_ENDPOINT_GROUP_LINES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STREAM_ENDPOINT_GROUP_LINES_DOC);
        conf.define(CAMEL_SOURCE_STREAM_ENDPOINT_GROUP_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_STREAM_ENDPOINT_GROUP_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STREAM_ENDPOINT_GROUP_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_STREAM_ENDPOINT_INITIAL_PROMPT_DELAY_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_STREAM_ENDPOINT_INITIAL_PROMPT_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STREAM_ENDPOINT_INITIAL_PROMPT_DELAY_DOC);
        conf.define(CAMEL_SOURCE_STREAM_ENDPOINT_PROMPT_DELAY_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_STREAM_ENDPOINT_PROMPT_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STREAM_ENDPOINT_PROMPT_DELAY_DOC);
        conf.define(CAMEL_SOURCE_STREAM_ENDPOINT_PROMPT_MESSAGE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_STREAM_ENDPOINT_PROMPT_MESSAGE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STREAM_ENDPOINT_PROMPT_MESSAGE_DOC);
        conf.define(CAMEL_SOURCE_STREAM_ENDPOINT_RETRY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_STREAM_ENDPOINT_RETRY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STREAM_ENDPOINT_RETRY_DOC);
        conf.define(CAMEL_SOURCE_STREAM_ENDPOINT_SCAN_STREAM_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_STREAM_ENDPOINT_SCAN_STREAM_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STREAM_ENDPOINT_SCAN_STREAM_DOC);
        conf.define(CAMEL_SOURCE_STREAM_ENDPOINT_SCAN_STREAM_DELAY_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_STREAM_ENDPOINT_SCAN_STREAM_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STREAM_ENDPOINT_SCAN_STREAM_DELAY_DOC);
        conf.define(CAMEL_SOURCE_STREAM_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_STREAM_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STREAM_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_STREAM_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_STREAM_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STREAM_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_STREAM_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_STREAM_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STREAM_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_STREAM_ENDPOINT_READ_TIMEOUT_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_STREAM_ENDPOINT_READ_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STREAM_ENDPOINT_READ_TIMEOUT_DOC);
        conf.define(CAMEL_SOURCE_STREAM_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_STREAM_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STREAM_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_STREAM_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_STREAM_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STREAM_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_STREAM_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_STREAM_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STREAM_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        return conf;
    }
}