package com.lefu8.www.singleton.flyweight.hashtest;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/**
 * hashCode equals 测试
 *
 * @author zyc
 *         created at 2017/7/14 16:31
 */

public class HashTest {

  private int i;

  public int getI() {
    return i;
  }

  public void setI(int i) {
    this.i = i;
  }

  //public int hashCode() {
  //  return i % 10;
  //}

  public static void HashCodeTest() {
    HashTest a = new HashTest();
    HashTest b = new HashTest();
    a.setI(1);
    b.setI(1);
    Set<HashTest> set = new HashSet<HashTest>();
    set.add(a);
    set.add(b);
    boolean b1 = a.hashCode() == b.hashCode();
    Log.i("hashTest",b1 + "");
    boolean equals = a.equals(b);
    Log.i("hashTest",equals + "");
    Log.i("hashTest",set + "");
  }
}
