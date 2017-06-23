package com.lefu8.www.singleton.command;

/**
 * 命令接口(命令角色)
 *
 * @author zyc
 *         created at 2017/6/22 18:56
 */

public interface Command {

  public void execute();

  public void undo();

  public void redo();
}
