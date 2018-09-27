/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights.v2018_07_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.policyinsights.v2018_07_01_preview.implementation.RemediationInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.policyinsights.v2018_07_01_preview.implementation.PolicyInsightsManager;
import org.joda.time.DateTime;

/**
 * Type representing Remediation.
 */
public interface Remediation extends HasInner<RemediationInner>, Indexable, Updatable<Remediation.Update>, HasManager<PolicyInsightsManager> {
    /**
     * @return the createdOn value.
     */
    DateTime createdOn();

    /**
     * @return the deploymentStatus value.
     */
    RemediationDeploymentSummary deploymentStatus();

    /**
     * @return the filters value.
     */
    RemediationFilters filters();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the lastUpdatedOn value.
     */
    DateTime lastUpdatedOn();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the policyAssignmentId value.
     */
    String policyAssignmentId();

    /**
     * @return the policyDefinitionReferenceId value.
     */
    String policyDefinitionReferenceId();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the Remediation definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithMicrosoft.PolicyInsight, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Remediation definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Remediation definition.
         */
        interface Blank extends WithMicrosoft.PolicyInsight {
        }

        /**
         * The stage of the remediation definition allowing to specify Microsoft.PolicyInsight.
         */
        interface WithMicrosoft.PolicyInsight {
           /**
            * Specifies managementGroupId.
            */
            WithCreate withExistingMicrosoft.PolicyInsight(String managementGroupId);
        }

        /**
         * The stage of the remediation definition allowing to specify DeploymentStatus.
         */
        interface WithDeploymentStatus {
            /**
             * Specifies deploymentStatus.
             */
            WithCreate withDeploymentStatus(RemediationDeploymentSummary deploymentStatus);
        }

        /**
         * The stage of the remediation definition allowing to specify Filters.
         */
        interface WithFilters {
            /**
             * Specifies filters.
             */
            WithCreate withFilters(RemediationFilters filters);
        }

        /**
         * The stage of the remediation definition allowing to specify PolicyAssignmentId.
         */
        interface WithPolicyAssignmentId {
            /**
             * Specifies policyAssignmentId.
             */
            WithCreate withPolicyAssignmentId(String policyAssignmentId);
        }

        /**
         * The stage of the remediation definition allowing to specify PolicyDefinitionReferenceId.
         */
        interface WithPolicyDefinitionReferenceId {
            /**
             * Specifies policyDefinitionReferenceId.
             */
            WithCreate withPolicyDefinitionReferenceId(String policyDefinitionReferenceId);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Remediation>, DefinitionStages.WithDeploymentStatus, DefinitionStages.WithFilters, DefinitionStages.WithPolicyAssignmentId, DefinitionStages.WithPolicyDefinitionReferenceId {
        }
    }
    /**
     * The template for a Remediation update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Remediation>, UpdateStages.WithDeploymentStatus, UpdateStages.WithFilters, UpdateStages.WithPolicyAssignmentId, UpdateStages.WithPolicyDefinitionReferenceId {
    }

    /**
     * Grouping of Remediation update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the remediation update allowing to specify DeploymentStatus.
         */
        interface WithDeploymentStatus {
            /**
             * Specifies deploymentStatus.
             */
            Update withDeploymentStatus(RemediationDeploymentSummary deploymentStatus);
        }

        /**
         * The stage of the remediation update allowing to specify Filters.
         */
        interface WithFilters {
            /**
             * Specifies filters.
             */
            Update withFilters(RemediationFilters filters);
        }

        /**
         * The stage of the remediation update allowing to specify PolicyAssignmentId.
         */
        interface WithPolicyAssignmentId {
            /**
             * Specifies policyAssignmentId.
             */
            Update withPolicyAssignmentId(String policyAssignmentId);
        }

        /**
         * The stage of the remediation update allowing to specify PolicyDefinitionReferenceId.
         */
        interface WithPolicyDefinitionReferenceId {
            /**
             * Specifies policyDefinitionReferenceId.
             */
            Update withPolicyDefinitionReferenceId(String policyDefinitionReferenceId);
        }

    }
}