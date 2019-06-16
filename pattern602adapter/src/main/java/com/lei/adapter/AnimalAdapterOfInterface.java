package com.lei.adapter;

import com.lei.interfaceadapter.Animal1;
import com.lei.interfaceadapter.Animal2;
import com.lei.interfaceadapter.AnimalInterface;

public class AnimalAdapterOfInterface implements AnimalInterface {

    AnimalInterface animalAdapter=null;
    @Override
    public void method1() {
        new Animal1().method1();

    }

    @Override
    public void method2() {
        new Animal2().method2();
    }

    @Override
    public void method3() {

    }

    @Override
    public void method4() {

    }
}
