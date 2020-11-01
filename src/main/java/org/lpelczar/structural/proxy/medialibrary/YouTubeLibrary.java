package org.lpelczar.structural.proxy.medialibrary;

import java.util.HashMap;

public interface YouTubeLibrary {
  HashMap<String, Video> popularVideos();

  Video getVideo(String videoId);
}
