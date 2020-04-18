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
package org.apache.camel.kafkaconnector.crypto;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelCryptoSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_CRYPTO_PATH_CRYPTO_OPERATION_CONF = "camel.sink.path.cryptoOperation";
    public static final String CAMEL_SINK_CRYPTO_PATH_CRYPTO_OPERATION_DOC = "Set the Crypto operation from that supplied after the crypto scheme in the endpoint uri e.g. crypto:sign sets sign as the operation. One of: [sign] [verify]";
    public static final String CAMEL_SINK_CRYPTO_PATH_CRYPTO_OPERATION_DEFAULT = null;
    public static final String CAMEL_SINK_CRYPTO_PATH_NAME_CONF = "camel.sink.path.name";
    public static final String CAMEL_SINK_CRYPTO_PATH_NAME_DOC = "The logical name of this operation.";
    public static final String CAMEL_SINK_CRYPTO_PATH_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_ALGORITHM_CONF = "camel.sink.endpoint.algorithm";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_ALGORITHM_DOC = "Sets the JCE name of the Algorithm that should be used for the signer.";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_ALGORITHM_DEFAULT = "SHA256withRSA";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_ALIAS_CONF = "camel.sink.endpoint.alias";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_ALIAS_DOC = "Sets the alias used to query the KeyStore for keys and {link java.security.cert.Certificate Certificates} to be used in signing and verifying exchanges. This value can be provided at runtime via the message header org.apache.camel.component.crypto.DigitalSignatureConstants#KEYSTORE_ALIAS";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_ALIAS_DEFAULT = null;
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_CERTIFICATE_NAME_CONF = "camel.sink.endpoint.certificateName";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_CERTIFICATE_NAME_DOC = "Sets the reference name for a PrivateKey that can be found in the registry.";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_CERTIFICATE_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_KEYSTORE_CONF = "camel.sink.endpoint.keystore";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_KEYSTORE_DOC = "Sets the KeyStore that can contain keys and Certficates for use in signing and verifying exchanges. A KeyStore is typically used with an alias, either one supplied in the Route definition or dynamically via the message header CamelSignatureKeyStoreAlias. If no alias is supplied and there is only a single entry in the Keystore, then this single entry will be used.";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_KEYSTORE_DEFAULT = null;
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_KEYSTORE_NAME_CONF = "camel.sink.endpoint.keystoreName";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_KEYSTORE_NAME_DOC = "Sets the reference name for a Keystore that can be found in the registry.";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_KEYSTORE_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_CRYPTO_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_PRIVATE_KEY_CONF = "camel.sink.endpoint.privateKey";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_PRIVATE_KEY_DOC = "Set the PrivateKey that should be used to sign the exchange";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_PRIVATE_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_PRIVATE_KEY_NAME_CONF = "camel.sink.endpoint.privateKeyName";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_PRIVATE_KEY_NAME_DOC = "Sets the reference name for a PrivateKey that can be found in the registry.";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_PRIVATE_KEY_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_PROVIDER_CONF = "camel.sink.endpoint.provider";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_PROVIDER_DOC = "Set the id of the security provider that provides the configured Signature algorithm.";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_PROVIDER_DEFAULT = null;
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_PUBLIC_KEY_NAME_CONF = "camel.sink.endpoint.publicKeyName";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_PUBLIC_KEY_NAME_DOC = "references that should be resolved when the context changes";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_PUBLIC_KEY_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_SECURE_RANDOM_NAME_CONF = "camel.sink.endpoint.secureRandomName";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_SECURE_RANDOM_NAME_DOC = "Sets the reference name for a SecureRandom that can be found in the registry.";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_SECURE_RANDOM_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_SIGNATURE_HEADER_NAME_CONF = "camel.sink.endpoint.signatureHeaderName";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_SIGNATURE_HEADER_NAME_DOC = "Set the name of the message header that should be used to store the base64 encoded signature. This defaults to 'CamelDigitalSignature'";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_SIGNATURE_HEADER_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_CRYPTO_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_BUFFER_SIZE_CONF = "camel.sink.endpoint.bufferSize";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_BUFFER_SIZE_DOC = "Set the size of the buffer used to read in the Exchange payload data.";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_BUFFER_SIZE_DEFAULT = "2048";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_CERTIFICATE_CONF = "camel.sink.endpoint.certificate";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_CERTIFICATE_DOC = "Set the Certificate that should be used to verify the signature in the exchange based on its payload.";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_CERTIFICATE_DEFAULT = null;
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_CLEAR_HEADERS_CONF = "camel.sink.endpoint.clearHeaders";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_CLEAR_HEADERS_DOC = "Determines if the Signature specific headers be cleared after signing and verification. Defaults to true, and should only be made otherwise at your extreme peril as vital private information such as Keys and passwords may escape if unset.";
    public static final Boolean CAMEL_SINK_CRYPTO_ENDPOINT_CLEAR_HEADERS_DEFAULT = true;
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_KEY_STORE_PARAMETERS_CONF = "camel.sink.endpoint.keyStoreParameters";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_KEY_STORE_PARAMETERS_DOC = "Sets the KeyStore that can contain keys and Certficates for use in signing and verifying exchanges based on the given KeyStoreParameters. A KeyStore is typically used with an alias, either one supplied in the Route definition or dynamically via the message header CamelSignatureKeyStoreAlias. If no alias is supplied and there is only a single entry in the Keystore, then this single entry will be used.";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_KEY_STORE_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_PUBLIC_KEY_CONF = "camel.sink.endpoint.publicKey";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_PUBLIC_KEY_DOC = "Set the PublicKey that should be used to verify the signature in the exchange.";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_PUBLIC_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_SECURE_RANDOM_CONF = "camel.sink.endpoint.secureRandom";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_SECURE_RANDOM_DOC = "Set the SecureRandom used to initialize the Signature service";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_SECURE_RANDOM_DEFAULT = null;
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_CRYPTO_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_PASSWORD_CONF = "camel.sink.endpoint.password";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_PASSWORD_DOC = "Sets the password used to access an aliased PrivateKey in the KeyStore.";
    public static final String CAMEL_SINK_CRYPTO_ENDPOINT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_CRYPTO_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.crypto.lazyStartProducer";
    public static final String CAMEL_SINK_CRYPTO_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_CRYPTO_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_CRYPTO_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.crypto.basicPropertyBinding";
    public static final String CAMEL_SINK_CRYPTO_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_CRYPTO_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_CRYPTO_COMPONENT_CONFIGURATION_CONF = "camel.component.crypto.configuration";
    public static final String CAMEL_SINK_CRYPTO_COMPONENT_CONFIGURATION_DOC = "To use the shared DigitalSignatureConfiguration as configuration";
    public static final String CAMEL_SINK_CRYPTO_COMPONENT_CONFIGURATION_DEFAULT = null;

    public CamelCryptoSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelCryptoSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf(Map<String, String> parsedConfig) {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_CRYPTO_PATH_CRYPTO_OPERATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CRYPTO_PATH_CRYPTO_OPERATION_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_CRYPTO_PATH_CRYPTO_OPERATION_DOC);
        conf.define(CAMEL_SINK_CRYPTO_PATH_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CRYPTO_PATH_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_CRYPTO_PATH_NAME_DOC);
        conf.define(CAMEL_SINK_CRYPTO_ENDPOINT_ALGORITHM_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CRYPTO_ENDPOINT_ALGORITHM_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CRYPTO_ENDPOINT_ALGORITHM_DOC);
        conf.define(CAMEL_SINK_CRYPTO_ENDPOINT_ALIAS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CRYPTO_ENDPOINT_ALIAS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CRYPTO_ENDPOINT_ALIAS_DOC);
        conf.define(CAMEL_SINK_CRYPTO_ENDPOINT_CERTIFICATE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CRYPTO_ENDPOINT_CERTIFICATE_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CRYPTO_ENDPOINT_CERTIFICATE_NAME_DOC);
        conf.define(CAMEL_SINK_CRYPTO_ENDPOINT_KEYSTORE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CRYPTO_ENDPOINT_KEYSTORE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CRYPTO_ENDPOINT_KEYSTORE_DOC);
        conf.define(CAMEL_SINK_CRYPTO_ENDPOINT_KEYSTORE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CRYPTO_ENDPOINT_KEYSTORE_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CRYPTO_ENDPOINT_KEYSTORE_NAME_DOC);
        conf.define(CAMEL_SINK_CRYPTO_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CRYPTO_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CRYPTO_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_CRYPTO_ENDPOINT_PRIVATE_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CRYPTO_ENDPOINT_PRIVATE_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CRYPTO_ENDPOINT_PRIVATE_KEY_DOC);
        conf.define(CAMEL_SINK_CRYPTO_ENDPOINT_PRIVATE_KEY_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CRYPTO_ENDPOINT_PRIVATE_KEY_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CRYPTO_ENDPOINT_PRIVATE_KEY_NAME_DOC);
        conf.define(CAMEL_SINK_CRYPTO_ENDPOINT_PROVIDER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CRYPTO_ENDPOINT_PROVIDER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CRYPTO_ENDPOINT_PROVIDER_DOC);
        conf.define(CAMEL_SINK_CRYPTO_ENDPOINT_PUBLIC_KEY_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CRYPTO_ENDPOINT_PUBLIC_KEY_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CRYPTO_ENDPOINT_PUBLIC_KEY_NAME_DOC);
        conf.define(CAMEL_SINK_CRYPTO_ENDPOINT_SECURE_RANDOM_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CRYPTO_ENDPOINT_SECURE_RANDOM_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CRYPTO_ENDPOINT_SECURE_RANDOM_NAME_DOC);
        conf.define(CAMEL_SINK_CRYPTO_ENDPOINT_SIGNATURE_HEADER_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CRYPTO_ENDPOINT_SIGNATURE_HEADER_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CRYPTO_ENDPOINT_SIGNATURE_HEADER_NAME_DOC);
        conf.define(CAMEL_SINK_CRYPTO_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CRYPTO_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CRYPTO_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_CRYPTO_ENDPOINT_BUFFER_SIZE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CRYPTO_ENDPOINT_BUFFER_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CRYPTO_ENDPOINT_BUFFER_SIZE_DOC);
        conf.define(CAMEL_SINK_CRYPTO_ENDPOINT_CERTIFICATE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CRYPTO_ENDPOINT_CERTIFICATE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CRYPTO_ENDPOINT_CERTIFICATE_DOC);
        conf.define(CAMEL_SINK_CRYPTO_ENDPOINT_CLEAR_HEADERS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CRYPTO_ENDPOINT_CLEAR_HEADERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CRYPTO_ENDPOINT_CLEAR_HEADERS_DOC);
        conf.define(CAMEL_SINK_CRYPTO_ENDPOINT_KEY_STORE_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CRYPTO_ENDPOINT_KEY_STORE_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CRYPTO_ENDPOINT_KEY_STORE_PARAMETERS_DOC);
        conf.define(CAMEL_SINK_CRYPTO_ENDPOINT_PUBLIC_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CRYPTO_ENDPOINT_PUBLIC_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CRYPTO_ENDPOINT_PUBLIC_KEY_DOC);
        conf.define(CAMEL_SINK_CRYPTO_ENDPOINT_SECURE_RANDOM_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CRYPTO_ENDPOINT_SECURE_RANDOM_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CRYPTO_ENDPOINT_SECURE_RANDOM_DOC);
        conf.define(CAMEL_SINK_CRYPTO_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CRYPTO_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CRYPTO_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_CRYPTO_ENDPOINT_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CRYPTO_ENDPOINT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CRYPTO_ENDPOINT_PASSWORD_DOC);
        conf.define(CAMEL_SINK_CRYPTO_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CRYPTO_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CRYPTO_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_CRYPTO_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CRYPTO_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CRYPTO_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_CRYPTO_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CRYPTO_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CRYPTO_COMPONENT_CONFIGURATION_DOC);
        return conf;
    }
}