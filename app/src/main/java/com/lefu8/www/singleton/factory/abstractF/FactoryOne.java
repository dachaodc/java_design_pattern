package com.lefu8.www.singleton.factory.abstractF;

/**
 * 工厂一
*@author zyc
*created at 2017/7/5 15:31
*/
public class FactoryOne extends AbstractFactory {

  @Override public Flyable createFlyable() {
    return new Aircraft();
  }

  @Override public Moveable createMoveable() {
    return new BMW7();
  }

  @Override public Writeable createWriteable() {
    return new Pen();
  }
}
