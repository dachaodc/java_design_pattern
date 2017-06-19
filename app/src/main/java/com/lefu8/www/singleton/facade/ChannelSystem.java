package com.lefu8.www.singleton.facade;

import android.util.Log;

/**
 * 频道控制系统
 *
 * @author zyc
 *         created at 2017/6/13 15:49
 */
public class ChannelSystem {

  public void next() {
    Log.i("facade","------下一频道-----");
  }

  public void prev() {
    Log.i("facade","------上一频道-----");
  }
}
