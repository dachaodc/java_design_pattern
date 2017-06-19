package com.lefu8.www.singleton.sligleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 容器模式
 *
 * @author zyc
 *         created at 2017/6/6 18:54
 */

public class SingletonContainer {

  private SingletonContainer singleton = null;
  private static Map<String, Object> objMap = new HashMap<String, Object>();

  /**
   * 注册对象到map中
   */
  public static void registerService(String key, Object instance) {
    if (!objMap.containsKey(key)) {
      objMap.put(key, instance);
    }
  }

  /**
   * 根据key获取对象
   */
  public static Object getService(String key) {
    return objMap.get(key);
  }
}
