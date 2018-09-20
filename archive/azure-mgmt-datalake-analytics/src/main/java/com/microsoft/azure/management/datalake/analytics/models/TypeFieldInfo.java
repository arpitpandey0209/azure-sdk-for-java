/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A Data Lake Analytics catalog type field information item.
 */
public class TypeFieldInfo {
    /**
     * the name of the field associated with this type.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * the type of the field.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the TypeFieldInfo object itself.
     */
    public TypeFieldInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the TypeFieldInfo object itself.
     */
    public TypeFieldInfo withType(String type) {
        this.type = type;
        return this;
    }

}