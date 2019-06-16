package com.lei.adapter;

import com.lei.AnimalSource;
import com.lei.AnimalTarget;

//适配器模式-类的适配
public class AnimalAdapterOfClass extends AnimalSource implements AnimalTarget {
    @Override
    public void eat() {
        System.out.println("eat 1111");

    }
}
