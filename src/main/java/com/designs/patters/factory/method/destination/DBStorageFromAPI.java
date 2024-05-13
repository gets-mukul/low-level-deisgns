package com.designs.patters.factory.method.destination;

import com.designs.patters.factory.simple.IngestToDataBase;

public class DBStorageFromAPI implements IngestToDataBase {
    @Override
    public void ingestData() {
        System.out.println("!!! Fetching Data From API for DB !!!");
    }
}
