package com.lei;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {

    Client client=new Client();

    @Test
    public void gooseCry() {
        String s = client.gooseCry();
        Assert.assertEquals( "goose cry",s );
    }

    @Test
    public void catCry() {
        String s = client.catCry();
        Assert.assertEquals( "cat cry",s );
    }

    @Test
    public void dogCry() {
        String s = client.dogCry();
        Assert.assertEquals( "dog cry",s );
    }
}