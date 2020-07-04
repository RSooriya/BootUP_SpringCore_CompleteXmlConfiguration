package com.sooriya;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
       ClassPathXmlApplicationContext context = new
    		   ClassPathXmlApplicationContext("applicationContext.xml");
       Coach theCoach = context.getBean("myCoach",Coach.class);
       Coach alphaCoach = context.getBean("myCoach",Coach.class);
       System.out.println(theCoach.getDailyWorkout());
       System.out.println(theCoach.getDailyFortune());
       System.out.println(theCoach.getDailyWorkoutTime());
       System.out.println(theCoach.getDetails());
       System.out.println("Singleton " + (theCoach==alphaCoach));
       context.close();
	}

}
