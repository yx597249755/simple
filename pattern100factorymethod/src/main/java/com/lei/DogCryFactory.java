package com.lei;

public class DogCryFactory implements ProviderSuperFactory {
    @Override
    public Cry createCry() {
        return new DogCry();
    }
}
