package com.sooriya;

public class BaseballCoach implements Coach {
	
	private String name;
	private String email;

	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private FortuneService fortuneService;
	private WorkoutTime workoutTime;
	public WorkoutTime getWorkoutTime() {
		return workoutTime;
	}
	public void setWorkoutTime(WorkoutTime workoutTime) {
		this.workoutTime = workoutTime;
	}
	@Override
	public String getDailyWorkout() {
		return "Practise batting for daily 30 mins";
	    
	}
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	@Override
	public String getDailyWorkoutTime() {
		return workoutTime.getTime();
	}
	@Override
	public String getDetails() {
		return name + "  " + email;
	}
	public void coachInitMethod()
	{
		System.out.println("Inside Coach init method - baseball");
	}
	public void coachDestroyMethod()
	{
		System.out.println("Inside Coach destroy method - baseball");
	}

}
