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
package org.apache.camel.kafkaconnector.ldap;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.camel.kafkaconnector.CamelSinkTask;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelLdapSinkTask extends CamelSinkTask {

    @Override
    protected CamelSinkConnectorConfig getCamelSinkConnectorConfig(
            Map<String, String> props) {
        return new CamelLdapSinkConnectorConfig(props);
    }
    @Override
    protected Map<String, String> getDefaultConfig() {
        return new HashMap<String, String>() {{
            put(CamelSinkConnectorConfig.CAMEL_SINK_COMPONENT_CONF, "ldap");
        }};
    }
}