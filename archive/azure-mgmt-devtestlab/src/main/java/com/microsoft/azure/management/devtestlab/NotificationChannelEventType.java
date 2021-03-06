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
 * Defines values for NotificationChannelEventType.
 */
public final class NotificationChannelEventType {
    /** Static value AutoShutdown for NotificationChannelEventType. */
    public static final NotificationChannelEventType AUTO_SHUTDOWN = new NotificationChannelEventType("AutoShutdown");

    /** Static value Cost for NotificationChannelEventType. */
    public static final NotificationChannelEventType COST = new NotificationChannelEventType("Cost");

    private String value;

    /**
     * Creates a custom value for NotificationChannelEventType.
     * @param value the custom value
     */
    public NotificationChannelEventType(String value) {
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
        if (!(obj instanceof NotificationChannelEventType)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        NotificationChannelEventType rhs = (NotificationChannelEventType) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
