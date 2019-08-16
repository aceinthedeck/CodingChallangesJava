package com.aceinthedeck.sorting;

import org.junit.Assert;
import org.junit.Test;

public class MarkAndToysTest {

    @Test
    public void test1(){
        int[] prices = {1, 12, 5, 111, 200, 1000, 10};
        Assert.assertEquals(4, MarkAndToys.maximumToys(prices, 50));
    }
}
