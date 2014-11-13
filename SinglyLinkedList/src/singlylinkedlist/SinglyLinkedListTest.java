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
	list1.addSorted(5);
	list1.addSorted(0);
	list1.addSorted(1);
	list1.addSorted(2);
	list1.addSorted(1);

	System.out.println(list1.toString());
	list1.add(1,10);
	list1.add(0,20);
	System.out.println(list1.toString());
	list1.remove(4);
	System.out.println(list1.toString());
	
	System.out.println("***Interface tests follow***");
	
	//from Reges/Stepp "Building Java Programs"
	SinglyLinkedList list2 = new SinglyLinkedList();
	processList(list2);
    }
    
    public static void processList(IntList list) {
	list.add(18);
	list.add(27);
	list.add(93);
	System.out.println(list);
	list.remove(1);
	System.out.println(list);
    }
	
}