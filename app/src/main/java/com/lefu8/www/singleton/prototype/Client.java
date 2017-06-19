package com.lefu8.www.singleton.prototype;

/**
 *
*@author zyc
*created at 2017/6/13 14:04
*/

public class Client {

  public static void testPrototype() {
    WordDocument originDoc = new WordDocument();
    originDoc.setText("这是一篇文档");
    originDoc.addImage("图片1");
    originDoc.addImage("图片2");
    originDoc.addImage("图片3");
    originDoc.showDocument();
    WordDocument doc2 = originDoc.callClone();
    doc2.showDocument();
    doc2.setText("这是修改过的Doc2文本");
    doc2.showDocument();
    originDoc.showDocument();
  }
}
