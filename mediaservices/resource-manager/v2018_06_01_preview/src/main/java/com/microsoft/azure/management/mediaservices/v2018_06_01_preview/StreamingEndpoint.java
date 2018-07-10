/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.mediaservices.v2018_06_01_preview.implementation.StreamingEndpointInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.mediaservices.v2018_06_01_preview.implementation.MediaManager;
import java.util.Map;
import java.util.List;
import org.joda.time.DateTime;

/**
 * Type representing StreamingEndpoint.
 */
public interface StreamingEndpoint extends HasInner<StreamingEndpointInner>, Indexable, Refreshable<StreamingEndpoint>, Updatable<StreamingEndpoint.Update>, HasManager<MediaManager> {
    /**
     * @return the accessControl value.
     */
    StreamingEndpointAccessControl accessControl();

    /**
     * @return the availabilitySetName value.
     */
    String availabilitySetName();

    /**
     * @return the cdnEnabled value.
     */
    Boolean cdnEnabled();

    /**
     * @return the cdnProfile value.
     */
    String cdnProfile();

    /**
     * @return the cdnProvider value.
     */
    String cdnProvider();

    /**
     * @return the created value.
     */
    DateTime created();

    /**
     * @return the crossSiteAccessPolicies value.
     */
    CrossSiteAccessPolicies crossSiteAccessPolicies();

    /**
     * @return the customHostNames value.
     */
    List<String> customHostNames();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the freeTrialEndTime value.
     */
    DateTime freeTrialEndTime();

    /**
     * @return the hostName value.
     */
    String hostName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the lastModified value.
     */
    DateTime lastModified();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the maxCacheAge value.
     */
    Long maxCacheAge();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the resourceState value.
     */
    StreamingEndpointResourceState resourceState();

    /**
     * @return the scaleUnits value.
     */
    int scaleUnits();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the StreamingEndpoint definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithMediaservice, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of StreamingEndpoint definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a StreamingEndpoint definition.
         */
        interface Blank extends WithMediaservice {
        }

