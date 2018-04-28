package com.ms.springannotationconfigusingxml.service;

import java.util.List;

import com.ms.springannotationconfigusingxml.model.Guest;
import com.ms.springannotationconfigusingxml.model.GuestPass;

public interface GuestService {

	List<Guest> getGuests();
	
	List<GuestPass> getGuestPasses();

}