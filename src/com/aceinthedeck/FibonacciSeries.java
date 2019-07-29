package com.aceinthedeck;

public class FibonacciSeries {


    public static void iterative(int n){

        int previous2 =0;
        int previous1 =1;
        int current;
        System.out.print(previous2+" "+previous1+ " ");

        for(int i=0;i<n;i++){
            current = previous1 + previous2;
            previous2 = previous1;
            previous1 = current;
            System.out.print(current+ " ");
        }

    }

    public static long recursion(int n){

        if(n<2){
            return n;
        }
        else{
            return recursion(n-1)+recursion(n-2);
        }
    }

    public static long recursionMemoization(int n){

        long[] cache = new long[n+1];

        if(n<2){
            return n;
        }
        if(cache[n]!=0){
            return cache[n];
        }
        else{
            cache[n] = recursion(n-1)+recursion(n-2);
            return cache[n];
        }
    }

    public static void compareRecurstionWithMemoization(int n){

        long preTime=System.currentTimeMillis();
        System.out.println("Value of number in Fibonacci series->"+recursion(n));
        long postTime=System.currentTimeMillis();
        System.out.println("Time taken to compute recursion in milliseconds->"+(postTime-preTime));

        preTime=System.currentTimeMillis();
        System.out.println("Value of number in Fibonacci series->"+recursionMemoization(n));
        postTime=System.currentTimeMillis();
        System.out.println("Time taken to compute recursion with memoization in milliseconds->"+(postTime-preTime));

    }

}
