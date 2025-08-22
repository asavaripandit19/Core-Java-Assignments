import java.util.Scanner;
public class SwappingTwoNos{
	public static void main(String[] args){
		int a,b;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a: ");
		a=sc.nextInt();
		System.out.print("Enter b: ");
		b=sc.nextInt();
		
		System.out.println("Using + and - operator");
		System.out.println("Before swapping:a="+a + ",b="+b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping:a="+a + ",b="+b);

		System.out.println("\n Using * and - operator");
		System.out.println("Before swapping:a="+a + ",b="+b);
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("After swapping:a="+a + ",b="+b);

		
		
		
		

		


		
	}
}