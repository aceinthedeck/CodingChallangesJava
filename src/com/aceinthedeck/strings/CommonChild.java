package com.aceinthedeck.strings;

/*

https://www.hackerrank.com/challenges/common-child/problem

A string is said to be a child of a another string if it can be formed by deleting 0 or more characters from the other string. Given two strings of equal length, what's the longest string that can be constructed such that it is a child of both?

For example, ABCD and ABDC have two children with maximum length 3, ABC and ABD. They can be formed by eliminating either the D or C from both strings.
Note that we will not consider ABCD as a common child because we can't rearrange characters and ABCD is not equal to ABDC.



 */

public class CommonChild {

    static int length(String a, String b) {

        int[][] C = new int[a.length()+1][b.length()+1];

        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    C[i+1][j+1] = C[i][j] + 1;
                } else {
                    C[i+1][j+1] = Math.max(C[i+1][j], C[i][j+1]);
                }
            }
        }


        return C[a.length()][b.length()];

    }
}
