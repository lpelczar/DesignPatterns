package org.lpelczar.structural.proxy;

import org.lpelczar.structural.proxy.downloader.YouTubeDownloader;
import org.lpelczar.structural.proxy.medialibrary.YouTube;

public class Demo {
  public static void main(String[] args) {
    YouTubeDownloader naiveDownloader = new YouTubeDownloader(new YouTube());
    YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());

    long naive = test(naiveDownloader);
    long smart = test(smartDownloader);
    System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");
  }

  private static long test(YouTubeDownloader downloader) {
    long startTime = System.currentTimeMillis();

    // User behavior in our app:
    downloader.renderPopularVideos();
    downloader.renderVideoPage("catzzzzzzzzz");
    downloader.renderPopularVideos();
    downloader.renderVideoPage("dancesvideoo");
    // Users might visit the same page quite often.
    downloader.renderVideoPage("catzzzzzzzzz");
    downloader.renderVideoPage("someothervid");

    long estimatedTime = System.currentTimeMillis() - startTime;
    System.out.print("Time elapsed: " + estimatedTime + "ms\n");
    return estimatedTime;
  }
}
