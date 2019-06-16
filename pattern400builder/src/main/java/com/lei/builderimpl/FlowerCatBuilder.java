package com.lei.builderimpl;

import com.lei.builder.CatBuilder;

public class FlowerCatBuilder implements CatBuilder {
    @Override
    public String prepareColor() {
        return "flower";
    }

    @Override
    public float calcPrice() {
        return 1999.1f;
    }

    @Override
    public String prepareArtificer() {
        return "C";
    }
}
