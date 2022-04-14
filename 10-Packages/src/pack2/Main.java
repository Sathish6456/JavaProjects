package pack2;

import pack1.Welcome;
import pack1.Hello;
import pack1.Training;


public class Main {

	public static void main(String[] args) {
		Welcome w=new Welcome();
		w.greet();
		
		Hello hello=new Hello();
		hello.test();
		
		Training t=new Training();
		System.out.println(t);
	}

}
