package com.assignment.quotes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("friendshipBean")
@Scope()//default singleton
@Lazy
public class FriendshipQuotes implements Quotes  
{
    public List<String> getQuotes()
    {
        List<String> quoteslist=new ArrayList<>();
        quoteslist.add("A friend in need is a friend in deed");
        quoteslist.add("A friend is the who accept you as you are");
        quoteslist.add("A friend is the one who stays at your worst");

        return quoteslist;
    }

    
}

