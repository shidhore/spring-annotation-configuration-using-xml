import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ms.springannotationconfigusingxml.service.AdminService;
import com.ms.springannotationconfigusingxml.service.GuestService;
import com.ms.springannotationconfigusingxml.service.UserService;

public class SpringAnnotationConfigurationUsingXMLDemo {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("");

		// Autowire annotation on member variable
		System.out.println("==== Autowire annotation on member variable ====");
		UserService userService = appContext.getBean("userService", UserService.class);
		System.out.println("Now retrieving first user...");
		System.out.println("user name = " + userService.getUsers().get(0).getUserName());
		System.out.println("");

		// Autowire annotation on setter
		System.out.println("==== Autowire annotation on setter ====");
		AdminService adminService = appContext.getBean("adminServiceNameMustMatch", AdminService.class);
		System.out.println("Now retrieving first admin...");
		System.out.println("admin name = " + adminService.getAdmins().get(0).getUserName());
		System.out.println("admin role = " + adminService.getAdmins().get(0).getRole());
		System.out.println("");

		// Autowire using Constructor
		// note that the first argument inside getBean(...) method (guestServ in this
		// case) must match bean name in @Service annotation.
		System.out.println("==== bean guestServ -> Autowire using constructor ====");
		GuestService guestServiceAutowireConstructor = appContext.getBean("guestServ", GuestService.class);
		System.out.println("Now retrieving first guest...");
		System.out.println("guest name = " + guestServiceAutowireConstructor.getGuests().get(0).getUserName());
		System.out.println("Now retrieving first guest pass...");
		System.out.println("guest pass number = " + guestServiceAutowireConstructor.getGuestPasses().get(0).getPassNumber());
		System.out.println("");

		System.out.println("==== bean anotherGuestServ -> Autowire using constructor ====");
		GuestService anotherGuestServiceAutowireConstructor = appContext.getBean("anotherGuestServ",
				GuestService.class);
		System.out.println("Now retrieving first guest...");
		System.out.println("guest name = " + anotherGuestServiceAutowireConstructor.getGuests().get(0).getUserName());
		System.out.println("");

		// note that following should print false as we have two bean definitions of type GuestService.
		System.out.println(
				"appContext.getBean(\"guestServ\", GuestService.class) same object as appContext.getBean(\"anotherGuestServ\", GuestService.class)? -> "
						+ ((guestServiceAutowireConstructor == anotherGuestServiceAutowireConstructor) ? true : false));
		
		/*// Autowire using byType
		System.out.println("==== Autowire using byType ====");
		GuestService guestServiceAutowireByType = appContext.getBean("guestService", GuestService.class);
		System.out.println("Now retrieving first guest pass...");
		System.out.println("guest pass number = " + guestServiceAutowireByType.getGuestPasses().get(0).getPassNumber());
		System.out.println("");

		// note that following should print false as we have three bean definitions for
		// GuestService in applicationContext.xml file.
		System.out.println(
				"appContext.getBean(\"guestServ\", GuestService.class) same object as appContext.getBean(\"guestService\", GuestService.class)? -> "
						+ ((guestServiceAutowireConstructor == guestServiceAutowireByType) ? true : false));
		System.out.println("");

		// Autowire using byName
		System.out.println("==== Autowire using byName ====");
		GuestService guestServiceAutowireByName = appContext.getBean("guestServiceByName", GuestService.class);
		System.out.println("Now retrieving first guest pass...");
		System.out.println("guest pass number = " + guestServiceAutowireByName.getGuestPasses().get(0).getPassNumber());
		System.out.println("");

		// note that following should print false as we have three bean definitions for
		// GuestService in applicationContext.xml file.
		System.out.println(
				"appContext.getBean(\"guestServiceByName\", GuestService.class) same object as appContext.getBean(\"guestService\", GuestService.class)? -> "
						+ ((guestServiceAutowireByName == guestServiceAutowireByType) ? true : false));*/

	}

}
