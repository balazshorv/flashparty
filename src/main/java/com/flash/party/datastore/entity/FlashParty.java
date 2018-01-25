package com.flash.party.datastore.entity;

import java.util.List;

public class FlashParty {

  private String coordinateKey;
  private List<String> userIds;
  private boolean deleted;

  private FlashParty(final String coordinateKey, final List<String> userIds) {
    this.coordinateKey = coordinateKey;
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

  public FlashParty setUserIds(final List<String> userIds) {
    this.userIds = userIds;
    return this;
  }

  public boolean isDeleted() {
    return deleted;
  }

  public FlashParty setDeleted(final boolean deleted) {
    this.deleted = deleted;
    return this;
  }
}
