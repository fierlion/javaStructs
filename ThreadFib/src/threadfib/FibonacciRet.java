/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadfib;

import java.util.concurrent.Callable;

/**
 * @author rfoote
 */
public class FibonacciRet implements Callable<Integer> {
    private Integer first = 0;
    private Integer second = 1;
    private final Integer fibNum;
    
    public FibonacciRet(Integer fibIn) {
	fibNum = fibIn;
    }
    
    @Override
    public Integer call() {
	Integer result = 0;
	if (fibNum == 0) {
	    result = 0;
	}
	else if (fibNum == 1) {
	    result = 1;
	}
	else {
	    for (int i = 2; i <= fibNum; i++) {
		result = first + second;
		first = second;
		second = result;
	    }
	}
	return result;
    }
}
