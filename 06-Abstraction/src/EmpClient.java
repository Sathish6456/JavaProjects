
public class EmpClient {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.basicSalary=10000.00;
		e1.grade='Y';
		
		System.out.println(e1.getAllowance());
		System.out.println(e1.getNetSalary());
		
		
	}

}
