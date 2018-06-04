package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration	
@PropertySource("classpath:sports.properties")
public class SportConfig {

	@Bean
	public FourtuneService myFourtuneService() {
		SadFourtuneService mySadFourtuneService = new SadFourtuneService();
		return mySadFourtuneService;
	}
	
	@Bean
	public Coach swimCoach() {
		SwimCoach mySwimCoach = new SwimCoach(myFourtuneService());
		return mySwimCoach;
	}
	
}
