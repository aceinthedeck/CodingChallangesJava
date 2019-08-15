package com.aceinthedeck.arrays;

import org.junit.Assert;
import org.junit.Test;

public class NewYearChaosTest {

    @Test
    public void test1(){

        int[] q = {2, 1, 5, 3, 4};
        Assert.assertEquals("3", NewYearChaos.minimumBribes(q));
    }

    @Test
    public void test2(){

        ////////////1 2 3 4 5 6 7 8
        int[] q = {1, 2, 5, 3, 7, 8, 6, 4};
        Assert.assertEquals("7", NewYearChaos.minimumBribes(q));
    }

}
