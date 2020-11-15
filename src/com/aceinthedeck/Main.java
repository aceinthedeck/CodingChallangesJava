package com.aceinthedeck;

import com.aceinthedeck.arrays.SequentialDigits;
import com.aceinthedeck.dynamicprogramming.FibonacciSeries;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Integer> result = SequentialDigits.digitsBFS(100, 10000);

        System.out.println(result);
    }
}
