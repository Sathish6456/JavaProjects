
public class Circle {
	private int radius;
	static final double PI=3.14;
	
	Circle(){
		
	}
	
	int getRadius() {
		
		
		return radius;
	}



	void setRadius(int radius) {
		this.radius = radius;
	}



	double getArea() {
		
		return PI*this.radius*this.radius;
	}
	
	static void greet() {
		System.out.println("Welcome to Circle");
		System.out.println(PI);
	}
}
