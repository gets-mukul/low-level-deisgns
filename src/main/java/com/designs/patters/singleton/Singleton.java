package com.designs.patters.singleton;

import java.util.Objects;

public class Singleton {

    private Singleton singleInstance;

    private Singleton() {
        this.singleInstance = new Singleton();
    }

    Singleton getSingletonInstance() {
        return Objects.requireNonNullElseGet(singleInstance, Singleton::new);
    }
}
