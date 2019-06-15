package com.lei.client;

import com.lei.factory.AnimalFactory;
import com.lei.factory.CatFatcory;
import com.lei.factory.DogFatcory;
import com.lei.factory.GooseFatcory;

public class Client {

    public String run(){
        AnimalFactory catFatcory = new CatFatcory();
        AnimalFactory dogFatcory = new DogFatcory();
        AnimalFactory gooseFatcory = new GooseFatcory();
        return gooseFatcory.createRun().runmethod();


    }


}
