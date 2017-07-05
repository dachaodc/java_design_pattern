package com.lefu8.www.singleton.Bridge;

import android.util.Log;

/**
 * 首先是两个绘图程序dp1,dp2
 * 具体的绘图程序类dp1
 *
 * @author zyc
 *         created at 2017/6/29 11:35
 */

public class DP1 {

  public void draw_1_Rantanle() {
    Log.i("bridge-->","使用DP1的程序画矩形");
  }

  public void draw_1_Circle() {
    Log.i("bridge-->","使用DP1的程序画圆形");
  }
}
