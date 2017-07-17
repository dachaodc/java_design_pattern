package com.lefu8.www.singleton.flyweight.simple;

import android.util.Log;

/**
 * 内蕴通过构造传入，外蕴通过方法传入
 *
 * 对于享元部分，ConcreteFlyweight 必须是可共享的，
 * 它保存的任何状态都必须是内部(intrinsic)，
 * ConcreteFlyweight 必须和它的应用环境场合无关。
 * 比如字符串 “Hello” 就无需关心使用它的场合，它是一个不可变的对象。
 *
*@author zyc
*created at 2017/7/14 15:04
*/

public class ConcreteFlyweight implements Flyweight {

  private String intrinsicState = null;

  /**
   * 构造函数 内蕴状态作为参数传入
   */
  public ConcreteFlyweight(String _intrinsicState) {
    this.intrinsicState = _intrinsicState;
  }

  /**
   * 外蕴状态作为参数传入方法中 改变方法的行为 但是并不改变对象的内蕴状态
   */
  @Override
  public void operation(String extrinsicState) {
    Log.i("flyweight","内蕴状态：" + intrinsicState);
    Log.i("flyweight","外蕴状态：" + extrinsicState);
  }
}
