package com.flash.party.api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateGeolocationRequest {

  @JsonProperty("timestamp")
  private String timestamp;

  @JsonProperty("coordinates")
  private GeolocationCoordinate coordinates;

  public String getTimestamp() {
    return timestamp;
  }

  public GeolocationCoordinate getCoordinates() {
    return coordinates;
  }
}
