package com.lei;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarProxyTest {

    @Test
    public void sale() {
        CarProxy carProxy = new CarProxy( new CarImpl() );
        carProxy.sale();

    }
}