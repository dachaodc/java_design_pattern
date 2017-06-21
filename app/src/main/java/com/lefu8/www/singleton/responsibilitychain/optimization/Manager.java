package com.lefu8.www.singleton.responsibilitychain.optimization;

import android.util.Log;

/**
 * 部门经理类
 *
 * @author zyc
 *         created at 2017/6/21 11:21
 */
public class Manager extends Leader {

  /**
   * 含参构造方法
   *
   * @param expenses 当前领导能批复的金额
   */
  public Manager(int expenses) {
    super(expenses);
  }

  @Override protected void reply(ProgramApes ape) {
    Log.i("reschainopt", ape.getApply());
    Log.i("reschainopt", "Manager: Of course Yes!");
  }
}
