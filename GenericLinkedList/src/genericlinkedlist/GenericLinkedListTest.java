/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericlinkedlist;

/**
 *
 * @author rfoote
 */
public class GenericLinkedListTest {
    public static void main(String [] args) {
	GenericLinkedList <String> list1 = new GenericLinkedList<>();
	list1.add("Hi there");
	System.out.println(list1.size());
    }
}
