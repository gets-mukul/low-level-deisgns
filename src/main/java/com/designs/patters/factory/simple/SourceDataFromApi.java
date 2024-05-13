package com.designs.patters.factory.simple;

public class SourceDataFromApi implements IngestToDataBase {
    @Override
    public void ingestData() {
        System.out.println("Ingesting Data form API");
    }
}
