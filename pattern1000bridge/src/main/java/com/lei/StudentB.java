package com.lei;

import java.sql.Driver;
import java.sql.DriverManager;

public class StudentB implements Student {
    @Override
    public void study() {
        System.out.println("BBBB");
    }

    public static void main(String[] args) {
        DriverManager a;
        Driver b;


    }
}
