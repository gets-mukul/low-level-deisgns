package com.designs.patters.factory.method.source;

import com.designs.patters.factory.method.IIngestionService;
import com.designs.patters.factory.method.constant.Source;
import com.designs.patters.factory.method.destination.DBStorageFromAPI;
import com.designs.patters.factory.method.destination.DBStorageFromDataLake;
import com.designs.patters.factory.method.destination.DBStorageFromFile;
import com.designs.patters.factory.simple.IngestToDataBase;

public class DataStorage implements IIngestionService {
    @Override
    public IngestToDataBase getInstanceOfSource(String source) {
        if (Source.API.getValue().equalsIgnoreCase(source)) {
            return new DBStorageFromAPI();
        } else if (Source.FILE.getValue().equalsIgnoreCase(source)) {
            return new DBStorageFromFile();
        } else if (Source.DATA_LAKE.getValue().equalsIgnoreCase(source)) {
            return new DBStorageFromDataLake();
        }
        return null;
    }
}
