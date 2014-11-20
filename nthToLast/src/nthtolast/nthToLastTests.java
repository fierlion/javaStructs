/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nthtolast;

import java.util.LinkedList;

/**
 *
 * @author rfoote
 */
public class nthToLastTests {
    public static void main(String [] args) {
	LinkedList<Integer> lints = new LinkedList<Integer>();
	for (int i = 0; i < 20; i++) {
	    lints.add(i);
	}
	NthToLast nth = new NthToLast();
	Integer linth = (Integer)nth.nthlast(lints, 0);
	System.out.println(linth);
    }
}
