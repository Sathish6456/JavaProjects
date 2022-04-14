package com.zensar.training.ui;

import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Manager;

public class Client2 {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.basicSalary=1000;
		System.out.println(employee.computeNetSalary());
		
		Manager manager=new Manager();
		manager.basicSalary=1000;
		manager.incentive=500;
		System.out.println(manager.computeNetSalary());
		
		Employee employee2=new Manager();
		employee2.basicSalary=1000;
		System.out.println(employee2.computeNetSalary());
	}

}
