/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.trafficmanager.v2017_05_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class representing a region in the Geographic hierarchy used with the
 * Geographic traffic routing method.
 */
public class Region {
    /**
     * The code of the region.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * The name of the region.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The list of Regions grouped under this Region in the Geographic
     * Hierarchy.
     */
    @JsonProperty(value = "regions")
    private List<Region> regions;

    /**
     * Get the code of the region.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code of the region.
     *
     * @param code the code value to set
     * @return the Region object itself.
     */
    public Region withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the name of the region.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the region.
     *
     * @param name the name value to set
     * @return the Region object itself.
     */
    public Region withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the list of Regions grouped under this Region in the Geographic Hierarchy.
     *
     * @return the regions value
     */
    public List<Region> regions() {
        return this.regions;
    }

    /**
     * Set the list of Regions grouped under this Region in the Geographic Hierarchy.
     *
     * @param regions the regions value to set
     * @return the Region object itself.
     */
    public Region withRegions(List<Region> regions) {
        this.regions = regions;
        return this;
    }

}