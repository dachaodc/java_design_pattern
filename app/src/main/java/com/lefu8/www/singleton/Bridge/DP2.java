package com.lefu8.www.singleton.Bridge;

import android.util.Log;

/**
 * 具体的绘图程序类dp2
 *
 * @author zyc
 *         created at 2017/6/29 11:37
 */

public class DP2 {

  public void drawRantanle() {
    Log.i("bridge-->", "使用DP2的程序画矩形");
  }

  public void drawCircle() {
    Log.i("bridge-->", "使用DP2的程序画圆形");
  }
}
