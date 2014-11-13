/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericlinkedlist;

/**
 * @author rfoote
 * @param <E>
 */
public class ListNode<E> {
    public ListNode prev;
    public ListNode next;
    public E data;
    
    public ListNode() {
	this(null, null, null);
    }
    
    public ListNode(E value){
	this(null, null, value);
    }
    
    public ListNode(ListNode prevIn, ListNode nextIn, E dataIn) {
	prev = prevIn;
	next = nextIn;
	data = dataIn;
    }
    
}
