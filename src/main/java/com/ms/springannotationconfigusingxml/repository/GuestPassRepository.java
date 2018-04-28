package com.ms.springannotationconfigusingxml.repository;

import java.util.List;

import com.ms.springannotationconfigusingxml.model.GuestPass;

public interface GuestPassRepository {

	List<GuestPass> getGuestPasses();

}