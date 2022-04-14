package com.zensar.training.bean;

public class Employee {
			int id;
			String name;
			double basic;
			SalaryCalculator aGradeSalCal;
			
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
			
			public SalaryCalculator getaGradeSalCal() {
				return aGradeSalCal;
			}
			public void setaGradeSalCal(SalaryCalculator aGradeSalCal) {
				this.aGradeSalCal = aGradeSalCal;
			}
			@Override
			public String toString() {
				return "Employee [id=" + id + ", name=" + name + ", basic=" + basic + ", salaryCalculator="
						+ aGradeSalCal + "]";
			}
			
			public double getAllowance() {
				return this.aGradeSalCal.computeAllowance(this.basic);
			}
			public double getDeduction() {
				return this.aGradeSalCal.computeTax(this.basic);
			}
}
