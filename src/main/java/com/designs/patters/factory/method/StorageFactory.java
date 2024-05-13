package com.designs.patters.factory.method;

import com.designs.patters.factory.method.source.CloudStorage;
import com.designs.patters.factory.method.source.DataStorage;

import static com.designs.patters.factory.method.constant.Storage.CLOUD;
import static com.designs.patters.factory.method.constant.Storage.DATA_BASE;

public class StorageFactory {

    public IIngestionService getStorageInstance(String storageType) {
        if (CLOUD.equalsIgnoreCase(storageType)) {
            return new CloudStorage();
        } else if (DATA_BASE.equalsIgnoreCase(storageType)) {
            return new DataStorage();
        }
        return null;
    }

}
