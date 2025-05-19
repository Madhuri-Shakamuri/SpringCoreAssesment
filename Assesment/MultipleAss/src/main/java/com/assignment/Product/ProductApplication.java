/*3. Get average price of products through JDBC spring.
4. Display catcode & avgprice.
5. Insert a new category.
6. Create a method where the name of the product has lessthan 10 letters and price is greater than the given value 
 a)display pro_name and cat_desc.
7. Create repo for sales and retreive 
  a) all sales for given product.
  b) all sales where quantity is between the range.
  c) display sales where the price per unit sold is lesthan the current price of the product.
  d) display sales in the ascending order of quantity.
  e)display 2nd page size '4'.

Adding jdbc for dependency*/



package com.assignment.Product;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.assignment.Product.Repository.CategoryRepo;
import com.assignment.Product.Repository.ProductRepo;
import com.assignment.Product.Repository.SalesRepo;

@SpringBootApplication
public class ProductApplication implements CommandLineRunner{

	@Autowired
	private ProductRepo productrepo;
	@Autowired
	private CategoryRepo catrepo;

	@Autowired
	private SalesRepo salesrepo;
	public static void main(String[] args) 
	{

		SpringApplication.run(ProductApplication.class, args);
	}
	public void run(String... args)
	{

		  System.out.println("Average Price Of Products: "+productrepo.avgPrice());

		for(Map<String,Object> cat_Price:productrepo.avgPriceWithCatcode())

		{
			System.out.println(cat_Price);
		}

		catrepo.creatingTable();
		catrepo.alteringTable();
		catrepo.insertingRows();
		
		System.out.println("Price greater Than 12000:\n");
		for(Map<String,Object> p:productrepo.joinmethod(12000))
		{
			
			System.out.println(p);
		}
		
		
		salesrepo.creatingTable();
		 salesrepo.insertingData();
		for(Object s:salesrepo.salesPerProduct(1))
		{
        System.out.println(s);
		}
		System.out.println("Sales Quantity Between Range: ");
		for(Object s:salesrepo.quantityRange(2, 5))
		{
			System.out.println(s);
		}
		System.out.println("Price Comparison");
		for(Object s:salesrepo.priceComparsion())
		{
			System.out.println(s);
		}
		 System.out.println("Quantity ASC Order:");
		for(Object s:salesrepo.ascOrderQuantity())
		{
			System.out.println(s);
		}


	}


}
