package org.lpelczar.structural.bridge.remotes;

import org.lpelczar.structural.bridge.devices.Device;

public class AdvancedRemote extends BasicRemote {

  public AdvancedRemote(Device device) {
    super.device = device;
  }

  public void mute() {
    System.out.println("Remote: mute");
    device.setVolume(0);
  }
}
