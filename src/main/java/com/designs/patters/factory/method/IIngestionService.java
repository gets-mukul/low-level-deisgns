package com.designs.patters.factory.method;

import com.designs.patters.factory.simple.IngestToDataBase;

public interface IIngestionService {
    public IngestToDataBase getInstanceOfSource(String source);
}
