package com.assignment.quotes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component

public class DisplayQuotes //pascal case
{

    private  Quotes quotes;
    
    @Autowired
   /* Filed injection
    @Qualifier("friendshipBean")
    private Quotes quotes;*/


    /*Constructor Injection
    public DisplayQuotes(@Qualifier("friendshipBean") Quotes quotes)
    {
      this.quotes = quotes;  
    }*/
    @Qualifier("friendshipBean")
    public void setQuotes(Quotes quotes)
    {
        this.quotes=quotes;

    }
    

    
    
    public void display()
    {
        
        
        for(String q:quotes.getQuotes())
        {
            System.out.println(q);
        }
    }
    @PostConstruct
    public void inDisplay()
    {
        System.out.println("Display Started ......................");
    
    }
   
     @PreDestroy
    public void outDisplay()
    {
        System.out.println("Display destroyed......................");
    
    }


}
