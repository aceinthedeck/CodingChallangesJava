package com.aceinthedeck.tests;


import com.aceinthedeck.ReverseString;
import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {

    @Test
    public void testReverseApple(){
        final String expected = "elppa";
        Assert.assertEquals(expected, ReverseString.reverse("apple"));
    }

    @Test
    public void testReverseGoogle(){
        final String expected = "elgoog";
        Assert.assertEquals(expected, ReverseString.reverse("google"));
    }

    @Test
    public void testReverseEmpty(){
        final String expected = "";
        Assert.assertEquals(expected, ReverseString.reverse(""));
    }


}
