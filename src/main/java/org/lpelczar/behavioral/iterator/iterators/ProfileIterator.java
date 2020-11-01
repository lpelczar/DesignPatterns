package org.lpelczar.behavioral.iterator.iterators;

import org.lpelczar.behavioral.iterator.profile.Profile;

public interface ProfileIterator {
  boolean hasNext();

  Profile getNext();

  void reset();
}
