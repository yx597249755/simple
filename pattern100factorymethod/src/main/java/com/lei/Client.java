package com.lei;

public class Client {

    ProviderSuperFactory factory=null;

    public String gooseCry(){

        factory=new GooseCryFactory();
        Cry cry = factory.createCry();
        return cry.crymethod();
    }

    public String catCry(){

        factory=new CatCryFactory();
        Cry cry = factory.createCry();
        return cry.crymethod();
    }


    public String dogCry(){

        factory=new DogCryFactory();
        Cry cry = factory.createCry();
        return cry.crymethod();
    }


}
