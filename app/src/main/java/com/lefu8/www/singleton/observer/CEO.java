package com.lefu8.www.singleton.observer;

import android.util.Log;
import java.util.Observable;
import java.util.Observer;

/**
 * CEO 观察者
*@author zyc
*created at 2017/6/12 17:10
*/

public class CEO implements Observer{

  @Override public void update(Observable o, Object arg) {
    Log.i("接收到消息","CEO-->" + arg.toString());
  }
}
