/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericlinkedlist;

/**
 * @author rayfoote
 */
public class GenericLinkedListTest {
    
    public static void main(String[] args) {
        GenericLinkedList<String> list1 = new GenericLinkedList<>();
        System.out.println(list1.getSize());
        list1.addBack("Howdy");
        list1.addFront("Nope");
        System.out.println(list1.getSize());
    }
    
}
