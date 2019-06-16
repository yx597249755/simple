package com.lei.two;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComputerPartDisplayVisitorTest {

    @Test
    public void visit() {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());

    }
}