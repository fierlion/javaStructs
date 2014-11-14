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
	list1.add(0, "Bach");
	list1.add(2, "Beethoven");
	
	System.out.println(list1.toString());
	
	list1.remove(2);
	System.out.println(list1.toString());

	System.out.println(list1.size());
	System.out.println(list1.toString());
	
	GenericLinkedList <Integer> list2 = new GenericLinkedList<>();
	list2.add(Integer.valueOf(0));
	list2.add(Integer.valueOf(2));
	list2.add(Integer.valueOf(4));
	list2.add(1, Integer.valueOf(1));
	list2.add(3, Integer.valueOf(3));
	
	System.out.println(list2.size());

	System.out.println(list2.toString());

	list2.remove(0);
	System.out.println(list2.toString());
	list2.add(0, Integer.valueOf(0));

	list2.remove(1);
	System.out.println(list2.toString());
	list2.add(1, Integer.valueOf(1));

	list2.remove(2);
	System.out.println(list2.toString());
	list2.add(2, Integer.valueOf(2));

	list2.remove(3);
	System.out.println(list2.toString());
	list2.add(3, Integer.valueOf(3));

	list2.remove(4);
	System.out.println(list2.toString());
	list2.add(Integer.valueOf(4));
	
	System.out.println(list2.toString());
	
    }
}
