/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchingalgos;

/**
 *
 * @author rfoote
 */
public class SearchingAlgos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	String [] ranks = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	String [] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	Integer [] numArr = {0,1,2,3,4,5,6,7,8,9,200,9,-23};
	int [] intArr = {0,1,2,3,4,5,6,7,8,9,200,9,-23};
	
	//shuffler test String
	System.out.println(ranks[0]);
	Shuffler<String> strShuf = new Shuffler<String>();
	strShuf.shuffle(ranks);
	System.out.println(ranks[0]);
	
	//shuffler test int
	System.out.println(numArr[0]);
	Shuffler<Integer> intShuf = new Shuffler<Integer>();
	intShuf.shuffle(numArr);
	System.out.println(numArr[0]);
	
	//binary search int test
	BinarySearchInt bsi = new BinarySearchInt();
	int intAnsIndx = bsi.bsi(intArr, 5);
	System.out.println(intAnsIndx);
	
	
	//binary search String (recursive) tests
	BinarySearchString bss = new BinarySearchString();
	int strAnsIndx = bss.bss(suits, "Diamonds", 0, suits.length - 1);
	int strAnsIndxBad = bss.bss(suits, "Dogs", 0, suits.length - 1);
	System.out.println("Expected behavior:");
	System.out.println("Index of String 'Diamonds' in String [] suits (should be 1): " + strAnsIndx);
	System.out.println("Index of String 'Dogs' in String [] suits (should be -1): " + strAnsIndxBad);
	
	
	
    }
    
}
