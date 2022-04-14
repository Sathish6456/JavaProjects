package com.zensar.training.ui;

import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Manager;

public class Client {

	public static void main(String[] args) {
		Employee employee;
		employee=new Employee();
		
		employee=new Manager();  // upcasting ..implicit
		
		Manager manager=(Manager)employee;// DownCasting..explicit

	}

}
