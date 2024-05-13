package com.designs.patters.factory.simple;

public class FactoryOfSource {
    IngestToDataBase source = null;

    public IngestToDataBase getInstanceOfSource(String sourceName) {
        IngestToDataBase source = null;
        switch (sourceName) {
            case "api" -> source = new SourceDataFromApi();
            case "dataLake" -> source = new SourceDataFromDataLake();
            case "file" -> source = new SourceDataFromFile();
            default -> System.out.println("Invalid file name");
        }
        return source;
    }
}
