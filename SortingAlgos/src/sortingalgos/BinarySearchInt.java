/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgos;

/**
 *
 * @author rfoote
 */
public class BinarySearchInt {
    public int bsi(int [] nums, int target) {
	int min = 0;
	int max = nums.length - 1;
	while (min <= max) {
	    int mid = (max + min) / 2;
	    if (nums[mid] == target) {
		return mid;
	    }
	    else if (nums[mid] < target) {
		min = mid + 1;
	    }
	    else {
		max = mid - 1;
	    }
	}
	return -1;  //not here
    }
}
