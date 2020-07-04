package com.sooriya;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day";
	}
	public void fortuneServiceInitMethod()
	{
		System.out.println("Inside FortuneService init method");
	}
	public void fortuneServiceDestroyMethod()
	{
		System.out.println("Inside FortuneService destroy method");
	}
	
}
