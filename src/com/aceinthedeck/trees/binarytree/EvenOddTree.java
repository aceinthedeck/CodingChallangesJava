package com.aceinthedeck.trees.binarytree;

import java.util.LinkedList;
import java.util.Queue;

/*
https://leetcode.com/problems/even-odd-tree/

A binary tree is named Even-Odd if it meets the following conditions:

The root of the binary tree is at level index 0, its children are at level index 1, their children are at level index 2, etc.

- For every even-indexed level, all nodes at the level have odd integer values in strictly increasing order (from left to right).
- For every odd-indexed level, all nodes at the level have even integer values in strictly decreasing order (from left to right).
Given the root of a binary tree, return true if the binary tree is Even-Odd, otherwise return false.

 */

public class EvenOddTree {

    public static boolean isEvenOdd(TreeNode root){

        if(root==null){
            return false;
        }

        Queue<TreeNode> queue =new LinkedList<>();

        queue.offer(root);

        int currentLevel = 0;

        while(!queue.isEmpty()){

            int currentLevelSize = queue.size();

            int previousValue = 0;

            for(int i=0; i<currentLevelSize; i++){

                TreeNode currentNode = queue.poll();

                int currentValue = currentNode.val;

                //even level
                if(currentLevel%2==0){

                    // return false if even level has even number
                    if(currentValue%2==0){
                        return false;
                    }

                    //first node from the left
                    if(previousValue==0){

                        previousValue = currentValue;
                    }

                    else if(previousValue!=0 && currentValue>previousValue){
                        previousValue = currentValue;

                    }
                    //current value is smaller than previous value
                    else{
                        return false;
                    }
                }

                // odd level
                else {

                    // return false if odd level has odd number
                    if(currentValue%2!=0){
                        return false;
                    }

                    //first node from left
                    if(previousValue==0){
                        previousValue = currentValue;
                    }

                    else if(previousValue!=0 && currentValue<previousValue){
                        previousValue = currentValue;
                    }
                    // current value is greater than previous value
                    else{
                        return false;
                    }
                }

                if(currentNode.left!=null){
                    queue.offer(currentNode.left);
                }

                if(currentNode.right!=null){
                    queue.offer(currentNode.right);
                }

            }

            previousValue = 0;
            currentLevel++;

        }
        return true;
    }

    public boolean isEvenOddTree(TreeNode root) {
        if(root == null) return true;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        boolean even = true;
        while(q.size() > 0) {
            int size = q.size();
            int prevVal = even ? Integer.MIN_VALUE : Integer.MAX_VALUE; // init preVal based on level even or odd
            while(size-- > 0) { // level by level
                root = q.poll();
                if(even && (root.val % 2 == 0 || root.val <= prevVal)) return false; // invalid case on even level
                if(!even && (root.val % 2 == 1 || root.val >= prevVal)) return false; // invalid case on odd level
                prevVal = root.val; // update the prev value
                if(root.left != null) q.add(root.left); // add left child if exist
                if(root.right != null) q.add(root.right); // add right child if exist
            }
            even = !even; // alter the levels
        }

        return true;
    }

}
