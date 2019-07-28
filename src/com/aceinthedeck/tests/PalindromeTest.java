package com.aceinthedeck.tests;

import com.aceinthedeck.Palindrome;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {


    @Test
    public void PalindromeHello(){
       Assert.assertEquals(Palindrome.palindrome("hello"), false);
    }

    @Test
    public void PalindromeAbba(){
        Assert.assertEquals(Palindrome.palindrome("abba"), true);
    }
}
