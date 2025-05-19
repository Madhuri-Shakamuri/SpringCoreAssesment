/*
2. Create an aspect called security aspect where before advice is applied to payment method of payment component, 
after advice is to be applied to validateCC method, around advice is to be applied to process method. 
find out how to return the values returned by the method in around advice. 

Need to add Aop dependecy in maven*/


package com.assignment.AspectDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AspectDemoApplication {

	public static void main(String[] args) 
	{
		ApplicationContext context =SpringApplication.run(AspectDemoApplication.class, args);
		Payment obj=context.getBean(Payment.class);
		obj.payment();
		obj.validateCc();
		System.out.println(obj.process());
	}

}
