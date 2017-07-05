package com.lefu8.www.singleton.factory.abstractF;

import android.util.Log;

/**
 * 具体的产品
 *
 * @author zyc
 *         created at 2017/7/5 15:37
 */

public class Aircraft implements Flyable {

  @Override public void fly(int height) {
    Log.i("abstractFactory", "我是一架客运机，我目前的飞行高度为：" + height + "千米。");
  }
}
