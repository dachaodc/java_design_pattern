package com.lefu8.www.singleton.facade;

/**
 * facade eg:
 * 遥控器
 *
 * @author zyc
 *         created at 2017/6/13 15:43
 */

public class TvController {

  private PowerSystem mPowerSystem = new PowerSystem();
  private VoiceSystem mVoiceSystem = new VoiceSystem();
  private ChannelSystem mChannelSystem = new ChannelSystem();

  public void powerOn() {
    mPowerSystem.powerOn();
  }

  public void powerOff() {
    mPowerSystem.powerOff();
  }

  public void turnUp() {
    mVoiceSystem.turnUp();
  }

  public void turnDown() {
    mVoiceSystem.turnDown();
  }

  public void nextChannel() {
    mChannelSystem.next();
  }

  public void prevChannel() {
    mChannelSystem.prev();
  }
}
