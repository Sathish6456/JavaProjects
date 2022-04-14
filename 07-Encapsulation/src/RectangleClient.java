
public class RectangleClient {

	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		r1.setWidth(10);
		r1.setHeight(25);
		System.out.println(r1.getArea());
		
		
		Rectangle r2=new Rectangle(4,5);
		System.out.println(r2.getArea());

	}

}
