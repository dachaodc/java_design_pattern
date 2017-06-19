package com.lefu8.www.singleton.sligleton;

/**
 * 第三，静态内部类模式
 *
 * @author zyc
 *         created at 2017/6/6 18:20
 */
public class SingletonStatic {

  private SingletonStatic() {
  }

  private static class SingletonHolder {
    private final static SingletonStatic instance = new SingletonStatic();
  }

  public static SingletonStatic getInstance() {
    return SingletonHolder.instance;
  }

}
