package com.lefu8.www.singleton.command;

import android.util.Log;

/**
 * 命令的具体执行类[接收者角色], 命令接收者可以是任意的类，只要实现了命令要求实现的相应功能即可。
 *
 * @author zyc
 *         created at 2017/6/22 19:09
 */

public class ReceiverRole {

  private PeopleBean people;
  //具体命令操作的缓存栈，用于回滚。这里为了方便就用一个PeopleBean来代替
  private PeopleBean peopleCache = new PeopleBean();

  public ReceiverRole() {
    this.people = new PeopleBean(-1, "NULL");//初始化年龄为-1，姓名为NULL
  }

  public ReceiverRole(PeopleBean people) {
    this.people = people;
  }

  /**
   * 具体操作方法[修改年龄和姓名]
   */
  public void opActionUpdateAge(int age) {
    Log.i("command--->", "执行命令前：" + people.toString());
    this.people.update(age);
    Log.i("command--->", "执行命令后：" + people.toString() + "\n");
  }

  //修改姓名
  public void opActionUpdateName(String name) {
    Log.i("command--->", "执行命令前：" + people.toString());
    this.people.update(name);
    Log.i("command--->", "执行命令后：" + people.toString() + "\n");
  }

  /**
   * 回滚操作，用于撤销opAction执行的改变
   */
  public void rollBackAge() {
    people.setAge(peopleCache.getAge());
    Log.i("command--->", "命令回滚后：" + people.toString() + "\n");
  }

  public void rollBackName() {
    people.setName(peopleCache.getName());
    Log.i("command--->", "命令回滚后：" + people.toString() + "\n");
  }
}
