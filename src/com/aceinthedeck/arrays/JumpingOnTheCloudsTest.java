package com.aceinthedeck.arrays;

import org.junit.Assert;
import org.junit.Test;

public class JumpingOnTheCloudsTest {

    @Test
    public void test1(){

        int[] clouds = {0, 0, 1, 0, 0, 1, 0};

        Assert.assertEquals(4, JumpingOnTheClouds.jumps(clouds));

    }

    @Test
    public void test2(){

        int[] clouds = {0, 0, 0, 1, 0, 0 };

        Assert.assertEquals(3, JumpingOnTheClouds.jumps(clouds));

    }
}
