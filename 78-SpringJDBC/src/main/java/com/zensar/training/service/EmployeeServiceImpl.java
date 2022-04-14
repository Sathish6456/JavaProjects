package com.zensar.training.service;

import java.sql.Connection;
import java.util.List;

import com.zensar.training.bean.Employee;
import com.zensar.training.db.DBConnectionFactory;
import com.zensar.training.db.EmployeeDAO;
import com.zensar.training.db.EmployeeSpringJdbcImpl;

public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public boolean addEmployee(Employee employee) throws Exception {
		boolean result=false;
		Connection connection=DBConnectionFactory.createConnection();
		EmployeeDAO dao=new EmployeeSpringJdbcImpl();
		result=dao.addEmployee(connection, employee);
		return result;
	}

	@Override
	public boolean updateEmployee(Employee employee) throws Exception {
		
		return false;
	}

	@Override
	public boolean deleteEmployee(Employee employee) throws Exception {
		
		return false;
	}

	@Override
	public Employee findEmployee(int id) throws Exception {
		
		return null;
	}

	@Override
	public List<Employee> findAllEmployees() throws Exception {
		
		return null;
	}

}
