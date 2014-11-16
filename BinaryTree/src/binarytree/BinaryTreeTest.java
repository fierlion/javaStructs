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
public class BinaryTreeTest {
    public static void main(String [] args) {
        BinaryTree tree1 = new BinaryTree(14);
        System.out.print("preorder: ");
        tree1.printPreorder(tree1.getRoot());
        System.out.println();
        System.out.print("inorder: ");
        tree1.printInorder(tree1.getRoot());
        System.out.println();
        System.out.print("postorder: ");
        tree1.printPostorder(tree1.getRoot());
        System.out.println();
        System.out.println("sideways: ");
        tree1.printSideways(tree1.getRoot(), 0);
    }
}
