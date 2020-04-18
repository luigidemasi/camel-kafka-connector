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
package org.apache.camel.kafkaconnector.jcache;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelJcacheSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_JCACHE_PATH_CACHE_NAME_CONF = "camel.sink.path.cacheName";
    public static final String CAMEL_SINK_JCACHE_PATH_CACHE_NAME_DOC = "The name of the cache";
    public static final String CAMEL_SINK_JCACHE_PATH_CACHE_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_CACHE_CONFIGURATION_CONF = "camel.sink.endpoint.cacheConfiguration";
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_CACHE_CONFIGURATION_DOC = "A Configuration for the Cache";
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_CACHE_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_CACHE_CONFIGURATION_PROPERTIES_CONF = "camel.sink.endpoint.cacheConfigurationProperties";
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_CACHE_CONFIGURATION_PROPERTIES_DOC = "The Properties for the javax.cache.spi.CachingProvider to create the CacheManager";
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_CACHE_CONFIGURATION_PROPERTIES_DEFAULT = null;
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_CACHING_PROVIDER_CONF = "camel.sink.endpoint.cachingProvider";
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_CACHING_PROVIDER_DOC = "The fully qualified class name of the javax.cache.spi.CachingProvider";
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_CACHING_PROVIDER_DEFAULT = null;
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_CONFIGURATION_URI_CONF = "camel.sink.endpoint.configurationUri";
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_CONFIGURATION_URI_DOC = "An implementation specific URI for the CacheManager";
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_CONFIGURATION_URI_DEFAULT = null;
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_MANAGEMENT_ENABLED_CONF = "camel.sink.endpoint.managementEnabled";
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_MANAGEMENT_ENABLED_DOC = "Whether management gathering is enabled";
    public static final Boolean CAMEL_SINK_JCACHE_ENDPOINT_MANAGEMENT_ENABLED_DEFAULT = false;
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_READ_THROUGH_CONF = "camel.sink.endpoint.readThrough";
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_READ_THROUGH_DOC = "If read-through caching should be used";
    public static final Boolean CAMEL_SINK_JCACHE_ENDPOINT_READ_THROUGH_DEFAULT = false;
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_STATISTICS_ENABLED_CONF = "camel.sink.endpoint.statisticsEnabled";
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_STATISTICS_ENABLED_DOC = "Whether statistics gathering is enabled";
    public static final Boolean CAMEL_SINK_JCACHE_ENDPOINT_STATISTICS_ENABLED_DEFAULT = false;
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_STORE_BY_VALUE_CONF = "camel.sink.endpoint.storeByValue";
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_STORE_BY_VALUE_DOC = "If cache should use store-by-value or store-by-reference semantics";
    public static final Boolean CAMEL_SINK_JCACHE_ENDPOINT_STORE_BY_VALUE_DEFAULT = true;
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_WRITE_THROUGH_CONF = "camel.sink.endpoint.writeThrough";
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_WRITE_THROUGH_DOC = "If write-through caching should be used";
    public static final Boolean CAMEL_SINK_JCACHE_ENDPOINT_WRITE_THROUGH_DEFAULT = false;
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_ACTION_CONF = "camel.sink.endpoint.action";
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_ACTION_DOC = "To configure using a cache operation by default. If an operation in the message header, then the operation from the header takes precedence.";
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_ACTION_DEFAULT = null;
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_JCACHE_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_JCACHE_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_CACHE_LOADER_FACTORY_CONF = "camel.sink.endpoint.cacheLoaderFactory";
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_CACHE_LOADER_FACTORY_DOC = "The CacheLoader factory";
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_CACHE_LOADER_FACTORY_DEFAULT = null;
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_CACHE_WRITER_FACTORY_CONF = "camel.sink.endpoint.cacheWriterFactory";
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_CACHE_WRITER_FACTORY_DOC = "The CacheWriter factory";
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_CACHE_WRITER_FACTORY_DEFAULT = null;
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_CREATE_CACHE_IF_NOT_EXISTS_CONF = "camel.sink.endpoint.createCacheIfNotExists";
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_CREATE_CACHE_IF_NOT_EXISTS_DOC = "Configure if a cache need to be created if it does exist or can't be pre-configured.";
    public static final Boolean CAMEL_SINK_JCACHE_ENDPOINT_CREATE_CACHE_IF_NOT_EXISTS_DEFAULT = true;
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_EXPIRY_POLICY_FACTORY_CONF = "camel.sink.endpoint.expiryPolicyFactory";
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_EXPIRY_POLICY_FACTORY_DOC = "The ExpiryPolicy factory";
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_EXPIRY_POLICY_FACTORY_DEFAULT = null;
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_LOOKUP_PROVIDERS_CONF = "camel.sink.endpoint.lookupProviders";
    public static final String CAMEL_SINK_JCACHE_ENDPOINT_LOOKUP_PROVIDERS_DOC = "Configure if a camel-cache should try to find implementations of jcache api in runtimes like OSGi.";
    public static final Boolean CAMEL_SINK_JCACHE_ENDPOINT_LOOKUP_PROVIDERS_DEFAULT = false;
    public static final String CAMEL_SINK_JCACHE_COMPONENT_CACHE_CONFIGURATION_CONF = "camel.component.jcache.cacheConfiguration";
    public static final String CAMEL_SINK_JCACHE_COMPONENT_CACHE_CONFIGURATION_DOC = "A Configuration for the Cache";
    public static final String CAMEL_SINK_JCACHE_COMPONENT_CACHE_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_JCACHE_COMPONENT_CACHE_CONFIGURATION_PROPERTIES_CONF = "camel.component.jcache.cacheConfigurationProperties";
    public static final String CAMEL_SINK_JCACHE_COMPONENT_CACHE_CONFIGURATION_PROPERTIES_DOC = "Properties to configure jcache";
    public static final String CAMEL_SINK_JCACHE_COMPONENT_CACHE_CONFIGURATION_PROPERTIES_DEFAULT = null;
    public static final String CAMEL_SINK_JCACHE_COMPONENT_CACHE_CONFIGURATION_PROPERTIES_REF_CONF = "camel.component.jcache.cacheConfigurationPropertiesRef";
    public static final String CAMEL_SINK_JCACHE_COMPONENT_CACHE_CONFIGURATION_PROPERTIES_REF_DOC = "References to an existing Properties or Map to lookup in the registry to use for configuring jcache.";
    public static final String CAMEL_SINK_JCACHE_COMPONENT_CACHE_CONFIGURATION_PROPERTIES_REF_DEFAULT = null;
    public static final String CAMEL_SINK_JCACHE_COMPONENT_CACHING_PROVIDER_CONF = "camel.component.jcache.cachingProvider";
    public static final String CAMEL_SINK_JCACHE_COMPONENT_CACHING_PROVIDER_DOC = "The fully qualified class name of the javax.cache.spi.CachingProvider";
    public static final String CAMEL_SINK_JCACHE_COMPONENT_CACHING_PROVIDER_DEFAULT = null;
    public static final String CAMEL_SINK_JCACHE_COMPONENT_CONFIGURATION_URI_CONF = "camel.component.jcache.configurationUri";
    public static final String CAMEL_SINK_JCACHE_COMPONENT_CONFIGURATION_URI_DOC = "An implementation specific URI for the CacheManager";
    public static final String CAMEL_SINK_JCACHE_COMPONENT_CONFIGURATION_URI_DEFAULT = null;
    public static final String CAMEL_SINK_JCACHE_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.jcache.lazyStartProducer";
    public static final String CAMEL_SINK_JCACHE_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_JCACHE_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_JCACHE_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.jcache.basicPropertyBinding";
    public static final String CAMEL_SINK_JCACHE_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_JCACHE_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;

    public CamelJcacheSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelJcacheSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf(Map<String, String> parsedConfig) {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_JCACHE_PATH_CACHE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JCACHE_PATH_CACHE_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_JCACHE_PATH_CACHE_NAME_DOC);
        conf.define(CAMEL_SINK_JCACHE_ENDPOINT_CACHE_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JCACHE_ENDPOINT_CACHE_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCACHE_ENDPOINT_CACHE_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_JCACHE_ENDPOINT_CACHE_CONFIGURATION_PROPERTIES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JCACHE_ENDPOINT_CACHE_CONFIGURATION_PROPERTIES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCACHE_ENDPOINT_CACHE_CONFIGURATION_PROPERTIES_DOC);
        conf.define(CAMEL_SINK_JCACHE_ENDPOINT_CACHING_PROVIDER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JCACHE_ENDPOINT_CACHING_PROVIDER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCACHE_ENDPOINT_CACHING_PROVIDER_DOC);
        conf.define(CAMEL_SINK_JCACHE_ENDPOINT_CONFIGURATION_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JCACHE_ENDPOINT_CONFIGURATION_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCACHE_ENDPOINT_CONFIGURATION_URI_DOC);
        conf.define(CAMEL_SINK_JCACHE_ENDPOINT_MANAGEMENT_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_JCACHE_ENDPOINT_MANAGEMENT_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCACHE_ENDPOINT_MANAGEMENT_ENABLED_DOC);
        conf.define(CAMEL_SINK_JCACHE_ENDPOINT_READ_THROUGH_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_JCACHE_ENDPOINT_READ_THROUGH_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCACHE_ENDPOINT_READ_THROUGH_DOC);
        conf.define(CAMEL_SINK_JCACHE_ENDPOINT_STATISTICS_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_JCACHE_ENDPOINT_STATISTICS_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCACHE_ENDPOINT_STATISTICS_ENABLED_DOC);
        conf.define(CAMEL_SINK_JCACHE_ENDPOINT_STORE_BY_VALUE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_JCACHE_ENDPOINT_STORE_BY_VALUE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCACHE_ENDPOINT_STORE_BY_VALUE_DOC);
        conf.define(CAMEL_SINK_JCACHE_ENDPOINT_WRITE_THROUGH_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_JCACHE_ENDPOINT_WRITE_THROUGH_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCACHE_ENDPOINT_WRITE_THROUGH_DOC);
        conf.define(CAMEL_SINK_JCACHE_ENDPOINT_ACTION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JCACHE_ENDPOINT_ACTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCACHE_ENDPOINT_ACTION_DOC);
        conf.define(CAMEL_SINK_JCACHE_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_JCACHE_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCACHE_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_JCACHE_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_JCACHE_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCACHE_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_JCACHE_ENDPOINT_CACHE_LOADER_FACTORY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JCACHE_ENDPOINT_CACHE_LOADER_FACTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCACHE_ENDPOINT_CACHE_LOADER_FACTORY_DOC);
        conf.define(CAMEL_SINK_JCACHE_ENDPOINT_CACHE_WRITER_FACTORY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JCACHE_ENDPOINT_CACHE_WRITER_FACTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCACHE_ENDPOINT_CACHE_WRITER_FACTORY_DOC);
        conf.define(CAMEL_SINK_JCACHE_ENDPOINT_CREATE_CACHE_IF_NOT_EXISTS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_JCACHE_ENDPOINT_CREATE_CACHE_IF_NOT_EXISTS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCACHE_ENDPOINT_CREATE_CACHE_IF_NOT_EXISTS_DOC);
        conf.define(CAMEL_SINK_JCACHE_ENDPOINT_EXPIRY_POLICY_FACTORY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JCACHE_ENDPOINT_EXPIRY_POLICY_FACTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCACHE_ENDPOINT_EXPIRY_POLICY_FACTORY_DOC);
        conf.define(CAMEL_SINK_JCACHE_ENDPOINT_LOOKUP_PROVIDERS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_JCACHE_ENDPOINT_LOOKUP_PROVIDERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCACHE_ENDPOINT_LOOKUP_PROVIDERS_DOC);
        conf.define(CAMEL_SINK_JCACHE_COMPONENT_CACHE_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JCACHE_COMPONENT_CACHE_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCACHE_COMPONENT_CACHE_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_JCACHE_COMPONENT_CACHE_CONFIGURATION_PROPERTIES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JCACHE_COMPONENT_CACHE_CONFIGURATION_PROPERTIES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCACHE_COMPONENT_CACHE_CONFIGURATION_PROPERTIES_DOC);
        conf.define(CAMEL_SINK_JCACHE_COMPONENT_CACHE_CONFIGURATION_PROPERTIES_REF_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JCACHE_COMPONENT_CACHE_CONFIGURATION_PROPERTIES_REF_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCACHE_COMPONENT_CACHE_CONFIGURATION_PROPERTIES_REF_DOC);
        conf.define(CAMEL_SINK_JCACHE_COMPONENT_CACHING_PROVIDER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JCACHE_COMPONENT_CACHING_PROVIDER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCACHE_COMPONENT_CACHING_PROVIDER_DOC);
        conf.define(CAMEL_SINK_JCACHE_COMPONENT_CONFIGURATION_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JCACHE_COMPONENT_CONFIGURATION_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCACHE_COMPONENT_CONFIGURATION_URI_DOC);
        conf.define(CAMEL_SINK_JCACHE_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_JCACHE_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCACHE_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_JCACHE_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_JCACHE_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCACHE_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        return conf;
    }
}