package com.lei;

/**
 * 当一个对象变化时，其它依赖该对象的对象都会收到通知，并且随着变化！对象之间是一种一对多的关系。先来看看关系图：
 */
public interface Observer {

     void update();
}
