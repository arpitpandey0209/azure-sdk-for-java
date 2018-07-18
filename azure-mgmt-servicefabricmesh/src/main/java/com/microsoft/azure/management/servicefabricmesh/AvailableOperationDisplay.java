/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabricmesh;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An operation available at the listed Azure resource provider.
 */
public class AvailableOperationDisplay {
    /**
     * Name of the operation provider.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /**
     * Name of the resource on which the operation is available.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /**
     * Name of the available operation.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /**
     * Description of the available operation.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get name of the operation provider.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set name of the operation provider.
     *
     * @param provider the provider value to set
     * @return the AvailableOperationDisplay object itself.
     */
    public AvailableOperationDisplay withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get name of the resource on which the operation is available.
     *
     * @return the resource value
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set name of the resource on which the operation is available.
     *
     * @param resource the resource value to set
     * @return the AvailableOperationDisplay object itself.
     */
    public AvailableOperationDisplay withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get name of the available operation.
     *
     * @return the operation value
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set name of the available operation.
     *
     * @param operation the operation value to set
     * @return the AvailableOperationDisplay object itself.
     */
    public AvailableOperationDisplay withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get description of the available operation.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description of the available operation.
     *
     * @param description the description value to set
     * @return the AvailableOperationDisplay object itself.
     */
    public AvailableOperationDisplay withDescription(String description) {
        this.description = description;
        return this;
    }

}
