package com.designs.patters.factory.method.source;

import com.designs.patters.factory.method.IIngestionService;
import com.designs.patters.factory.method.constant.Source;
import com.designs.patters.factory.method.destination.CloudStorageFromAPI;
import com.designs.patters.factory.method.destination.CloudStorageFromDataLake;
import com.designs.patters.factory.method.destination.CloudStorageFromFile;
import com.designs.patters.factory.simple.IngestToDataBase;

public class CloudStorage implements IIngestionService {
    @Override
    public IngestToDataBase getInstanceOfSource(String source) {
        if (Source.API.getValue().equalsIgnoreCase(source)) {
            return new CloudStorageFromAPI();
        } else if (Source.FILE.getValue().equalsIgnoreCase(source)) {
            return new CloudStorageFromFile();
        } else if (Source.DATA_LAKE.getValue().equalsIgnoreCase(source)) {
            return new CloudStorageFromDataLake();
        }
        return null;
    }
}
