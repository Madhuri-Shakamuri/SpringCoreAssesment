/*7. Create repo for sales and retreive 
  a) all sales for given product.
  b) all sales where quantity is between the range.
  c) display sales where the price per unit sold is lesthan the current price of the product.
  d) display sales in the ascending order of quantity.
  e)display 2nd page size '4'.*/

package com.assignment.Product.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class SalesRepo
{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void creatingTable()
    {
        jdbcTemplate.execute("CREATE TABLE SalesAss(id int PRIMARY KEY,prod_id int FOREIGN KEY REFERENCES ProductAss(id) , quantity int ,price_unit DECIMAL(10,2),sales_date DATE);");
    }
    public void insertingData()
    {
         jdbcTemplate.execute("INSERT INTO SalesAss(id,prod_id,quantity,price_unit,sales_date) VALUES(1, 1, 5,199.99, '2024-05-01'),(2, 2, 3, 149.49, '2024-05-03'),(3, 1, 7, 189.99, '2024-05-04'),(4, 3, 2, 99.99, '2024-05-06'),(5, 1, 1, 205.00, '2024-05-08')");
         jdbcTemplate.execute("INSERT INTO SalesAss(id,prod_id,quantity,price_unit,sales_date) VALUES(6, 1, 5,12000, '2024-05-01');");
         jdbcTemplate.execute("UPDATE SalesAss SET price_unit=80000 WHERE id=6;");
    }
   
    public List salesPerProduct(int id)
    {
     return jdbcTemplate.queryForList("SELECT *FROM SalesAss s JOIN ProductAss p ON p.id=s.prod_id WHERE p.id=?;",id);
    }
    public List quantityRange(int min,int max) 
    {
     return jdbcTemplate.queryForList("SELECT *FROM SalesAss WHERE quantity BETWEEN ? AND ?;",min,max) ;
    }
    public List priceComparsion()
    {
        return jdbcTemplate.queryForList("SELECT *FROM SalesAss S JOIN ProductAss p ON p.id=s.prod_id WHERE s.price_unit<p.price;");
    }
    public List ascOrderQuantity()
    {
     return jdbcTemplate.queryForList("SELECT *FROM SalesAss ORDER BY quantity ASC;");
    }
    public void displayPage2()
    {
        
    }
}
