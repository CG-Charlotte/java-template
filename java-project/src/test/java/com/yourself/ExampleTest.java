package com.yourself;


import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExampleTest{

    @Test
    public  void test(){

        Assert.assertEquals("Did you return Hello World?", "Hello World!", Example.HelloWorld());
    }

    @Test
    public void visualisation() throws IOException {
        Process p = Runtime.getRuntime().exec("ls /project/target ");

        BufferedReader stdInput = new BufferedReader(new
                InputStreamReader(p.getInputStream()));


        // read the output from the command
        System.out.println("Here is the standard output of the command:\n");
        String s;
        while ((s = stdInput.readLine()) != null) {
            System.out.println(s);
        }

        System.out.println("CG> open -s /project/target HelloWorld.html");

    }

}