package com.zensar.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Person;
import com.zensar.training.bean.Shape;
import com.zensar.training.bean.Square;
import com.zensar.training.bean.Student;

public class App 
{
    public static void main( String[] args )
    {
        Shape shape=null;
        
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        shape=(Shape) context.getBean("shapeBean");
        System.out.println(shape.computeArea());
        
        Student student=(Student) context.getBean("studBean");
        System.out.println(student);
        
        Student student1=(Student) context.getBean("studBean1");
        System.out.println(student1);
        
        Person person1,person2;
        person1=(Person) context.getBean("personBean");
        person2=(Person) context.getBean("personBean");
        
        person1.setAge(50);
        System.out.println(person1);
        
        System.out.println(person2.getAge());
        
        String str=(String) context.getBean("companyBean");
        double salary=(double) context.getBean("salaryBean");
        
        System.out.println(str);
        System.out.println(salary);
        
        Employee employee=(Employee) context.getBean("employeeBean");
        System.out.println(employee);
        System.out.println(employee.getAllowance());
        System.out.println(employee.getDeduction());
    }
}
