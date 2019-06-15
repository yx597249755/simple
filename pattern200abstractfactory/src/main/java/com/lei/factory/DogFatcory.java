package com.lei.factory;

import com.lei.*;

public class DogFatcory implements AnimalFactory {
    @Override
    public Cry createCry() {
        return new DogCry();
    }

    @Override
    public Run createRun() {
        return new DogRun();
    }
}
