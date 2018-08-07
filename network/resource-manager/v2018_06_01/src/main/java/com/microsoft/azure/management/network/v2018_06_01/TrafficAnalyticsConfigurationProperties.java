/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters that define the configuration of traffic analytics.
 */
public class TrafficAnalyticsConfigurationProperties {
    /**
     * Flag to enable/disable traffic analytics.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /**
     * The resource guid of the attached workspace.
     */
    @JsonProperty(value = "workspaceId", required = true)
    private String workspaceId;

    /**
     * The location of the attached workspace.
     */
    @JsonProperty(value = "workspaceRegion", required = true)
    private String workspaceRegion;

    /**
     * Resource Id of the attached workspace.
     */
    @JsonProperty(value = "workspaceResourceId", required = true)
    private String workspaceResourceId;

    /**
     * Get flag to enable/disable traffic analytics.
     *
     * @return the enabled value
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set flag to enable/disable traffic analytics.
     *
     * @param enabled the enabled value to set
     * @return the TrafficAnalyticsConfigurationProperties object itself.
     */
    public TrafficAnalyticsConfigurationProperties withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the resource guid of the attached workspace.
     *
     * @return the workspaceId value
     */
    public String workspaceId() {
        return this.workspaceId;
    }

    /**
     * Set the resource guid of the attached workspace.
     *
     * @param workspaceId the workspaceId value to set
     * @return the TrafficAnalyticsConfigurationProperties object itself.
     */
    public TrafficAnalyticsConfigurationProperties withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * Get the location of the attached workspace.
     *
     * @return the workspaceRegion value
     */
    public String workspaceRegion() {
        return this.workspaceRegion;
    }

    /**
     * Set the location of the attached workspace.
     *
     * @param workspaceRegion the workspaceRegion value to set
     * @return the TrafficAnalyticsConfigurationProperties object itself.
     */
    public TrafficAnalyticsConfigurationProperties withWorkspaceRegion(String workspaceRegion) {
        this.workspaceRegion = workspaceRegion;
        return this;
    }

    /**
     * Get resource Id of the attached workspace.
     *
     * @return the workspaceResourceId value
     */
    public String workspaceResourceId() {
        return this.workspaceResourceId;
    }

    /**
     * Set resource Id of the attached workspace.
     *
     * @param workspaceResourceId the workspaceResourceId value to set
     * @return the TrafficAnalyticsConfigurationProperties object itself.
     */
    public TrafficAnalyticsConfigurationProperties withWorkspaceResourceId(String workspaceResourceId) {
        this.workspaceResourceId = workspaceResourceId;
        return this;
    }

}
