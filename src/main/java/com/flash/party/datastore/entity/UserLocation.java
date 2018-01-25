package com.flash.party.datastore.entity;

public class UserLocation {

  private final String userId;
  private final String timeStamp;
  private final Double longitude;
  private final Double latitude;

  private UserLocation(final String userId, final String timeStamp, final Double longitude, final Double latitude) {
    this.userId = userId;
    this.timeStamp = timeStamp;
    this.longitude = longitude;
    this.latitude = latitude;
  }

  public static UserLocation of(final String userId, final String timeStamp, final Double longitude, final Double latitude) {
    return new UserLocation(userId, timeStamp, longitude, latitude);
  }

  public String getUserId() {
    return userId;
  }

  public String getTimeStamp() {
    return timeStamp;
  }

  public Double getLongitude() {
    return longitude;
  }

  public Double getLatitude() {
    return latitude;
  }
}