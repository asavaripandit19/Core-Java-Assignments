import java.util.Scanner;
public class OperationAndDisplay{
	public static void main(String[] args){
		int n1,n2;
		char op;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		n1=sc.nextInt();
		System.out.print("Enter Operatar(* / + - ): ");
		op=sc.next().charAt(0);
		System.out.print("Enter second number: ");
		n2=sc.nextInt();
	
		

		switch(op)
		{
			case '+':
				System.out.println("Result = "+(n1+n2));
				break;
			case '-':
				System.out.println("Result = "+(n1-n2));
				break;
			case '*':
				System.out.println("Result = "+(n1*n2));
				break;
			case '/':
				System.out.println("Result = "+(n1/n2));
				break;


		}

		
		
	}
}