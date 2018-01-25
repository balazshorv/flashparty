package com.flash.party.api.transformer;

import com.flash.party.api.entity.UpdateGeolocationRequest;
import com.flash.party.datastore.entity.UserLocation;

public interface UserLocationTransformer {

  UserLocation transform(String userId, UpdateGeolocationRequest request);
}
