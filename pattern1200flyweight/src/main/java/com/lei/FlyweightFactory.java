package com.lei;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    Map<String,Flyweight> map=new HashMap<>(  );

    public Flyweight getFlyweight(String name){
        Flyweight flyweight = map.get( name );
        if (flyweight==null){
            flyweight=new FlyweightImpl();
            map.put( name,flyweight );
        }

        return flyweight;


    }



}
