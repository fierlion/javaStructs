/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistadd;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Collections;

/**
 *
 * @author rfoote
 */
public class LinkedListAdd {
    public LinkedList<Integer> lladd(LinkedList<Integer> aIn, LinkedList<Integer>bIn) {
	LinkedList<Integer> listOut = new LinkedList<Integer>();
	Iterator<Integer> aIt = aIn.descendingIterator();
	Iterator<Integer> bIt = bIn.descendingIterator();
	int carryBit = 0;
	while(aIt.hasNext()){
	    int valA = aIt.next() + bIt.next() + carryBit;
	    if (valA / 10 == 1) {
		carryBit = 1;
		listOut.add(valA % 10);
	    }
	    else {
		listOut.add(valA);
		carryBit = 0;
	    }
	}
	if (carryBit == 1){
	    listOut.add(1);
	}
	Collections.reverse(listOut);
	return listOut;
    }
}
