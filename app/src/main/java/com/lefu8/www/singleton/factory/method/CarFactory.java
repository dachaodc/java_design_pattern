package com.lefu8.www.singleton.factory.method;

/**
 * 汽车工厂
*@author zyc
*created at 2017/7/5 15:07
*/

public class CarFactory extends VehicleFactory {

  @Override public Moveable create() {
    return new BMWCar();
  }
}
