import java.util.Scanner;

public class DoWhileMain1 {

	public static void main(String[] args) {

		int choice=0;
		do {
			System.out.println("1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			System.out.println("5. Exit");
			
			System.out.println("Enter your choice : ");
			Scanner scanner=new Scanner(System.in);
			choice=scanner.nextInt();
			
			
		} while (choice != 5);

	}

}
