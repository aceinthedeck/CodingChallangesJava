package com.aceinthedeck.tests;

import com.aceinthedeck.Anagram;
import org.junit.Assert;
import org.junit.Test;

public class AnagramTest {


    @Test
    public void AnagramTestSort1(){
        Assert.assertTrue(Anagram.anagramBySorting("triangle", "integral"));
    }

    @Test
    public void AnagramTestSort2(){
        Assert.assertFalse(Anagram.anagramBySorting("apple", "oragnes"));
    }

    @Test
    public void AnagramTestStorage1(){
        Assert.assertTrue(Anagram.anagramByStorage("triangle", "integral"));
    }

    @Test
    public void AnagramTestStorage2(){
        Assert.assertFalse(Anagram.anagramBySorting("apple", "oragnes"));
    }




}
