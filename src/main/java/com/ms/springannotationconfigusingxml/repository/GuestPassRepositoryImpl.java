package com.ms.springannotationconfigusingxml.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ms.springannotationconfigusingxml.model.GuestPass;

@Repository
public class GuestPassRepositoryImpl implements GuestPassRepository {

	/* (non-Javadoc)
	 * @see com.ms.springxmlconfig.repository.GuestPassRepository#getGuestPasses()
	 */
	@Override
	public List<GuestPass> getGuestPasses() {
		List<GuestPass> guestPasses = new ArrayList<>();
		GuestPass guestPass = new GuestPass();
		guestPass.setPassNumber("1");
		guestPasses.add(guestPass);
		return guestPasses;
	}

}
