package com.lefu8.www.singleton.command;

/**
 * 更新姓名的命令类[具体命令角色]
*@author zyc
*created at 2017/6/22 19:04
*/

public class ConcreteCommandImpl2 implements Command{

  private ReceiverRole receiverRole1;

  public ConcreteCommandImpl2(ReceiverRole receiverRole1) {
    this.receiverRole1 = receiverRole1;
  }

  @Override
  public void execute() {
    		/*
    		 * 可以加入命令排队等等，未执行的命令支持redo操作
    		 */
    receiverRole1.opActionUpdateName("zyc");//执行具体的命令操作
  }

  @Override
  public void undo() {
    receiverRole1.rollBackName();//执行具体的撤销回滚操作
  }

  @Override
  public void redo() {
    //在命令执行前可以修改命令的执行
  }
}
