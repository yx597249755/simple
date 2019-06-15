package com.lei;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CryFactoryTest {

    CryFactory cryFactory =null;
    @Before
    public void setUp() throws Exception {
        cryFactory = new CryFactory();
        System.out.println(">>>>>>>>>>>setUp");

    }

    @After
    public void tearDown() throws Exception {

        cryFactory=null;
        System.out.println(">>>>>>>>>>>tearDown");
    }

    @Test
    public void createCry() {

        Cry cry = cryFactory.createCry( "DOG" );
        String s = cry.crymethod();
        Assert.assertEquals( "dog cry" ,s);


    }
}