package com.aceinthedeck.tests;

import com.aceinthedeck.SentenceCapitalization;
import org.junit.Assert;
import org.junit.Test;

public class SentenceCapitalizationTest {


    @Test
    public void capitalizeTest(){

        Assert.assertEquals("A Quick Brown Fox",
                SentenceCapitalization.capitalize("a quick brown fox"));
    }

    @Test
    public void capitalizeTestEmpty(){

        Assert.assertEquals("",
                SentenceCapitalization.capitalize(""));
    }
}
