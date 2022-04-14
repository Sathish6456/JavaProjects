
public class Employee {
	private int id;
	private String name;
	protected double basicSalary;
	
	
	Employee(int id, String name, double basicSalary) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
	}

	Employee() {
		super();
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getBasicSalary() {
		return basicSalary;
	}

	void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	double computeAllowance() {
		return 0.35*this.basicSalary;
	}
	
	double computeTax() {
		return 0.10*this.basicSalary;
	}
	
	double computeNetSalary() {
		return this.basicSalary+this.computeAllowance()-this.computeTax();
	}

}
