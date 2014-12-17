/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charmap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rfoote
 */
public class CharMap {
    private Map chars;
    private char [] stringArr;
    
    public CharMap(String stringIn) {
	chars = new HashMap<>();
	stringArr = stringIn.toCharArray();
    }
    
    public String firstNonRepeat() {
	StringBuilder sb = new StringBuilder();
	//no non repeats?  Use string, return empty
	//empty string?
	for (char c : stringArr) {
	    if (!chars.containsKey(c)) {
		chars.put(c, 1);
	    } 
	    else {
		Integer times = (Integer)chars.get(c);
		chars.put(c, times + 1);
	    }
	}
	for (char c : stringArr) {
	    if ((Integer)chars.get(c) == 1) {
		sb.append(c);
		return sb.toString();
	    }
	}
	sb.append("(No non-repeats)");
	return sb.toString();
    }
    
    public String reverseWords() {
	StringBuilder stringOut = new StringBuilder();
	StringBuilder oneWord = new StringBuilder();
	for (int i = stringArr.length -1; i >= 0; i--) {
	    if (stringArr[i] != ' ') {
		oneWord.append(stringArr[i]);
	    } 
	    else {
		stringOut.append(oneWord.reverse()).append(" ");
		oneWord = new StringBuilder();
	    }  
	}
	stringOut.append(oneWord.reverse());
	return stringOut.toString();
    }
}
