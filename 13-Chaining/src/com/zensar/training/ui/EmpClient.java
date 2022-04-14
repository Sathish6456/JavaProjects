package com.zensar.training.ui;

import com.zensar.training.bean.Employee;

public class EmpClient {

	public static void main(String[] args) {
		
		Employee employee=new Employee();
		employee.setSalary(10000.00);
		System.out.println(employee.computeNetSalary());

	}

}
