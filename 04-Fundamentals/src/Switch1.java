
public class Switch1 {

	public static void main(String[] args) {
		short b=50;
		
		final short v1=20;
		final short v2=40;
		final short v3=60;
		
		switch(b) {
		default : System.out.println("Invalid"); 
				break;
		case v1: System.out.println("a1");
		            break;
		case v2: System.out.println("a2");
			break;
		case v3: System.out.println("a3");
                 break;
              
                  
		}

	}

}
