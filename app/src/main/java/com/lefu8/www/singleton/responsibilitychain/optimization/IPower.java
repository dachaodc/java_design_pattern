package com.lefu8.www.singleton.responsibilitychain.optimization;

/**
 * 老大的权利接口
 *
 * @author zyc
 *         created at 2017/6/21 10:45
 */

public interface IPower {

  /**
   * 处理请求
   *
   * @param ape 具体的猿
   */
  public void handleRequest(ProgramApes ape);
}
