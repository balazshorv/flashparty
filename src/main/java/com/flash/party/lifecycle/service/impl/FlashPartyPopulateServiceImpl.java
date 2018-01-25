package com.flash.party.lifecycle.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.flash.party.datastore.entity.FlashParty;
import com.flash.party.datastore.store.FlashPartyStore;
import com.flash.party.datastore.store.UserLocationStore;
import com.flash.party.lifecycle.event.events.FlashPartyCreateEvent;
import com.flash.party.lifecycle.event.eventstore.FlashPartyEventStore;
import com.flash.party.lifecycle.service.FlashPartyPopulateService;

@Component
public class FlashPartyPopulateServiceImpl implements FlashPartyPopulateService {

  @Autowired
  private UserLocationStore userLocationStore;

  @Autowired
  private FlashPartyStore flashPartyStore;

  @Autowired
  private FlashPartyEventStore flashPartyEventStore;

  @Override
  @Scheduled(cron = "* 0/10 * * * ?")
  public void populate() { Map<String, List<String>> possibleParties = new HashMap<>();
    final Set<String> populatedCoordinates = flashPartyStore.getCoordinateKeys();
    userLocationStore.getAll()
      .stream()
      .filter(l -> !populatedCoordinates.contains(l.getCoordinateKey()))
      .forEach(l -> {
        possibleParties.computeIfPresent(l.getCoordinateKey(), (k, v) -> {
          v.add(l.getUserId());
          return v;
        });
        possibleParties.putIfAbsent(l.getCoordinateKey(), newList(l.getUserId()));
      });
    possibleParties
      .forEach((c, userIds) -> {
        if (userIds.size() > 4) {
          createFlashParty(c, userIds);
        }
      });
  }

  private List<String> newList(String userId) {
    List<String> users = new ArrayList<>();
    users.add(userId);
    return users;
  }

  private void createFlashParty(String coordinateKey, List<String> userIds) {
    flashPartyStore.addParty(FlashParty.of(coordinateKey, userIds));
    flashPartyEventStore.addEvent(FlashPartyCreateEvent.of(coordinateKey, userIds));
  }
}
