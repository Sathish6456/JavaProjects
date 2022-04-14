package com.zensar.training.ui;

import com.zensar.training.bean.Employee;

public class EmpClient {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setName("John");
		employee.setBasicSalary(10000.00);
		employee.setGrade('C');
		
		System.out.println(employee.getAllowance());
		System.out.println(employee.getDeduction());

	}

}
