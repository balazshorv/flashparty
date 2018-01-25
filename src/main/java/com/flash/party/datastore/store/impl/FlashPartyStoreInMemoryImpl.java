package com.flash.party.datastore.store.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.flash.party.datastore.entity.FlashParty;
import com.flash.party.datastore.store.FlashPartyStore;

public class FlashPartyStoreInMemoryImpl implements FlashPartyStore {

  private Map<String, FlashParty> flashPartyStore = new HashMap<>();

  @Override
  public Optional<FlashParty> getParty(final String coordinateKey) {
    return Optional.ofNullable(flashPartyStore.get(coordinateKey));
  }

  @Override
  public void addParty(final FlashParty flashParty) {
    flashPartyStore.put(flashParty.getCoordinateKey(), flashParty);
  }
}
