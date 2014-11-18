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
public class BinarySearchString {
    public int bss(String [] arrIn, String val, int low, int high) {
	if (low > high) {
	    return -1;
	}
	int mid = (low + high) / 2;
	if (val.equals(arrIn[mid])) {
	    return mid;
	}
	else if (val.compareTo(arrIn[mid]) > 0) {
	    return bss(arrIn, val, mid+1, high);
	}
	else {
	    return bss(arrIn, val, low, mid-1);
	}
    }
}
