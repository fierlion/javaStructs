/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree;

/**
 *
 * @author rayfoote
 */
public class BinarySearchTree implements SearchTree{
    private TreeNode root;
    
    public BinarySearchTree(int value) {
        root = new TreeNode(value, null, null);
    }
    
    public TreeNode getRoot() {
        return root;
    }
    
    @Override
    public TreeNode insert(TreeNode rootIn, int value) {
        if (rootIn == null) {
            rootIn = new TreeNode(value);
        }
        else if (value < rootIn.data) {
            rootIn.left = insert(rootIn.left, value);
        }
        else {
            rootIn.right = insert(rootIn.right, value);
        }
        return rootIn;
    }

    @Override
    public boolean contains(TreeNode rootIn, int value) {
        if (rootIn == null) {
            return false;
        }
        else if (value == rootIn.data) {
            return true;
        }
        else if (value > rootIn.data) {
            return contains(rootIn.right, value);
        }
        else {
            return contains(rootIn.left, value);
        }
    }

    @Override
    public TreeNode remove(TreeNode rootIn, int value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int sum(TreeNode rootIn) {
        if (rootIn == null) {
            return 0;
        }
        else {
            return (sum(rootIn.left) + sum(rootIn.right) + rootIn.data);
        }
    }

    @Override
    public int countLeaves(TreeNode rootIn) {
        if (rootIn == null) {
            return 0;
        }
        else if (rootIn.right == null && rootIn.left == null) {
            return 1;
        }
        else {
            return (countLeaves(rootIn.left) + countLeaves(rootIn.right));
        }
    }

    @Override
    public void printPre(TreeNode rootIn) {
        if (rootIn != null) {
            System.out.print(" " + rootIn.data);
            printPre(rootIn.left);
            printPre(rootIn.right);
        }
    }

    @Override
    public void printIn(TreeNode rootIn) {
        if (rootIn != null) {
            printIn(rootIn.left);
            System.out.println(" " + rootIn.data);
        }
    }

    @Override
    public void printPost(TreeNode rootIn) {
        if (rootIn != null) {
            printPost(rootIn.left);
            printPost(rootIn.right);
            System.out.println(" " + rootIn.data);
        }
    }

    @Override
    public void printSideways(TreeNode rootIn, int level) {
        if (rootIn != null) {
            printSideways(rootIn.right, level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("   ");
            }
            System.out.println(rootIn.data);
            printSideways(rootIn.left, level + 1);
        }
    }

}
