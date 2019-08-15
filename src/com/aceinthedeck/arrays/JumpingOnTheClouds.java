package com.aceinthedeck.arrays;

public class JumpingOnTheClouds {

    static int jumps(int[] c) {

        int current = 0;
        int counter = 0;
        while(current<c.length){

            if(current==c.length-1){
                break;
            }

            if(current+2<c.length && c[current+2]==0){
                counter++;
                current+=2;
            }
            else if(current+1<c.length && c[current+1]==0){
                counter++;
                current++;
            }

        }
        return counter;
    }
}
