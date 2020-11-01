package org.lpelczar.structural.bridge;

import org.lpelczar.structural.bridge.devices.Device;
import org.lpelczar.structural.bridge.devices.Radio;
import org.lpelczar.structural.bridge.devices.Tv;
import org.lpelczar.structural.bridge.remotes.AdvancedRemote;
import org.lpelczar.structural.bridge.remotes.BasicRemote;

public class Demo {
  public static void main(String[] args) {
    testDevice(new Tv());
    testDevice(new Radio());
  }

  public static void testDevice(Device device) {
    System.out.println("Tests with basic remote.");
    BasicRemote basicRemote = new BasicRemote(device);
    basicRemote.power();
    device.printStatus();

    System.out.println("Tests with advanced remote.");
    AdvancedRemote advancedRemote = new AdvancedRemote(device);
    advancedRemote.power();
    advancedRemote.mute();
    device.printStatus();
  }
}
