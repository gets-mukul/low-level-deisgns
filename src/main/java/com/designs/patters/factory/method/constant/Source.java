package com.designs.patters.factory.method.constant;

public enum Source {
    API("api"),
    FILE("file"),
    DATA_LAKE("dataLake");

    Source(String source) {

    }

    public String getValue() {
        return this.name();
    }
}
