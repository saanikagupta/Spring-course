package com.my_codes.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Add the @Component Annotation to your Java class

// Spring will now automatically register this bean 
// with a bean ID: sillyCoach in case of explicit like below
// @Component("sillyCoach")

// default bean ID would be classname with lowercase first letter
@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

	// Field injection
	@Autowired
	private FortuneService fortuneService;
	
//	// setter injection
//	// any method name would have worked
//	@Autowired
//	public void setFortuneService(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}
	
//  contructor injection
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}
	
	// define my init method
	// it will execute after constructor and after dependency injection
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("Inside doMyStartupStuff");
	}
	
	// define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("Inside doMyCleanupStuff");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
