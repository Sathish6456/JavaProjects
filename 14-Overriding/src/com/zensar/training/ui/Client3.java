package com.zensar.training.ui;

import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Manager;
import com.zensar.training.bean.SalesEmployee;

public class Client3 {

	public static void main(String[] args) {
		Employee employee;
		employee=new Employee();
		employee.basicSalary=1000;
		System.out.println(employee.computeNetSalary());
		
		employee=new Manager();
		employee.basicSalary=1000;
		System.out.println(employee.computeNetSalary());
		
		employee=new SalesEmployee();
		employee.basicSalary=1000;
		System.out.println(employee.computeNetSalary());

	}

}
