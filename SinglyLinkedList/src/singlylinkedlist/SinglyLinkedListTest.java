/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlylinkedlist;

/**
 *
 * @author rfoote
 */
public class SinglyLinkedListTest {
    public static void main(String [] args) {
	SinglyLinkedList list1 = new SinglyLinkedList();
	list1.add(0);
	list1.add(1);
	list1.add(2);
	
	System.out.println(list1.toString());
	list1.add(1,10);
	list1.add(0,20);
	System.out.println(list1.toString());
	
    }
}
