package com.designs.patters.factory.simple;

public class SourceDataFromDataLake implements IngestToDataBase {
    @Override
    public void ingestData() {
        System.out.println("Ingesting data from Data lake");
    }
}
