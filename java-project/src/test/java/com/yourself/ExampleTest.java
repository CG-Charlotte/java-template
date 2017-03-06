package com.yourself;


import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class ExampleTest{

    @Test
    public  void test(){

        Assert.assertEquals("Did you return Hello World?", "Hello World!", Example.HelloWorld());
    }

    @Test
    public void visualisation() throws IOException {
        Process p = Runtime.getRuntime().exec("ls /project/target ");
        System.out.println("CG> open -s /project/target/target/classes HelloWorld.html");
        System.out.println("CG> open -s /project/target HelloWorld.html");

    }

}