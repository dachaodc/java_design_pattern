package com.lefu8.www.singleton.factory.method;

import android.util.Log;

/**
*@author zyc
*created at 2017/7/5 15:10
*/

public class BMWCar implements Moveable {

  @Override public void run() {
    Log.i("factoryMethod","BMW7系，开回家~");
  }
}
