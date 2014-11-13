/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericlinkedlist;

import java.util.Iterator;

/**
 * Doubly linked list
 * Generic Implementation based on Reges / Stepp
 * "Building Java Programs"
 * 
 * @author rfoote / Reges / Strepp
 * @param <E>
 */
public class GenericLinkedList<E> implements List<E>{
    private ListNode head;
    private int size;
    
    GenericLinkedList(){
	head = null;
	size = 0;
    }

    @Override
    public int size() {
	return size;
    }

    @Override
    public E get(int index) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int indexOf(E value) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
	return (size == 0);
    }

    @Override
    public boolean contains(E value) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(E value) {
	if (head != null){
	    ListNode current = head;
	    ListNode prev = head;
	    while (current.next != null){
		current = current.next;
	    }
	    current.next = new ListNode(value);
	}
	else {
	    head = new ListNode(value);
	}
	size += 1;
    }

    @Override
    public void add(int index, E value) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(int index) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator<E> iterator() {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
