package com.lefu8.www.singleton.factory.abstractF;

import android.util.Log;

/**
 * @author zyc
 *         created at 2017/7/5 15:48
 */

public class Pen implements Writeable{

  @Override public void write() {
    Log.i("abstractFactory", "来一打英雄牌钢笔");
  }
}
