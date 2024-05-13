package com.designs.patters.factory.simple;

public class IngestionService {

    FactoryOfSource source = new FactoryOfSource();

    public IngestionService(FactoryOfSource source_) {
        this.source = source_;
    }

    public void ingestData(String sourceName) {
        IngestToDataBase sourceObject = source.getInstanceOfSource(sourceName);
        sourceObject.ingestData();
    }
}
