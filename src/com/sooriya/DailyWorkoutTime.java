package com.sooriya;

public class DailyWorkoutTime implements WorkoutTime {

	@Override
	public String getTime() {
		return "Workout for daily 30 mins";
	}

	public void workoutTimeInitMethod()
	{
		System.out.println("Inside WorkoutTime init method");
	}
	public void workoutTimeDestroyMethod()
	{
		System.out.println("Inside Workout destroy method");
	}
}
