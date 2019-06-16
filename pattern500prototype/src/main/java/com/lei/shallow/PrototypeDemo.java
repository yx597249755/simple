package com.lei.shallow;

import com.lei.domain.Car;

public class PrototypeDemo implements Cloneable {

    private Car car=new Car(  );
    private String ad;
    private int age;



    /**
     * 浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
     *
     * 深复制：将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底。
     *
     * @return
     * @throws CloneNotSupportedException
     */

    @Override
    protected PrototypeDemo clone() throws CloneNotSupportedException {

        return (PrototypeDemo)super.clone();
    }


    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
