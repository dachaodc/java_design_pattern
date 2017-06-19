package com.lefu8.www.singleton.facade;

import android.util.Log;

/**
 * 电源系统
*@author zyc
*created at 2017/6/13 15:46
*/
public class PowerSystem {

  public void powerOn() {
    Log.i("facade","------开机了-----");
  }

  public void powerOff() {
    Log.i("facade","------关机了-----");
  }

}
