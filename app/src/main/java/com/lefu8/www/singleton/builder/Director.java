package com.lefu8.www.singleton.builder;

/**
 * director
 *
 * @author zyc
 *         created at 2017/6/12 11:01
 */

public class Director {

  ComputerBuilder mBuilder = null;

  /**
   *
   * @param builder
   */
  public Director(ComputerBuilder builder) {
    mBuilder = builder;
  }

  /**
   * 顺序执行--装配工作
   */
  public void construct(String cpuType, String cpuCapCity, String ramCapcity, String ramFrequency,
      String graphicsType, String graphicsCapcity) {
    if (mBuilder == null) {
      throw new NullPointerException("builder is null");
    }
    // 装配
    mBuilder.buildCpuType(cpuType);
    mBuilder.buildCpuCapcity(cpuCapCity);
    mBuilder.buildRamCapcity(ramCapcity);
    mBuilder.buildRamFrequency(ramFrequency);
    mBuilder.buildGraphicsType(graphicsType);
    mBuilder.buildGraphicsCapcity(graphicsCapcity);
  }
}
