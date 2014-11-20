/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removedupes;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;

/**
 * @author rfoote
 * @param <E> type of linked list
 */
public class RemoveDupes <E> {
    public void removedupes(LinkedList <E> listIn) {
	ListIterator<E> li = listIn.listIterator();
	Set<E> values = new HashSet<E>();
	while (li.hasNext()){
	    E value = li.next();
	    if (values.contains(value)) {
		li.remove();
	    }
	    values.add(value);
	}
    }
}
