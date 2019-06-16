package com.lei;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlusTest {

    @Test
    public void interpret() {

        // 计算9+2-8的值
        int result = new Minus().interpret(new Context( 2,9 ));
        System.out.println(result);

    }
}