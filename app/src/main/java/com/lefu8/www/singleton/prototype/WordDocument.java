package com.lefu8.www.singleton.prototype;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/**
 * 文档类型, 扮演的是ConcretePrototype角色，
 * 而cloneable是代表prototype角色
 *
 * @author zyc
 *         created at 2017/6/13 9:11
 */

public class WordDocument implements Cloneable {

  /**
   * 文本
   */
  private String mText;
  /**
   * 图片名列表
   */
  private ArrayList<String> mImages = new ArrayList<String>();

  public WordDocument() {
    Log.i("WordDocument", "----------- WordDocument构造函数 -----------");
  }

  //@Override protected WordDocument clone() throws CloneNotSupportedException {
  //  try {
  //    // native clone
  //    WordDocument doc = (WordDocument) super.clone();
  //    doc.mText = this.mText;
  //    doc.mImages = this.mImages;
  //    return doc;
  //  } catch (Exception e) {
  //    e.printStackTrace();
  //  }
  //  return null;
  //}

  /**
   * 针对引用型的field，也需要clone
   */
  @Override protected WordDocument clone() throws CloneNotSupportedException {
    try {
      WordDocument doc = (WordDocument) super.clone();
      doc.mText = this.mText;
      doc.mImages = (ArrayList<String>) this.mImages.clone();
      return doc;
    } catch (Exception e) {
    }

    return null;
  }

  public String getText() {
    return mText;
  }

  public void setText(String mText) {
    this.mText = mText;
  }

  public List<String> getImages() {
    return mImages;
  }

  /**
   * @param img
   */
  public void addImage(String img) {
    this.mImages.add(img);
  }

  /**
   * public clone
   */
  public WordDocument callClone() {
    try {
      WordDocument wd = (WordDocument) super.clone();
      wd.mText = this.mText;
      wd.mImages = (ArrayList<String>) this.mImages.clone();
      return wd;
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return null;
  }

  /**
   * 打印文档内容
   */
  public void showDocument() {
    Log.i("WordDocument", "----------- Word Content Start -----------");
    Log.i("WordDocument", "Text : " + mText);
    Log.i("WordDocument", "Images List: ");
    for (String imgName : mImages) {
      Log.i("WordDocument", "image name : " + imgName);
    }
    Log.i("WordDocument", "----------- Word Content End -----------");
  }
}
