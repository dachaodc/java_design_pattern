package com.lefu8.www.singleton.factory.simple;

import android.util.Log;

/**
 * car
*@author zyc
*created at 2017/7/5 14:00
*/

public class Car {
  public Car() {
    Log.i("simpleFactory","造一辆车");
  }

  public void want(){
    Log.i("simpleFactory","奔驰G级SUV");
  }

}
