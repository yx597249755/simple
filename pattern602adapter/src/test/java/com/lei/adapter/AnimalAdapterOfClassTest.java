package com.lei.adapter;

import org.junit.Test;

public class AnimalAdapterOfClassTest {
    AnimalAdapterOfClass animalAdapter = new AnimalAdapterOfClass();

    @Test
    public void fly() {
        animalAdapter.fly();
    }

    @Test
    public void eat() {
        animalAdapter.eat();
    }
}