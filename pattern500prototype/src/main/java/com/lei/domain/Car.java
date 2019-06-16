package com.lei.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Car implements Serializable {

    private String name;
    private float price;

    public Car() {
    }

    public Car(String name, float price) {
        this.name = name;
        this.price = price;
    }
}
