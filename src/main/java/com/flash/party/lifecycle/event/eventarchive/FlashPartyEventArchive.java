package com.flash.party.lifecycle.event.eventarchive;

import com.flash.party.lifecycle.event.events.FlashPartyBasicEvent;

public interface FlashPartyEventArchive {

  void archive(FlashPartyBasicEvent event);
}
