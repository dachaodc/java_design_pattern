package com.lefu8.www.singleton.flyweight.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * 在 Flyweight Factory 里维护了一个 Flyweight 池(存放内部状态)
 * Flyweight Factory 就是通过这个 Flyweight 池对整个享元模式进行控制。
 *
 * @author zyc
 *         created at 2017/7/14 15:12
 */

public class FlyweightFactory {

  private Map<Integer, Flyweight> labels = new HashMap<Integer, Flyweight>();

  public Flyweight factory(String intrinsicState) {
    int hashCode = intrinsicState.hashCode();
    Flyweight fly = labels.get(hashCode);
    if (fly == null) {
      fly = new ConcreteFlyweight(intrinsicState);
      labels.put(hashCode, fly);
    }
    return fly;
  }
}
