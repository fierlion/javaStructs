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
    
    /**
     * constructor for GenericLinkedList
     * creates sentinels tail / head to avoid errors
     */
    public GenericLinkedList(){
	//create sentinels
	head = new ListNode();
	tail = new ListNode();
	head.next = tail;
	tail.prev = head;
	//initialize size
	size = 0;
    }
    
    /**
     * @return size 
     */
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

    /**
     * @return boolean True if array size == 0 
     */
    @Override
    public boolean isEmpty() {
	return (size == 0);
    }

    @Override
    public boolean contains(E value) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * method to append to end of array
     * post: value is at end of array, size += 1
     * @param value to be added to end of array
     */
    @Override
    public void add(E value) {
	ListNode current = head;
	ListNode prev = head;
	while (current.next != tail) {
	    prev = current;
	    current = current.next;
	}
	ListNode noobie = new ListNode(current, current.next, value);
	current.next.prev = noobie;
	current.next = noobie;
	size += 1;
    }

    /**
     * method to add value at position index
     * pre: index < size
     * post: value is added at position index, size += 1
     * @param index position where value will be added
     * @param value to be added
     */
    @Override
    public void add(int index, E value) {
	if (index < size) {
	   ListNode current = head;
	   ListNode prev = head;
	   for (int i = 0; i < index; i++) {
	       prev = current;
	       current = current.next;
	   }
	   ListNode noobie = new ListNode(current, current.next, value);
	   current.next.prev = noobie;
	   current.next = noobie;
	   size += 1;
	}
	else {
	    throw new IllegalArgumentException("size < " + index);
	}
    }

    /**
     * method to remove value at position index
     * pre: index < size
     * post: value is removed from array, size -= 1
     * @param index position where value will be removed
     */
    @Override
    public void remove(int index) {
	if (index < size){
	    ListNode current = head.next;
	    ListNode prev = head;
	    for (int i = 0; i < index; i++) {
		prev = current;
		current = current.next;
	    }
	    current.next.prev = prev;
	    prev.next = current.next;
	    //remove references to current;
	    current.next = null;
	    current.prev = null;
	
	    size -= 1;
	}
	else {
	    throw new IllegalArgumentException("size < " + index);
	}
    }
  

    @Override
    public Iterator<E> iterator() {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * @return formatted string representation of the array
     * in format: [ E, E, E ]
     */
    @Override 
    public String toString(){
	if (size == 0) {
	    return "[ ]";
	}
	else {
	    String result = "[ " + head.next.data.toString();
	    ListNode current = head.next;
	    while (current.next != tail) {
		result += ", " + current.next.data.toString();
		current = current.next;
	    }
	    return result + " ]";
	}
    }
    
    @Override
    public void reverse(){
	if (size > 0) {
	    ListNode temp = head;
	    head = tail;
	    tail = temp;
	    ListNode current = head;
	    while(current != null) {
		temp = current.next;
		current.next = current.prev;
		current.prev = temp;
		current = current.next;
	    }
	}
	else {
	    throw new IllegalArgumentException("array is size 0");
	}
    }
}
