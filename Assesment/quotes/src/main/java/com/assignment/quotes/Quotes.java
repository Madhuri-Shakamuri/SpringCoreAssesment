package com.assignment.quotes;

import java.util.List;

import org.springframework.stereotype.Component;


@Component
public interface Quotes   //loose coupling
{
    public List<String> getQuotes(); //abstract method(default)
    
}
