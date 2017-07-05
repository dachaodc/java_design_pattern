package com.lefu8.www.singleton.Bridge;

/**
 * @author zyc
 *         created at 2017/6/29 14:18
 */

//修正抽象化角色Refined Abstraction(圆形)
public class Circle extends Shape {

  public Circle(Drawing drawing) {
    super(drawing);
  }

  @Override public void draw() {
    drawCircle();
  }
}
