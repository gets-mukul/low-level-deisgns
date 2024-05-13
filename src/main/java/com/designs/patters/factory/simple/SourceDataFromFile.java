package com.designs.patters.factory.simple;

public class SourceDataFromFile implements IngestToDataBase {
    @Override
    public void ingestData() {
        System.out.println("Ingesting Data form source");
    }
}
