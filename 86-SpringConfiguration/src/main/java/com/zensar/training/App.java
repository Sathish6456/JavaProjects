package com.zensar.training;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zensar.training.bean.Address;
import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Student;
import com.zensar.training.config.MyConfig1;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context;
        context=new AnnotationConfigApplicationContext(MyConfig1.class);
        
        Student student=(Student) context.getBean("studBean");
        System.out.println(student);
        
        
        Employee employee=(Employee) context.getBean("empBean");
        System.out.println(employee);
        
        Address address=(Address) context.getBean("address");
        System.out.println(address);
    }
}
