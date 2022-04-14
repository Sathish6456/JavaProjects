package com.zensar.training.db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Gender;

public class EmployeeSpringJdbcImpl implements EmployeeDAO{

	public boolean addEmployee(JdbcTemplate jdbcTemplate, Employee employee) throws Exception {
		boolean result=true;
		Object[] rowdata= {employee.getName(),
				employee.getHiredDate(),
				employee.getGrade(),
				employee.getGender().toString().charAt(0)};
		
		int r=jdbcTemplate.update(INSERT_QRY, rowdata);
		if(r==0)
			result=false;
		return result;
	}

	public boolean updateEmployee(JdbcTemplate jdbcTemplate, Employee employee) throws Exception {
		boolean result=true;
		Object[] rowdata= {employee.getName(),
				employee.getHiredDate(),
				employee.getGrade(),
				employee.getGender().toString().charAt(0)};
		
		int r=jdbcTemplate.update(INSERT_QRY, rowdata);
		if(r==0)
			result=false;
		return result;
		}

	public boolean deleteEmployee(JdbcTemplate jdbcTemplate, Employee employee) throws Exception {
		boolean result=true;
		Object[] data= {employee.getId()};
		int r=jdbcTemplate.update(DELETE_QRY,data);
		if(r==0)
			result=false;
		return result;
	}

	public Employee findEmployee(JdbcTemplate jdbcTemplate, int empId) throws Exception {
		Employee employee=jdbcTemplate.queryForObject(FIND_ALL_QRY, new EmployeeRowMapper());
		
		return employee;
	}

	public List<Employee> findAllEmployees(JdbcTemplate jdbcTemplate) throws Exception {
		List<Employee> employees=jdbcTemplate.query(FIND_ALL_QRY, new EmployeeRowMapper());

		return employees;
	}
		private class EmployeeRowMapper implements RowMapper<Employee> {
		
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee employee=new Employee();
			employee.setId(rs.getInt(1));
			employee.setName(rs.getString(2));
			
			java.sql.Date dojdate=rs.getDate(3);	
			LocalDate doj=DateConversion.convertToLocalDate(dojdate);
			
			employee.setHiredDate(doj);
			employee.setGrade(rs.getString(4).charAt(0));
			employee.setBasicSalary(rs.getDouble(5));
			
			char gend=rs.getString(6).charAt(0);
			if(gend=='M')
				employee.setGender(Gender.MALE);
			else
				employee.setGender(Gender.FEMALE);
			
			return employee;
		}

}
}