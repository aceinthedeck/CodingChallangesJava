package com.aceinthedeck.tests;

import com.aceinthedeck.ReverseInteger;
import org.junit.Assert;
import org.junit.Test;

public class ReverseIntegerTest {

    @Test
    public void ReverseIntegerTest1337()
    {
        Assert.assertEquals(7331, ReverseInteger.reverse(1337));
    }

    @Test
    public void ReverseIntegerTest100(){
        Assert.assertEquals(1, ReverseInteger.reverse(100));
    }

    @Test
    public void ReverseIntegerTest91(){
        Assert.assertEquals(-19, ReverseInteger.reverse(-91));
    }




}
