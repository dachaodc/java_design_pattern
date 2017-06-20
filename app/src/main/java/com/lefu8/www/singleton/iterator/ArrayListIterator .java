package com.lefu8.www.singleton.iterator;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * iterator
 *
 * @author zyc
 *         created at 2017/6/20 13:46
 */

//public class ArrayListIterator implements Iterator<E> {
//
//  /** Number of elements remaining in this iteration */
//  private int remaining = size;
//
//  /** Index of element that remove() would remove, or -1 if no such elt */
//  private int removalIndex = -1;
//
//  /** The expected modCount value */
//  private int expectedModCount = modCount;
//
//  public boolean hasNext() {
//    return remaining != 0;
//  }
//
//  @SuppressWarnings("unchecked") public E next() {
//    ArrayList<E> ourList = ArrayList.this;
//    int rem = remaining;
//    if (ourList.modCount != expectedModCount) {
//      throw new ConcurrentModificationException();
//    }
//    if (rem == 0) {
//      throw new NoSuchElementException();
//    }
//    remaining = rem - 1;
//    return (E) ourList.array[removalIndex = ourList.size - rem];
//  }
//
//  public void remove() {
//    Object[] a = array;
//    int removalIdx = removalIndex;
//    if (modCount != expectedModCount) {
//      throw new ConcurrentModificationException();
//    }
//    if (removalIdx < 0) {
//      throw new IllegalStateException();
//    }
//    System.arraycopy(a, removalIdx + 1, a, removalIdx, remaining);
//    a[--size] = null;  // Prevent memory leak
//    removalIndex = -1;
//    expectedModCount = ++modCount;
//  }
//
//  @Override public Iterator<E> iterator() {
//    return new ArrayListIterator();
//  }
//}
