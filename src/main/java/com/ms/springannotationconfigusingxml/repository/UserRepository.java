package com.ms.springannotationconfigusingxml.repository;

import java.util.List;

import com.ms.springannotationconfigusingxml.model.User;

public interface UserRepository {

	List<User> getUser();

}