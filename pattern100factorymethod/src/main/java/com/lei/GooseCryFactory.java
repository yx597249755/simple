package com.lei;

public class GooseCryFactory implements ProviderSuperFactory {
    @Override
    public Cry createCry() {
        return new GooseCry();
    }
}
