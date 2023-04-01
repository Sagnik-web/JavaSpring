package com.springcore.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/jdbc/config.xml");
        JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
        System.out.println("Database Connected Successfully");
        
        String query = "insert into mydb(id) values(100)";
        int result = template.update(query);
        System.out.println("Data Inserted Successfully ---> "+result);
        
    }
}
