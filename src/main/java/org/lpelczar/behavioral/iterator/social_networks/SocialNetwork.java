package org.lpelczar.behavioral.iterator.social_networks;

import org.lpelczar.behavioral.iterator.iterators.ProfileIterator;

public interface SocialNetwork {
  ProfileIterator createFriendsIterator(String profileEmail);

  ProfileIterator createCoworkersIterator(String profileEmail);
}
