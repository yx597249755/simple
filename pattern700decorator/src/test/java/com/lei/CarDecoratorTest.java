package com.lei;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarDecoratorTest {

    @Test
    public void sale() {

        CarDecorator decorator = new CarDecorator( new CarImpl() );
        decorator.sale();

    }
}