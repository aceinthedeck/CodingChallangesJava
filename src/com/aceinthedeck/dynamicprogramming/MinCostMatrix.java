package com.aceinthedeck.dynamicprogramming;

/*

Find the minimum cost to reach a sell from first cell in a matrix

 */

public class MinCostMatrix {

    static int minCost(int[][] cost, int m, int n){


        int[][] costMatrix = new int[m+1][n+1];

        if(m==-1 || n==-1){
            return Integer.MAX_VALUE;
        }

        if(m==0 && n ==0){

            return cost[m][n];
        }

        if(costMatrix[m][n]==0){

            return Integer.min(minCost(cost, m-1, n), minCost(cost, m, n-1)) + cost[m][n];
        }

        else
            return costMatrix[m][n];



    }
}
