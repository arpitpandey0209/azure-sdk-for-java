/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.redis;

import com.microsoft.azure.management.redis.implementation.ScheduleEntryInner;
import org.joda.time.Period;

/**
 * Patch schedule entry for a Premium Redis Cache.
 */
public class ScheduleEntry {
    private ScheduleEntryInner inner;

    /**
     * Creates an instance of the Patch schedule entry object.
     *
     * @param inner the inner object
     */
    public ScheduleEntry(ScheduleEntryInner inner) {
        this.inner = inner;
    }

    /**
     * Creates an instance of the Patch schedule entry object.
     */
    public ScheduleEntry() {
        this.inner = new ScheduleEntryInner();
    }

    /**
     * Get the dayOfWeek value.
     *
     * @return the dayOfWeek value
     */
    public DayOfWeek dayOfWeek() {
        return this.inner.dayOfWeek();
    }

    /**
     * Set the dayOfWeek value.
     *
     * @param dayOfWeek the dayOfWeek value to set
     * @return the ScheduleEntryInner object itself.
     */
    public ScheduleEntry withDayOfWeek(DayOfWeek dayOfWeek) {
        this.inner.withDayOfWeek(dayOfWeek);
        return this;
    }

    /**
     * Get the startHourUtc value.
     *
     * @return the startHourUtc value
     */
    public int startHourUtc() {
        return this.inner.startHourUtc();
    }

    /**
     * Set the startHourUtc value.
     *
     * @param startHourUtc the startHourUtc value to set
     * @return the ScheduleEntryInner object itself.
     */
    public ScheduleEntry withStartHourUtc(int startHourUtc) {
        this.inner.withStartHourUtc(startHourUtc);
        return this;
    }

    /**
     * Get the maintenanceWindow value.
     *
     * @return the maintenanceWindow value
     */
    public Period maintenanceWindow() {
        return this.inner.maintenanceWindow();
    }

    /**
     * Set the maintenanceWindow value.
     *
     * @param maintenanceWindow the maintenanceWindow value to set
     * @return the ScheduleEntryInner object itself.
     */
    public ScheduleEntry withMaintenanceWindow(Period maintenanceWindow) {
        this.inner.withMaintenanceWindow(maintenanceWindow);
        return this;
    }

}
