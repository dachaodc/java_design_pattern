package com.lefu8.www.singleton.strategy;

import android.util.Log;

/**
 * "+" cal
 *
 * @author zyc
 *         created at 2017/6/16 13:49
 */

public class AddCal implements Strategy {

  @Override public double cal(double a, double b) {
    double r = a + b;
    Log.i("Strategy", r + "");
    return r;
  }
}
