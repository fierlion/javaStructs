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
public interface SearchTree {
    public void add(TreeNode rootIn, int value);
    public boolean contains(TreeNode rootIn, int value);
    public void remove(TreeNode rootIn, int value);
    public int sum(TreeNode rootIn);
    public int countLeaves(TreeNode rootIn);
    public void printPre(TreeNode rootIn);
    public void printIn(TreeNode rootIn);
    public void printPost(TreeNode rootIn);
    public void printSideways(TreeNode rootIn);
}
