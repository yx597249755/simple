package com.lei;

public class Client {

    public void calculate() {

        String exp="2+1";

        Calculator cal = new Plus();
        int result = cal.calculate(exp);
        System.out.println(result);

    }

}
