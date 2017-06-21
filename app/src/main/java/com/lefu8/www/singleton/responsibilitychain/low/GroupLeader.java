package com.lefu8.www.singleton.responsibilitychain.low;

import android.util.Log;

/**
 * 小组长
*@author zyc
*created at 2017/6/21 9:32
*/

public class GroupLeader {

  /**
   * 处理请求
   *
   * @param ape
   *            具体的猿
   */
  public void handleRequest(ProgramApe ape) {
    Log.i("responsibilitychainlow",ape.getApply());
    Log.i("responsibilitychainlow","GroupLeader: Of course Yes!");
  }

}
