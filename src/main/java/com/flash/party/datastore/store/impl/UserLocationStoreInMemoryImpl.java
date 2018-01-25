package com.flash.party.datastore.store.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.flash.party.datastore.entity.UserLocation;
import com.flash.party.datastore.store.UserLocationStore;

@Repository
public class UserLocationStoreInMemoryImpl implements UserLocationStore {

  private Map<String, UserLocation> userLocationStore = new HashMap<>();

  @Override
  public void insertOrUpdate(final UserLocation userLocation) {
    userLocationStore.put(userLocation.getUserId(), userLocation);
  }
}
