/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for CostThresholdStatus.
 */
public final class CostThresholdStatus {
    /** Static value Enabled for CostThresholdStatus. */
    public static final CostThresholdStatus ENABLED = new CostThresholdStatus("Enabled");

    /** Static value Disabled for CostThresholdStatus. */
    public static final CostThresholdStatus DISABLED = new CostThresholdStatus("Disabled");

    private String value;

    /**
     * Creates a custom value for CostThresholdStatus.
     * @param value the custom value
     */
    public CostThresholdStatus(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof CostThresholdStatus)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        CostThresholdStatus rhs = (CostThresholdStatus) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
