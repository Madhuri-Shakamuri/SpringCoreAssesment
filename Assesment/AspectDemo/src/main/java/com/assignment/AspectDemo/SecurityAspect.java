package com.assignment.AspectDemo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SecurityAspect 
{
    @Before("execution(* com.assignment.AspectDemo.Payment.payment())")
    public void login()
    {
     System.out.println("Logged in");
    }
    @After("execution(* com.assignment.AspectDemo.Payment.validateCc())")
    public void logout()
    {
        System.out.println("Logged out");
    }
    @Around("execution(String com.assignment.AspectDemo.Payment.process())")
    public Object around(ProceedingJoinPoint jp) throws Throwable
    {
        System.out.println("Around object ");
        Object obj=jp.proceed();
        return obj+"\nSuccessfull";
       
     
    }


   
    
}
