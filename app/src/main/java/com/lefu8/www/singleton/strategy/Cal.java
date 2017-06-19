package com.lefu8.www.singleton.strategy;

/**
 * cal
*@author zyc
*created at 2017/6/16 13:57
*/

public class Cal{
  private Strategy mStrategy = null;
  public void setStrategy(Strategy strategy){
    mStrategy = strategy;
  }

  public double calc(double paramA, double paramB) {
    // doing something
    if (this.mStrategy == null) {
      throw new IllegalStateException("你还没有设置计算的策略");
    }
    return mStrategy.cal(paramA,paramB);
  }

}
