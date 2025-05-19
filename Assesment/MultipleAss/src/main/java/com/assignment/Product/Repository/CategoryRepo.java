//5. Insert a new category.

package com.assignment.Product.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class CategoryRepo 
{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void creatingTable()
    {
        jdbcTemplate.execute("CREATE TABLE Category(cat_Code VARCHAR(20) PRIMARY KEY,cat_des VARCHAR(20));");
    }
    
    public void alteringTable() {
      //  jdbcTemplate.execute("ALTER TABLE Category DROP CONSTRAINT PK_Category;");
       //  jdbcTemplate.execute("EXEC sp_rename 'Category.id','cat_Code','COLUMN';");
    }
    
         

    public void insertingRows()
    {
        jdbcTemplate.execute("INSERT INTO Category(cat_Code,cat_des)VALUES('A1','gadgets'),('A2','gadgetspro'),('B1','Hardware');");
        jdbcTemplate.execute("INSERT INTO Category(cat_Code,cat_des) VALUES('D1','HITECH')");
    }
    
}
