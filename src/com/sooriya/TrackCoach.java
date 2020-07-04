package com.sooriya;

public class TrackCoach implements Coach {

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
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run hard 5k";
	}

	public WorkoutTime getWorkoutTime() {
		return workoutTime;
	}

	public void setWorkoutTime(WorkoutTime workoutTime) {
		this.workoutTime = workoutTime;
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
		System.out.println("Inside Coach init method - trackCoach");
	}
	public void coachDestroyMethod()
	{
		System.out.println("Inside Coach destroy method - trackCoach");
	}

}
