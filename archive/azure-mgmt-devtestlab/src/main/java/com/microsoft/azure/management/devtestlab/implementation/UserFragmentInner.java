/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.implementation;

import com.microsoft.azure.management.devtestlab.UserIdentityFragment;
import com.microsoft.azure.management.devtestlab.UserSecretStoreFragment;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Profile of a lab user.
 */
@JsonFlatten
public class UserFragmentInner extends Resource {
    /**
     * The identity of the user.
     */
    @JsonProperty(value = "properties.identity")
    private UserIdentityFragment identity;

    /**
     * The secret store of the user.
     */
    @JsonProperty(value = "properties.secretStore")
    private UserSecretStoreFragment secretStore;

    /**
     * The provisioning status of the resource.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * The unique immutable identifier of a resource (Guid).
     */
    @JsonProperty(value = "properties.uniqueIdentifier")
    private String uniqueIdentifier;

    /**
     * Get the identity value.
     *
     * @return the identity value
     */
    public UserIdentityFragment identity() {
        return this.identity;
    }

    /**
     * Set the identity value.
     *
     * @param identity the identity value to set
     * @return the UserFragmentInner object itself.
     */
    public UserFragmentInner withIdentity(UserIdentityFragment identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the secretStore value.
     *
     * @return the secretStore value
     */
    public UserSecretStoreFragment secretStore() {
        return this.secretStore;
    }

    /**
     * Set the secretStore value.
     *
     * @param secretStore the secretStore value to set
     * @return the UserFragmentInner object itself.
     */
    public UserFragmentInner withSecretStore(UserSecretStoreFragment secretStore) {
        this.secretStore = secretStore;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     * @return the UserFragmentInner object itself.
     */
    public UserFragmentInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the uniqueIdentifier value.
     *
     * @return the uniqueIdentifier value
     */
    public String uniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    /**
     * Set the uniqueIdentifier value.
     *
     * @param uniqueIdentifier the uniqueIdentifier value to set
     * @return the UserFragmentInner object itself.
     */
    public UserFragmentInner withUniqueIdentifier(String uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
        return this;
    }

}
