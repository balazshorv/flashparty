package com.flash.party.lifecycle.event.events;

import java.util.List;

public class FlashPartyCreateEvent implements FlashPartyBasicEvent {

  private final String id;
  private final List<String> userIds;

  private FlashPartyCreateEvent(String id, List<String> userIds) {
    this.id = id;
    this.userIds = userIds;
  }


}
