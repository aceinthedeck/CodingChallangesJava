package com.aceinthedeck.strings;

import java.util.*;

/*

https://www.hackerrank.com/challenges/ctci-making-anagrams/problem

Alice is taking a cryptography class and finding anagrams to be very useful. We consider two strings to be anagrams of each other if the first string's letters can be rearranged to form the second string.
In other words, both strings must contain the same exact letters in the same exact frequency For example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.

Alice decides on an encryption scheme involving two large strings where encryption is dependent on the minimum number of character deletions required to make the two strings anagrams.
Can you help her find this number?

Example

cde
abc

Output 4

Remove d and e from cde to get c.
Remove a and b from abc to get c.

So 4 deletions

 */

public class MakingAnagrams {

    public static int numberNeeded(String first, String second) {
        Map<Character, Integer> count = new HashMap<>();
        for( char ch: first.toCharArray() ) {
            int ct = count.containsKey(ch) ? count.get(ch) : 0;
            count.put(ch, (ct + 1));
        }

        for( char ch: second.toCharArray() ) {
            int ct = count.containsKey(ch) ? count.get(ch) : 0;
            count.put(ch, (ct - 1));
        }

        List<Integer> values = new ArrayList<>( count.values() );
        int total = 0;
        for( Integer v: values ) {
            total += Math.abs(v);
        }
        return total;
    }

}
