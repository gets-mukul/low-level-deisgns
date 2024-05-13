package com.designs.patters.factory.method.destination;

import com.designs.patters.factory.simple.IngestToDataBase;

public class CloudStorageFromFile implements IngestToDataBase {
    @Override
    public void ingestData() {
        System.out.println("!!! Fetching Data from file for cloud !!!");
    }
}
