package com.aceinthedeck.arrays;

import org.junit.Assert;
import org.junit.Test;

public class RotateLeftTest {

    @Test
    public void test1(){
        int[] a = {1,2,3,4,5};
        int[] result = {5,1,2,3,4};
        Assert.assertArrayEquals(result, RotateLeft.rotate(a,4));
    }
}
