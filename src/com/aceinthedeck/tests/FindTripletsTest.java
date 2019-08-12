package com.aceinthedeck.tests;

import com.aceinthedeck.FindTriplets;
import org.junit.Assert;
import org.junit.Test;

public class FindTripletsTest {

    @Test
    public void test1(){

        int[] array = {1, 5, 3, 2};
        Assert.assertEquals(2, FindTriplets.process(array));
    }

    @Test
    public void test2(){

        int[] array = {7, 3, 2};
        Assert.assertEquals(0, FindTriplets.process(array));
    }
}
