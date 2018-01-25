package com.flash.party.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.flash.party.api.entity.UpdateGeolocationRequest;
import com.flash.party.api.transformer.UserLocationTransformer;
import com.flash.party.datastore.entity.UserLocation;
import com.flash.party.datastore.store.UserLocationStore;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class LocationController {

  @Autowired
  private UserLocationTransformer geolocationTransformer;

  @Autowired
  private UserLocationStore userLocationStore;

  @RequestMapping(path = "/api/v1/{userId}",
    method = POST,
    consumes = APPLICATION_JSON_VALUE,
    produces = APPLICATION_JSON_VALUE)
  @ResponseStatus(OK)
  public void updateGeolocationData(@PathVariable("userId") final String userId,
                                    @RequestBody final UpdateGeolocationRequest updateGeolocationRequest) {
    final UserLocation userLocation = geolocationTransformer.transform(userId, updateGeolocationRequest);
    userLocationStore.insertOrUpdate(userLocation);
  }
}
