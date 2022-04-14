
public class Employee {
	double basicSalary;
	char grade;
	
	double getAllowance() {
		double allowance;
		
		switch (grade) {
		case 'A':
			allowance=basicSalary*0.35;
			break;
		case 'B': allowance=basicSalary*0.28;
			break;
		case 'C': allowance=basicSalary*0.20;
			break;
		default:
			System.out.println("Invalid Grade");
			allowance=0;
			break;
		}
		
		return allowance;
	}
	
	double getNetSalary() {
		return basicSalary+ getAllowance();
	}
}
