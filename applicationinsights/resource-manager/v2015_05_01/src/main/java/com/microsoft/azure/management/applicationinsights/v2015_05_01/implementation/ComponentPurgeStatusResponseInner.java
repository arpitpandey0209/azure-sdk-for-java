/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation;

import com.microsoft.azure.management.applicationinsights.v2015_05_01.PurgeState;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response containing status for a specific purge operation.
 */
public class ComponentPurgeStatusResponseInner {
    /**
     * Status of the operation represented by the requested Id. Possible values
     * include: 'pending', 'completed'.
     */
    @JsonProperty(value = "status", required = true)
    private PurgeState status;

    /**
     * Get status of the operation represented by the requested Id. Possible values include: 'pending', 'completed'.
     *
     * @return the status value
     */
    public PurgeState status() {
        return this.status;
    }

    /**
     * Set status of the operation represented by the requested Id. Possible values include: 'pending', 'completed'.
     *
     * @param status the status value to set
     * @return the ComponentPurgeStatusResponseInner object itself.
     */
    public ComponentPurgeStatusResponseInner withStatus(PurgeState status) {
        this.status = status;
        return this;
    }

}
