package com.lefu8.www.singleton.iterator;

import java.util.List;

/**
 * 具体的遍历实现
 *
 * @author zyc
 *         created at 2017/6/20 14:25
 */

public class ConcreteIterator implements Iterator {

  private List<Object> list;
  private int cursor = 0;// 当前游标位置

  public ConcreteIterator(List<Object> list) {
    this.list = list;
  }

  @Override public Object next() {
    Object obj = null;
    if (hasNext()) {
      obj = list.get(cursor++);
    }
    return obj;
  }

  @Override public boolean hasNext() {
    return !(cursor == list.size());
  }
}
