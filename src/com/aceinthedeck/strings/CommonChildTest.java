package com.aceinthedeck.strings;

import org.junit.Assert;
import org.junit.Test;

public class CommonChildTest {

    @Test
    public void test1(){
      Assert.assertEquals(3, CommonChild.length("SHINCHAN", "NOHARAAA"));
    }
}
