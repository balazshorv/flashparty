package com.flash.party.lifecycle.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.flash.party.datastore.entity.FlashParty;
import com.flash.party.datastore.store.UserLocationStore;
import com.flash.party.lifecycle.service.FlashPartyPopulateService;

public class FlashPartyPopulateServiceImpl implements FlashPartyPopulateService {

  @Autowired
  UserLocationStore userLocationStore;

  @Override
  public List<FlashParty> populate() {


    return null;
  }

}
