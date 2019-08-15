package com.aceinthedeck.strings;

import org.junit.Assert;
import org.junit.Test;

public class RepeatedStringTest {

    @Test
    public void test1(){
        Assert.assertEquals(7, RepeatedString.count("aba", 10));
    }

    @Test
    public void test2(){
        Assert.assertEquals(1000000000000L, RepeatedString.count("a", 1000000000000L));
    }


}
