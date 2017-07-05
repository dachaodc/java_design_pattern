package com.lefu8.www.singleton.command.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * 按照通常做法，我们就可以直接调用这三个Command
 * 但是使用Command模式，我们要将他们封装起来
 * 扔到黑盒子List里去
 *
 * 这三个命令进入List中后，已经失去了其外表特征
 * 以后再取出，也可能无法分辨出谁是Engineer
 * 谁是Programmer了
 * @author zyc
 *         created at 2017/6/26 9:38
 */

public class Producer {

  public static List produceRequests() {
    List queue = new ArrayList();
    queue.add(new Engineer());
    queue.add(new Politician());
    queue.add(new Programmer());
    return queue;
  }
}
