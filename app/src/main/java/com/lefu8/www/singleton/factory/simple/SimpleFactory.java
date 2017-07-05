package com.lefu8.www.singleton.factory.simple;

/**
 * simple factory
 *
 * @author zyc
 *         created at 2017/7/5 13:55
 */

public class SimpleFactory {

  public Object create(Class<?> clazz) {
    if (clazz.getName().equals(BigHouse.class.getName())) {
      return createBigHouse();
    } else if (clazz.getName().equals(Car.class.getName())) {
      return createCar();
    }
    return null;
  }

  private BigHouse createBigHouse() {
    return new BigHouse();
  }

  private Car createCar() {
    return new Car();
  }
}
