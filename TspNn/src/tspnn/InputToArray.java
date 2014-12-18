/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tspnn;

import java.util.ArrayList;

/**
 *
 * @author rfoote
 */
public class InputToArray {
    private String inputStr;
    
    public InputToArray(String strIn) {
	inputStr = strIn;
    }
    
    public ArrayList<Point> makeArray() {
	ArrayList<Point> listOut = new ArrayList<>();
	StringBuilder line = new StringBuilder();
	char [] strArr = inputStr.toCharArray();
	for (char c : strArr) {
	    if (c != '\n') {
		line.append(c);
	    } 
	    else {
		String lineStr = line.toString();
		String [] trioStr = lineStr.split("\\s+");

		int [] trio = new int[3];
		for (int i = 0; i < 3; i++) {
		    trio[i] = Integer.parseInt(trioStr[i]);
		}
		Point p = new Point(trio[1], trio[2]);
		listOut.add(p);
		//reset line
		line = new StringBuilder();
	    }
	}
	return listOut;
    }
}
