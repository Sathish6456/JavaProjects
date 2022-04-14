
public class SalesEmployee extends Employee{
	private double incentive;

	double getIncentive() {
		return incentive;
	}

	void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	
	
	double computeNetSalary() {
		return this.basicSalary+this.computeAllowance()-this.computeTax()+incentive;
	}
}
