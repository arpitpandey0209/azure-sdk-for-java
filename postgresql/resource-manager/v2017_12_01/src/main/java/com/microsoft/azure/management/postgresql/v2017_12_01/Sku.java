/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.postgresql.v2017_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Billing information related properties of a server.
 */
public class Sku {
    /**
     * The name of the sku, typically, tier + family + cores, e.g. B_Gen4_1,
     * GP_Gen5_8.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The tier of the particular SKU, e.g. Basic. Possible values include:
     * 'Basic', 'GeneralPurpose', 'MemoryOptimized'.
     */
    @JsonProperty(value = "tier")
    private SkuTier tier;

    /**
     * The scale up/out capacity, representing server's compute units.
     */
    @JsonProperty(value = "capacity")
    private Integer capacity;

    /**
     * The size code, to be interpreted by resource as appropriate.
     */
    @JsonProperty(value = "size")
    private String size;

    /**
     * The family of hardware.
     */
    @JsonProperty(value = "family")
    private String family;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the Sku object itself.
     */
    public Sku withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier value.
     *
     * @return the tier value
     */
    public SkuTier tier() {
        return this.tier;
    }

    /**
     * Set the tier value.
     *
     * @param tier the tier value to set
     * @return the Sku object itself.
     */
    public Sku withTier(SkuTier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the capacity value.
     *
     * @return the capacity value
     */
    public Integer capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity value.
     *
     * @param capacity the capacity value to set
     * @return the Sku object itself.
     */
    public Sku withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get the size value.
     *
     * @return the size value
     */
    public String size() {
        return this.size;
    }

    /**
     * Set the size value.
     *
     * @param size the size value to set
     * @return the Sku object itself.
     */
    public Sku withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * Get the family value.
     *
     * @return the family value
     */
    public String family() {
        return this.family;
    }

    /**
     * Set the family value.
     *
     * @param family the family value to set
     * @return the Sku object itself.
     */
    public Sku withFamily(String family) {
        this.family = family;
        return this;
    }

}
