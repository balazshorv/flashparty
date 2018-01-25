package com.flash.party.datastore.store;

import java.util.Optional;
import java.util.Set;

import com.flash.party.datastore.entity.FlashParty;

public interface FlashPartyStore {

  Optional<FlashParty> getParty(String coordinateKey);

  void addParty(FlashParty flashParty);

  Set<String> getCoordinateKeys();
}
