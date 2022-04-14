package com.zensar.training;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Gender;
import com.zensar.training.util.HibernateUtil;
 
public class App 
{

    public static void insert()
    {
        Employee employee=new Employee("kiran",LocalDate.of(1998, 6, 15),3000,Gender.MALE);
        Employee employeee1=new Employee("Sai",LocalDate.of(1997, 7, 11),3100,Gender.MALE);
        Employee employeee2=new Employee("Ganesh",LocalDate.of(1889, 7, 7),1200,Gender.MALE);
        
        HibernateUtil.init();

        Session session=HibernateUtil.getSession();
        Transaction tx=session.beginTransaction();

        session.save(employee);
        session.save(employeee1);
        session.save(employeee2);
        
        tx.commit();
        System.out.println("Contact inserted into DB");
        HibernateUtil.cleanUp();
    }
    
    public static void read()
    {
    HibernateUtil.init();
    Session session=HibernateUtil.getSession();

    Employee employee=session.load(Employee.class,1);
    System.out.println(employee);


    HibernateUtil.cleanUp();

    }
    public static void readAll()
    {
    HibernateUtil.init();
    Session session=HibernateUtil.getSession();

    String str="from Employee";
    Query query=session.createQuery(str);
    List<Employee> list=query.list();
    System.out.println(list);


    HibernateUtil.cleanUp();
    }
    public static void update()
    {
    HibernateUtil.init();
    Session session=HibernateUtil.getSession();
    Employee employee=session.load(Employee.class, 2);
    employee.setName(employee.getName().toLowerCase());

    Transaction tx=session.beginTransaction();
    session.update(employee);
    tx.commit();

    HibernateUtil.cleanUp();
    }
    public static void delete()
    {
    HibernateUtil.init();
    Session session=HibernateUtil.getSession();
    Employee employee=session.load(Employee.class, 1);
    Transaction tx=session.beginTransaction();
    session.delete(employee);
    tx.commit();


    HibernateUtil.cleanUp();
    }
    public static void main( String[] args )
    {
    //insert();
     //read();
    //readAll();
    //update();
     delete();
    }

}