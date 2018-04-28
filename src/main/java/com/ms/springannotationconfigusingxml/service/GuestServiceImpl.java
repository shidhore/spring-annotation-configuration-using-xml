package com.ms.springannotationconfigusingxml.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.springannotationconfigusingxml.model.Guest;
import com.ms.springannotationconfigusingxml.model.GuestPass;
import com.ms.springannotationconfigusingxml.repository.GuestPassRepository;
import com.ms.springannotationconfigusingxml.repository.GuestRepository;

@Service("guestServ")
public class GuestServiceImpl implements GuestService {

	private GuestRepository guestRepository;
	
	// Could have placed @Autowired on member here or on setter for guestPassRepository as done below.
	private GuestPassRepository guestPassRepository;

	@Autowired
	public GuestServiceImpl(GuestRepository guestRepository) {
		System.out.println("---- GuestServiceImpl constructor invoked using CONSTRUCTOR injection ----");
		this.guestRepository = guestRepository;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ms.springxmlconfig.service.GuestService#getGuests()
	 */
	@Override
	public List<Guest> getGuests() {
		return guestRepository.getGuests();
	}

	@Autowired
	public void setGuestPassRepository(GuestPassRepository guestPassRepository) {
		System.out.println("---- setGuestPassRepository method invoked using SETTER injection ----");
		this.guestPassRepository = guestPassRepository;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ms.springxmlconfig.service.GuestService#getGuestPasses()
	 */
	@Override
	public List<GuestPass> getGuestPasses() {
		return guestPassRepository.getGuestPasses();
	}

}
