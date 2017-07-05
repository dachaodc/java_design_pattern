package com.lefu8.www.singleton.command.demo2;

import android.util.Log;

/**
 * 具体不同命令/请求代码是实现接口Command
*@author zyc
*created at 2017/6/26 9:32
*/

public class Engineer implements Command{

  @Override public void execute() {
    Log.i("command2","Engineer");
  }
}
