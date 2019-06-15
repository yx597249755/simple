package com.lei;

public class CatCryFactory implements ProviderSuperFactory {
    @Override
    public Cry createCry() {
        return new CatCry();
    }
}
