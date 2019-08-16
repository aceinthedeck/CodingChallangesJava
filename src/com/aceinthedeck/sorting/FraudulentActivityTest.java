package com.aceinthedeck.sorting;

import org.junit.Assert;
import org.junit.Test;

public class FraudulentActivityTest {


    @Test
    public void test1(){

        int[] expenditures = {2, 3, 4, 2, 3, 6, 8, 4, 5};

        Assert.assertEquals(2, FraudulentActivity.notifications(expenditures, 5));
    }

    @Test
    public void test2(){

        int[] expenses = {1, 2, 3, 4, 4};
        Assert.assertEquals(0, FraudulentActivity.notifications(expenses, 4));

    }


}
