/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylinkedlist;

import java.util.Iterator;

/**
 *
 * @author rfoote
 */
public class MyLinkedList <E> implements Iterable <E>{
    private Node<E> startSent;
    private Node<E> endSent;
    private int size;
    
    private static class Node<E> {
	public E data;
	public Node<E> prev;
	public Node<E> next;
	public Node(E dataIn, Node<E> prevIn, Node<E> nextIn){
	    data = dataIn;
	    prev = prevIn;
	    next = nextIn;
	}
    }
    
    public MyLinkedList() {
	doClear();
    }
    
    public int size() {
	return size;
    }
    
    public boolean isEmpty() {
	return size == 0;
    }
    
    public boolean add(E dataIn) {
	add(size(), dataIn);
	return true;
    }
    
    public void add(int idx, E dataIn) {
	addBefore(getNode(idx, 0, size()), dataIn);
    }
    
    public E get(int idx) {
	return getNode(idx).data;
    }
    
    public void set (int idx, E newVal) {
	Node<E> temp = getNode(idx);
	temp.data = newVal;
    }
    
    public E remove(int idx) {
	return remove(getNode(idx));
    }
    
    private void addBefore(Node<E> prevIn, E dataIn) {
	Node<E> temp = new Node<>(dataIn, prevIn.prev, prevIn);
	temp.prev.next = temp;
	prevIn.prev = temp;
	size += 1;
    }
    
    private E remove(Node<E> prevIn) {
	prevIn.next.prev = prevIn.prev;
	prevIn.prev.next = prevIn.next;
		size -= 1;
	return prevIn.data;	
    }
    
    private Node<E> getNode(int idx) {
	return getNode(idx, 0, size() - 1);
    }
    
    private Node<E> getNode(int idx, int lower, int upper) {
	Node<E> temp;
	if (idx < lower || idx > upper) {
	    throw new IndexOutOfBoundsException();
	}
	//if in first half of list (cuts down on search time)
	if (idx < size() / 2) {
	    temp = startSent.next;
	    for(int i = 0; i < idx; i++) {
		temp = temp.next;
	    }
	}
	else {
	    temp = endSent;
	    for(int i = size(); i > idx; i--) {
		temp = temp.prev;
	    }
	}
	
	return temp;	
    }
    
    private void doClear() {
	
    }

    @Override
    public Iterator<E> iterator() {
	return new LinkedListIterator();
    }
    
    private class LinkedListIterator implements Iterator<E> {
	private Node<E> current = startSent.next;
	
	@Override
	public boolean hasNext() {
	    return current != endSent;
	}
	
	@Override
	public E next() {
	   E nextItem = current.data;
	   current = current.next;
	   return nextItem;
	}
	
	@Override
	public void remove() {
	    
	}
    }
    
}
