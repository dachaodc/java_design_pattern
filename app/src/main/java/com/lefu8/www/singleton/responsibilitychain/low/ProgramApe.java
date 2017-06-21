package com.lefu8.www.singleton.responsibilitychain.low;

/**
 * 程序猿类
 *
 * @author zyc
 *         created at 2017/6/21 9:09
 */

public class ProgramApe {

  // 出差费用
  private int expenses;
  // 出差申请
  private String apply = "爷要点钱出差";

  /*
   * 含参构造方法
	 */
  public ProgramApe(int expenses) {
    this.expenses = expenses;
  }

  /*
	 * 获取程序员具体的差旅费用
	 */
  public int getExpenses() {
    return expenses;
  }

  /*
   * 获取差旅费申请
   */
  public String getApply() {
    return apply;
  }
}
