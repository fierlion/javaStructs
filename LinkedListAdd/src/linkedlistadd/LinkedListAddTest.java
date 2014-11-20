/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistadd;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author rfoote
 */
public class LinkedListAddTest {
    public static void main(String [] args) {
	LinkedList<Integer> a = new LinkedList<Integer>();
	LinkedList<Integer> b = new LinkedList<Integer>();
	LinkedList<Integer> c; 

	a.add(5);
	a.add(9);
	a.add(9);
	
	b.add(4);
	b.add(9);
	b.add(9);
	
	LinkedListAdd lladd = new LinkedListAdd();
	c = lladd.lladd(a,b);
	
	ListIterator<Integer> lic = c.listIterator();
	while (lic.hasNext()) {
	    System.out.println(lic.next());
	}
	
    }
}
