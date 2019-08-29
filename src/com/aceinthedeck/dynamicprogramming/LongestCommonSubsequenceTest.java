package com.aceinthedeck.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonSubsequenceTest {

    @Test
    public void test1(){
        Assert.assertEquals(4, LongestCommonSubsequence.count("ABCBDAB", "BDCABA", 7, 6));
    }
}
