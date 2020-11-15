package com.aceinthedeck.hashmap;

import java.util.HashMap;

public class Practice {

    public static void main(String[] args){

        int[] array = {2, 7, 9, 3};
        int target = 4;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i =0; i< array.length; i++){
            map.put(array[i], i);
        }

        /*
            2 -> 0
            7 -> 1
            9 -> 2
            3 -> 3
         */

        for(int i=0; i< array.length; i++){

            int numberToSearch = target - array[i];

            if(map.containsKey(numberToSearch) && map.get(numberToSearch) !=i){

                System.out.println("First Index: " +  i);
                System.out.println("Second Index: "+ map.get(numberToSearch));
                return;
            }
        }

        System.out.println("Target sum not found");


    }

}
