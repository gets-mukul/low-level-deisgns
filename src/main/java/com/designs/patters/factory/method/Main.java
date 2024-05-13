package com.designs.patters.factory.method;

public class Main {
    public static void main(String[] args) {
        StorageFactory storageFactory = new StorageFactory();
        IIngestionService cloudObject = storageFactory.getStorageInstance("cloud");
        cloudObject.getInstanceOfSource("api");
        IIngestionService dataObject = storageFactory.getStorageInstance("db");
        dataObject.getInstanceOfSource("file");
    }
}
