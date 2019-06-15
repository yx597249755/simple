package com.lei;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CryFactoryTest {

    @Test
    public void createCatCry() {
        String s1 = CryFactory.createCatCry().crymethod();
        Assert.assertEquals( "cat cry",s1 );
    }

    @Test
    public void createDogCry() {
        String s1 = CryFactory.createDogCry().crymethod();
        Assert.assertEquals( "dog cry",s1 );
    }
}