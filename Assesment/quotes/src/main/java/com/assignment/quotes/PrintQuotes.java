package com.assignment.quotes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class PrintQuotes 
{

    @Autowired
    @Qualifier("hardworkBean")
    private Quotes quotes;
    
    public void PrintQuotes()
    {
       
        System.out.println("Printing.......");
        for(String q:quotes.getQuotes())
        {
            System.out.println(q);
        }
    }
}
