/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadfib;

/**
 *
 * @author rfoote
 */
public class Fibonacci implements Runnable{
    private int fibNum;
    private int first;
    private int second;
    
    public Fibonacci (int fibIn) {
	fibNum = fibIn;
	first = 0;
	second = 1;
    }
    
    public void run() {
	if (fibNum == 0) {
	    System.out.println(String.format("#1 = %d", fibNum));
	    Thread.yield();
	}
	else if (fibNum == 1)  {
	    System.out.println(String.format("#1 = %d", fibNum));
	    Thread.yield();
	}
	else {
	    for (int i = 1; i < fibNum; i++) {
		int nextFib = first + second;
		System.out.println(String.format("#%d = %d", i, nextFib));
		first = second;
		second = nextFib;
	    }
	}
    }
}
