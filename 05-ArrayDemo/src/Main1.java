import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		int a=30;
		System.out.println(a);
		
		float b;
		boolean c=true;
		System.out.println(c);
		
		int[] marks;
		int n=new Scanner(System.in).nextInt();
		marks=new int[n];
		
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks.length);
		
		marks[0]=80;
		marks[1]=90;
		marks[2]=95;
		
		for(int i=marks.length-1; i>=0;i--) {
			System.out.println(marks[i]);
		}

		for(int value:marks) {
			System.out.println(value);
		}
			
		marks=null;
		marks=new int[] {10,20,30,40,50}; // re initialization
		
		float []arr= {10.0f, 20.0f, 30.0f}; // inline initialization
		
	
		
		for(float v:arr)
			System.out.println(v);
		
	}

}
