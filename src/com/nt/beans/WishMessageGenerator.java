package com.nt.beans;

import java.time.LocalTime;

public class WishMessageGenerator 
{
private LocalTime time;//HAS-A property
	
	public WishMessageGenerator()
	{
		System.out.println("WishMessageGenerator::0-param constructor");
	}
	
	//setter method for setter Injection
	
	public void setTime(LocalTime time)
	{
		System.out.println("WishMessageGenerator:setTime()");
		this.time=time;
		
	}
	//business method
	
	public String showMessage(String name)
	{
		System.out.println("WishMessageGenerator.showMessage()");
		//get current hour of the day
		
		int hour = time.getHour();
		if(hour<12)
		{
			return "Good Morning: "+name;
		}
		else if(hour<16)
		{
			return "Good Afternoon: "+name;
		}
		else if(hour<20)
		{
			return "Good Evening: "+name;
		}
		else 
		{
			return "Good Night: "+name;
		}
	}



}
