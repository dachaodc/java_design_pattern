package com.lefu8.www.singleton.factory.method;

/**
 * 具体工厂
 *
 * @author zyc
 *         created at 2017/7/5 14:57
 */
public class BroomFactory extends VehicleFactory {

  @Override public Moveable create() {
    return new Broom();
  }
}
