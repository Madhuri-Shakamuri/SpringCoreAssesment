package com.assignment.AspectDemo;

import org.springframework.stereotype.Component;

@Component
public class Payment 
{
    public void payment()
    {
    System.out.println("Payment initiated");
    }
    public void validateCc()
    {

     System.out.println("Validated");
    }
    public String process()
    {
        System.out.println("Processing......");
        
        return "Processed";
        

    }
    
}
