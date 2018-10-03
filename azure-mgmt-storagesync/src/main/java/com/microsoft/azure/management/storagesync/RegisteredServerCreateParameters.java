/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagesync;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * The parameters used when creating a registered server.
 */
@JsonFlatten
public class RegisteredServerCreateParameters extends ProxyResource {
    /**
     * Registered Server Certificate.
     */
    @JsonProperty(value = "properties.serverCertificate")
    private String serverCertificate;

    /**
     * Registered Server Agent Version.
     */
    @JsonProperty(value = "properties.agentVersion")
    private String agentVersion;

    /**
     * Registered Server OS Version.
     */
    @JsonProperty(value = "properties.serverOSVersion")
    private String serverOSVersion;

    /**
     * Registered Server last heart beat.
     */
    @JsonProperty(value = "properties.lastHeartBeat")
    private String lastHeartBeat;

    /**
     * Registered Server serverRole.
     */
    @JsonProperty(value = "properties.serverRole")
    private String serverRole;

    /**
     * Registered Server clusterId.
     */
    @JsonProperty(value = "properties.clusterId")
    private String clusterId;

    /**
     * Registered Server clusterName.
     */
    @JsonProperty(value = "properties.clusterName")
    private String clusterName;

    /**
     * Registered Server serverId.
     */
    @JsonProperty(value = "properties.serverId")
    private String serverId;

    /**
     * Friendly Name.
     */
    @JsonProperty(value = "properties.friendlyName")
    private String friendlyName;

    /**
     * Get registered Server Certificate.
     *
     * @return the serverCertificate value
     */
    public String serverCertificate() {
        return this.serverCertificate;
    }

    /**
     * Set registered Server Certificate.
     *
     * @param serverCertificate the serverCertificate value to set
     * @return the RegisteredServerCreateParameters object itself.
     */
    public RegisteredServerCreateParameters withServerCertificate(String serverCertificate) {
        this.serverCertificate = serverCertificate;
        return this;
    }

    /**
     * Get registered Server Agent Version.
     *
     * @return the agentVersion value
     */
    public String agentVersion() {
        return this.agentVersion;
    }

    /**
     * Set registered Server Agent Version.
     *
     * @param agentVersion the agentVersion value to set
     * @return the RegisteredServerCreateParameters object itself.
     */
    public RegisteredServerCreateParameters withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * Get registered Server OS Version.
     *
     * @return the serverOSVersion value
     */
    public String serverOSVersion() {
        return this.serverOSVersion;
    }

    /**
     * Set registered Server OS Version.
     *
     * @param serverOSVersion the serverOSVersion value to set
     * @return the RegisteredServerCreateParameters object itself.
     */
    public RegisteredServerCreateParameters withServerOSVersion(String serverOSVersion) {
        this.serverOSVersion = serverOSVersion;
        return this;
    }

    /**
     * Get registered Server last heart beat.
     *
     * @return the lastHeartBeat value
     */
    public String lastHeartBeat() {
        return this.lastHeartBeat;
    }

    /**
     * Set registered Server last heart beat.
     *
     * @param lastHeartBeat the lastHeartBeat value to set
     * @return the RegisteredServerCreateParameters object itself.
     */
    public RegisteredServerCreateParameters withLastHeartBeat(String lastHeartBeat) {
        this.lastHeartBeat = lastHeartBeat;
        return this;
    }

    /**
     * Get registered Server serverRole.
     *
     * @return the serverRole value
     */
    public String serverRole() {
        return this.serverRole;
    }

    /**
     * Set registered Server serverRole.
     *
     * @param serverRole the serverRole value to set
     * @return the RegisteredServerCreateParameters object itself.
     */
    public RegisteredServerCreateParameters withServerRole(String serverRole) {
        this.serverRole = serverRole;
        return this;
    }

    /**
     * Get registered Server clusterId.
     *
     * @return the clusterId value
     */
    public String clusterId() {
        return this.clusterId;
    }

    /**
     * Set registered Server clusterId.
     *
     * @param clusterId the clusterId value to set
     * @return the RegisteredServerCreateParameters object itself.
     */
    public RegisteredServerCreateParameters withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * Get registered Server clusterName.
     *
     * @return the clusterName value
     */
    public String clusterName() {
        return this.clusterName;
    }

    /**
     * Set registered Server clusterName.
     *
     * @param clusterName the clusterName value to set
     * @return the RegisteredServerCreateParameters object itself.
     */
    public RegisteredServerCreateParameters withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * Get registered Server serverId.
     *
     * @return the serverId value
     */
    public String serverId() {
        return this.serverId;
    }

    /**
     * Set registered Server serverId.
     *
     * @param serverId the serverId value to set
     * @return the RegisteredServerCreateParameters object itself.
     */
    public RegisteredServerCreateParameters withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * Get friendly Name.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set friendly Name.
     *
     * @param friendlyName the friendlyName value to set
     * @return the RegisteredServerCreateParameters object itself.
     */
    public RegisteredServerCreateParameters withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

}