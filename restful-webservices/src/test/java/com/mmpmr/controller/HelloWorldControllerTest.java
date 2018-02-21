package com.mmpmr.controller;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldControllerTest {
    HelloWorldController helloWorldController = new HelloWorldController();

    @Test
    public void testHelloWorld() throws Exception {
        String result = helloWorldController.helloWorld();
        Assert.assertEquals("Hello World", result);
    }

    @Test
    public void testHelloWithPathVar() throws Exception {
        String result = helloWorldController.helloWithPathVar("John");
        Assert.assertEquals("Hello, John", result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme