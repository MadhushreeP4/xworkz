package com.xworkz.rocket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.rocket.component.RocketComponent;

public class RocketTester {

	public static void main(String[] args) {
		
		ApplicationContext container=new ClassPathXmlApplicationContext("rocket.xml");
		//container.getBean("rocketComponent",RocketComponent.class);
		//container.getBean("rocketComponent1",RocketComponent.class);

	}

}
