package com.lei.client;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {

    Client client = new Client();
    @Test
    public void run() {


        String s = client.run();

        Assert.assertEquals( "goose run",s );

    }


    @Test
    public void cry() {

        String s = client.cry();

        Assert.assertEquals( "goose cry",s );

    }
}