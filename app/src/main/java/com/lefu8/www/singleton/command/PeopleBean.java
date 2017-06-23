package com.lefu8.www.singleton.command;

/**
 * 辅助类，作为接收者Receiver的成员，包含两个属性，用来观察命令的执行情况
 *
 * @author zyc
 *         created at 2017/6/23 9:19
 */

public class PeopleBean {

  private int age = -1;  //年龄
  private String name = "NULL";  //姓名

  public PeopleBean() {
  }

  public PeopleBean(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public void update(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public void update(int age) {
    this.age = age;
  }

  public void update(String name) {
    this.name = name;
  }

  /**
   * @return 返回一个PeopleBean的克隆对象
   */
  protected PeopleBean clone() {
    return new PeopleBean(age, name);
  }

  @Override public String toString() {
    return " 【年龄：" + age + "\t姓名：" + name + "】";
  }
  // setter and getter

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }
}
