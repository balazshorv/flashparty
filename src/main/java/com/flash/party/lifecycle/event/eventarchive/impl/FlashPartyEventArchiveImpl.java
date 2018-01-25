package com.flash.party.lifecycle.event.eventarchive.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.flash.party.lifecycle.event.events.FlashPartyBasicEvent;
import com.flash.party.lifecycle.event.eventarchive.FlashPartyEventArchive;

import static java.util.stream.Collectors.toList;

@Repository
public class FlashPartyEventArchiveImpl implements FlashPartyEventArchive {

  private final List<FlashPartyBasicEvent> events = new ArrayList<>();

  @Override
  public void archive(FlashPartyBasicEvent event) {
    events.add(event);
  }

  public List<FlashPartyBasicEvent> getEvents(Integer numOfEvents) {
    return events.stream()
      .limit(numOfEvents)
      .collect(toList());
  }
}
