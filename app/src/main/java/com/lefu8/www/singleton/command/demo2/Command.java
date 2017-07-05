package com.lefu8.www.singleton.command.demo2;

/**
 * 典型的Command模式需要有一个接口。
 * 接口中有一个统一的方法，这就是"将命令/请求封装为对象"：
 *
 * @author zyc
 * created at 2017/6/26 9:30
 */

public interface Command {
  void execute();
}
