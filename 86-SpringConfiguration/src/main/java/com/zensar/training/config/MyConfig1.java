package com.zensar.training.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zensar.training.bean.Address;
import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Student;

@Configuration
public class MyConfig1 {
	
	@Bean(name="studBean")
	public Student f1() {
		return new Student();
		
	}

	
	@Bean(name="empBean")
	public Employee employee() {
		Employee employee=new Employee();
		employee.setId(101);
		employee.setName("sathish");
		employee.setSalary(25743);
		return new Employee();
	}
	
	@Bean(name="address")
	public Address f3() {
		Address address=new Address();
			address.setAreaName("13-357");
			address.setCity("Tiruvuru");
			address.setAreaName("Rajupeta");
			return address;
		}
	}


