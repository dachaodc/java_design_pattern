package com.lefu8.www.singleton.responsibilitychain.low;

import android.util.Log;

/**
 * 老总类
 *
 * @author zyc
 *         created at 2017/6/21 9:35
 */

public class Boss {

  /**
   * 处理请求
   *
   * @param ape 具体的猿
   */
  public void handleRequest(ProgramApe ape) {
    Log.i("responsibilitychainlow",ape.getApply());
    Log.i("responsibilitychainlow","Boss: Of course Yes!");
  }
}
