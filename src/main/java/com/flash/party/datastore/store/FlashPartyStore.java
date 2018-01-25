package com.flash.party.datastore.store;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.flash.party.datastore.entity.FlashParty;

@Repository
public interface FlashPartyStore {

  Optional<FlashParty> getParty(String coordinateKey);

  void addParty(FlashParty flashParty);
}
