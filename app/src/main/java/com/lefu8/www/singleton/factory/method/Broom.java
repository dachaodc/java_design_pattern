package com.lefu8.www.singleton.factory.method;

import android.util.Log;

/**
 * 具体产品
 *
 * @author zyc
 *         created at 2017/7/5 15:01
 */

public class Broom implements Moveable {

  @Override public void run() {
    Log.i("factoryMethod","我是Broom.我在飞...");
  }
}
