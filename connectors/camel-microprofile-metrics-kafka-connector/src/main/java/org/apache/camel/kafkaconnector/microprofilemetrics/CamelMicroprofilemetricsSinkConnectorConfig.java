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
package org.apache.camel.kafkaconnector.microprofilemetrics;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelMicroprofilemetricsSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_MICROPROFILEMETRICS_PATH_METRIC_TYPE_CONF = "camel.sink.path.metricType";
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_PATH_METRIC_TYPE_DOC = "Metric type One of: [concurrent gauge] [counter] [gauge] [meter] [histogram] [timer] [simple timer] [invalid]";
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_PATH_METRIC_TYPE_DEFAULT = null;
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_PATH_METRIC_NAME_CONF = "camel.sink.path.metricName";
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_PATH_METRIC_NAME_DOC = "Metric name";
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_PATH_METRIC_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_ACTION_CONF = "camel.sink.endpoint.action";
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_ACTION_DOC = "Action to use when using the timer type";
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_ACTION_DEFAULT = null;
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_COUNTER_INCREMENT_CONF = "camel.sink.endpoint.counterIncrement";
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_COUNTER_INCREMENT_DOC = "Increment value when using the counter type";
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_COUNTER_INCREMENT_DEFAULT = null;
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_DESCRIPTION_CONF = "camel.sink.endpoint.description";
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_DESCRIPTION_DOC = "Metric description";
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_DESCRIPTION_DEFAULT = null;
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_DISPLAY_NAME_CONF = "camel.sink.endpoint.displayName";
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_DISPLAY_NAME_DOC = "Metric display name";
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_DISPLAY_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_GAUGE_DECREMENT_CONF = "camel.sink.endpoint.gaugeDecrement";
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_GAUGE_DECREMENT_DOC = "Decrement metric value when using concurrent gauge type";
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_GAUGE_DECREMENT_DEFAULT = null;
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_GAUGE_INCREMENT_CONF = "camel.sink.endpoint.gaugeIncrement";
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_GAUGE_INCREMENT_DOC = "Increment metric value when using the concurrent gauge type";
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_GAUGE_INCREMENT_DEFAULT = null;
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_GAUGE_VALUE_CONF = "camel.sink.endpoint.gaugeValue";
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_GAUGE_VALUE_DOC = "Decrement metric value when using concurrent gauge type";
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_GAUGE_VALUE_DEFAULT = null;
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_MARK_CONF = "camel.sink.endpoint.mark";
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_MARK_DOC = "Mark value to set when using the meter type";
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_MARK_DEFAULT = null;
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_METRIC_UNIT_CONF = "camel.sink.endpoint.metricUnit";
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_METRIC_UNIT_DOC = "Metric unit. See org.eclipse.microprofile.metrics.MetricUnits";
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_METRIC_UNIT_DEFAULT = null;
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_TAGS_CONF = "camel.sink.endpoint.tags";
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_TAGS_DOC = "Comma delimited list of tags associated with the metric in the format tagName=tagValue";
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_TAGS_DEFAULT = null;
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_VALUE_CONF = "camel.sink.endpoint.value";
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_VALUE_DOC = "Value to set when using the histogram type";
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_VALUE_DEFAULT = null;
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.microprofile-metrics.lazyStartProducer";
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_MICROPROFILEMETRICS_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.microprofile-metrics.basicPropertyBinding";
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_MICROPROFILEMETRICS_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_COMPONENT_METRIC_REGISTRY_CONF = "camel.component.microprofile-metrics.metricRegistry";
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_COMPONENT_METRIC_REGISTRY_DOC = "Use a custom MetricRegistry.";
    public static final String CAMEL_SINK_MICROPROFILEMETRICS_COMPONENT_METRIC_REGISTRY_DEFAULT = null;

    public CamelMicroprofilemetricsSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelMicroprofilemetricsSinkConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf(Map<String, String> parsedConfig) {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_MICROPROFILEMETRICS_PATH_METRIC_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MICROPROFILEMETRICS_PATH_METRIC_TYPE_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_MICROPROFILEMETRICS_PATH_METRIC_TYPE_DOC);
        conf.define(CAMEL_SINK_MICROPROFILEMETRICS_PATH_METRIC_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MICROPROFILEMETRICS_PATH_METRIC_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_MICROPROFILEMETRICS_PATH_METRIC_NAME_DOC);
        conf.define(CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_ACTION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_ACTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_ACTION_DOC);
        conf.define(CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_COUNTER_INCREMENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_COUNTER_INCREMENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_COUNTER_INCREMENT_DOC);
        conf.define(CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_DESCRIPTION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_DESCRIPTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_DESCRIPTION_DOC);
        conf.define(CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_DISPLAY_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_DISPLAY_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_DISPLAY_NAME_DOC);
        conf.define(CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_GAUGE_DECREMENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_GAUGE_DECREMENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_GAUGE_DECREMENT_DOC);
        conf.define(CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_GAUGE_INCREMENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_GAUGE_INCREMENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_GAUGE_INCREMENT_DOC);
        conf.define(CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_GAUGE_VALUE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_GAUGE_VALUE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_GAUGE_VALUE_DOC);
        conf.define(CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_MARK_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_MARK_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_MARK_DOC);
        conf.define(CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_METRIC_UNIT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_METRIC_UNIT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_METRIC_UNIT_DOC);
        conf.define(CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_TAGS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_TAGS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_TAGS_DOC);
        conf.define(CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_VALUE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_VALUE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_VALUE_DOC);
        conf.define(CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MICROPROFILEMETRICS_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_MICROPROFILEMETRICS_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_MICROPROFILEMETRICS_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MICROPROFILEMETRICS_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_MICROPROFILEMETRICS_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_MICROPROFILEMETRICS_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MICROPROFILEMETRICS_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_MICROPROFILEMETRICS_COMPONENT_METRIC_REGISTRY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MICROPROFILEMETRICS_COMPONENT_METRIC_REGISTRY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MICROPROFILEMETRICS_COMPONENT_METRIC_REGISTRY_DOC);
        return conf;
    }
}