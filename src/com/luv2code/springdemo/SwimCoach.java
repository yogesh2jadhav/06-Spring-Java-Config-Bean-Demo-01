package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	public FourtuneService myFourtuneService;
	
	@Value("${foo.email}")
	public String email;
	
	public SwimCoach(FourtuneService myFourtuneService) {
		 
		this.myFourtuneService = myFourtuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do warm up before getting into swimming pool.";
	}

	@Override
	public String getYourFourtune() {
		// TODO Auto-generated method stub
		return myFourtuneService.getYourFourtune();
	}

	@Override
	public String getProperties() {
		// TODO Auto-generated method stub
		return email;
	}

}
