package com.aceinthedeck.arrays;

import com.aceinthedeck.arrays.ContinousSubArray;
import org.junit.Assert;
import org.junit.Test;

public class ContinousSubArrayTest {


    @Test
    public void test1(){
        int[] array = {1, 2, 3, 7, 5};
        int[] output = ContinousSubArray.findSubarray(array, 12);
        Assert.assertArrayEquals(new int[]{2,3,7},output);
    }


}