        /**
         * The stage of the streamingendpoint definition allowing to specify Mediaservice.
         */
        interface WithMediaservice {
           /**
            * Specifies resourceGroupName, accountName.
            */
            WithCreate withExistingMediaservice(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the streamingendpoint definition allowing to specify AccessControl.
         */
        interface WithAccessControl {
            /**
             * Specifies accessControl.
             */
            WithCreate withAccessControl(StreamingEndpointAccessControl accessControl);
        }

        /**
         * The stage of the streamingendpoint definition allowing to specify AvailabilitySetName.
         */
        interface WithAvailabilitySetName {
            /**
             * Specifies availabilitySetName.
             */
            WithCreate withAvailabilitySetName(String availabilitySetName);
        }

        /**
         * The stage of the streamingendpoint definition allowing to specify CdnEnabled.
         */
        interface WithCdnEnabled {
            /**
             * Specifies cdnEnabled.
             */
            WithCreate withCdnEnabled(Boolean cdnEnabled);
        }

        /**
         * The stage of the streamingendpoint definition allowing to specify CdnProfile.
         */
        interface WithCdnProfile {
            /**
             * Specifies cdnProfile.
             */
            WithCreate withCdnProfile(String cdnProfile);
        }

        /**
         * The stage of the streamingendpoint definition allowing to specify CdnProvider.
         */
        interface WithCdnProvider {
            /**
             * Specifies cdnProvider.
             */
            WithCreate withCdnProvider(String cdnProvider);
        }

        /**
         * The stage of the streamingendpoint definition allowing to specify CrossSiteAccessPolicies.
         */
        interface WithCrossSiteAccessPolicies {
            /**
             * Specifies crossSiteAccessPolicies.
             */
            WithCreate withCrossSiteAccessPolicies(CrossSiteAccessPolicies crossSiteAccessPolicies);
        }

        /**
         * The stage of the streamingendpoint definition allowing to specify CustomHostNames.
         */
        interface WithCustomHostNames {
            /**
             * Specifies customHostNames.
             */
            WithCreate withCustomHostNames(List<String> customHostNames);
        }

        /**
         * The stage of the streamingendpoint definition allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the streamingendpoint definition allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the streamingendpoint definition allowing to specify MaxCacheAge.
         */
        interface WithMaxCacheAge {
            /**
             * Specifies maxCacheAge.
             */
            WithCreate withMaxCacheAge(Long maxCacheAge);
        }

        /**
         * The stage of the streamingendpoint definition allowing to specify ScaleUnits.
         */
        interface WithScaleUnits {
            /**
             * Specifies scaleUnits.
             */
            WithCreate withScaleUnits(int scaleUnits);
        }

        /**
         * The stage of the streamingendpoint definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<StreamingEndpoint>, DefinitionStages.WithAccessControl, DefinitionStages.WithAvailabilitySetName, DefinitionStages.WithCdnEnabled, DefinitionStages.WithCdnProfile, DefinitionStages.WithCdnProvider, DefinitionStages.WithCrossSiteAccessPolicies, DefinitionStages.WithCustomHostNames, DefinitionStages.WithDescription, DefinitionStages.WithLocation, DefinitionStages.WithMaxCacheAge, DefinitionStages.WithScaleUnits, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a StreamingEndpoint update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<StreamingEndpoint>, UpdateStages.WithAccessControl, UpdateStages.WithAvailabilitySetName, UpdateStages.WithCdnEnabled, UpdateStages.WithCdnProfile, UpdateStages.WithCdnProvider, UpdateStages.WithCrossSiteAccessPolicies, UpdateStages.WithCustomHostNames, UpdateStages.WithDescription, UpdateStages.WithLocation, UpdateStages.WithMaxCacheAge, UpdateStages.WithScaleUnits, UpdateStages.WithTags {
    }

    /**
     * Grouping of StreamingEndpoint update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the streamingendpoint update allowing to specify AccessControl.
         */
        interface WithAccessControl {
            /**
             * Specifies accessControl.
             */
            Update withAccessControl(StreamingEndpointAccessControl accessControl);
        }

        /**
         * The stage of the streamingendpoint update allowing to specify AvailabilitySetName.
         */
        interface WithAvailabilitySetName {
            /**
             * Specifies availabilitySetName.
             */
            Update withAvailabilitySetName(String availabilitySetName);
        }

        /**
         * The stage of the streamingendpoint update allowing to specify CdnEnabled.
         */
        interface WithCdnEnabled {
            /**
             * Specifies cdnEnabled.
             */
            Update withCdnEnabled(Boolean cdnEnabled);
        }

        /**
         * The stage of the streamingendpoint update allowing to specify CdnProfile.
         */
        interface WithCdnProfile {
            /**
             * Specifies cdnProfile.
             */
            Update withCdnProfile(String cdnProfile);
        }

        /**
         * The stage of the streamingendpoint update allowing to specify CdnProvider.
         */
        interface WithCdnProvider {
            /**
             * Specifies cdnProvider.
             */
            Update withCdnProvider(String cdnProvider);
        }

        /**
         * The stage of the streamingendpoint update allowing to specify CrossSiteAccessPolicies.
         */
        interface WithCrossSiteAccessPolicies {
            /**
             * Specifies crossSiteAccessPolicies.
             */
            Update withCrossSiteAccessPolicies(CrossSiteAccessPolicies crossSiteAccessPolicies);
        }

        /**
         * The stage of the streamingendpoint update allowing to specify CustomHostNames.
         */
        interface WithCustomHostNames {
            /**
             * Specifies customHostNames.
             */
            Update withCustomHostNames(List<String> customHostNames);
        }

        /**
         * The stage of the streamingendpoint update allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the streamingendpoint update allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             */
            Update withLocation(String location);
        }

        /**
         * The stage of the streamingendpoint update allowing to specify MaxCacheAge.
         */
        interface WithMaxCacheAge {
            /**
             * Specifies maxCacheAge.
             */
            Update withMaxCacheAge(Long maxCacheAge);
        }

        /**
         * The stage of the streamingendpoint update allowing to specify ScaleUnits.
         */
        interface WithScaleUnits {
            /**
             * Specifies scaleUnits.
             */
            Update withScaleUnits(int scaleUnits);
        }

        /**
         * The stage of the streamingendpoint update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             */
            Update withTags(Map<String, String> tags);
        }

    }
}
