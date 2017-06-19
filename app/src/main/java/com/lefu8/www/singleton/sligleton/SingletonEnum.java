package com.lefu8.www.singleton.sligleton;

/**
 * 方式四 : 枚举单例, 线程安全
 *
 * @author zyc
 *         created at 2017/6/6 18:37
 */
public enum SingletonEnum {
  INSTANCE;

  public void doSomething() {
    System.out.println("do sth.");
  }
}
