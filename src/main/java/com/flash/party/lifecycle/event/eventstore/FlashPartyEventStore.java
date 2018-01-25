package com.flash.party.lifecycle.event.eventstore;

import com.flash.party.lifecycle.event.events.FlashPartyBasicEvent;

public interface FlashPartyEventStore {

  void addEvent(FlashPartyBasicEvent event);

  FlashPartyBasicEvent getNextEvent();
}
