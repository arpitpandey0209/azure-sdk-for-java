/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31;

import rx.Completable;
import rx.Observable;

/**
 * Type representing RunbookDrafts.
 */
public interface RunbookDrafts {
    /**
     * Retrieve the content of runbook draft identified by runbook name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable getContentAsync(String resourceGroupName, String automationAccountName, String runbookName);

    /**
     * Replaces the runbook draft content.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @param runbookContent The runbook draft content.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable replaceContentAsync(String resourceGroupName, String automationAccountName, String runbookName, String runbookContent);

    /**
     * Retrieve the runbook draft identified by runbook name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RunbookDraft> getAsync(String resourceGroupName, String automationAccountName, String runbookName);

    /**
     * Publish runbook draft.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The parameters supplied to the publish runbook operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable publishAsync(String resourceGroupName, String automationAccountName, String runbookName);

    /**
     * Undo draft edit to last known published state identified by runbook name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RunbookDraftUndoEditResult> undoEditAsync(String resourceGroupName, String automationAccountName, String runbookName);

}
