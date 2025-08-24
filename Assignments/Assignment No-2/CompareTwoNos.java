import java.util.Scanner;
public class CompareTwoNos{
	public static void main(String[] args){
		int n1,n2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number: ");
		n1 = sc.nextInt();
		System.out.println("Enter second number: ");
		n2 = sc.nextInt();
	
		if(n1>n2)
			System.out.println(n1+" is greater");
		else if(n2>n1)
			System.out.println(n2+" is greater");
		else
			System.out.println(n1+" and " +n2+" are equal");
			

	}


}