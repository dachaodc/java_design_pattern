package com.lefu8.www.singleton.facade;

import android.util.Log;

/**
 * 声音控制系统
 *
 * @author zyc
 *         created at 2017/6/13 15:48
 */

public class VoiceSystem {
  public void turnUp() {
    Log.i("facade","------音量增大-----");
  }

  public void turnDown() {
    Log.i("facade","------音量减小-----");
  }
}
