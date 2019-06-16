package com.lei;

import org.junit.Test;

import static org.junit.Assert.*;

public class MySubjectTest {

    @Test
    public void operation() {
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());

        sub.operation();

    }
}