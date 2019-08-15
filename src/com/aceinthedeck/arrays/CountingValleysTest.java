package com.aceinthedeck.arrays;

import org.junit.Assert;
import org.junit.Test;

public class CountingValleysTest {


    @Test
    public void test1(){

        Assert.assertEquals(1, CountingValleys.countingValleys(8, "UDDDUDUU"));
    }

    @Test
    public void test2(){

        Assert.assertEquals(2, CountingValleys.countingValleys(12, "DDUUDDUDUUUD"));
    }
}
