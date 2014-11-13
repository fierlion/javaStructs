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
public class SinglyLinkedList {
    private ListNode head;
    private int size;
    
    /**
     * Default SinglyLinkedList constructor
     */
    public SinglyLinkedList() {
	head = null;
	size = 0;
    }
    
    /**
     * @return list size 
     */
    public int size() {
	return size;
    }

    /**
     * add (to end of list)
     * @param value to add at end of list 
     */
    public void add(int value) {
	if (head != null) {
	    ListNode current = head;
	    while (current.next != null) {
		current = current.next;
	    }
	    current.next = new ListNode(value);
	}
	else {
	    head = new ListNode(value);
	}
	size += 1;
    }
    
    /**
     * add (to position index)
     * @param index pre: 0 <= index < size
     * @param value to add at position index
     */
    public void add(int index, int value) {
	if (index < size) {
	    ListNode current = head;
	    ListNode prev = head;

	    for (int i = 0; i < index; i++) {
		prev = current;
		current = current.next;
	    }
	    ListNode noobie = new ListNode(value, current);
	    if (index > 0) prev.next = noobie;
	    else if (index == 0) head = noobie;
	    size += 1;
	}
	else {
	    throw new IllegalArgumentException("size < " + index);
	}
    }
    
    /**
     * 
     * @param index pre 0 <= index < size
     * @return data at position index
     */
    public int get(int index) {
	if (index < size) {
	    ListNode current = head;
	    for (int i = 0; i < index; i++) {
		current = current.next;
	    }
	    return current.data;
	    } 
	else {
	    throw new IllegalArgumentException("size < " + index);
	} 
    }
    
    /**
     * toString implementation for SinglyLinkedList
     * @return a comma separated bracketed string of list
     */
    @Override
    public String toString() {
	if (head == null) {
	    return "[]";
	}
	else {
	    //fencepost
	    String result = "[" + head.data;
	    ListNode current = head.next;
	    while (current != null) {
		result += ", " + current.data;
		current = current.next;
	    }
	    result += "]";
	    return result;
	}
    }
    

}