/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removedupes;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author rfoote
 */
public class RemoveDupesTest {
    public static void main(String [] args) {
    	LinkedList<String> list1 = new LinkedList<String>();
	list1.add("Hi");
	list1.add("There");
	list1.add("friends");
	list1.add("There");
	list1.add("Hi");
	RemoveDupes<String> rm = new RemoveDupes();
	rm.removedupes(list1);
	ListIterator<String> listIt = list1.listIterator();
	while (listIt.hasNext()) {
	    System.out.println(listIt.next());
	}
    }
}
