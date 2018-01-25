package com.flash.party.api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GeolocationCoordinate {

  @JsonProperty("latitude")
  private Double latitude;

  @JsonProperty("longitude")
  private Double longitude;

  public Double getLatitude() {
    return latitude;
  }

  public Double getLongitude() {
    return longitude;
  }
}
