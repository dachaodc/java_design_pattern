package com.lefu8.www.singleton.builder;

/**
 * 产品基类
 * 电脑
 *
 * @author zyc
 *         created at 2017/6/7 14:37
 */

public abstract class ComputerProduct {

  protected String mCpuType;
  protected String mCpuCapcity;
  protected String mRamCapcity;
  protected String mRamFrequency;
  protected String mGraphicsCapcity;
  protected String mGraphicsType;

  // cpu类型 容量
  public abstract void setCpuType(String type);

  public abstract void setCpuCapcity(String capcity);

  // 内存容量 频率
  public abstract void setRamCapcity(String capcity);

  public abstract void setRamFrequency(String frequency);

  //显卡 类型 大小
  public abstract void setGraphicsCapcity(String capcity);

  public abstract void setGraphicsType(String type);

  @Override public String toString() {
    return "ComputerProduct{"
        + "mCpuType='"
        + mCpuType
        + '\''
        + ", mCpuCapcity='"
        + mCpuCapcity
        + '\''
        + ", mRamCapcity='"
        + mRamCapcity
        + '\''
        + ", mRamFrequency='"
        + mRamFrequency
        + '\''
        + ", mGraphicsCapcity='"
        + mGraphicsCapcity
        + '\''
        + ", mGraphicsType='"
        + mGraphicsType
        + '\''
        + '}';
  }
}
