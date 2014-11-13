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
public class ListNode {
    //not encapsulated.
    //"technique of using public fields is
    //the usual approach to defining nodes" 
    //-Reges/Stepp
    public int data;
    public ListNode next;
    
    public ListNode() {
	//uses this(2 arg constructor)
	this(0, null);
    }
    
    public ListNode(int dataIn) {
	//uses this(2 arg constructor)
	this(dataIn, null);
    }
    
    public ListNode(int dataIn, ListNode nextIn) {
	data = dataIn;
	next = nextIn;
    }
}