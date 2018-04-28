package com.ms.springannotationconfigusingxml;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ms.springannotationconfigusingxml.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
public class SpringXMLConfigurationUsingSetterTest {

	private UserService userService;

	@Before
	public void runBeforeEachTest() {
		// this isn't working; need to find why
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		userService = appContext.getBean("userService", UserService.class);
	}

	@Test
	public void testSimpleServiceNotNull() {
		assertNotNull(userService.getUsers());
	}

}
