package com.flash.party.datastore.store;

import java.util.Collection;

import com.flash.party.datastore.entity.UserLocation;

public interface UserLocationStore {

  void insertOrUpdate(UserLocation userLocation);

  Collection<UserLocation> getAll();
}
