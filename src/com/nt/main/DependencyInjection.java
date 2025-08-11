package com.nt.main;

import java.sql.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.WishMessageGenerator;

public class DependencyInjection 
{

	public static void main(String[] args) 
	{
		//create IOC Container
			try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml"))
			{
				//get Spring beans class obj ref
				Object obj = ctx.getBean("wmg");
				//type casting
				WishMessageGenerator generator = (WishMessageGenerator) obj;
				//invoke business method
				
				String result = generator.showMessage("Bhushan");
				System.out.println("Result: "+ result);
			}//try IOC container will be closed here automatically
			catch (Exception e) {
				e.printStackTrace();
				
				
			}



	}

}
