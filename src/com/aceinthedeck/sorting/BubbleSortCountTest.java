package com.aceinthedeck.sorting;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BubbleSortCountTest {

    @Test
    public void test1(){

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        int[] a = {6, 4, 1};

        BubbleSortCount.countSwaps(a);

        String output = new String(outputStream.toByteArray());
        Assert.assertEquals(output,
                "Array is sorted in 3 swaps.\nFirst element: 1\nLast element: 6\n");

    }
}
