package com.lei;

public class Client {
    public void show(){
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight red = factory.getFlyweight( "red" );
        factory.getFlyweight( "green" );
        factory.getFlyweight( "yellow" );
        factory.getFlyweight( "yellow" );
        factory.getFlyweight( "yellow" );

        System.out.println(factory.map.size());


    }
}
