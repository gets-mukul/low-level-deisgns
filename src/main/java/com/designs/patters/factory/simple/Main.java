package com.designs.patters.factory.simple;

public class Main {
    public static void main(String[] args) {

        FactoryOfSource source = new FactoryOfSource();
        IngestionService service = new IngestionService(source);
        service.ingestData("api");
        service.ingestData("dataLake");
        service.ingestData("file");
    }
}
