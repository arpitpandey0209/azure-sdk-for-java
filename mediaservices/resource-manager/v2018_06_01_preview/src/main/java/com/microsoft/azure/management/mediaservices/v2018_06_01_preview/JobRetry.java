/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_06_01_preview;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for JobRetry.
 */
public enum JobRetry {
    /** Issue needs to be investigated and then the job resubmitted with corrections or retried once the underlying issue has been corrected. */
    DO_NOT_RETRY("DoNotRetry"),

    /** Issue may be resolved after waiting for a period of time and resubmitting the same Job. */
    MAY_RETRY("MayRetry");

    /** The actual serialized value for a JobRetry instance. */
    private String value;

    JobRetry(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a JobRetry instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed JobRetry object, or null if unable to parse.
     */
    @JsonCreator
    public static JobRetry fromString(String value) {
        JobRetry[] items = JobRetry.values();
        for (JobRetry item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
