package com.lefu8.www.singleton.builder;

/**
 * 产品具体实现
*@author zyc
*created at 2017/6/7 14:47
*/

public class AppleComputer extends ComputerProduct {

  @Override public void setCpuType(String type) {
    mCpuType = type;
  }

  @Override public void setCpuCapcity(String capcity) {
    mCpuCapcity = capcity;
  }

  @Override public void setRamCapcity(String capcity) {
    mRamCapcity = capcity;
  }

  @Override public void setRamFrequency(String frequency) {
    mRamFrequency = frequency;
  }

  @Override public void setGraphicsCapcity(String capcity) {
    mGraphicsCapcity = capcity;
  }

  @Override public void setGraphicsType(String type) {
    mGraphicsType = type;
  }
}
