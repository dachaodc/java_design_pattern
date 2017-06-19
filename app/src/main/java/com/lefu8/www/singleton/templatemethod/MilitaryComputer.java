package com.lefu8.www.singleton.templatemethod;

import android.util.Log;

/**
 * 军用电脑
*@author zyc
*created at 2017/6/16 11:22
*/

public class MilitaryComputer extends AbstractStartComputer{

  @Override protected void checkHardware() {
    super.checkHardware();
    Log.i("template method","检查硬件防火墙");
  }

  @Override protected void login() {
    super.login();
    Log.i("template method","进行指纹识别，人脸识别，眼角膜识别等一系列验证");
  }
}
