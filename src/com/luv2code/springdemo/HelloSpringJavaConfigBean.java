package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloSpringJavaConfigBean {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ACApplicationContext = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach myCoach = ACApplicationContext.getBean("swimCoach", Coach.class);
		
		// Normal Bean from Java config
		System.out.println(myCoach.getDailyWorkout());
		
		//Using DI from Java Config.
		System.out.println(myCoach.getYourFourtune());
		
		
		//Using property file injects
		System.out.println(myCoach.getProperties());
	}

}
