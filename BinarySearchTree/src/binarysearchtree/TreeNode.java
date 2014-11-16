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
public class TreeNode {
    public int data;
    public TreeNode left;
    public TreeNode right;
    
    TreeNode(int dataIn){
        this(dataIn, null, null);
    }
    
    TreeNode(int dataIn, TreeNode leftIn, TreeNode rightIn) {
        data = dataIn;
        left = leftIn;
        right = rightIn;
    }
}
