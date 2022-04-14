
public class Customer {
	private int id;
	private String name;
	private double balance;
	
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
	double getBalance() {
		return balance;
	}
	void setBalance(double balance) {
		this.balance = balance;
	}
	
	boolean isGoodCustomer() {
		if(this.balance<100000)
			return true;
		return false;
			
	}
	
	
	
	
	
}
