package com.xworkz.init;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.init.component.ArmyComponent;

public class ArmyTester {

	public static void main(String[] args) {


		ApplicationContext container=new ClassPathXmlApplicationContext("army.xml");
		ArmyComponent refOfArmy=container.getBean(ArmyComponent.class);
		
		System.out.println(refOfArmy.getStrength());
		System.out.println(refOfArmy.getType());
	}

}
