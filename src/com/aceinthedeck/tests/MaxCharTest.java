package com.aceinthedeck.tests;

import com.aceinthedeck.MaxChar;
import org.junit.Assert;
import org.junit.Test;

public class MaxCharTest {


    @Test
    public void MaxCharTestA(){

        Assert.assertEquals("a", MaxChar.maxChar("aaabbbccca"));

    }

    @Test
    public void MaxCharTestB(){

        Assert.assertEquals("a", MaxChar.maxChar("abrakadabra"));

    }
}
