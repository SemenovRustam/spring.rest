package com.rustamsemenov.spring.rest;

import com.rustamsemenov.spring.rest.configuration.MyConfig;
import com.rustamsemenov.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

        Employee empByID = communication.getEmployee(1);
        System.out.println(empByID);
  }
}
