package com.ms.springannotationconfigusingxml.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.springannotationconfigusingxml.model.User;
import com.ms.springannotationconfigusingxml.repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService {

	// Autowire using member variable
	// if @Autowired annotation is commented out, following exception will be thrown - Exception in thread "main" 
	// java.lang.NullPointerException at com.ms.springannotationconfigusingxml.service.UserServiceImpl.getUsers(UserServiceImpl.java:24)
	@Autowired
	private UserRepository userRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ms.springxmlconfig.service.UserService#getUsers()
	 */
	@Override
	public List<User> getUsers() {
		return userRepository.getUser();
	}

}
