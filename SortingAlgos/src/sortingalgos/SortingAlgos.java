/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author rfoote
 */
public class SortingAlgos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	String [] ranks = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	//String [] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	Integer [] numArr = {0,1,2,3,4,5,6,7,8,9,200,9,-23};
	
	System.out.println(ranks[0]);
	Shuffler<String> strShuf = new Shuffler<String>();
	strShuf.shuffle(ranks);
	System.out.println(ranks[0]);
	
	System.out.println(numArr[0]);
	Shuffler<Integer> intShuf = new Shuffler<Integer>();
	intShuf.shuffle(numArr);
	System.out.println(numArr[0]);
    }
    
}
