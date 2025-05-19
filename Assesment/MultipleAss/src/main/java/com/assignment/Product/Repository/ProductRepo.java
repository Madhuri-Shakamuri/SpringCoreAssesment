package com.assignment.Product.Repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProductRepo 
{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public double avgPrice()
    {
        return jdbcTemplate.queryForObject("SELECT AVG(price) as Avg_Price From  ProductAss", Double.class);
    }
    public List<Map<String,Object>> avgPriceWithCatcode()
    {
        return jdbcTemplate.queryForList("SELECT cat_Code,AVG(price) as Avg_Price FROM  ProductAss GROUP BY cat_Code;");
    }
     public List<Map<String,Object>> joinmethod(double price)
     {
       return jdbcTemplate.queryForList("SELECT p.name,c.cat_des FROM ProductAss  p JOIN Category  c ON p.cat_Code=c.cat_Code WHERE LEN(p.name)<10 AND p.price>?",price);
     }
    
}
