package com.lei.builderimpl;

import com.lei.builder.CatBuilder;

public class WhiteCatBuilder implements CatBuilder {
    @Override
    public String prepareColor() {
        return "white";
    }

    @Override
    public float calcPrice() {
        return 300.1f;
    }

    @Override
    public String prepareArtificer() {
        return "B";
    }
}
