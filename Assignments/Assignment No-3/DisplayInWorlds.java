import java.util.Scanner;
public class DisplayInWorlds{
	public static void main(String[] args){
		int n;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number between 1 to 10: ");
		n = sc.nextInt();

		switch(n){
			case 1 :
				System.out.print("One");
				break;
			case 2 :
				System.out.print("Two");
				break;
			case 3 :
				System.out.print("Three");
				break;
			case 4 :
				System.out.print("Four");
				break;
			case 5 :
				System.out.print("Five");
				break;
			case 6 :
				System.out.print("Six");
				break;
			case 7 :
				System.out.print("Seven");
				break;
			case 8 :
				System.out.print("Eight");
				break;
			case 9 :
				System.out.print("Nine");
				break;
			case 10 :
				System.out.print("Ten");
				break;

			default: System.out.println("Invalid Input!!");

			

		}

	}
}