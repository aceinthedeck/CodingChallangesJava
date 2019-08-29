package com.aceinthedeck.dynamicprogramming;

import com.aceinthedeck.dynamicprogramming.FibonacciSeries;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FibonacciSeriesTest {


    @Test
    public void iterativeTest5(){

        String expectedOutput ="0 1 1 2 3 5 8 ";

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        FibonacciSeries.iterative(5);
        String output = new String(outputStream.toByteArray());
        Assert.assertEquals(output, expectedOutput);

    }
}
