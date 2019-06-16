package com.lei.builderimpl;

import com.lei.builder.CatBuilder;
import com.lei.product.Cat;

public class BlackCatBuilder implements CatBuilder {
    @Override
    public String prepareColor() {
        return "black";
    }

    @Override
    public float calcPrice() {
        return 100.1f;
    }

    @Override
    public String prepareArtificer() {
        return "A";
    }


}
