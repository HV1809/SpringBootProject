package edu.udayton.NewCourseSpring.SpringBootProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
/*
@SpringApplication => Bootstrap Annotation ==> Starting point
A JAva class which is having @SpringBootApplication is called as VBootStrap class
In Every Springboot project there will be only one bootstrap class
->Functionality of Bootstrap Class:
	1.) It will create IOC container : Inversion of Control Container => All the Java objects will be located here
															=> Now these objects managed by IOC container (Creating, managing the state and Destroying the Object)
	2.) It will implement Dispatcher Servlets: Will instantiate dispatcher servlet during startup
	3.) It will create the database connection automatically, sessionFactory and Entity ManagerFactory
	4.) It will scan all the code in the project, identify all the autostartup events and start them.


 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringBootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectApplication.class, args);

		//Web Application context
		/*
		=> Customer customerObj = new Customer();
		//ioc we will create obj like this:

			Customer customerObj = ioc.getCustomer();

		// Spring we use below in spring.xml

			<bean id ="customerObj" class="edu.udayton.NewCourseSpring.SpringBootProject.Customer">
			<bean id ="cartObj" class="edu.udayton.NewCourseSpring.SpringBootProject.Cart">
			<bean id ="articleObj" class="edu.udayton.NewCourseSpring.SpringBootProject.Article">

		// By Default, spring boot will scan only bootstrap package and bootstrap subpackage, it will move all the classes in the
		package in to the ioc container and inside ioc container it will instantiate the classes here

		example:  => Package Name = " com.amazon.shoppingcart"  ~ BASEPACKAGE that has => @SpringBootApplication
							// all these classes inside the base package named "com.amazon.shoppingcart"
							will moved and instantied created objects in the IOC contrainer //
											//WEB APPLICATION CONTEXT//  pushing the java objects into ioc and initializing them
		com.amazon.shoppingcart.Customer;
		com.amazon.shoppingcart.Product;
		com.amazon.shoppingcart.Cart;
		com.amazon.shoppingcart.Inventory;
		com.amazon.shoppingcart.Payment;
		com.amazon.shoppingcart.Discount;
		com.amazon.shoppingcart.Return;
		com.amazon.shoppingcart.Review;
		com.amazon.shoppingcart.Shipping;

			@SpringBootApplication is a combination of three different annotation :
						@SpringBootConfiguration
						@EnableAutoConfiguration
						@ComponentScan

			@ComponentScan : it will check and scan all the Java classes under the base package "com.amazon.shoppingcart"

		 */

	}
}
