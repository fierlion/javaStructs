/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charmap;

/**
 *
 * @author rfoote
 */
public class CharMapTest {
    public static void main(String [] args) {
	String testString = "this is the string to test";
	String testStringSingle = "nn";
	String testStringNull = "";
	CharMap cMap1 = new CharMap(testString);
	CharMap cMap2 = new CharMap(testStringSingle);
	CharMap cMap3 = new CharMap(testStringNull);
	System.out.println(cMap1.firstNonRepeat());
	System.out.println(cMap1.reverseWords());
	System.out.println("___");
	System.out.println(cMap2.firstNonRepeat());
	System.out.println(cMap2.reverseWords());
	System.out.println("___");
	System.out.println(cMap3.firstNonRepeat());
	System.out.println(cMap3.reverseWords());
    }  
}
