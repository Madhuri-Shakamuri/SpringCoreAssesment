package com.assignment.quotes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("hardworkBean")

public class HardworkQuotes  implements Quotes
{
    public List<String> getQuotes()
    {
        List<String> quoteList=new ArrayList<>();
        quoteList.add("Suffer Until you succeed");
        quoteList.add("Hardwork is the key to acheive your dreams");
        quoteList.add("You have to work hard till you get the respect you need");

        return quoteList;
    }
    
}
