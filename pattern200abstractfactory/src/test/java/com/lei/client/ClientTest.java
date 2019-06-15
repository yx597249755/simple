package com.lei.client;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {

    @Test
    public void run() {

        Client client = new Client();
        String s = client.run();

        Assert.assertEquals( "goose run",s );

    }
}