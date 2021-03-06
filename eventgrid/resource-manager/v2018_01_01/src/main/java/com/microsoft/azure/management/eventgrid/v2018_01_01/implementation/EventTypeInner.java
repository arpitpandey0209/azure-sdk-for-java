/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2018_01_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Event Type for a subject under a topic.
 */
@JsonFlatten
public class EventTypeInner extends ProxyResource {
    /**
     * Display name of the event type.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * Description of the event type.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Url of the schema for this event type.
     */
    @JsonProperty(value = "properties.schemaUrl")
    private String schemaUrl;

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     * @return the EventTypeInner object itself.
     */
    public EventTypeInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set
     * @return the EventTypeInner object itself.
     */
    public EventTypeInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the schemaUrl value.
     *
     * @return the schemaUrl value
     */
    public String schemaUrl() {
        return this.schemaUrl;
    }

    /**
     * Set the schemaUrl value.
     *
     * @param schemaUrl the schemaUrl value to set
     * @return the EventTypeInner object itself.
     */
    public EventTypeInner withSchemaUrl(String schemaUrl) {
        this.schemaUrl = schemaUrl;
        return this;
    }

}
