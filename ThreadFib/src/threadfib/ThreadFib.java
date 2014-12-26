/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadfib;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author rfoote
 */
public class ThreadFib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, ExecutionException {
	//creating thread objects
//	for (int i = 0; i < 10; i++) {
//	    new Thread(new Fibonacci(i)).start();
//	}
	//using Executors
//	ExecutorService exec = Executors.newCachedThreadPool();
//	for (int i=0; i < 10; i++) {
//	    exec.execute(new Fibonacci(i));
//	}
//	exec.shutdown();
	//using Callables
	ArrayList<Future<Integer>> results = new ArrayList<>();
	ExecutorService exec = Executors.newCachedThreadPool();
	for (int i = 0; i < 10; i++) {
	    results.add(exec.submit(new FibonacciRet(i)));
	}
	exec.shutdown();
	Integer summed = 0;
	for(Future<Integer> f : results) {
	    summed += f.get();
	}
	System.out.println("result = " + summed);
    }
}
