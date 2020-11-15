package com.aceinthedeck.arrays;
/*

https://leetcode.com/problems/sequential-digits/
An integer has sequential digits if and only if each digit in the number is one more than the previous digit.
Return a sorted list of all the integers in the range [low, high] inclusive that have sequential digits.

Ex
Input: low = 1000, high = 13000
Output: [1234,2345,3456,4567,5678,6789,12345]
 */

import java.util.*;

public class SequentialDigits {

    public static List<Integer> digits(int low, int high){

        List<Integer> result = new ArrayList<>();

        if(high < low){
            return result;
        }

        for (int digit = 1; digit < 9; digit++) {
            int next = digit, n = next;
            while (n <= high && next < 10) {
                if (n >= low) {
                    result.add(n);
                }
                n = n * 10 + ++next;
            }
        }
        return result;
    }

    // BFS
    public static List<Integer> digitsBFS(int low, int high) {
        int MOD=1000000000;
        List<Integer> result=new ArrayList<>();
        if(low<10||high>MOD){
            return result;
        }
        Queue<Integer> queue=new LinkedList<>();
        for(int i=1;i<=9;i++){
            queue.offer(i);
        }
        while(!queue.isEmpty()){
            int target=queue.poll();
            if(target>=low&&target<=high){
                result.add(target);
            }
            int tail=target%10;
            if(tail<9&&target<=high){
                queue.offer(target*10+tail+1);
            }
        }
        return result;
    }

    //dfs
    public List<Integer> digitDFS(int low, int high) {
        int MOD=1000000000;
        List<Integer> result=new ArrayList<>();
        if(low<10||high>MOD){
            return result;
        }
        for(int i=1;i<=9;i++){
            backtrace(result,i,0,low,high);
        }
        Collections.sort(result);
        return result;
    }

    public void backtrace(List<Integer> result,int start,int target,int low,int high){
        if(target>=low&&target<=high){
            result.add(target);
        }
        if(start>9||target>high){
            return;
        }
        backtrace(result,start+1,target*10+start,low,high);
    }



}
