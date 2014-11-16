/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author rayfoote
 */
public interface Tree {
    public void printPreorder(TreeNode rootIn);
    public void printInorder(TreeNode rootIn);
    public void printPostorder(TreeNode rootIn);
    public void printSideways(TreeNode rootIn, int level);
}
