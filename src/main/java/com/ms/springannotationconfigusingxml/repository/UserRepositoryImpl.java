package com.ms.springannotationconfigusingxml.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ms.springannotationconfigusingxml.model.User;

// if @Repository annotation is removed or commented out, it will throw the following exception 
// org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.ms.springxmlconfig.repository.UserRepository' available: 
// expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ms.springxmlconfig.repository.UserRepository#getUser()
	 */
	@Override
	public List<User> getUser() {
		List<User> users = new ArrayList<>();
		User user = new User();
		user.setUserName("MS");
		users.add(user);
		return users;
	}

}
