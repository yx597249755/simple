package com.lei.factory;

import com.lei.*;

public class GooseFatcory implements AnimalFactory {
    @Override
    public Cry createCry() {
        return new GooseCry();
    }

    @Override
    public Run createRun() {
        return new GooseRun();
    }
}
