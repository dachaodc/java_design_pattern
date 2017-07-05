package com.lefu8.www.singleton.factory.abstractF;

/**
 * 抽象工厂
 * @author zyc
 *         created at 2017/7/5 15:26
 */

public abstract class AbstractFactory {

  public abstract Flyable createFlyable();

  public abstract Moveable createMoveable();

  public abstract Writeable createWriteable();
}
