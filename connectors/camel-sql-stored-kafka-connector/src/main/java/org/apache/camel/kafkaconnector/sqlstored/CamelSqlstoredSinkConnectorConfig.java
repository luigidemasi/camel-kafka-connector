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
package org.apache.camel.kafkaconnector.sqlstored;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelSqlstoredSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_SQLSTORED_PATH_TEMPLATE_CONF = "camel.sink.path.template";
    public static final String CAMEL_SINK_SQLSTORED_PATH_TEMPLATE_DOC = "Sets the StoredProcedure template to perform";
    public static final String CAMEL_SINK_SQLSTORED_PATH_TEMPLATE_DEFAULT = null;
    public static final String CAMEL_SINK_SQLSTORED_ENDPOINT_BATCH_CONF = "camel.sink.endpoint.batch";
    public static final String CAMEL_SINK_SQLSTORED_ENDPOINT_BATCH_DOC = "Enables or disables batch mode";
    public static final Boolean CAMEL_SINK_SQLSTORED_ENDPOINT_BATCH_DEFAULT = false;
    public static final String CAMEL_SINK_SQLSTORED_ENDPOINT_DATA_SOURCE_CONF = "camel.sink.endpoint.dataSource";
    public static final String CAMEL_SINK_SQLSTORED_ENDPOINT_DATA_SOURCE_DOC = "Sets the DataSource to use to communicate with the database.";
    public static final String CAMEL_SINK_SQLSTORED_ENDPOINT_DATA_SOURCE_DEFAULT = null;
    public static final String CAMEL_SINK_SQLSTORED_ENDPOINT_FUNCTION_CONF = "camel.sink.endpoint.function";
    public static final String CAMEL_SINK_SQLSTORED_ENDPOINT_FUNCTION_DOC = "Whether this call is for a function.";
    public static final Boolean CAMEL_SINK_SQLSTORED_ENDPOINT_FUNCTION_DEFAULT = false;
    public static final String CAMEL_SINK_SQLSTORED_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_SQLSTORED_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_SQLSTORED_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_SQLSTORED_ENDPOINT_NOOP_CONF = "camel.sink.endpoint.noop";
    public static final String CAMEL_SINK_SQLSTORED_ENDPOINT_NOOP_DOC = "If set, will ignore the results of the template and use the existing IN message as the OUT message for the continuation of processing";
    public static final Boolean CAMEL_SINK_SQLSTORED_ENDPOINT_NOOP_DEFAULT = false;
    public static final String CAMEL_SINK_SQLSTORED_ENDPOINT_OUTPUT_HEADER_CONF = "camel.sink.endpoint.outputHeader";
    public static final String CAMEL_SINK_SQLSTORED_ENDPOINT_OUTPUT_HEADER_DOC = "Store the template result in a header instead of the message body. By default, outputHeader == null and the template result is stored in the message body, any existing content in the message body is discarded. If outputHeader is set, the value is used as the name of the header to store the template result and the original message body is preserved.";
    public static final String CAMEL_SINK_SQLSTORED_ENDPOINT_OUTPUT_HEADER_DEFAULT = null;
    public static final String CAMEL_SINK_SQLSTORED_ENDPOINT_USE_MESSAGE_BODY_FOR_TEMPLATE_CONF = "camel.sink.endpoint.useMessageBodyForTemplate";
    public static final String CAMEL_SINK_SQLSTORED_ENDPOINT_USE_MESSAGE_BODY_FOR_TEMPLATE_DOC = "Whether to use the message body as the template and then headers for parameters. If this option is enabled then the template in the uri is not used.";
    public static final Boolean CAMEL_SINK_SQLSTORED_ENDPOINT_USE_MESSAGE_BODY_FOR_TEMPLATE_DEFAULT = false;
    public static final String CAMEL_SINK_SQLSTORED_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_SQLSTORED_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_SQLSTORED_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_SQLSTORED_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_SQLSTORED_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_SQLSTORED_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_SQLSTORED_COMPONENT_DATA_SOURCE_CONF = "camel.component.sql-stored.dataSource";
    public static final String CAMEL_SINK_SQLSTORED_COMPONENT_DATA_SOURCE_DOC = "Sets the DataSource to use to communicate with the database.";
    public static final String CAMEL_SINK_SQLSTORED_COMPONENT_DATA_SOURCE_DEFAULT = null;
    public static final String CAMEL_SINK_SQLSTORED_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.sql-stored.lazyStartProducer";
    public static final String CAMEL_SINK_SQLSTORED_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_SQLSTORED_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_SQLSTORED_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.sql-stored.basicPropertyBinding";
    public static final String CAMEL_SINK_SQLSTORED_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_SQLSTORED_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;

    public CamelSqlstoredSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelSqlstoredSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf(Map<String, String> parsedConfig) {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_SQLSTORED_PATH_TEMPLATE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SQLSTORED_PATH_TEMPLATE_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_SQLSTORED_PATH_TEMPLATE_DOC);
        conf.define(CAMEL_SINK_SQLSTORED_ENDPOINT_BATCH_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SQLSTORED_ENDPOINT_BATCH_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SQLSTORED_ENDPOINT_BATCH_DOC);
        conf.define(CAMEL_SINK_SQLSTORED_ENDPOINT_DATA_SOURCE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SQLSTORED_ENDPOINT_DATA_SOURCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SQLSTORED_ENDPOINT_DATA_SOURCE_DOC);
        conf.define(CAMEL_SINK_SQLSTORED_ENDPOINT_FUNCTION_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SQLSTORED_ENDPOINT_FUNCTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SQLSTORED_ENDPOINT_FUNCTION_DOC);
        conf.define(CAMEL_SINK_SQLSTORED_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SQLSTORED_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SQLSTORED_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_SQLSTORED_ENDPOINT_NOOP_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SQLSTORED_ENDPOINT_NOOP_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SQLSTORED_ENDPOINT_NOOP_DOC);
        conf.define(CAMEL_SINK_SQLSTORED_ENDPOINT_OUTPUT_HEADER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SQLSTORED_ENDPOINT_OUTPUT_HEADER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SQLSTORED_ENDPOINT_OUTPUT_HEADER_DOC);
        conf.define(CAMEL_SINK_SQLSTORED_ENDPOINT_USE_MESSAGE_BODY_FOR_TEMPLATE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SQLSTORED_ENDPOINT_USE_MESSAGE_BODY_FOR_TEMPLATE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SQLSTORED_ENDPOINT_USE_MESSAGE_BODY_FOR_TEMPLATE_DOC);
        conf.define(CAMEL_SINK_SQLSTORED_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SQLSTORED_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SQLSTORED_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_SQLSTORED_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SQLSTORED_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SQLSTORED_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_SQLSTORED_COMPONENT_DATA_SOURCE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SQLSTORED_COMPONENT_DATA_SOURCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SQLSTORED_COMPONENT_DATA_SOURCE_DOC);
        conf.define(CAMEL_SINK_SQLSTORED_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SQLSTORED_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SQLSTORED_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_SQLSTORED_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SQLSTORED_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SQLSTORED_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        return conf;
    }
}