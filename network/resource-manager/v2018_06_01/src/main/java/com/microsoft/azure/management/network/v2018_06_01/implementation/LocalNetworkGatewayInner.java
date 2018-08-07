/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_06_01.implementation;

import com.microsoft.azure.management.network.v2018_06_01.AddressSpace;
import com.microsoft.azure.management.network.v2018_06_01.BgpSettings;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * A common class for general resource information.
 */
@JsonFlatten
@SkipParentValidation
public class LocalNetworkGatewayInner extends Resource {
    /**
     * Local network site address space.
     */
    @JsonProperty(value = "properties.localNetworkAddressSpace")
    private AddressSpace localNetworkAddressSpace;

    /**
     * IP address of local network gateway.
     */
    @JsonProperty(value = "properties.gatewayIpAddress")
    private String gatewayIpAddress;

    /**
     * Local network gateway's BGP speaker settings.
     */
    @JsonProperty(value = "properties.bgpSettings")
    private BgpSettings bgpSettings;

    /**
     * The resource GUID property of the LocalNetworkGateway resource.
     */
    @JsonProperty(value = "properties.resourceGuid")
    private String resourceGuid;

    /**
     * The provisioning state of the LocalNetworkGateway resource. Possible
     * values are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get local network site address space.
     *
     * @return the localNetworkAddressSpace value
     */
    public AddressSpace localNetworkAddressSpace() {
        return this.localNetworkAddressSpace;
    }

    /**
     * Set local network site address space.
     *
     * @param localNetworkAddressSpace the localNetworkAddressSpace value to set
     * @return the LocalNetworkGatewayInner object itself.
     */
    public LocalNetworkGatewayInner withLocalNetworkAddressSpace(AddressSpace localNetworkAddressSpace) {
        this.localNetworkAddressSpace = localNetworkAddressSpace;
        return this;
    }

    /**
     * Get iP address of local network gateway.
     *
     * @return the gatewayIpAddress value
     */
    public String gatewayIpAddress() {
        return this.gatewayIpAddress;
    }

    /**
     * Set iP address of local network gateway.
     *
     * @param gatewayIpAddress the gatewayIpAddress value to set
     * @return the LocalNetworkGatewayInner object itself.
     */
    public LocalNetworkGatewayInner withGatewayIpAddress(String gatewayIpAddress) {
        this.gatewayIpAddress = gatewayIpAddress;
        return this;
    }

    /**
     * Get local network gateway's BGP speaker settings.
     *
     * @return the bgpSettings value
     */
    public BgpSettings bgpSettings() {
        return this.bgpSettings;
    }

    /**
     * Set local network gateway's BGP speaker settings.
     *
     * @param bgpSettings the bgpSettings value to set
     * @return the LocalNetworkGatewayInner object itself.
     */
    public LocalNetworkGatewayInner withBgpSettings(BgpSettings bgpSettings) {
        this.bgpSettings = bgpSettings;
        return this;
    }

    /**
     * Get the resource GUID property of the LocalNetworkGateway resource.
     *
     * @return the resourceGuid value
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Set the resource GUID property of the LocalNetworkGateway resource.
     *
     * @param resourceGuid the resourceGuid value to set
     * @return the LocalNetworkGatewayInner object itself.
     */
    public LocalNetworkGatewayInner withResourceGuid(String resourceGuid) {
        this.resourceGuid = resourceGuid;
        return this;
    }

    /**
     * Get the provisioning state of the LocalNetworkGateway resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set a unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set
     * @return the LocalNetworkGatewayInner object itself.
     */
    public LocalNetworkGatewayInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the LocalNetworkGatewayInner object itself.
     */
    public LocalNetworkGatewayInner withId(String id) {
        this.id = id;
        return this;
    }

}
