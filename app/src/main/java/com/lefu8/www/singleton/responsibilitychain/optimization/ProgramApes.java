package com.lefu8.www.singleton.responsibilitychain.optimization;

/**
 * 程序猿抽象接口
 * 程序猿有不同类型，比如一个公司的php、c/c++、Android、IOS等等
 * 所以要抽出来
 *
 * @author zyc
 *         created at 2017/6/21 9:59
 */

public abstract class ProgramApes {
  /**
   * 获取程序员具体的差旅费用
   *
   * @return 要多少钱
   */
  public abstract int getExpenses();

  /**
   * 获取差旅费申请
   *
   * @return Just a request
   */
  public abstract String getApply();
}
