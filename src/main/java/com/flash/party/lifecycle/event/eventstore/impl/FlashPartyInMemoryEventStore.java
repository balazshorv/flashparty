package com.flash.party.lifecycle.event.eventstore.impl;

import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.flash.party.lifecycle.event.eventarchive.FlashPartyEventArchive;
import com.flash.party.lifecycle.event.events.FlashPartyBasicEvent;
import com.flash.party.lifecycle.event.eventstore.FlashPartyEventStore;

@Repository
public class FlashPartyInMemoryEventStore implements FlashPartyEventStore {
  private final Queue<FlashPartyBasicEvent> eventQueue = new LinkedList<>();

  @Autowired
  private FlashPartyEventArchive eventArchive;

  @Override
  public void addEvent(final FlashPartyBasicEvent event) {
    eventQueue.add(event);
  }

  @Override
  public FlashPartyBasicEvent getNextEvent() {
    Optional.ofNullable(eventQueue.peek())
      .ifPresent(e -> eventArchive.archive(e));
    return eventQueue.poll();
  }
}