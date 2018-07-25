/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.faceapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties describing present makeups on a given face.
 */
public class Makeup {
    /**
     * A boolean value describing whether eye makeup is present on a face.
     */
    @JsonProperty(value = "eyeMakeup")
    private boolean eyeMakeup;

    /**
     * A boolean value describing whether lip makeup is present on a face.
     */
    @JsonProperty(value = "lipMakeup")
    private boolean lipMakeup;

    /**
     * Get a boolean value describing whether eye makeup is present on a face.
     *
     * @return the eyeMakeup value
     */
    public boolean eyeMakeup() {
        return this.eyeMakeup;
    }

    /**
     * Set a boolean value describing whether eye makeup is present on a face.
     *
     * @param eyeMakeup the eyeMakeup value to set
     * @return the Makeup object itself.
     */
    public Makeup withEyeMakeup(boolean eyeMakeup) {
        this.eyeMakeup = eyeMakeup;
        return this;
    }

    /**
     * Get a boolean value describing whether lip makeup is present on a face.
     *
     * @return the lipMakeup value
     */
    public boolean lipMakeup() {
        return this.lipMakeup;
    }

    /**
     * Set a boolean value describing whether lip makeup is present on a face.
     *
     * @param lipMakeup the lipMakeup value to set
     * @return the Makeup object itself.
     */
    public Makeup withLipMakeup(boolean lipMakeup) {
        this.lipMakeup = lipMakeup;
        return this;
    }

}