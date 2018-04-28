package com.ms.springannotationconfigusingxml.repository;

import java.util.List;

import com.ms.springannotationconfigusingxml.model.Guest;

public interface GuestRepository {

	List<Guest> getGuests();

}