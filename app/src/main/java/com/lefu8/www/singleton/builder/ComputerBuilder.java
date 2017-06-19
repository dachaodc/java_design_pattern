package com.lefu8.www.singleton.builder;

/**
 * builder 抽象类
 * @author zyc
 * created at 2017/6/7 14:51
 */

public abstract class ComputerBuilder {

  public abstract void buildCpuType(String cpuType);

  public abstract void buildCpuCapcity(String cpuCapcity);

  public abstract void buildRamCapcity(String ramCapcity);

  public abstract void buildRamFrequency(String ramFrequency);

  public abstract void buildGraphicsCapcity(String graphicsCapcity);

  public abstract void buildGraphicsType(String graphicsType);

  // 创建Computer
  public abstract ComputerProduct create();
}
