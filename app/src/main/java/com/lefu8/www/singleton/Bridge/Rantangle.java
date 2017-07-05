package com.lefu8.www.singleton.Bridge;

/**
 * 修正抽象化角色Refined Abstraction(矩形)
 *
 * @author zyc
 *         created at 2017/6/29 14:07
 */

public class Rantangle extends Shape {

  public Rantangle(Drawing drawing) {
    super(drawing);
  }

  @Override public void draw() {
    drawRectangle();
  }
}
