/*
 * Copyright 2019 Rundeck, Inc. (http://rundeck.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.rundeck.core.projects;

import com.dtolabs.rundeck.core.plugins.configuration.Property;

import java.util.List;
import java.util.Map;

/**
 * Defines project level configuration properties for a component
 */
public interface ProjectConfigurable {
    /**
     * Return configuration categories for the properties, keyed by property name
     */
    Map<String, String> getCategories();

    /**
     * List of properties
     */
    List<Property> getProjectConfigProperties();

    /**
     * @return a map of config prop names to project config property names
     */
    public Map<String, String> getPropertiesMapping();

}
