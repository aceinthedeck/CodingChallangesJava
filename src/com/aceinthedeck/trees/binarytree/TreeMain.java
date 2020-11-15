package com.aceinthedeck.trees.binarytree;

public class TreeMain {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(10);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        System.out.println(EvenOddTree.isEvenOdd(root));

    }
}
