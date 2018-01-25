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

  public UpdateGeolocationRequest setTimestamp(final String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public GeolocationCoordinate getCoordinates() {
    return coordinates;
  }

  public UpdateGeolocationRequest setCoordinates(final GeolocationCoordinate coordinates) {
    this.coordinates = coordinates;
    return this;
  }
}
