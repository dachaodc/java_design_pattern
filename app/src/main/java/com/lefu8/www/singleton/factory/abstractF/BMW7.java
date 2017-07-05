package com.lefu8.www.singleton.factory.abstractF;

import android.util.Log;

/**
 * @author zyc
 *         created at 2017/7/5 15:47
 */

public class BMW7 implements Moveable {

  @Override public void run() {
    Log.i("abstractFactory", "来一辆宝马~");
  }
}
