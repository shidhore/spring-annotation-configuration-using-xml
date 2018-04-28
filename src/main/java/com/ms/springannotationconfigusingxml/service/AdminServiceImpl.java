package com.ms.springannotationconfigusingxml.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.springannotationconfigusingxml.model.Admin;
import com.ms.springannotationconfigusingxml.repository.AdminRepository;

// If @Service annotation is removed or commented out, following exception will be thrown
// Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'adminService' available
// Also
// The name given to @Service (adminService here) must match the name in 'appContext.getBean("adminService", AdminService.class);' invocation method. 
// Or else following exception will be thrown.
// Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'adminService' available
@Service("adminServiceNameMustMatch")
public class AdminServiceImpl implements AdminService {

	private AdminRepository adminRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ms.springxmlconfig.service.AdminService#getAdmins()
	 */
	@Override
	public List<Admin> getAdmins() {
		return adminRepository.getAdmin();
	}

	// Autowire using setter method
	// If @Autowired annotation is commented out, following exception will be thrown
	// - Exception in thread "main" java.lang.NullPointerException at com.ms.springannotationconfigusingxml.service.AdminServiceImpl.getAdmins(AdminServiceImpl.java:34)
	@Autowired
	public void setAdminRepository(AdminRepository adminRepository) {
		System.out.println("---- setAdminRepository method invoked using SETTER injection ----");
		this.adminRepository = adminRepository;
	}

}
