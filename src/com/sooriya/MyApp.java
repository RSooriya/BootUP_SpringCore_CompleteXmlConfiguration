package com.sooriya;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
	   // creating spring container and loading configuration file into container
       ClassPathXmlApplicationContext context = new
    		   ClassPathXmlApplicationContext("applicationContext.xml");
       // retrieving beans from container
       Coach theCoach = context.getBean("myCoach",Coach.class);
       Coach alphaCoach = context.getBean("myCoach",Coach.class);
       //calling methods on bean
       System.out.println(theCoach.getDailyWorkout());
       System.out.println(theCoach.getDailyFortune());
       System.out.println(theCoach.getDailyWorkoutTime());
       System.out.println(theCoach.getDetails());
       // checking for scope 
       System.out.println("Singleton " + (theCoach==alphaCoach));
       context.close();
	}

}
