
public class Employee {
	private double basicSalary;
	private char grade;
	
	double getBasicSalary() {
		return this.basicSalary;
	}
	
	void setBasicSalary(double basicSalary) {
		if(basicSalary<0) {
			System.out.println("invalid salary");
			return;
		}
		this.basicSalary=basicSalary;
	}
	
	char getGrade() {
		return this.grade;
	}
	
	void setGrade(char grade) {
		
		
		this.grade=grade;
	}
	
	double getAllowance() {
		double allowance;
		
		switch (grade) {
		case 'A':
			allowance=this.basicSalary*0.35;
			break;
		case 'B': allowance=this.basicSalary*0.28;
			break;
		case 'C': allowance=this.basicSalary*0.20;
			break;
		default:
			System.out.println("Invalid Grade");
			allowance=0;
			break;
		}
		
		return allowance;
	}
	
	double getNetSalary() {
		return this.basicSalary+ getAllowance();
	}
}
