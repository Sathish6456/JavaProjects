package com.zensar.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Square;
import com.zensar.training.bean.Student;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    
    	Student student;
    	student=(Student) context.getBean("stud");
    	System.out.println(student);
    
    	Square square;
    	square=(Square) context.getBean("sqr");
    	System.out.println(square);
    
    	Employee employee=(Employee) context.getBean("employee");
    	employee.setId(101);
    	employee.setName("sai");
    	employee.setBasic(25743.00);
    	
    	System.out.println(employee);
    	System.out.println(employee.getAllowance());
    	System.out.println(employee.getDeduction());
    	
    
    }
}
