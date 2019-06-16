package com.lei.adapter;

import com.lei.AnimalSource;
import com.lei.AnimalTarget;

//适配器模式-对象的适配
public class AnimalAdapterOfObject extends AnimalSource implements AnimalTarget {

    AnimalSource animalAdapter;

    public AnimalAdapterOfObject() {
    }

    public AnimalAdapterOfObject(AnimalSource animalAdapter) {
        this.animalAdapter = animalAdapter;
    }

    @Override
    public void fly() {
        animalAdapter.fly();
    }

    @Override
    public void eat() {
        System.out.println("eat 2222");

    }
}
