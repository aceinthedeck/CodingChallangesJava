package com.aceinthedeck.arrays;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CountTripletTest {


    @Test
    public void test1(){

        long[] array = {1, 3, 9, 9, 27, 81};
        Assert.assertEquals(6, CountTriplets.count(array, 3));
    }
}

