/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author rfoote/ Reges/Stepp
 */
public class BinaryTree implements Tree{
    private TreeNode root;
    
    public TreeNode getRoot() {
        return root;
    }
    
    public BinaryTree(int max) {
        if (max > 0) {
            root = buildTree(1, max);
        } 
        else {
            throw new IllegalArgumentException("max: " + max);
        }
    }

    //fills tree with numbers 1 through max (inclusive) 
    private TreeNode buildTree(int n, int max) {
        if (n > max) {
            return null;
        } 
        else {
            return new TreeNode(n, buildTree(2*n, max), buildTree(2*n+1, max));
        }
    }
    
    @Override
    public void printPreorder(TreeNode rootIn) {
        if (rootIn != null) {
            System.out.print(" " + rootIn.data);
            printPreorder(rootIn.left);
            printPreorder(rootIn.right);
        }
    }

    @Override
    public void printInorder(TreeNode rootIn) {
        if (rootIn != null) {
            printInorder(rootIn.left);
            System.out.print(" " + rootIn.data);
            printInorder(rootIn.right);
        }
      
    }

    @Override
    public void printPostorder(TreeNode rootIn) {
        if (rootIn != null) {
            printPostorder(rootIn.left);
            printPostorder(rootIn.right);
            System.out.print(" " + rootIn.data);
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
