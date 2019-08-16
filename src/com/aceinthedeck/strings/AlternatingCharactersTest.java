package com.aceinthedeck.strings;

import org.junit.Assert;
import org.junit.Test;

public class AlternatingCharactersTest {

    @Test
    public void test1(){

       Assert.assertEquals(3, AlternatingCharacters.deletions("AAAA"));

    }
}
