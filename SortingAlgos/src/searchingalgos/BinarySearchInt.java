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
public class BinarySearchInt {
    public int bsi(int [] arrIn, int val) {
	int min = 0;
	int max = arrIn.length - 1;
	while (min <= max) {
	    int mid = (max + min) / 2;
	    if (arrIn[mid] == val) {
		return mid;
	    }
	    else if (arrIn[mid] < val) {
		min = mid + 1;
	    }
	    else {
		max = mid - 1;
	    }
	}
	return -1;  //not here
    }
}
