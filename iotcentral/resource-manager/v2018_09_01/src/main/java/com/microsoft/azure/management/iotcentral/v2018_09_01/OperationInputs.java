/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iotcentral.v2018_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input values.
 */
public class OperationInputs {
    /**
     * The name of the IoT Central application instance to check.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The subdomain of the IoT Central application instance to check.
     */
    @JsonProperty(value = "subdomain")
    private String subdomain;

    /**
     * The name of the IoT Central resource name to query.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the name of the IoT Central application instance to check.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the IoT Central application instance to check.
     *
     * @param name the name value to set
     * @return the OperationInputs object itself.
     */
    public OperationInputs withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the subdomain of the IoT Central application instance to check.
     *
     * @return the subdomain value
     */
    public String subdomain() {
        return this.subdomain;
    }

    /**
     * Set the subdomain of the IoT Central application instance to check.
     *
     * @param subdomain the subdomain value to set
     * @return the OperationInputs object itself.
     */
    public OperationInputs withSubdomain(String subdomain) {
        this.subdomain = subdomain;
        return this;
    }

    /**
     * Get the name of the IoT Central resource name to query.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the name of the IoT Central resource name to query.
     *
     * @param type the type value to set
     * @return the OperationInputs object itself.
     */
    public OperationInputs withType(String type) {
        this.type = type;
        return this;
    }

}
