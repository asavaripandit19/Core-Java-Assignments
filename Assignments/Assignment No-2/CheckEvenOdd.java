import java.util.Scanner;
public class CheckEvenOdd{
	public static void main(String[] args){
		int num;

		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		
		System.out.println((num%2==0)?"Even":"Odd");

	}
}