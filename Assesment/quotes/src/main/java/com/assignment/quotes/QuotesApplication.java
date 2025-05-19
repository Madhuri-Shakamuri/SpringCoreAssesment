/*
1.Create an interface called Quotes with a method getQuotes() , 
implement this interface by two classes one returns 3 quotes about friendship another class about hardwork with 4 quotes. 

a) Inject quotes into PrintQuotes, DisplayQuotes.
b) Implement @primary, @qualifier, @lazy, @Scope, @postconstruct, @predestroy.
c) Create different versions of PrintQuotes for constructor injection, property injection and field injection.

  ** Dont need to add any dependencies **      */

package com.assignment.quotes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class QuotesApplication implements CommandLineRunner 
{
      @Autowired
      private PrintQuotes printQuotes;
	  @Autowired
	  private DisplayQuotes displayQuotes;


	public static void main(String[] args) 
	{
		SpringApplication.run(QuotesApplication.class,args);

		/*ApplicationContext app= SpringApplication.run(QuotesApplication.class, args);
		DisplayQuotes  displayobj =app.getBean(DisplayQuotes.class);
		displayobj.display();
		PrintQuotes  printobj =app.getBean(PrintQuotes.class);
		printobj.PrintQuotes();*/
	}
	public void run(String... args)
	{
      printQuotes.PrintQuotes();
	  displayQuotes.display();
	}

}
