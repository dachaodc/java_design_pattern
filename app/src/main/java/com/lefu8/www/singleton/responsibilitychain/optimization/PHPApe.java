package com.lefu8.www.singleton.responsibilitychain.optimization;

/**
 * ndroid程序猿类
 *
 * @author zyc
 *         created at 2017/6/21 10:41
 */

public class PHPApe extends ProgramApes {
  private int expenses;// 声明整型成员变量表示出差费用
  private String apply = "大哥我要点钱出差";// 声明字符串型成员变量表示差旅申请

  /*
   * 含参构造方法
   */
  public PHPApe(int expenses) {
    this.expenses = expenses;
  }

  @Override public int getExpenses() {
    return expenses;
  }

  @Override public String getApply() {
    return apply;
  }
}
