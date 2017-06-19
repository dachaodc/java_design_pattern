package com.lefu8.www.singleton.proxy;

import android.util.Log;

/**
 * 目标对象角色
*@author zyc
*created at 2017/6/16 14:38
*/

public class RealMe extends AbstractObject{

  @Override public void obtainEmail(String email) {
    Log.i("proxy","我收到了email:-->" + email);
  }
}
