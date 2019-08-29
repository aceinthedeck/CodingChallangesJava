package com.aceinthedeck.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromeTest {


    @Test
    public void test1(){

        Assert.assertEquals(5, LongestPalindrome.count("ABBDCACB", 0, 7));

    }
}
