package com.lefu8.www.singleton.proxy;

import android.util.Log;

/**
 * 代理对象
*@author zyc
*created at 2017/6/16 14:39
*/

public class ProxyRmail extends AbstractObject {

  private RealMe me = new RealMe();

  @Override public void obtainEmail(String email) {
    Log.i("proxy","代理收到了email");
    me.obtainEmail(email);
    Log.i("proxy","代理把email发给我了");
  }
}
