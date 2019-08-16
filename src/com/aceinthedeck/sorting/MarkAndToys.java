package com.aceinthedeck.sorting;

import java.util.Arrays;

public class MarkAndToys {

    static int maximumToys(int[] prices, int budget){

        Arrays.sort(prices);
        int count =0;

        for(int i=0; i<prices.length; i++){

            budget -= prices[i];

            if(budget<0){
                break;
            }

            count++;
        }

        return count;
    }
}
