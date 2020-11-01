package org.lpelczar.structural.facade.medialibrary;

import java.io.File;

public class AudioMixer {
  public File fix(VideoFile result) {
    System.out.println("AudioMixer: fixing audio...");
    return new File("tmp");
  }
}
