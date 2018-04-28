package com.ms.springannotationconfigusingxml.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.springannotationconfigusingxml.model.Guest;
import com.ms.springannotationconfigusingxml.model.GuestPass;
import com.ms.springannotationconfigusingxml.repository.GuestPassRepository;
import com.ms.springannotationconfigusingxml.repository.GuestRepository;

@Service("anotherGuestServ")
public class AnotherGuestServiceImpl implements GuestService {

	private GuestRepository guestRepository;
	private GuestPassRepository guestPassRepository;

	@Autowired
	public AnotherGuestServiceImpl(GuestRepository guestRepository) {
		System.out.println("---- AnotherGuestServiceImpl constructor invoked using CONSTRUCTOR injection ----");
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
