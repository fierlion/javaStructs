/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlylinkedlist;

/**
 * @author rfoote
 */
public interface IntList {
    public int size();
    public int get(int index);
    public String toString();
    //pubic int indexOf(int value);
    public void add(int value);
    public void add(int index, int value);
    public void remove(int index);
}
