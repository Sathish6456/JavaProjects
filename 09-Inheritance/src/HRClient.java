
public class HRClient {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setId(101);
		e.setName("John");
		e.setBasicSalary(10000.00);
		System.out.println(e.computeNetSalary());
		
		SalesEmployee employee1=new SalesEmployee();
		employee1.setId(102);
		employee1.setName("Vikram");
		employee1.setBasicSalary(10000.00);
		employee1.setIncentive(2000);
		System.out.println(employee1.computeNetSalary());
		
		Manager manager=new Manager();
		manager.setId(103);
		manager.setName("Asha");
		manager.setBasicSalary(10000.00);
		manager.setVehicleAllowance(5000);
		System.out.println(manager.computeNetSalary());
	}

}
