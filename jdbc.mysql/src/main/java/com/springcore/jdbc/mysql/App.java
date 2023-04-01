package com.springcore.jdbc.mysql;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/jdbc/mysql/config.xml");
        JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
        
//        String quiString = "insert into myapp(ID, emp_name, city) values(?,?,?)";
//        int result = template.update(quiString,10,"DDD","ABC");
//        System.out.println(result);
        
        String selectQuerString = "select * from myapp";
//        RowMapper<Student> rowMapper = new RowMapperImp();
        
        
        List<Map<String, Object>> list = template.queryForList(selectQuerString);
        
        
       
        
        List<Student> studentList = new ArrayList<Student>();
//        Student student = template.queryForObject(selectQuerString, rowMapper);
        for(Map<String, Object> map : list) {
        	Student student = new Student();
        	student.setID((Integer) map.get("ID"));
        	student.setEmp_nameString((String) map.get("emp_name"));
        	student.setCityString((String)map.get("city"));
        	studentList.add(student);
        	System.out.println(student);
        }
        System.out.println(studentList);
        
        
    }
}
