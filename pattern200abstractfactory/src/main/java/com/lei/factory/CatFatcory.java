package com.lei.factory;

import com.lei.*;

public class CatFatcory implements AnimalFactory {
    @Override
    public Cry createCry() {
        return new CatCry();
    }

    @Override
    public Run createRun() {
        return new CatRun();
    }
}
