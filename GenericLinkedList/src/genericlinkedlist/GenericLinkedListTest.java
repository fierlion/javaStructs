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
	list1.add("Prokofyev");
	list1.add("Tchaikovsky");
	list1.add("Rachmaninov");
	
	System.out.println(list1.size());
	System.out.println(list1.toString());
	
	GenericLinkedList <Integer> list2 = new GenericLinkedList<>();
	list2.add(Integer.valueOf(6));
	list2.add(Integer.valueOf(235));
	list2.add(Integer.valueOf(12));
	
	System.out.println(list2.size());
	System.out.println(list2.toString());
    }
}
