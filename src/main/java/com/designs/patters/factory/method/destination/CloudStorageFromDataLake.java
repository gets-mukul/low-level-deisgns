package com.designs.patters.factory.method.destination;

import com.designs.patters.factory.simple.IngestToDataBase;

public class CloudStorageFromDataLake implements IngestToDataBase {
    @Override
    public void ingestData() {
        System.out.println("!!! Fetching Data from data lake for cloud !!!");
    }
}
