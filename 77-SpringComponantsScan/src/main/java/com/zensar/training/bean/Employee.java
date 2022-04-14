package com.zensar.training.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {
			int id;
			String name;
			double basic;
			
			@Autowired
			@Qualifier(value="aGradeSalCal")
			SalaryCalculator salaryCalculator;
			
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public double getBasic() {
				return basic;
			}
			public void setBasic(double basic) {
				this.basic = basic;
			}
			
			
			
			public SalaryCalculator getSalaryCalculator() {
				return salaryCalculator;
			}
			public void setSalaryCalculator(SalaryCalculator salaryCalculator) {
				this.salaryCalculator = salaryCalculator;
			}
			
			
			@Override
			public String toString() {
				return "Employee [id=" + id + ", name=" + name + ", basic=" + basic + ", salaryCalculator="
						+ salaryCalculator + "]";
			}
			public double getAllowance() {
				return this.salaryCalculator.computeAllowance(this.basic);
			}
			public double getDeduction() {
				return this.salaryCalculator.computeTax(this.basic);
			}
}
