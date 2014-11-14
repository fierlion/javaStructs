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
    private ListNode tail;
    private int size;
    
    public GenericLinkedList(){
	//create sentinels
	head = new ListNode();
	tail = new ListNode();
	head.next = tail;
	tail.prev = head;
	//initialize size
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
	ListNode current = head;
	ListNode prev = head;
	while (current.next != tail) {
	    prev = current;
	    current = current.next;
	}
	ListNode noobie = new ListNode(value);
	noobie.next = current.next;
	noobie.prev = current;
	current.next.prev = noobie;
	current.next = noobie;
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
    
    @Override 
    public String toString(){
	if (size == 0) {
	    return "[]";
	}
	else {
	    String result = "[" + head.next.data.toString();
	    ListNode current = head.next;
	    while (current.next != tail) {
		result += ", " + current.next.data.toString();
		current = current.next;
	    }
	    return result + "]";
	}
    }
}
