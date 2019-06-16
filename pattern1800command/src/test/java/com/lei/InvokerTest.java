package com.lei;

import org.junit.Test;

import static org.junit.Assert.*;

public class InvokerTest {

    @Test
    public void action() {
        Receiver receiver = new Receiver();
        Command cmd = new MyCommand(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action();

    }
}