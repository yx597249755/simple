package com.lei;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlusTest {

    @Test
    public void calculate() {
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);


    }
}