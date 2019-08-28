package com.aceinthedeck.hashmap;

/*

https://www.hackerrank.com/challenges/ctci-ransom-note/problem





 */

import java.util.HashMap;

public class RansomNote {


    // Complete the checkMagazine function below.
    static boolean checkMagazine(String[] magazine, String[] note) {

        HashMap<String, Integer> magazineMap = new HashMap<>();
        HashMap<String, Integer> noteMap = new HashMap<>();

        for(int i=0;i<magazine.length;i++){


            Integer j = magazineMap.get(magazine[i]);

            if(j==null){
                magazineMap.put(magazine[i], 1);
            }
            else {
                magazineMap.put(magazine[i],j+1);
            }

        }

        for(int i=0; i<note.length;i++){

            Integer j =magazineMap.get(note[i]);

            if(j == null || j==0){
                return false;
            }
            else{
                magazineMap.put(note[i], j-1);
            }

        }


        return true;


    }



}
