package com.lei;


public class CryFactory {

    // 普通工厂仿佛，就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建
    public Cry createCry(String type){

        if ("cat".equalsIgnoreCase( type )){
            return new CatCry();
        }else if ("dog".equalsIgnoreCase( type )){
            return new DogCry();
        }else {
            return null;
        }

    }

}
