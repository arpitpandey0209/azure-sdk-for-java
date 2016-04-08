/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.network;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.network.models.PageImpl;
import com.microsoft.azure.management.network.models.SecurityRule;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in SecurityRulesOperations.
 */
public interface SecurityRulesOperations {
    /**
     * The delete network security rule operation deletes the specified network security rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param securityRuleName The name of the security rule.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> delete(String resourceGroupName, String networkSecurityGroupName, String securityRuleName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The delete network security rule operation deletes the specified network security rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param securityRuleName The name of the security rule.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteAsync(String resourceGroupName, String networkSecurityGroupName, String securityRuleName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The delete network security rule operation deletes the specified network security rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param securityRuleName The name of the security rule.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> beginDelete(String resourceGroupName, String networkSecurityGroupName, String securityRuleName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The delete network security rule operation deletes the specified network security rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param securityRuleName The name of the security rule.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginDeleteAsync(String resourceGroupName, String networkSecurityGroupName, String securityRuleName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The Get NetworkSecurityRule operation retreives information about the specified network security rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param securityRuleName The name of the security rule.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SecurityRule object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SecurityRule> get(String resourceGroupName, String networkSecurityGroupName, String securityRuleName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Get NetworkSecurityRule operation retreives information about the specified network security rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param securityRuleName The name of the security rule.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAsync(String resourceGroupName, String networkSecurityGroupName, String securityRuleName, final ServiceCallback<SecurityRule> serviceCallback) throws IllegalArgumentException;

    /**
     * The Put network security rule operation creates/updates a security rule in the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param securityRuleName The name of the security rule.
     * @param securityRuleParameters Parameters supplied to the create/update network security rule operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the SecurityRule object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SecurityRule> createOrUpdate(String resourceGroupName, String networkSecurityGroupName, String securityRuleName, SecurityRule securityRuleParameters) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Put network security rule operation creates/updates a security rule in the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param securityRuleName The name of the security rule.
     * @param securityRuleParameters Parameters supplied to the create/update network security rule operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateAsync(String resourceGroupName, String networkSecurityGroupName, String securityRuleName, SecurityRule securityRuleParameters, final ServiceCallback<SecurityRule> serviceCallback) throws IllegalArgumentException;

    /**
     * The Put network security rule operation creates/updates a security rule in the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param securityRuleName The name of the security rule.
     * @param securityRuleParameters Parameters supplied to the create/update network security rule operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SecurityRule object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SecurityRule> beginCreateOrUpdate(String resourceGroupName, String networkSecurityGroupName, String securityRuleName, SecurityRule securityRuleParameters) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Put network security rule operation creates/updates a security rule in the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param securityRuleName The name of the security rule.
     * @param securityRuleParameters Parameters supplied to the create/update network security rule operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginCreateOrUpdateAsync(String resourceGroupName, String networkSecurityGroupName, String securityRuleName, SecurityRule securityRuleParameters, final ServiceCallback<SecurityRule> serviceCallback) throws IllegalArgumentException;

    /**
     * The List network security rule opertion retrieves all the security rules in a network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;SecurityRule&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<SecurityRule>> list(final String resourceGroupName, final String networkSecurityGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List network security rule opertion retrieves all the security rules in a network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAsync(final String resourceGroupName, final String networkSecurityGroupName, final ListOperationCallback<SecurityRule> serviceCallback) throws IllegalArgumentException;

    /**
     * The List network security rule opertion retrieves all the security rules in a network security group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;SecurityRule&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<SecurityRule>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List network security rule opertion retrieves all the security rules in a network security group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<SecurityRule> serviceCallback) throws IllegalArgumentException;

}