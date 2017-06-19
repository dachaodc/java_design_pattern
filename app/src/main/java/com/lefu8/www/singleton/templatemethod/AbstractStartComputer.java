package com.lefu8.www.singleton.templatemethod;

import android.util.Log;

/**
 * 模板方法
 * 电脑开机固定流程
*@author zyc
*created at 2017/6/16 11:10
*/
public class AbstractStartComputer {

  protected void powerOn(){
    Log.i("template method","开启电源");
  }

  protected void checkHardware(){
    Log.i("template method","检查硬件");
  }

  protected void loadOS(){
    Log.i("template method","加载系统");
  }

  protected void login(){
    Log.i("template method","登录系统");
  }

  /**
   * 启动电脑方法, 步骤固定为开启电源、系统检查、加载操作系统、用户登录。该方法为final， 防止算法框架被覆写.
   */
  public final void startUp() {
    Log.i("template method","------ 开机 START ------");
    powerOn();
    checkHardware();
    loadOS();
    login();
    Log.i("template method","------ 开机 END ------");
  }
}
