package com.lei;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CryFactoryTest {

    CryFactory cryFactory=null;
    @Before
    public void setUp() throws Exception {
         cryFactory = new CryFactory();
    }

    @After
    public void tearDown() throws Exception {
        cryFactory=null;
    }

    @Test
    public void createCatCry() {
        String s = cryFactory.createCatCry().crymethod();
        Assert.assertEquals( "cat cry",s );
    }

    @Test
    public void createDogCry() {
        String s = cryFactory.createDogCry().crymethod();
        Assert.assertEquals( "dog cry",s );
    }
}