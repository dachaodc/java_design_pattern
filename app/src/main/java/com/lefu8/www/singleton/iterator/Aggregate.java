package com.lefu8.www.singleton.iterator;

/**
 * 模拟集合接口 增删 查(遍历)
 *
 * @author zyc
 *         created at 2017/6/20 14:30
 */

interface Aggregate {
  void add(Object obj);

  void remove(Object obj);

  Iterator iterator();
}
