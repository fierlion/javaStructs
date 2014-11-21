/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threestacks;

import java.util.Arrays;

/**
 *
 * @author rfoote
 * @param <E>
 */
public class ArrayList <E> {
    private E [] data;
    private int size;
    
    public static final int DEFAULT_CAPACITY = 100;
    
    public ArrayList() {
	this(DEFAULT_CAPACITY);
    }
    
    @SuppressWarnings("unchecked")
    public ArrayList(int capacityIn) {
	data = (E[]) new Object[capacityIn];
	size = 0;
    }
    
    public int size() {
	return size;
    }
    
    public E get(int index) {
	return data[index];
    }

    
    public void add(int index, E val) {
	if (index > data.length) {
	    resize(data.length);
	}
	data[index] = val;
	size += 1;
    }
        
    public void resize(int newCapacity) {
	if (newCapacity > data.length) {
	    int newSize = newCapacity * 2;
	    data = Arrays.copyOf(data, newSize);
	}
    }
       
}
