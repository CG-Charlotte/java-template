package com.yourself;


import org.junit.Assert;
import org.junit.Test;

public class ExampleTest{

    @Test
    public  void test(){

        Assert.assertEquals("Did you return Hello World?", "Hello World!", Example.HelloWorld());
    }

}