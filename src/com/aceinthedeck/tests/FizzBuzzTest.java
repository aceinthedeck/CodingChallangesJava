package com.aceinthedeck.tests;

import com.aceinthedeck.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FizzBuzzTest {

    @Test
    public void fizzBuzzTest1(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        FizzBuzz.print(3);
        String output = new String(outputStream.toByteArray());
        Assert.assertEquals(output, "1\n2\nFizz\n");
    }
}
