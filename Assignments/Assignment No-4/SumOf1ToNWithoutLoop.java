import java.util.Scanner;

public class SumOf1ToNWithoutLoop{
	public static void main(String[] args){
	
	int n;
	int sum =0;

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter N: ");
	 n = sc.nextInt();
	
	sum=(n*(n+1))/2;

	System.out.println("Sum of 1 to "+n+" is: "+sum);
	}
}