/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericlinkedlist;

import java.util.Iterator;

/**
 * @author rfoote
 * @param <E>
 */
public interface Iterable<E> {
    public Iterator<E> iterator();
}
