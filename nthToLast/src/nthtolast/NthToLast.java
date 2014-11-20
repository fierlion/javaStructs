/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nthtolast;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author rfoote
 * @param <E>
 */
public class NthToLast <E>{
    public E nthlast(LinkedList <E> listIn, int nth) {
	if (nth < 1) {return null;} 
	ListIterator<E> li = listIn.listIterator();
	ListIterator<E> linth = listIn.listIterator();
	for (int i = nth; i > 0; i--) {
	    if (li.hasNext()){
		li.next();
	    }
	    else throw new IllegalArgumentException("List size > nth");
	}
	//System.out.println(li.next());
	//System.out.println(linth.next());
	while (li.hasNext()) {
	    li.next();
	    linth.next();
	}
	return linth.next();
    }
}
