package com.aceinthedeck.hashmap;

import org.junit.Assert;
import org.junit.Test;

public class RansomNoteTest {


    @Test
    public void test1(){

        String[] magazine = {"give", "me", "one", "grand", "today", "night"};
        String[] note = {"give", "one", "grand", "today"};
        Assert.assertEquals(true, RansomNote.checkMagazine(magazine,note));
    }
}
