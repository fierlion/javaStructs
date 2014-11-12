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
public class GenericLinkedList<E> {
    private Node<E> head;
    private int size;
    
    public GenericLinkedList(){
        head = null;
        size = 0;
    }
    
    public void addBack(E v){
        Node<E> noobie = new Node<E>(v);
        if (head != null){
            Node<E> current = head;
            while (current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(noobie);
        }
        else head = noobie;
        size += 1;
    }
    
    public void addFront(E v){
        Node<E> noobie = new Node<E>(v);
        if (head != null){
            noobie.setNext(head.getNext());
            head = noobie;
        }
        else head = noobie;
        size += 1;  
    }
    
    public void remove(int index){
        
    }
    
    public int getSize(){
        return size;
    }
}

