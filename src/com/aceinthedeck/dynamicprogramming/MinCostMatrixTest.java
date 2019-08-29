package com.aceinthedeck.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

public class MinCostMatrixTest {

    @Test
    public void test1(){

        int[][] cost =
                {
                        { 4, 7, 8, 6, 4 },
                        { 6, 7, 3, 9, 2 },
                        { 3, 8, 1, 2, 4 },
                        { 7, 1, 7, 3, 7 },
                        { 2, 9, 8, 9, 3 }
                };


        Assert.assertEquals(36, MinCostMatrix.minCost(cost, 4, 4));
    }
}
