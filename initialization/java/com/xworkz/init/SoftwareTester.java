package com.xworkz.init;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.init.component.SoftwareComponent;

public class SoftwareTester {

	public static void main(String[] args) {


		ApplicationContext container=new ClassPathXmlApplicationContext("software.xml");
		SoftwareComponent refOfSoftware=container.getBean(SoftwareComponent.class);
		
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		
		System.out.println(refOfSoftware.getVersion());
		System.out.println(refOfSoftware.getType());
	}

}
