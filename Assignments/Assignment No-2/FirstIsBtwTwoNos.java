import java.util.Scanner;
public class FirstIsBtwTwoNos{
	public static void main(String[] args){
		int n1,n2,n3;

		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter first number: ");
		n1 = sc.nextInt();
		System.out.print("Enter second number: ");
		n2 = sc.nextInt();
		System.out.print("Enter third number: ");
		n3 = sc.nextInt();

		if(n1>n2 && n1<n3 || n1>n3 && n1<n2)
			System.out.println(n1+" is between "+n2+ " and "+n3);
		else
			System.out.println(n1+" is not between "+n2+ " and "+ n3);
		
	}
}