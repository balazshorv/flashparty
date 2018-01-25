package com.flash.party.datastore.entity;

import java.util.List;

public class FlashParty {

  private final String coordinateKey;
  private final List<String> userIds;
  private final boolean deleted;

  private FlashParty(final String coordinateKey, final List<String> userIds) {
    this.coordinateKey = coordinateKey;
    this.userIds = userIds;
    this.deleted = false;
  }

  public static FlashParty of(final String coordinateKey, final List<String> userIds) {
    return new FlashParty(coordinateKey, userIds);
  }

  public String getCoordinateKey() {
    return coordinateKey;
  }

  public List<String> getUserIds() {
    return userIds;
  }

  public boolean isDeleted() {
    return deleted;
  }
}
