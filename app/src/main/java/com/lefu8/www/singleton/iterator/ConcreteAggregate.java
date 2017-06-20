package com.lefu8.www.singleton.iterator;

import java.util.List;

/**
 * @author zyc
 *         created at 2017/6/20 14:36
 */

public class ConcreteAggregate implements Aggregate {

  private List<Object> list;

  public ConcreteAggregate(List<Object> list) {
    this.list = list;
  }

  public void add(Object obj) {
    list.add(obj);
  }

  public Iterator iterator() {
    return new ConcreteIterator(list);
  }

  public void remove(Object obj) {
    list.remove(obj);
  }
}
