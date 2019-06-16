package com.lei.adapter;

import com.lei.AnimalSource;
import org.junit.Test;

public class AnimalAdapterOfObjectTest {
    AnimalAdapterOfObject animalAdapter = new AnimalAdapterOfObject(new AnimalSource() );
    @Test
    public void fly() {

        animalAdapter.fly();

    }

    @Test
    public void eat() {
        animalAdapter.eat();
    }
}