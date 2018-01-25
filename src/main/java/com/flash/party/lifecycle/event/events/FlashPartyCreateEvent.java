package com.flash.party.lifecycle.event.events;

import java.util.List;

public class FlashPartyCreateEvent implements FlashPartyBasicEvent {

  private final String id;
  private final List<String> userIds;

  private FlashPartyCreateEvent(final String id, final List<String> userIds) {
    this.id = id;
    this.userIds = userIds;
  }

  public static FlashPartyCreateEvent of(final String id, final List<String> userIds) {
    return new FlashPartyCreateEvent(id, userIds);
  }
}
