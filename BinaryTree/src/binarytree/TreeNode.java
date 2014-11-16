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
public class TreeNode {
    public int data;
    public TreeNode left;
    public TreeNode right;
    
    public TreeNode(int dataIn) {
	this(dataIn, null, null);
    }
    
    public TreeNode(int dataIn, TreeNode leftIn, TreeNode rightIn) {
	data = dataIn;
	left = leftIn;
	right = rightIn;
    }
}
