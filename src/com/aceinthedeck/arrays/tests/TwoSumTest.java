package com.aceinthedeck.arrays.tests;

import com.aceinthedeck.arrays.TwoSum;
import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void test1(){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Assert.assertArrayEquals(new int[]{0, 1}, TwoSum.twoSum(nums,target));
    }

    @Test
    public void testHashMap1(){

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Assert.assertArrayEquals(new int[]{0, 1}, TwoSum.twoSumHashMap(nums,target));

    }

}
