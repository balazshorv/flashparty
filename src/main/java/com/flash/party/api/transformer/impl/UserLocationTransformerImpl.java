package com.flash.party.api.transformer.impl;

import org.springframework.stereotype.Service;

import com.flash.party.api.entity.UpdateGeolocationRequest;
import com.flash.party.api.transformer.UserLocationTransformer;
import com.flash.party.datastore.entity.UserLocation;

@Service
public class UserLocationTransformerImpl implements UserLocationTransformer {

  @Override
  public UserLocation transform(final String userId, final UpdateGeolocationRequest request) {
    return UserLocation.of(userId, request.getTimestamp(), request.getCoordinates().getLongitude(), request.getCoordinates().getLatitude());
  }
}
