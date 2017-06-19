package com.lefu8.www.singleton.sligleton;

/**
 * DCL(Double lock)模式
 * 双重检查锁定（double-checked-locking）
 * @author zyc
 * created at 2017/6/6 18:20
 */
public class SingletonDCL {

  private static SingletonDCL instance = null;

  private SingletonDCL(){
  }

  public static SingletonDCL getInstance(){
    if (instance == null){
      synchronized (SingletonDCL.class){
        if (instance == null){
          instance = new SingletonDCL();
        }
      }
    }
    return instance;
  }
}
