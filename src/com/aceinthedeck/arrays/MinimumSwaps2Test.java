package com.aceinthedeck.arrays;

import org.junit.Assert;
import org.junit.Test;

public class MinimumSwaps2Test {


    @Test
    public void test1(){
        int[] array= {1, 3, 5, 2, 4, 6, 7};
        Assert.assertEquals(3, MinimumSwaps2.count(array));
    }
}
