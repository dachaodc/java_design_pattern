package com.lefu8.www.singleton.sligleton;

/**
 * 单例设计模式之懒汉模式
 *
 * @author zyc
 *         created at 2017/6/6 17:56
 */
public class Singleton {

  private static Singleton instance = null;

  private Singleton() {
  }

  public static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }
}
