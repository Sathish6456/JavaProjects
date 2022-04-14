
public class Variables {
	
	int v1;  // instance variable
	static int v2; // global

	public static void main(String[] args) {
		int age; //local variable

	}
	
	public void demo(double x) {
		int a=100;
		System.out.println(a);
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(x);
		if(a==100) {
			int y=90;
			System.out.println(90);
		}
		
	}

}
