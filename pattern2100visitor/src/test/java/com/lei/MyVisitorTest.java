package com.lei;

import com.lei.one.MySubject;
import com.lei.one.MyVisitor;
import com.lei.one.Subject;
import com.lei.one.Visitor;
import org.junit.Test;

public class MyVisitorTest {

    @Test
    public void visit() {

        Visitor visitor = new MyVisitor();
        Subject sub = new MySubject();
        sub.accept(visitor);


    }
}