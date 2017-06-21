package com.lefu8.www.singleton.responsibilitychain.low;

import android.util.Log;

/**
 * 项目主管类
*@author zyc
*created at 2017/6/21 9:33
*/

public class Director {

  /**
   * 处理请求
   *
   * @param ape
   *            具体的猿
   */
  public void handleRequest(ProgramApe ape) {
    Log.i("responsibilitychainlow",ape.getApply());
    Log.i("responsibilitychainlow","Director: Of course Yes!");
  }
}
