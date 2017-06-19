package com.lefu8.www.singleton.templatemethod;

import android.util.Log;

/**
 * 码农的电脑
*@author zyc
*created at 2017/6/16 11:19
*/

public class CoderComputer extends AbstractStartComputer{

  @Override protected void login() {
    super.login();
    Log.i("template method","码农的电脑，只需要登录就可以了");
  }
}
