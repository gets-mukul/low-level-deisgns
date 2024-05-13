package com.designs.patters.factory.method.destination;

import com.designs.patters.factory.simple.IngestToDataBase;

public class DBStorageFromDataLake implements IngestToDataBase {
    @Override
    public void ingestData() {
        System.out.println("!!! Fetching Data From data lake for DB !!!");

    }
}
