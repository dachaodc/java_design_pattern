package com.lefu8.www.singleton.builder;

/**
 * 制造微星电脑
*@author zyc
*created at 2017/6/12 12:04
*/
public class MsiBuilder extends ComputerBuilder{

  private ComputerProduct mProduct = new MsiComputer();

  @Override public void buildCpuType(String cpuType) {
    mProduct.setCpuType(cpuType);
  }

  @Override public void buildCpuCapcity(String cpuCapcity) {
    mProduct.setCpuCapcity(cpuCapcity);
  }

  @Override public void buildRamCapcity(String ramCapcity) {
    mProduct.setRamCapcity(ramCapcity);
  }

  @Override public void buildRamFrequency(String ramFrequency) {
    mProduct.setRamFrequency(ramFrequency);
  }

  @Override public void buildGraphicsCapcity(String graphicsCapcity) {
    mProduct.setGraphicsCapcity(graphicsCapcity);
  }

  @Override public void buildGraphicsType(String graphicsType) {
    mProduct.setGraphicsType(graphicsType);
  }

  @Override public ComputerProduct create() {
    return mProduct;
  }
}
