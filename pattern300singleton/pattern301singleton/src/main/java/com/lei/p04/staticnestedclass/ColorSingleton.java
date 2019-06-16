package com.lei.p04.staticnestedclass;

//这个类可以满足基本要求，但是，像这样毫无线程安全保护的类，如果我们把它放入多线程的环境下，肯定就会出现问题了

public class ColorSingleton {


    /* 私有构造方法，防止被实例化 */
    private ColorSingleton() {

    }

    /* 此处使用一个内部类来维护单例 */
    private static class singletonFactory{
        private static ColorSingleton instance =new ColorSingleton();
        /**
         * 实际情况是，单例模式使用内部类来维护单例的实现，JVM内部的机制能够保证当一个类被加载的时候，这个类的加载过程是线程互斥的。这样当我们第一次调用getInstance的时候，JVM能够帮我们保证instance只被创建一次，并且会保证把赋值给instance的内存初始化完毕，这样我们就不用担心上面的问题。同时该方法也只会在第一次调用的时候使用互斥机制，这样就解决了低性能问题。这样我们暂时总结一个完美的单例模式：
         *
         * 其实说它完美，也不一定，如果在构造函数中抛出异常，实例将永远得不到创建，也会出错。所以说，十分完美的东西是没有的，我们只能根据实际情况，选择最适合自己应用场景的实现方法。
         *
         */
    }

    /* 静态工程方法，创建实例 */
    public  static ColorSingleton getInstance(){
        return singletonFactory.instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public ColorSingleton readResolve() {
        return getInstance();
    }

}
