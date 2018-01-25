package com.flash.party.datastore.entity;

public class FlashParty {

  private String coordinateKey;
  private Integer peopleNearBy;
  private boolean deleted;

  private FlashParty(String coordinateKey, Integer peopleNearBy) {
    this.coordinateKey = coordinateKey;
    this.peopleNearBy = peopleNearBy;
    this.deleted = false;
  }

  public FlashParty of(String coordinateKey, Integer peopleNearBy) {
    return new FlashParty(coordinateKey, peopleNearBy);
  }

  public String getCoordinateKey() {
    return coordinateKey;
  }

  public Integer getPeopleNearBy() {
    return peopleNearBy;
  }

  public FlashParty setPeopleNearBy(final Integer peopleNearBy) {
    this.peopleNearBy = peopleNearBy;
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
