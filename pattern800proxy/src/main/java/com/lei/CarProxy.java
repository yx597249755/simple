package com.lei;

/**
 * 装饰器模式 关注点在扩展功能，一个团队
 *
 * 代理模式 关注点在我就是对象本身，一个全能的人
 *
 */
public class CarProxy implements Car {

    private CarImpl carImpl;

    public CarProxy() {
    }

    public CarProxy(CarImpl carImpl) {
        this.carImpl = carImpl;
    }

    @Override
    public void sale() {


        before();
        carImpl.sale();
        after();

    }

    public void before(){
        System.out.println("before");
    }
    public void after(){
        System.out.println("after");
    }

}
