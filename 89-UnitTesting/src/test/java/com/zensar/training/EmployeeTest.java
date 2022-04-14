package com.zensar.training;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.zensar.training.bean.Employee;
import com.zensar.training.bean.InvalidSalaryException;

public class EmployeeTest {
	Employee employee;

	@BeforeEach
	public void init() {
		employee = new Employee();
		System.out.println(".....init before test.......");
	}

	@Test
	@DisplayName("allowance Testing positive1 ")
	public void ComputeAllowancePositive1() throws InvalidSalaryException {
		employee.setBasicSalary(20000);
		double expected = 4000;
		double actual = employee.computeAllowance();
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("allowance Testing positive2 ")
	public void ComputeAllowancePositive2() throws InvalidSalaryException {
		employee.setBasicSalary(40000);
		double expected = 8000;
		double actual = employee.computeAllowance();
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Testing employee negative salary")
	public void test1() {
		Exception ex=assertThrows(InvalidSalaryException.class, ()->this.employee.setBasicSalary(-1000));
		assertEquals("Salary cannot be negative", ex.getMessage());
	}
	
	@AfterEach
	public void destroy() {
		employee = null;
		System.out.println(".....init after test.......");
	}
}
