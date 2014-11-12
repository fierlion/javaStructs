/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericlinkedlist;

/**
 *
 * @author rayfoote
 * @param <E>
 */
public class Node<E> {
    private E data;
    private Node<E> next;
    
    public Node(E v, Node<E> nextIn){
        data = v;
        next = nextIn;
    }
    
    public Node(E v){
        data = v;
        next = null;
    }
    
    public E getData(){
        return data;
    }
    
    public Node<E> getNext(){
        return next;
    }
    
    public void setData(E v){
        data = v;
    }
    
    public void setNext(Node<E> nextIn){
        next=nextIn;
    }
}
