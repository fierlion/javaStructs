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
public class BinarySearchTreeTest {
    public static void main(String [] args){
        BinarySearchTree tree1 = new BinarySearchTree(5);
        System.out.println(tree1.getRoot().data);
        tree1.printSideways(tree1.getRoot(), 0);
        tree1.insert(tree1.getRoot(), 4);
        tree1.insert(tree1.getRoot(), 10);
        tree1.printSideways(tree1.getRoot(), 0);
        System.out.println(tree1.contains(tree1.getRoot(), 10));
        System.out.println(tree1.contains(tree1.getRoot(), 2));
    }
}
