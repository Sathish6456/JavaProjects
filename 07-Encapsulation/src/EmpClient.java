
public class EmpClient {

	public static void main(String[] args) {
		Employee e1=new Employee();
		
		
		
		e1.setBasicSalary(1000);
		e1.setGrade('A');
		
		
		System.out.println(e1.getAllowance());
		System.out.println(e1.getNetSalary());
		
		
	}

}
