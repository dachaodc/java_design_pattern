package com.lefu8.www.singleton.command.demo2;

import android.util.Log;

/**
*@author zyc
*created at 2017/6/26 9:37
*/

public class Politician implements Command{

  @Override public void execute() {
    Log.i("command2","Politician");
  }
}
