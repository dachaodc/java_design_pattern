package com.lefu8.www.singleton.Bridge;

/**
 * 接着​抽象的形状Shape和两个派生类：矩形Rantanle和圆形Circle
 * 抽象化角色Abstraction
 *
 * @author zyc
 *         created at 2017/6/29 11:43
 */

public abstract class Shape {

  //持有实现的角色Implementor(作图类)
  protected Drawing myDrawing;

  public Shape(Drawing drawing) {
    this.myDrawing = drawing;
  }

  abstract public void draw();

  //保护方法drawRectangle
  protected void drawRectangle() {
    //this.impl.implmentation()
    myDrawing.drawRantangle();
  }

  //保护方法drawCircle
  protected void drawCircle() {
    //this.impl.implmentation()
    myDrawing.drawCircle();
  }
}
