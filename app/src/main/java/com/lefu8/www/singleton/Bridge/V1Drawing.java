package com.lefu8.www.singleton.Bridge;

/**
 * 具体实现化逻辑ConcreteImplementor
 * 实现了接口方法，使用DP1进行绘图
 *
 * @author zyc
 *         created at 2017/6/29 14:31
 */

public class V1Drawing implements Drawing {

  DP1 dp1;

  public V1Drawing() {
    dp1 = new DP1();
  }

  @Override public void drawRantangle() {
    dp1.draw_1_Rantanle();
  }

  @Override public void drawCircle() {
    dp1.draw_1_Circle();
  }
}
