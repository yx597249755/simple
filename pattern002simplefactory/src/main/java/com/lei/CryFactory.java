package com.lei;

public class CryFactory {

    //001 就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建
    //002 在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法，分别创建对象
//    public Cry createCry(String type){
//
//        if ("cat".equalsIgnoreCase( type )){
//            return new CatCry();
//        }else if ("dog".equalsIgnoreCase( type )){
//            return new DogCry();
//        }else {
//            return null;
//        }
//
//    }

    public Cry createCatCry(){
        return new CatCry();
    }
    public Cry createDogCry(){
        return new DogCry();
    }






}
