/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_30_30_preview.implementation;

import com.microsoft.azure.management.mediaservices.v2018_30_30_preview.Asset;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.UUID;
import org.joda.time.DateTime;
import com.microsoft.azure.management.mediaservices.v2018_30_30_preview.AssetStorageEncryptionFormat;

class AssetImpl extends CreatableUpdatableImpl<Asset, AssetInner, AssetImpl> implements Asset, Asset.Definition, Asset.Update {
    private final MediaManager manager;
    private String resourceGroupName;
    private String accountName;
    private String assetName;

    AssetImpl(String name, MediaManager manager) {
        super(name, new AssetInner());
        this.manager = manager;
        // Set resource name
        this.assetName = name;
        //
    }

    AssetImpl(AssetInner inner, MediaManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.assetName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "mediaServices");
        this.assetName = IdParsingUtils.getValueFromIdByName(inner.id(), "assets");
        //
    }

    @Override
    public MediaManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Asset> createResourceAsync() {
        AssetsInner client = this.manager().inner().assets();
        return client.createOrUpdateAsync(this.resourceGroupName, this.accountName, this.assetName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Asset> updateResourceAsync() {
        AssetsInner client = this.manager().inner().assets();
        return client.updateAsync(this.resourceGroupName, this.accountName, this.assetName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<AssetInner> getInnerAsync() {
        AssetsInner client = this.manager().inner().assets();
        return client.getAsync(this.resourceGroupName, this.accountName, this.assetName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String alternateId() {
        return this.inner().alternateId();
    }

    @Override
    public UUID assetId() {
        return this.inner().assetId();
    }

    @Override
    public String container() {
        return this.inner().container();
    }

    @Override
    public DateTime created() {
        return this.inner().created();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public DateTime lastModified() {
        return this.inner().lastModified();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String storageAccountName() {
        return this.inner().storageAccountName();
    }

    @Override
    public AssetStorageEncryptionFormat storageEncryptionFormat() {
        return this.inner().storageEncryptionFormat();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public AssetImpl withExistingMediaservice(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    @Override
    public AssetImpl withAlternateId(String alternateId) {
        this.inner().withAlternateId(alternateId);
        return this;
    }

    @Override
    public AssetImpl withContainer(String container) {
        this.inner().withContainer(container);
        return this;
    }

    @Override
    public AssetImpl withDescription(String description) {
        this.inner().withDescription(description);
        return this;
    }

    @Override
    public AssetImpl withStorageAccountName(String storageAccountName) {
        this.inner().withStorageAccountName(storageAccountName);
        return this;
    }

}
