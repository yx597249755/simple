package com.lei.director;

import com.lei.builder.CatBuilder;
import com.lei.builderimpl.BlackCatBuilder;
import com.lei.builderimpl.FlowerCatBuilder;
import com.lei.builderimpl.WhiteCatBuilder;
import com.lei.product.Cat;

//指挥者
public class CatDirector {

    private CatBuilder catBuilder;

    public Cat getBlackCat(){
        catBuilder=new BlackCatBuilder();
        return getProduct();
    }

    public Cat getWhiteCat(){
        catBuilder=new WhiteCatBuilder();
        return getProduct();
    }


    public Cat getFlowerCat(){
        catBuilder=new FlowerCatBuilder();
        return getProduct();
    }


    private Cat getProduct() {
        Cat cat = new Cat();
        cat.setColor( catBuilder.prepareColor());
        cat.setPrice( catBuilder.calcPrice() );
        cat.setArtificer( catBuilder.prepareArtificer());

        return cat;
    }


}
