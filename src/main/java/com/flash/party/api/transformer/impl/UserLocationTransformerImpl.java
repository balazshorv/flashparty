package com.flash.party.api.transformer.impl;

import java.text.DecimalFormat;

import org.springframework.stereotype.Service;

import com.flash.party.api.entity.UpdateGeolocationRequest;
import com.flash.party.api.transformer.UserLocationTransformer;
import com.flash.party.datastore.entity.UserLocation;

@Service
public class UserLocationTransformerImpl implements UserLocationTransformer {

  private static final DecimalFormat df = new DecimalFormat(".####");

  @Override
  public UserLocation transform(final String userId, final UpdateGeolocationRequest request) {
    final Double longitude = request.getCoordinates().getLongitude();
    final Double latitude = request.getCoordinates().getLatitude();
    return UserLocation.of(userId,
      request.getTimestamp(),
      longitude,
      latitude,
      generateCoordinateKey(longitude, latitude));
  }

  private String generateCoordinateKey(Double longitude, Double latitude) {
    return df.format(longitude) + df.format(latitude);
  }
}
