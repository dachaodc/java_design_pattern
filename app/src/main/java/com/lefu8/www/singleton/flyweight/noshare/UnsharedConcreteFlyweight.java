package com.lefu8.www.singleton.flyweight.noshare;

import android.util.Log;
import com.lefu8.www.singleton.flyweight.simple.Flyweight;

/**
 * 不共享的享元实现与 ConcreteFlyweight 无异
 *
 * @author zyc
 *         created at 2017/7/14 17:28
 */

public class UnsharedConcreteFlyweight implements Flyweight {

  private String intrinsicState = null;

  public UnsharedConcreteFlyweight(String _intrinsicState) {
    this.intrinsicState = _intrinsicState;
  }

  @Override public void operation(String extrinsicState) {
    Log.i("flyweight","内蕴状态：" + intrinsicState);
    Log.i("flyweight","外蕴状态：" + extrinsicState);
  }
}
