package com.lefu8.www.singleton.observer;

import java.util.Observable;

/**
 * 主题 被观察者
*@author zyc
*created at 2017/6/12 17:16
*/

public class BroadcastObservable extends Observable{

   public void notifyMsg(String msg){
     setChanged();

     notifyObservers(msg);
   }
}
