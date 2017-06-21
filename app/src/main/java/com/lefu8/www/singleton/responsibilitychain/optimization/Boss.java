package com.lefu8.www.singleton.responsibilitychain.optimization;

import android.util.Log;

/**
 * 老总类
 *
 * @author zyc
 *         created at 2017/6/21 11:22
 */

public class Boss extends Leader {

  /**
   * 含参构造方法
   *
   * @param expenses 当前领导能批复的金额
   */
  public Boss(int expenses) {
    super(expenses);
  }

  @Override protected void reply(ProgramApes ape) {
    Log.i("reschainopt", ape.getApply());
    Log.i("reschainopt", "Boss: Of course Yes!");
  }
}
