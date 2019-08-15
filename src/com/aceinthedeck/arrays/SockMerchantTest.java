package com.aceinthedeck.arrays;

import org.junit.Assert;
import org.junit.Test;

public class SockMerchantTest {

    @Test
    public void test1(){

        int[] array = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int n =9;
        Assert.assertEquals(3, SockMerchant.getPairs(n, array));
    }

    @Test
    public void test2(){

        int[] array = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
        int n =10;
        Assert.assertEquals(4, SockMerchant.getPairs(n, array));
    }
}
