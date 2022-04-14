package com.zensar.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.training.bean.Vehicle;

public class App 
{
    public static void main( String[] args )
    {
        Vehicle vehicle=null;
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        vehicle=(Vehicle) context.getBean("vehicleBean");
        vehicle.drive();
    }
}
