package com.lefu8.www.singleton.command.demo1;

/**
 * 更新年龄的命令类  [ 具体命令角色 ]
 *
 * @author zyc
 *         created at 2017/6/22 19:01
 */

public class ConcreteCommandImpl1 implements Command {

  private ReceiverRole receiverRole1;

  public ConcreteCommandImpl1(ReceiverRole receiverRole1) {
    this.receiverRole1 = receiverRole1;
  }

  @Override public void execute() {
        /*
    		 * 可以加入命令排队等等，未执行的命令支持redo操作
    		 */
    receiverRole1.opActionUpdateAge(1001);//执行具体的命令操作
  }

  @Override public void undo() {
    receiverRole1.rollBackAge();//执行具体的撤销回滚操作
  }

  @Override public void redo() {
    //在命令执行前可以修改命令的执行
  }
}
