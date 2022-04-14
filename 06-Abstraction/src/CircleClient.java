
public class CircleClient {

	public static void main(String[] args) {
		Circle c1;
		c1=new Circle();
		
		c1.radius=10;
		
		double area=c1.getArea();
		System.out.println(area);
		
		Circle c2;
		c2=new Circle();
		c2.radius=7;
		System.out.println(c2.getArea());
		
		
		
	}

}
