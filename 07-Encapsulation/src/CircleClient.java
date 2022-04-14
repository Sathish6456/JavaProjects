
public class CircleClient {

	public static void main(String[] args) {
		Circle c1;
		c1=new Circle();
		
		c1.setRadius(5);
		System.out.println(c1.getRadius());
		
		double area=c1.getArea();
		System.out.println(area);
		
		Circle c2;
		c2=new Circle();
		c2.setRadius(10);
		System.out.println(c2.getRadius());
		System.out.println(c2.getArea());
		
		
		
	}

}
