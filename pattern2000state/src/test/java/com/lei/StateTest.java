package com.lei;

import org.junit.Test;

import static org.junit.Assert.*;

public class StateTest {

    @Test
    public void method123() {
        State state = new State();
        Context context = new Context(state);

        //设置第一种状态
        state.setValue("state1");
        context.method();

        //设置第二种状态
        state.setValue("state2");
        context.method();
    }


}