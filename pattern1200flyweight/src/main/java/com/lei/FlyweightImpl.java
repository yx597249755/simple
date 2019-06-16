package com.lei;

public class FlyweightImpl implements Flyweight {
    @Override
    public String method1(String name) {
        return name;
    }

    @Override
    public String method2(int age) {
        return age+"----";
    }
}
