/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchingalgos;

import java.util.*;
/**
 *
 * @author rfoote
 */
public class Shuffler<E> {
    
    Random rnd = new Random();
    //Fisher-Yates shuffle
    public void shuffle(E [] arr) {
	for (int i = arr.length - 1; i > 0; i--) {
	    int index = rnd.nextInt(i+1);
	    //simple swap
	    E a = arr[index];
	    arr[index] = arr[i];
	    arr[i] = a;
	}
    }
}
