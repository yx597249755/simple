package com.lei;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyBridgeTest {

    @Test
    public void displayStudy() {

        Bridge bridge=new MyBridge();
        Student studentA = new StudentA();
        bridge.setStudent( studentA );
        bridge.displayStudy();

        Bridge bridge2=new MyBridge();
        Student studentB = new StudentB();
        bridge2.setStudent( studentB );
        bridge2.displayStudy();

    }
}